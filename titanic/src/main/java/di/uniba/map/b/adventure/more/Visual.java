package di.uniba.map.b.adventure.more;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@SuppressWarnings("serial")
public class Visual implements Serializable{

	char [] textArray;
	int arrayDimension;
	int counter;
	
	public void arrow () {
		System.out.print("--> ");
	}
	
	private void initTxt() {
		
		String testo = (""
				+"\nCostruito presso i cantieri Harland and Wolff di Belfast, il TITANIC rappresentava la massima espressione\r\n"
				+ "della tecnologia navale di quei tempi ed era il più grande e lussuoso transatlantico del mondo.\r\n"
				+ "\r\n"
				+ "Dal 1912 ovvero dall'urto con l'iceberg e dello sprofondamento della nave nelle acque gelide dell'Oceano Atlantico, \r\n"
				+ "molti dei tesori dei ricchi passeggeri sono andati perduti tra cui il famosissimo CUORE DELL'OCEANO.\r\n"
				+ "\r\n"
				+ "Questo ha portato molti amanti del rischio, alla ricerca di gloria ad avventurarsi alla ricerca del relitto perduto, \r\n"
				+ "ma nessuno e' piu' riuscito a trovarlo e molti non sono piu' tornati...\r\n"
				+ "\r\n"
				+ "ALMENO FINO AD OGGI...\r\n"
				+ "\r\n"
				+ "Sei un giovane navigatore, i tuoi studi ti hanno portato a cercare il TITANIC nei pressi del POINT NEMO una zona inaccessibile del pianeta,\r\n"
				+ "situato nell' Oceano Pacifico... Le correnti marine e i frequenti maremoti potrebbero aver spostato il relitto a migliaia di miglia di distanza \r\n"
				+ "dal luogo originario e un sogno ti ha portato dove ti trovi adesso, a bordo della tua nave, la TITANIC REVENGE (speriamo non porti sfiga),\r\n"
				+ "al largo delle coste del Cile, in Sud America. \r\n"
				+ "\r\n"
				+ "Tieniti pronto e preparati al peggio non sara' un avventura semplice, pensa bene a cio' che potrebbe servirti prima di immergerti, \r\n"
				+ "potresti pagare con la vita ogni tua distrazione o superficialita'\r\n");
        try{
        FileOutputStream outFile = new FileOutputStream("resources/car.dat");
        ObjectOutputStream outStream = new ObjectOutputStream(outFile);
        outStream.writeObject(testo);

        if (outStream != null)
        	outStream.close();
        } catch (IOException e ) {
        	System.out.println(e.getMessage());		
        }
	}
	
	public void title() {

		System.out.println("\n\n");

	System.out.println("\t                                      ████████╗██╗████████╗ █████╗ ███╗   ██╗██╗ ██████╗                             \n"          
                +"                                              ╚══██╔══╝██║╚══██╔══╝██╔══██╗████╗  ██║██║██╔════╝                             \n"          
                +"                                                 ██║   ██║   ██║   ███████║██╔██╗ ██║██║██║                                  \n"          
                +"                                                 ██║   ██║   ██║   ██╔══██║██║╚██╗██║██║██║                                  \n"         
                +"                                                 ██║   ██║   ██║   ██║  ██║██║ ╚████║██║╚██████╗                             \n"          
                +"                                                 ╚═╝   ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝ ╚═════╝                             \n"
				+ "████████╗██╗  ██╗███████╗    ██╗      ██████╗ ███████╗████████╗    ████████╗██████╗ ███████╗ █████╗ ███████╗██╗   ██╗██████╗ ███████╗\n"
				+ "╚══██╔══╝██║  ██║██╔════╝    ██║     ██╔═══██╗██╔════╝╚══██╔══╝    ╚══██╔══╝██╔══██╗██╔════╝██╔══██╗██╔════╝██║   ██║██╔══██╗██╔════╝\n"
				+ "   ██║   ███████║█████╗      ██║     ██║   ██║███████╗   ██║          ██║   ██████╔╝█████╗  ███████║███████╗██║   ██║██████╔╝█████╗  \n"
				+ "   ██║   ██╔══██║██╔══╝      ██║     ██║   ██║╚════██║   ██║          ██║   ██╔══██╗██╔══╝  ██╔══██║╚════██║██║   ██║██╔══██╗██╔══╝  \n"
				+ "   ██║   ██║  ██║███████╗    ███████╗╚██████╔╝███████║   ██║          ██║   ██║  ██║███████╗██║  ██║███████║╚██████╔╝██║  ██║███████╗\n"
				+ "   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝ ╚═════╝ ╚══════╝   ╚═╝          ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝\n");

		System.out.println("=====================================================================================================================================  ");	

		
	}

