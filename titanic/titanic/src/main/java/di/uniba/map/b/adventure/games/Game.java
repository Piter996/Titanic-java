package di.uniba.map.b.adventure.games;

import di.uniba.map.b.adventure.more.Cronometro;
import di.uniba.map.b.adventure.more.Visual;
import di.uniba.map.b.adventure.parser.ParserOutput;
import di.uniba.map.b.adventure.type.AdvObject;
import di.uniba.map.b.adventure.type.AdvObjectContainer;
import di.uniba.map.b.adventure.type.CommandType;
import java.io.PrintStream;
import java.util.List;
//import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;



/**
 * @author Napoli Salvatore , Terrone Pietro
 */

@SuppressWarnings("serial")
public class Game extends GameDescription {

	private List <AdvObjectContainer> container = new ArrayList<>();

	private Cronometro cronometro = new Cronometro();

	private Initialize data = new Initialize();
		
	private int minuti, secondi;


	@Override
	//inizializza game
	public void NewGame() {
 
		try {
cronometro.run();
			data.setGame(this, container);
		} catch (Exception e) {
			System.out.println("######################################################");
			System.err.println("Impossibile inizializzare le istanze\n" + e.getMessage());
			System.out.println("######################################################");

		}
	}
	 
	//sincronizza il tempo
	public void checkTime() {
		
		secondi += cronometro.leggiSecondi();
		
		if (secondi >= 60) {
			minuti++;
		}
		
		secondi = secondi%60;
		
		cronometro = new Cronometro();
		
		cronometro.run();
		
	}

