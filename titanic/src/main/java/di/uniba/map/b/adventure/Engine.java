/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.adventure;
import di.uniba.map.b.adventure.games.Game;
import di.uniba.map.b.adventure.libreria.Library;
import di.uniba.map.b.adventure.parser.Parser;
import di.uniba.map.b.adventure.parser.ParserOutput;
import di.uniba.map.b.adventure.type.AdvObject;
import di.uniba.map.b.adventure.type.CommandType;
import di.uniba.map.b.adventure.more.Visual;
import di.uniba.map.b.adventure.more.ControlEffect;
import di.uniba.map.b.adventure.more.DBInventory;
import di.uniba.map.b.adventure.more.Effect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Engine {


	private Game game = new Game();

	private ControlEffect controlEffect;

	private Parser parser;

	private Visual visual;

	private Effect effects = new Effect();

	private DBInventory inventory = new DBInventory();
	
	private boolean firstRead = true;


	//menu inizio nuova partita
	private void start() {
		
		//controlla se il menu viene avviato all'apertura del programma o dopo una morte
		if (firstRead) {
		inventory.createTable();
		firstRead = false;
		
		} else {
			
			//svuota inventario
			inventory = new DBInventory();
			EmptyDBInventory(game);
			
			game.NewGame();
			;

		}

		
		boolean valid = false;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
			String command ;
			
			//cicla fino a quando non viene immesso un input valido
		while (!valid) {
			
			System.out.println("\n========================================================");
			System.out.println(" Digita \n\n"
                                + "'Nuova Partita'  : Per iniziare una nuova partita \n"
                                + "'Carica Partita' : Per tornare dov'eri rimasto \n"
                                + "'Esci'           : Per chiudere il gioco \n");
			System.out.println("========================================================\n");
						
			command = scanner.nextLine();
			
			command = command.toLowerCase();


			if(command.contentEquals("nuova") || command.contentEquals("nuova partita") || command.contentEquals("n")){
				valid = true;
				execute();
			}
			if(command.contentEquals("carica") || command.contentEquals("carica partita")){
				valid = true;
				game = loadGame(game,System.out);
				execute();

			}
			else if(command.contentEquals("esci")){
				valid = true;
				System.exit(0);
				

			}


		}
	}

	//esecuzione del gioco
	private void execute() {


		System.out.println("\n");

		System.out.println("========================================================");
		System.out.println(game.getCurrentRoom().getDescription());
		System.out.println("========================================================\n");
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		controlEffect = new ControlEffect(game);
		
		while (scanner.hasNextLine()) {

			//sincronizza il DB con l'inventario
			this.ToDBInventory(game);
			
			if (game.getCurrentRoom().getMission() != null) {
								
		    if (game.getCurrentRoom().getMission().checkIsDead()) {
		    	
		    	inventory.close();
		    	start();
		    }
         }
			
			//sincronizza il cronometro
			game.checkTime();
			game.fermaTempo();
			
			String command = scanner.nextLine();

			command.toLowerCase();

		
			
			if (!command.isEmpty()) { // Se la stringa digitata non è vuota

				//contolla se il giocatore chiede di salvare
				if (command.equalsIgnoreCase("salva") || command.equalsIgnoreCase("salva partita")) {

					saveGame(game, System.out);					

					//controlla se viene richiesto l'inventario dal giocatore
				} else if (command.equalsIgnoreCase("inventario")) {

					if (!game.getInventory().isEmpty()) {			


						inventory.showInventory();

					} else {
						System.out.println("================================================");
						System.out.println("Il tuo inventario é vuoto");
						System.out.println("================================================\n");

					}
				}
				else {
					
					game.avviaTempo();
					
					try{
						// Stringa digitata + lista comandi + oggetti nella stanza + inventario
						ParserOutput p = parser.parse(command, game.getCommands(), game.getCurrentRoom().getObjects(), game.getInventory());

						if (p.getCommand() != null) { // Se ho trovato il comando
							System.out.println("====================================================================================");
							game.nextMove(p, System.out);
							
							//controlla se viene richiesta la visualizzazione della libreria
							checkLibrary(p, System.out);
							
							//controlla se so verifica un evento in cui e' necessaria la riproduzione di qualche effetto sonoro
							this.controlEffect.checkCase(game, p, game.getCurrentRoom().getMission());
							System.out.println("====================================================================================\n");

							checkEndGame(p);

							
						}else {
							System.out.println("\n====================================================");
							System.out.println("Scusami, non ho capito, potresti essere piu' chiaro?");
							System.out.println("====================================================\n");

						} 
					} catch (NullPointerException e) {
						System.out.println("\n====================================================");
						System.out.println("Scusami, non ho capito, potresti essere piu' chiaro?");
						System.out.println("====================================================\n");
					}
				}

			} else { // Se non ho digitato niente
				System.out.println("\n================================================");
				System.out.println("Digita qualcosa!                                ");
				System.out.println("================================================\n");
			}

			System.out.println();

		}


	}

	public Engine(Game game) {

		visual = new Visual();

		this.game = game;

		
		try {
			
			effects.playMusic();     	

			Object[] message = {"Vuoi visualizzare l'introduzione?"};

			Object[] options = {"Si", "No"};
			JFrame jf = new JFrame();
			jf.setAlwaysOnTop(true);
			int selectedOption = JOptionPane.showOptionDialog(jf,
					message, "Titanic: The Lost Treasure",
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
					options, options[1]);

			if (selectedOption == JOptionPane.OK_OPTION) { // Risposta affermativa

				visual.title(); 
				visual.intro();	// Mostra introduzione del gioco

			}

			visual.title(); // Mostra introduzione del gioco



			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("\n==============================================");
			System.out.println(" Premi il tasto INVIO per continuare...         ");
			System.out.println("==============================================\n");
			br.readLine();

			this.visual.help(); // Mostra comandi principali


			this.game.NewGame();

		} catch (Exception ex) {

			System.err.println(ex);
		}
		try {
			Set<String> stopwords = Utils.loadFileListInSet(new File("./resources/stopwords"));
			parser = new Parser(stopwords);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}

	public static void main(String[] args) {
		Engine engine = new Engine(new Game());

		engine.start();
	}

//controlla se si e' verificato l'evento che porta alla fine del gioco e quindi alla chiusura
	private void checkEndGame(ParserOutput p) {

		if (p.getCommand() != null && p.getObject() != null) {

			if (p.getCommand().getType() == CommandType.EXAMINES) {

				if (p.getObject().getId() == 35) {

					if (effects != null) {
						effects.stopMusic();
					}

					visual.theEnd();
				}
			} else if (p.getCommand().getType() == CommandType.END ) {

				System.exit(0);
			}
		}
	}

	private void checkLibrary (ParserOutput p, PrintStream out) {

		if (p.getObject() != null) {

			if (p.getObject().getId() == 33) {

				Library library = new Library();

				library.setVisible(true);

				while (library.isRunning()) {

					try{
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.getMessage();
					}
				}

				if(library.isUnlocked()) {

					game.getCurrentRoom().getEast().setVisible(true);

					out.println("Il quadro si e' spostato...");
					out.println("Nascondeva una porta a est");

				} else {
					out.println("Magari daro' un altra occhiata piu' tardi");
				}

			} 
		}
	}

	private void saveGame (Game game, PrintStream out){

		File previusSave = new File("salvataggio.dat");

		if(previusSave.exists()) {

			previusSave.delete();

		}


		try{

			FileOutputStream outFile = new FileOutputStream("salvataggio.dat");
			ObjectOutputStream outStream = new ObjectOutputStream(outFile);

			out.print(game.getCurrentRoom().getName());

			outStream.writeObject(game);

			out.println("\n================================================");
			out.println("Salvataggio partita effettuato.");
			out.println("================================================\n");

			if (outStream != null)
				outStream.close();
		} catch (IOException e ) {
			System.out.println("\n######################################################");
			System.err.println("Impossibile salvare la partita.\n" + e.getMessage());
			System.out.println("######################################################\n");
		}
	}

	private Game loadGame (Game game, PrintStream out) {

		File previusSave = new File("salvataggio.dat");

		if(!previusSave.exists()) {

			System.err.println("Nessun salvataggio trovato");

			 Object[] message = {"Vuoi iniziare una nuova partita?"};

		        Object[] options = {"Si", "No"};
		        JFrame jf = new JFrame();
		        jf.setAlwaysOnTop(true);
		        int selectedOption = JOptionPane.showOptionDialog(jf,
		                message, "Titanic: The Lost Treasure",
		                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
		                options, options[1]);

		        if (selectedOption == JOptionPane.OK_OPTION) { // Risposta affermativa
		        
		        	execute();
		        
		        }
		        
		        if (selectedOption == JOptionPane.NO_OPTION) {

		        	visual.theEnd();
		        	System.exit(0);;
		        }
		}

		else {


		try{
			FileInputStream inFile = new FileInputStream("salvataggio.dat");
			ObjectInputStream inStream = new ObjectInputStream(inFile);
			game = (Game) inStream.readObject();

			ToDBInventory(game);

			inStream.close();
			System.out.println("\n================================================");
			System.out.println("Caricamento partita completato.");
			System.out.println("================================================\n");
			System.out.println();
			System.out.println();
			System.out.println();


		} catch (IOException | ClassNotFoundException e) {

			System.out.println("\n######################################################");
			System.err.println("Impossibile caricare la partita.\n" + e.getMessage());
			System.out.println("######################################################\n");
		}

			}

				return game;

	}

	public void ToDBInventory(Game game) {
		

		
		for (AdvObject o : game.getInventory()) {
			
			inventory.addToDBInventory(o.getId());
		}  
	}
	
	public void EmptyDBInventory(Game game) {
		
		for (AdvObject o : game.getInventory()) {
			
			inventory.deleteFromDBInventory(o.getId());
		}  
	}

}