	public void intro() {

        boolean execute = false;
        
        while (!execute) {
		try {
        FileInputStream inFile = new FileInputStream("./resources/intro.dat");
        ObjectInputStream inStream = new ObjectInputStream(inFile);
        String testo = (String) inStream.readObject();
		timerStampa(testo);

        execute = true;
        
        if (inStream != null) {
        	inStream.close();
        }
        	
		         } catch (ClassNotFoundException ex) {
        	System.out.println(ex.getMessage());
                 } catch (FileNotFoundException ex) {
                	 System.out.println("Inizializzazione intro...");
       	             initTxt();
                 } catch (IOException ex) {
            System.out.println(ex.getMessage());
                 }
        }
	}	
 
	public void help() {
		System.out.println("Ecco la lista dei comandi per il gioco:\n\n"
				+ "- 'nord', 'sud', 'est', 'ovest' per spostarti.\n"
				+ "- Per osservare cosa sta vicino a te digita il comando 'guarda' o 'osserva'.\n"
				+ "- Se vuoi sembrare arguto digita il comando 'esamina' (QUALCOSA).\n"
				+ "- Inoltre la tua tuta da immersione può contenere vari oggetti,\n"
				+ "  per vederne il contenuto digita 'inventario.\n"
				+ "- Ci potrebbero essere pericoli, ricordati di salvare la partita con 'salva'.\n"
				+ "  Per caricare la partita precedente usa 'salva'.\n"
				+ "- Per sapere quanti minuti di vita hai perso giocando a questo gioco usa 'tempo'.\n"
				+ "Se vuoi mettermi alla prova usandone altri, prova pure, MA IO NON TI GARANTISCO NIENTE!\n"
				+ "\n"
				+ "Se anche tu hai problemi di memoria come me, digita 'aiuto' o '?'"
				+ "  per rivedere questa schermata.\n\n");
	}