	@Override
	public void nextMove(ParserOutput p, PrintStream out) {		
		
		checkTime();
		
		Visual show = new Visual();

		//move
		boolean noroom = false;
		boolean move = false;
		
		
         //LAMBDA EXPRESSION
		 Runnable moving = () -> {

				out.println(getCurrentRoom().getName());
				out.println("================================================");
				out.println(getCurrentRoom().getDescription());
		};
		
		
		switch(p.getCommand().getType()) { //Se il comando inserito corrisponde a...



		case NORD:


			if((getCurrentRoom().getMission() == null) || (!getCurrentRoom().getMission().getActive()) || (getCurrentRoom().getMission().getLockedCommand() != CommandType.NORD)) {

				if (getCurrentRoom().getNorth() != null && (getCurrentRoom().getId() != 14 && getCurrentRoom().getId() != 16 && getCurrentRoom().getId() != 17 && getCurrentRoom().getId() != 18 && getCurrentRoom().getId() != 19 && getCurrentRoom().getId() != 20 && getCurrentRoom().getId() != 21)) {

					setCurrentRoom(getCurrentRoom().getNorth());

                    moving.run();

					move = true;

				} else {			
					out.println("Da quella parte non si può andare!  :{");

					noroom = true;
				}
			} else {
				getCurrentRoom().getMission().getMsgProblem();
			}

			break;


		case SOUTH:

			if((getCurrentRoom().getMission() == null) || (!getCurrentRoom().getMission().getActive()) || (getCurrentRoom().getMission().getLockedCommand() != CommandType.SOUTH)) {

				if (getCurrentRoom().getSouth() != null) {

					setCurrentRoom(getCurrentRoom().getSouth());


                    moving.run();

					move = true;

				} else {				
					out.println("Da quella parte non si può andare!  :{");
 
					noroom = true;
				}
			} else {
				getCurrentRoom().getMission().getMsgProblem();
			}
			break;


		case EAST:

			if((getCurrentRoom().getMission() == null) || (!getCurrentRoom().getMission().getActive()) || (getCurrentRoom().getMission().getLockedCommand() != CommandType.EAST)) {

				if (getCurrentRoom().getEast() != null && getCurrentRoom().getEast().isVisible()) {

					setCurrentRoom(getCurrentRoom().getEast());

                    moving.run();

					move = true;

				} else {	
					out.println("Da quella parte non si può andare! :{");

					noroom = true;
				}

			} else {
				getCurrentRoom().getMission().getMsgProblem();
			}
			break;


		case WEST:

			if((getCurrentRoom().getMission() == null) || (!getCurrentRoom().getMission().getActive()) || (getCurrentRoom().getMission().getLockedCommand() != CommandType.WEST)) {

				if (getCurrentRoom().getWest() != null) {

					setCurrentRoom(getCurrentRoom().getWest());


                    moving.run();

					move = true;

				} else {	
					out.println("Da quella parte non si può andare!  :~{");

					noroom = true;
				}
			} else {
				getCurrentRoom().getMission().getMsgProblem();
			}
			break;

		case TIME:

			out.println("Sono passati " + minuti + " minuti e " + secondi + " secondi");

			break;


		case USE:

			boolean found = false;

			if (p.getInvObject() != null) {

				if (getInventory().contains(p.getInvObject())) {
					
					
					found = true;
				}				
			}
			if (getCurrentRoom().getMission() != null && getCurrentRoom().getMission().getActive() && found) {

			this.setInventory(getCurrentRoom().getMission().isSolution(p, getInventory()));
			
			} else if (!found) {

				out.println("ma certooo, é un ottima idea... peccato che non abbiamo questo oggetto BOOMER");
				getCurrentRoom().getMission().addAttempts();

			}
			break;

		case EXAMINES:

			if((getCurrentRoom().getMission() == null) ||
					(getCurrentRoom().getMission() != null) &&
					(((getCurrentRoom().getMission().getActive()) &&
							(!getCurrentRoom().getMission().getLockedObject().equals(p.getContainer()) ||
									(getCurrentRoom().getMission().getLockedCommand() != CommandType.EXAMINES))) ||
							            !getCurrentRoom().getMission().getActive()) ) {

				if(p.getObject() != null || p.getInvObject() != null || p.getContainer() != null) {

					if(p.getObject() != null) {											

							if (p.getObject().isExaminable()) {
								
								if(p.getObject().isOpen()) {

									out.println(p.getObject().getDescription());

								} else {

									out.println(p.getObject().getName() + " e' chiuso");
								}

						}
						
					} else if (p.getContainer() != null) {
						
								if(p.getContainer().isOpen()) {

									out.println(p.getContainer().getDescription());

								} else {

									out.println(p.getContainer().getName() + " e' chiuso");
								}
							
						

					} else if (p.getInvObject() != null) {

						if (p.getInvObject().isExaminable()) {

							if(p.getInvObject().isOpen()) {

								System.out.print(p.getInvObject().getName());

								if(p.getInvObject() != null) {


									AdvObjectContainer inv = (AdvObjectContainer) p.getInvObject();
									out.print(" contiene:\n");
									for(AdvObject view : inv.getList() )

										out.println(view.getName());

								}
							} else {

								out.println(p.getInvObject().getName() + " e' chiuso");
							}


						} else {

							System.out.println("Non puoi esaminare questo oggetto");
						}

					} else {

						System.out.println("Non puoi esaminare questo oggetto");
					}
				}

			}
			break; 


		case LOOK_AT: //Osserva
			if (getCurrentRoom().getLook() != null) {

				out.println(getCurrentRoom().getName());
				out.println(getCurrentRoom().getLook());

			} else {

				out.println("Non c'è niente di interessante qui.");
			}

			break;

		case IMMERSE_YOURSELF: //Immergiti
			
			if((getCurrentRoom().getMission() == null) ||
					(!getCurrentRoom().getMission().getActive()) ||
					(getCurrentRoom().getMission().getLockedCommand() != CommandType.IMMERSE_YOURSELF)) {

				if (getCurrentRoom().getId() == 14 | getCurrentRoom().getId() == 16 | getCurrentRoom().getId() == 17 | getCurrentRoom().getId() == 18 | getCurrentRoom().getId() == 19 | getCurrentRoom().getId() == 20 | getCurrentRoom().getId() == 21 ) {
					setCurrentRoom(getCurrentRoom().getNorth());

                    moving.run();

				} else {
					
					out.println("Non puoi immergerti da questo punto."); 
				}
			} else if (getCurrentRoom().getId() == 14) {
			
			getCurrentRoom().getMission().isSolution(p, getInventory().listIterator());				
			
			if(!getCurrentRoom().getMission().getActive()) {
				
				setCurrentRoom(getCurrentRoom().getNorth());

                moving.run();
				
			}
			} else {
				getCurrentRoom().getMission().getMsgProblem();
			}
			break;

		case PICK_UP: //Prendi


			if (p.getObject() != null) {

				if (p.getObject().isPickupable() && p.getObject().isAccessible()) {

					if(p.getObject() instanceof AdvObjectContainer) {

						container.remove(p.getContainer());

						Iterator <AdvObjectContainer> l = container.listIterator();

						try {
							while(l.hasNext()) {

								l.next().remove(p.getContainer());

							}
						} catch (NoSuchElementException e ) {

							l.next().remove(p.getContainer());

						} finally {

							getInventory().add(p.getContainer());

							out.println("Hai preso '" + p.getContainer().getName() + "'");

						}

					} else {
						Iterator <AdvObjectContainer> l = container.iterator();

						try {
							while(l.hasNext()) {

								l.next().remove(p.getObject());

							}
						} catch (NoSuchElementException e) {

							l.next().remove(p.getObject());

						} finally {

							getInventory().add(p.getObject());

							out.println("Hai preso '" + p.getObject().getName() + "'");


						}
					} 
					getInventory().add(p.getObject());
					getCurrentRoom().getObjects().remove(p.getObject());
				
				} else if (p.getObject().isPickupable() && p.getObject().isOpen() == false || p.getContainer().isPickupable() && p.getContainer().isOpen() == false  ) {
				
					out.println("Dovresti aprire qualcosa prima.");
					
				}
				else {
					out.println("Non puoi raccogliere questo oggetto.");
				}

			}
			else {
				out.println("Non c'è niente da raccogliere oppure specifica bene.");
			}

			break;

		case OPEN: //Apri
				if (p.getContainer() == null && p.getInvObject() == null) {
					
					out.println("Non credo di aver capito.");

				} else {
			
					if((getCurrentRoom().getMission() == null) ||
							
							(getCurrentRoom().getMission() != null) &&
							
							( ( getCurrentRoom().getMission().getActive()  &&
							
									(getCurrentRoom().getMission().getLockedCommand() != CommandType.OPEN) ) ||
									
									(getCurrentRoom().getMission().getActive()) && !getCurrentRoom().getMission().getLockedObject().equals(p.getContainer())) ) {

				

					boolean printed = false; //evita che il messaggio di apertura avvenga piu' volte
					
					if (p.getContainer() != null) {

						if (p.getContainer().isOpenable() && !p.getContainer().isOpen()) {
							
							if (p.getContainer().isAccessible()) { 
								
								if (!p.getContainer().isPickupable()) {
														
							p.getContainer().setOpen(true);
														
							out.println("Hai aperto: " + p.getContainer().getName());
							
							printed = true;
							
							AdvObjectContainer c =p.getContainer();

							if (!c.getList().isEmpty()) {

								Iterator<AdvObject> it = c.getList().iterator();

								while (it.hasNext()) {

									AdvObject next = it.next();
									next.setAccessible(true);
								}

							} else {

								if (!printed)
								{

									out.println("Hai aperto: " + p.getObject().getName());
									p.getObject().setOpen(true);
								}
							}
							} else {
								
								out.println("Dovresti prenderla prima di aprirla");
								
							}
							} else {
								out.println("Dovresti aprire qualcosa prima");
							}
						} else if (p.getContainer().isOpen() == true) {

							out.println("Questo oggetto è già stato aperto");
						
						} else {

							out.println("Non puoi aprire questo oggetto");
						}
						} else if (p.getInvObject() != null) {
												
						if (p.getInvObject().isOpenable() && p.getInvObject().isOpen() == false) {
							
							if (p.getInvObject().isAccessible()) {

							p.getInvObject().setOpen(true);

							if (p.getInvObject() instanceof AdvObjectContainer) {

								AdvObjectContainer c = (AdvObjectContainer) p.getInvObject();
								if (!c.getList().isEmpty()) {


									Iterator<AdvObject> it = c.getList().iterator();
									while (it.hasNext()) {

										AdvObject next = it.next();
										out.println("Hai ottenuto " + next.getName());
										getInventory().add(next);
										getCurrentRoom().getObjects().remove(next);
										next.setAccessible(true);

									}
								} else {

									p.getInvObject().setOpen(true);
								}

								out.println("Hai aggiunto nel tuo inventario gli oggetti di: " + p.getInvObject().getName());

							} else {

								out.println("Non puoi aprire questo oggetto.");
							}
						}
						} else if( p.getInvObject().isOpen() == true)  {
							
							out.println("Questo oggetto è già stato aperto.");
						}

					}
				
			} else {
				getCurrentRoom().getMission().getMsgProblem();
			}
			}
			break;

		case HELP:

			show.help();

			break;

		case END:
			show.gameOver();

		default:

			if (noroom) {

				out.println("Da quella parte non si può andare! *SAD FACE* \n");

			} else if (move) {
				
                moving.run();

			} 
		}
	}

	public void fermaTempo() {
		cronometro.ferma();
	}

	public void avviaTempo() {
		cronometro.run();
	}
}