	public void theEnd() {

		try{    
			    Thread.sleep(500);
				System.out.println("                                            ████████╗██╗████████╗ █████╗ ███╗   ██╗██╗ ██████╗                                      ");
				Thread.sleep(200);
				System.out.println("                                            ╚══██╔══╝██║╚══██╔══╝██╔══██╗████╗  ██║██║██╔════╝                                          ");
				Thread.sleep(200);
				System.out.println("                                               ██║   ██║   ██║   ███████║██╔██╗ ██║██║██║                                         ");
				Thread.sleep(200);
				System.out.println("                                               ██║   ██║   ██║   ██╔══██║██║╚██╗██║██║██║                                      ");
				Thread.sleep(200);
				System.out.println("                                               ██║   ██║   ██║   ██║  ██║██║ ╚████║██║╚██████╗                                         ");
				Thread.sleep(200);
				System.out.println("                                               ╚═╝   ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝ ╚═════╝                                          ");
				Thread.sleep(200);
				System.out.println("████████╗██╗  ██╗███████╗    ██╗      ██████╗ ███████╗████████╗    ████████╗██████╗ ███████╗ █████╗ ███████╗██╗   ██╗██████╗ ███████╗");
				Thread.sleep(200);
				System.out.println("╚══██╔══╝██║  ██║██╔════╝    ██║     ██╔═══██╗██╔════╝╚══██╔══╝    ╚══██╔══╝██╔══██╗██╔════╝██╔══██╗██╔════╝██║   ██║██╔══██╗██╔════╝");
				Thread.sleep(200);
				System.out.println("   ██║   ███████║█████╗      ██║     ██║   ██║███████╗   ██║          ██║   ██████╔╝█████╗  ███████║███████╗██║   ██║██████╔╝█████╗  ");
				Thread.sleep(200);
				System.out.println("   ██║   ██╔══██║██╔══╝      ██║     ██║   ██║╚════██║   ██║          ██║   ██╔══██╗██╔══╝  ██╔══██║╚════██║██║   ██║██╔══██╗██╔══╝  ");
				Thread.sleep(200);
				System.out.println("   ██║   ██║  ██║███████╗    ███████╗╚██████╔╝███████║   ██║          ██║   ██║  ██║███████╗██║  ██║███████║╚██████╔╝██║  ██║███████╗");
				Thread.sleep(200);
				System.out.println("   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝ ╚═════╝ ╚══════╝   ╚═╝          ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝");
		
		for (int i = 0; i<20 ;i++) {
			Thread.sleep(200);
         System.out.println();
		}
		
		 System.out.println("Creato da:");
			Thread.sleep(200);
	         System.out.println("Pietro Terrone e Salvatore Napoli\n\n\n");
				Thread.sleep(200);
		         System.out.println("Sponsorizzato da:");
					Thread.sleep(200);
			         System.out.println("Salvatore Napoli e Pietro Terrone\n\n\n");
						Thread.sleep(200);
				         System.out.println("Con la regia di:");
							Thread.sleep(200);
					         System.out.println("Pietro Terrone e Salvatore Napoli\n\n\n");
								Thread.sleep(200);
						         System.out.println("Un ringraziamento speciale va alla paperella di gomma");
									Thread.sleep(200);
							         System.out.println("che si e' sacrificata per il successo di questa missione");
										Thread.sleep(200);
								         System.out.println("nella speranza che adesso sia in un posto migliore");			
								            Thread.sleep(200);

		
								    		for (int i = 0; i<20 ;i++) {
								    			Thread.sleep(200);
								             System.out.println();
								    		}
								    		
		 System.out.println(" ██████╗ ██████╗  █████╗ ███████╗██╗███████╗    ██████╗ ███████╗██████╗      █████╗ ██╗   ██╗███████╗██████╗      ██████╗ ██╗ ██████╗  ██████╗ █████╗ ████████╗ ██████╗  ");     
			Thread.sleep(200);

		 System.out.println("██╔════╝ ██╔══██╗██╔══██╗╚══███╔╝██║██╔════╝    ██╔══██╗██╔════╝██╔══██╗    ██╔══██╗██║   ██║██╔════╝██╔══██╗    ██╔════╝ ██║██╔═══██╗██╔════╝██╔══██╗╚══██╔══╝██╔═══██╗ ");     
			Thread.sleep(200);
	     
		 System.out.println("██║  ███╗██████╔╝███████║  ███╔╝ ██║█████╗      ██████╔╝█████╗  ██████╔╝    ███████║██║   ██║█████╗  ██████╔╝    ██║  ███╗██║██║   ██║██║     ███████║   ██║   ██║   ██║ ");    
			Thread.sleep(200);
	     
		 System.out.println("██║   ██║██╔══██╗██╔══██║ ███╔╝  ██║██╔══╝      ██╔═══╝ ██╔══╝  ██╔══██╗    ██╔══██║╚██╗ ██╔╝██╔══╝  ██╔══██╗    ██║   ██║██║██║   ██║██║     ██╔══██║   ██║   ██║   ██║ ");     
			Thread.sleep(200);
	     
		 System.out.println("╚██████╔╝██║  ██║██║  ██║███████╗██║███████╗    ██║     ███████╗██║  ██║    ██║  ██║ ╚████╔╝ ███████╗██║  ██║    ╚██████╔╝██║╚██████╔╝╚██████╗██║  ██║   ██║   ╚██████╔╝ ");     
			Thread.sleep(200);
	     
		 System.out.println(" ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝╚══════╝    ╚═╝     ╚══════╝╚═╝  ╚═╝    ╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝  ╚═╝     ╚═════╝ ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝  ");     
			Thread.sleep(200);
		  
			for (int i = 0; i<20 ;i++) {
				Thread.sleep(200);
	         System.out.println();
			}
		
		} catch (InterruptedException e) {
			
		}
		gameOver(); // Termine del gioco
	}

	public void Dead() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(
					
			"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░░░░░░░░▓████████████████████████▒░░░░░░░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░░░░░▓█████▓▒░░░░░░░░░░░░░░░▒██████▒░░░░░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░░░████▒░░░░░░░░░░░░░░░░░░░░░░░░░▓███▒░░░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░██▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░██░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░██▒░██▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██▓░▒██░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░██▒░██░░░░░▒▒▓███▒░░░░░░░▒███▓▒▒░░░░░██░▓██░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░██░██░░██████████▒░░░░░▓██████████░░██▒██░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░████░████████████░░░░░████████████░████░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░░███░▒██████████░░░░░░░██████████▒░██▒░░░░░░░░░▒░░░░░░\n"+
			"░░░░░▒████░░░░░░░▓█▒░░█████████░░░░░░░░░█████████░░▒█▓░░░░░░▓████░░░░░\n"+
			"░░░░░██░▒██▒░░░░░██░░░░██████▓░░░░█░█░░░░███████░░░░██░░░░░███░░██░░░░\n"+
			"░░░░░██░░░██▓░░░░██░░░░░░▒▓▓░░░░▒██░██░░░░░▓▓▒░░░░░▒██░░░░███░░░██░░░░\n"+
			"░░░▓██▒░░░░████▓░░██░░░░░░░░░░░░███░███░░░░░░░░░░░░██░░█████░░░░▓██▒░░\n"+
			"░░██▓░░░░░░░░▒████████▓░░░░░░░░████░███▓░░░░░░░▒▓████████░░░░░░░░░███░\n"+
			"░░██▓▒▓███▓░░░░░░▓████████▓░░░░████░███▓░░░░▓████████▓░░░░░░████▓▓███░\n"+
			"░░░███████████▒░░░░░░███████░░░░██░░░██░░░░██████▓░░░░░░▓███████████░░\n"+
			"░░░░░░░░░░░░▓█████░░░░██▓▓░██░░░░░░░░░░░░░██░█▒██░░░▒█████▓░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░▒█████▒▒█▓█░███▓▓▒▒▒▓▒▒▓▓▓███▒███░▓█████░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░░░░▒████▒▓█▒▒█░█▒█░█░█▓█▒█▓░█░█████▒░░░░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░░░░░░░██░░██▓█▓█▓█▒█▒█▓█▓████░▓█▓░░░░░░░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░░░░░▓████▓░▓█▓█░█▒█░█░█▒█▒███▒░██████░░░░░░░░░░░░░░░░░░\n"+
			"░░░░░░░░░░░░░░░▓█████░░██░░░▒█████▓█▓█████▒░░░██░▒█████▓░░░░░░░░░░░░░░\n"+
			"░░░░░░▒██████████▓░░░░░███░░░░░░░░░░░░░░░░░░░██▒░░░░░▓██████████▒░░░░░\n"+
			"░░░░░░██░░░▓▓▓░░░░░░▒██████▓░░░░░░░░░░░░░░░███████▒░░░░░░▓▓▒░░▒██░░░░░\n"+
			"░░░░░░▓██░░░░░░░░▓████▓░░░█████▒░░░░░░▒▓█████░░░▓████▓░░░░░░░▒██▓░░░░░\n"+
			"░░░░░░░░███░░░░████▒░░░░░░░░▓█████████████▒░░░░░░░░▒████░░░░███░░░░░░░\n"+
			"░░░░░░░░░██░░░██▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓██░░░██░░░░░░░░\n"+
			"░░░░░░░░░██▒▓██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒██▒▓██░░░░░░░░\n"+
			"░░░░░░░░░░████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████░░░░░░░░░\n"+
			"QUALCOSA E' ANDATO STORTO...LA PROSSIMA VOLTA PRESTA PIU' ATTENZIONE!!\n");
			
			System.out.println("\n=============================================");
			System.out.println("Premi il tasto INVIO per continuare...");
			System.out.println("=============================================");
			br.readLine();
		} catch (IOException ex) {
			System.out.println("\n################################################");
			System.err.println("Impossibile terminare il gioco.\nEccezione verificata: " + ex);
			System.out.println("################################################");
		}

	}
	
	public void gameOver() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("                                            ████████╗██╗████████╗ █████╗ ███╗   ██╗██╗ ██████╗                                      ");
			System.out.println("                                            ╚══██╔══╝██║╚══██╔══╝██╔══██╗████╗  ██║██║██╔════╝                                          ");
			System.out.println("                                               ██║   ██║   ██║   ███████║██╔██╗ ██║██║██║                                         ");
			System.out.println("                                               ██║   ██║   ██║   ██╔══██║██║╚██╗██║██║██║                                      ");
			System.out.println("                                               ██║   ██║   ██║   ██║  ██║██║ ╚████║██║╚██████╗                                         ");
			System.out.println("                                               ╚═╝   ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝ ╚═════╝                                          ");
			System.out.println("████████╗██╗  ██╗███████╗    ██╗      ██████╗ ███████╗████████╗    ████████╗██████╗ ███████╗ █████╗ ███████╗██╗   ██╗██████╗ ███████╗");
			System.out.println("╚══██╔══╝██║  ██║██╔════╝    ██║     ██╔═══██╗██╔════╝╚══██╔══╝    ╚══██╔══╝██╔══██╗██╔════╝██╔══██╗██╔════╝██║   ██║██╔══██╗██╔════╝");
			System.out.println("   ██║   ███████║█████╗      ██║     ██║   ██║███████╗   ██║          ██║   ██████╔╝█████╗  ███████║███████╗██║   ██║██████╔╝█████╗  ");
			System.out.println("   ██║   ██╔══██║██╔══╝      ██║     ██║   ██║╚════██║   ██║          ██║   ██╔══██╗██╔══╝  ██╔══██║╚════██║██║   ██║██╔══██╗██╔══╝  ");
			System.out.println("   ██║   ██║  ██║███████╗    ███████╗╚██████╔╝███████║   ██║          ██║   ██║  ██║███████╗██║  ██║███████║╚██████╔╝██║  ██║███████╗");
			System.out.println("   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝ ╚═════╝ ╚══════╝   ╚═╝          ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝");
	        System.out.println("\nAlla prossima avventura!!!\n;)");
	
			
			System.out.println("\n=============================================");
			System.out.println("Premi il tasto INVIO per continuare...");
			System.out.println("=============================================");
			br.readLine();
		} catch (IOException ex) {
			System.out.println("\n################################################");
			System.err.println("Impossibile terminare il gioco.\nEccezione verificata: " + ex);
			System.out.println("################################################");
		} finally {
			System.exit(0);
		}

	}

	private void timerStampa(String input) {
		 textArray = input.toCharArray();
		 arrayDimension = input.length();

		 Effect typeWriter = new Effect();
		 typeWriter.playTypeWriter();
		 
		 for (int i = 0; i < arrayDimension; i++) {

				System.out.print(textArray[i]);

					try {

			Thread.sleep(20);

			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
			}
		 
		 typeWriter.stopTypeWriter();
		 
	}

	}