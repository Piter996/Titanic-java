package di.uniba.map.b.adventure.games;

import java.io.Serializable;
import java.util.List;

import di.uniba.map.b.adventure.Mission;
import di.uniba.map.b.adventure.type.AdvObject;
import di.uniba.map.b.adventure.type.AdvObjectContainer;
import di.uniba.map.b.adventure.type.Command;
import di.uniba.map.b.adventure.type.CommandType;
import di.uniba.map.b.adventure.type.Room;

@SuppressWarnings("serial")
public class Initialize implements Serializable{



	public void setGame(Game game, List<AdvObjectContainer> container) {

		//Inizializzazione dei comandi
		Command nord = new Command(CommandType.NORD, "nord");
		nord.setAlias(new String[]{"nord"});
		game.getCommands().add(nord);

		Command sud = new Command(CommandType.SOUTH, "sud");
		sud.setAlias(new String[]{"sud"});
		game.getCommands().add(sud);

		Command east = new Command(CommandType.EAST, "est");
		east.setAlias(new String[]{"est"});
		game.getCommands().add(east);

		Command west = new Command(CommandType.WEST, "ovest");
		west.setAlias(new String[]{"ovest"});
		game.getCommands().add(west);

		Command inventory = new Command(CommandType.INVENTORY, "inventario");
		inventory.setAlias(new String[]{"inventario"});
		game.getCommands().add(inventory);

		Command end = new Command(CommandType.END, "end");
		end.setAlias(new String[]{"end", "fine", "esci", "muori", "ammazzati", "ucciditi", "suicidati","exit","quit"});
		game.getCommands().add(end);

		Command use = new Command(CommandType.USE, "usa");
		use.setAlias(new String[]{"usa", "utilizza"});
		game.getCommands().add(use);

		Command look = new Command(CommandType.LOOK_AT, "osserva");
		look.setAlias(new String[]{"guarda", "vedi", "trova", "cerca", "descrivi"});
		game.getCommands().add(look);

		Command pickup = new Command(CommandType.PICK_UP, "raccogli");
		pickup.setAlias(new String[]{"prendi"});
		game.getCommands().add(pickup);

		Command immerseYourself = new Command(CommandType.IMMERSE_YOURSELF, "immergiti");
		immerseYourself.setAlias(new String[]{"tuffati","scendi"});
		game.getCommands().add(immerseYourself);

		Command open = new Command(CommandType.OPEN, "apri");
		open.setAlias(new String[]{});
		game.getCommands().add(open);

		Command push = new Command(CommandType.PUSH, "premi");
		push.setAlias(new String[]{"spingi", "attiva"});
		game.getCommands().add(push);

		Command examines = new Command(CommandType.EXAMINES, "esamina");
		examines.setAlias(new String[] {"studia", "controlla"});
		game.getCommands().add(examines);

		Command help = new Command (CommandType.HELP, "aiuto");
		help.setAlias(new String[] {"?"});
		game.getCommands().add(help);

		Command time = new Command (CommandType.TIME, "tempo");
		time.setAlias(new String[] {"cronometro, orologio"});
		game.getCommands().add(time);

		//Inizializzazione delle stanze
		Room shipDeck = new Room(14, "Ponte navale", "Sei sul ponte della tua imbarcazione per la spedizione");
		shipDeck.setLook("Sei sul ponte della tua nave, puoi immergerti o andare a Sud nella tua cabina");

		Room cockpit = new Room(15, "Cabina nave spedizione", "Sei all'interno della tua cabina");
		cockpit.setLook("C'e' solo il tuo armadio e un letto, ma non mi sembra un buon momento per dormire");

		Room kitchens = new Room(0, "Cucine", "Non ho mai visto una cucina cosi grande, devo ricordarmi che sono a dieta pero'");
		kitchens.setLook("Ci sono dei fornelli mentre dall'altra parte della cucina c'e' un armadietto");

		Room restaurant = new Room(1, "Ristorante", "Essendo pieno di tavoli e sedie, deduco che questo sia il ristorante");
		restaurant.setLook("A parte tavoli e sedie non vedo nulla di interessante");

		Room foodStorage = new Room(2, "Dispensa", "Ho l'acquolina in bocca, questa dovrebbe essere la dispensa, "
				+ "dal momento che gli scaffali sono pieni di cibo...");
		foodStorage.setLook("A parte cibo scaduto, non vedo nient'altro");

		Room nostromoCabin = new Room(3, "Cabina Nostromo", "Sei nella cabina Nostromo.");
		nostromoCabin.setLook("C'e' un letto, che a occhio sembra anche abbastanza scomodo, \r\n"
				+ "a sinista un comodino malconcio e avanti al letto un baule.");

		Room purser = new Room(4, "Cabina Commissario di Bordo", "Finalmente nella cabina commissario di bordo");
		purser.setLook("C'e' un letto che apparentemente sembra molto comodo, inoltre c'e' \r\n"
				+ "un baule avanti al letto e un armadio");

		Room engineManagerCabin = new Room(5, "Cabina Direttore Macchine", "Sei nella cabina direttore di macchine");
		engineManagerCabin.setLook("Oltre a un letto c'e' un comodino e quello che doveva essere un armadio\r\n"
				+ "prima che qualche squalo decidesse di usarlo come stuzzicadenti");

		Room engineMasterCabin = new Room(6, "Cabina Maestro di Macchine", "Sei nella cabina maestro di macchine");
		engineMasterCabin.setLook("La parete ormai non c'e' piu', non é rimasto piu' nulla...\r\n"
				+ "E' rimasto soltanto un pezzo di ferro che potrei usare come leva.");

		Room medicalCabinOnBoard = new Room(7, "Cabina Medico di Bordo", "Sei nella cabina medico di bordo");
		medicalCabinOnBoard.setLook("Speriamo in un bel 30");

		Room secondCaptainCabin = new Room(8, "Cabina Comandante in Seconda", "Sei nella Cabina Comandante in Seconda.");
		secondCaptainCabin.setLook("Chi dormiva qui doveva avere di sicuro problemi \r\n"
				+ "ad addormentarsi con un cuscino cosi grande. Il comodino accanto al letto\r\n"
				+ "si e' trasformato in un giardino di alghe.");

		Room nonCommissionedOfficersCorridor = new Room(9, "Corrdoio Sottoufficiali", "Da qui si entra nelle cabine dei sottoufficiali");
		nonCommissionedOfficersCorridor.setLook("Ci sono due cabine...\r\n"
				+ "una a nord e una a sud, su entrambe c'e' una targhetta");


		Room corridorOfOfficers1 = new Room(10, "Corridoio degli ufficiali 1", "Questo e'il primo corridoio ufficiali. ");
		corridorOfOfficers1.setLook("Ci sono due cabine e un altro corridoio a est\r\n"
				+ "una a nord e una a sud, su entrambe c'e' una targhetta davanti alle porta a Nord c'e' uno zerbino");

		Room corridorOfOfficers2 = new Room(11, "Corridoio degli ufficiali 2", "Questo e' il secondo corridoio degli ufficiali. ");
		corridorOfOfficers2.setLook("Ci sono tre cabine una a nord, una a sud.\r\n"
				+ "su tutte e tre c'e' una targhetta");

		Room captainsCabin = new Room(12, "Cabina Comandante", "Wow!...\r\n"
				+ "Il comandante si trattava bene...");
		captainsCabin.setLook("Il letto sembra quello di un Re, una scrivania in legno di mogano e' posta \r\n"
				+ "al centro della stanza mentre sulla parete c'e' una libreria stracolma di libri,\r\n"
				+ "e sulla parete a nord c'e' un enorme quadro in cui e' immortalata un epica battaglia\r\n"
				+ "tra un riccio blu e un uomo in tuta da lavoro e con una M sul cappello.\r\n"
				+ "");

		Room safe = new Room(13, "Cassaforte", "Che spreco di spazio (e di codice)");
		safe.setLook("Forse ci siamo...al centro della stanza c'e' un piedistallo con sopra un contenitore");
		safe.setVisible(false);

		Room liv1 = new Room(16, "Pelo dell'acqua", "Sei ancora lontano dal fondale, devi immergerti di piu'");
		liv1.setLook("Sei nel mare, puoi scendere in profondità");

		Room liv2 = new Room(17, "Appena sotto la superficie", "Sei finito in mezzo a un banco di meduse non puoi proseguire");
		liv2.setLook("Sei nel mare, puoi scendere in profondità");

		Room liv3 = new Room(18, "Molto sotto la superficie", "Sei ancora lontano dal fondale, devi immergerti di piu'");
		liv3.setLook("Sei nel mare, puoi scendere in profondità");

		Room liv4 = new Room(19, "Siamo a meta' strada", "C'e' qualcosa di strano... Oh mamma uno squalo!!! (hai 3 tentativi per trovare una soluzione)");
		liv4.setLook("Sei nel mare, puoi scendere in profondità");

		Room liv5 = new Room(20, "Siamo poco lontani dal fondale", "I raggi del sole non arrivano fin qui");
		liv5.setLook("Sei nel mare, puoi scendere in profondità");

		Room liv6 = new Room(21, "Quasi sul fondale", "Vedi una piccola luce in lontanaza, ma e' troppo buoio per capire di cosa si tratta");
		liv6.setLook("Sei nel mare, puoi scendere in profondità");
		liv6.setVisible(false);

		Room access = new Room(22, "Fondo del mare", "Vedi il relitto a nord");
		access.setLook("Sei di fronte al relitto");


		//Inizializzazione della mappa
		kitchens.setEast(restaurant);

		restaurant.setNorth(nonCommissionedOfficersCorridor);
		restaurant.setEast(foodStorage);
		restaurant.setWest(kitchens);

		foodStorage.setWest(restaurant);

		nostromoCabin.setEast(nonCommissionedOfficersCorridor);

		purser.setEast(corridorOfOfficers1);

		engineManagerCabin.setEast(corridorOfOfficers2); //manager (direttore)

		engineMasterCabin.setWest(nonCommissionedOfficersCorridor);//master (maestro)

		medicalCabinOnBoard.setWest(corridorOfOfficers1);

		secondCaptainCabin.setWest(corridorOfOfficers2);

		nonCommissionedOfficersCorridor.setNorth(corridorOfOfficers1);
		nonCommissionedOfficersCorridor.setSouth(restaurant);
		nonCommissionedOfficersCorridor.setEast(engineMasterCabin);
		nonCommissionedOfficersCorridor.setWest(nostromoCabin);

		corridorOfOfficers1.setNorth(corridorOfOfficers2);
		corridorOfOfficers1.setSouth(nonCommissionedOfficersCorridor);
		corridorOfOfficers1.setEast(medicalCabinOnBoard);
		corridorOfOfficers1.setWest(purser);

		corridorOfOfficers2.setNorth(captainsCabin);
		corridorOfOfficers2.setSouth(corridorOfOfficers1);
		corridorOfOfficers2.setEast(secondCaptainCabin);
		corridorOfOfficers2.setWest(engineMasterCabin);

		captainsCabin.setNorth(safe);
		captainsCabin.setSouth(corridorOfOfficers2);

		safe.setSouth(captainsCabin);

		cockpit.setNorth(shipDeck);
		shipDeck.setSouth(cockpit);
		shipDeck.setNorth(liv1);
		liv1.setNorth(liv2);
		liv2.setNorth(liv3);
		liv3.setNorth(liv4);
		liv4.setNorth(liv5);
		liv5.setNorth(liv6);
		liv6.setNorth(access);
		access.setNorth(restaurant);


		//aggiunta delle stanze
		game.getRooms().add(shipDeck);                          //ponte della nave piccola
		game.getRooms().add(cockpit);                           //interno nave piccola
		game.getRooms().add(kitchens);                          //cucina della nave
		game.getRooms().add(restaurant);                        //ristorante della nave
		game.getRooms().add(foodStorage);                       //dispensa della nave
		game.getRooms().add(nostromoCabin);                     //cabina del nostromo
		game.getRooms().add(purser);   						    //cabina commissario di bordo
		game.getRooms().add(engineManagerCabin);				//cabina direttore macchina  
		game.getRooms().add(engineMasterCabin);					//cabina maestro di macchina
		game.getRooms().add(medicalCabinOnBoard);				//cabina medico di bordo
		game.getRooms().add(secondCaptainCabin);				//cabina comandante in seconda
		game.getRooms().add(nonCommissionedOfficersCorridor);   //corridoio dei sottoufficiali
		game.getRooms().add(corridorOfOfficers1);               //corridoio degli ufficiali 1
		game.getRooms().add(corridorOfOfficers2);               //corridoio degli ufficiali 2 
		game.getRooms().add(captainsCabin);                     //cabina del capitano
		game.getRooms().add(safe);                              //cassaforte
		game.getRooms().add(access);                            //ultimo livello del mare
		game.getRooms().add(liv1);                              //livello 1 del mare
		game.getRooms().add(liv2);                              //livello 2 del mare
		game.getRooms().add(liv3);                              //livello 3 del mare 
		game.getRooms().add(liv4);                              //livello 4 del mare
		game.getRooms().add(liv5);                              //livello 5 del mare
		game.getRooms().add(liv6);                              //livello 6 del mare




		//set starting room
		game.setCurrentRoom(shipDeck);






		//Inizializzazione degli oggetti
		AdvObject torch = new AdvObject(1, "Torcia Marina", "...potrebbe illuminarmi il cammino nei percorsi piu' bui.");
		torch.setAlias(new String[]{"torcia","torcia marina", "fiaccola", "lampadina", "lampioncino", "luce"});
		torch.setOpenable(false);
		cockpit.getObjects().add(torch); // Aggiungi alla stanza
		torch.setAccessible(false);
		torch.setPickupable(true);

		AdvObject glove = new AdvObject(2, "Guanto Protettivo", "...potrebbe tornarmi utile.");
		glove.setAlias(new String[] {"protezione", "guanto protettivo", "guanto"});
		cockpit.getObjects().add(glove); // Aggiungi alla stanza
		glove.setAccessible(false);
		glove.setPickupable(true);

		AdvObject harpoon = new AdvObject(3, "Arpione", "...potrebbe tornarmi utile contro i pericoli.");
		harpoon.setAlias(new String[]{"rampone","fiocina", "lancia","arpione", "fucile"});
		cockpit.getObjects().add(harpoon); // Aggiungi alla stanza
		harpoon.setPickupable(true);
		harpoon.setAccessible(false);

		AdvObject rubberDuck = new AdvObject(5, "Papera di Gomma", "...potrebbe portarmi fortuna.");
		rubberDuck.setAlias(new String[]{"papera di gomma", "papera", "paperella", "paperella di gomma"});
		rubberDuck.setPickupable(true);
		rubberDuck.setAccessible(false);

		AdvObject knife = new AdvObject(9, "Coltello", "...potrebbe tornarmi utile.");
		knife.setAlias(new String[] {"coltello", "lama", "coltellino", "cortello"});
		knife.setPickupable(true);
		knife.setExaminable();
		knife.setAccessible(true);
		kitchens.getObjects().add(knife);

		AdvObject key1 = new AdvObject(10, "Chiave cabina Nostromo", "...chissa' cosa apre.");
		key1.setAlias(new String[] {"chiave","chiave del nostromo", "chiave nostromo"});
		key1.setPickupable(true);
		key1.setExaminable();
		key1.setAccessible(false);
		kitchens.getObjects().add(key1);

		AdvObject note1 = new AdvObject(11, "Bigliettino", "Il biglietto ormai e' illeggibile, riesco a leggere solamente \r\n"
				+ "la firma... \"Nostromo Smith\"");
		note1.setAlias(new String[] {"biglietto", "bigliettino", "nota", "foglio"});
		note1.setPickupable(true);
		note1.setExaminable();
		note1.setAccessible(false);
		kitchens.getObjects().add(note1);

		AdvObject plates1 = new AdvObject(12,"Targhette", "Su quella a Nord c'e' scritto 'Nostromo Smith' mentre, su quella a Sud 'Maestro Macchine Nelson'");
		plates1.setAlias(new String[] {"targhetta", "targhette", "targhetta a nord", "targhetta a sud"});
		plates1.setPickupable(false);
		plates1.setExaminable();
		nonCommissionedOfficersCorridor.getObjects().add(plates1);

		AdvObject lever = new AdvObject (14, "Un pezzo di ferro", " ...potrei usarlo come leva.");
		lever.setAlias(new String[] {"leva", "pezzo di ferro"});
		lever.setExaminable();
		engineMasterCabin.getObjects().add(lever);

		AdvObject postCard = new AdvObject(16, "Una cartolina", " E' dell'innaugurazione del Titanic, dietro c'e' scritto \"Niente potra'\r\n"
				+ "impedirmi di tornare da te\"... Fors enon ha fatto in tempo a spedirla.");
		postCard.setAlias(new String[] {"cartolina"});
		postCard.setExaminable();
		postCard.setAccessible(false);
		nostromoCabin.getObjects().add(postCard);

		AdvObject key2 = new AdvObject (17, "Chiave del baule", "Questa chiave apre il baule situato nella cabina del Nostromo");
		key2.setAlias(new String[] {"chiave","chiave del baule", "chiave del baule del nostromo"});
		key2.setExaminable();
		key2.setAccessible(false);
		nostromoCabin.getObjects().add(key2);

		AdvObject sheet = new AdvObject (19, "Un foglietto", "C'e' scritto \"nel caso in cui non riuscissi ad arrivare in tempo, aspettami\r\n"
				+ "dentro... La chiave e' sotto lo zerbino. \r\n"
				+ "P.S. Pulisciti bene i piedi prima di entrare       J.K.\". ");
		sheet.setAlias(new String[] {"foglio", "foglietto", "lettera"});
		sheet.setExaminable();
		nostromoCabin.getObjects().add(sheet);

		AdvObject plates2 = new AdvObject (20, "Targhette corridoio ufficiali 1", "Sulla porta a Nord c'e' scritto \"Commissario Bordo John Kelvin\" \r\n"
				+ "su quella a Sud \"Medico di Bordo Johnson \" " );
		plates2.setAlias(new String[] {"targhetta", "targhette", "targhetta a nord", "targhetta a sud"});
		plates2.setPickupable(false);
		plates2.setExaminable();
		corridorOfOfficers1.getObjects().add(plates2);

		AdvObject key3 = new AdvObject (21, "Chiave commissario di Bordo", "...apre la Cabina del Commisario di Bordo");
		key3.setAlias(new String[] {"chiave","chiave commissario di bordo"});
		key3.setExaminable();
		corridorOfOfficers1.getObjects().add(key3);

		AdvObject key4 = new AdvObject (26, "Chiave 1 cabina del comandante", "...e una delle due chiavi che apre la cabina del Comandante");
		key4.setAlias(new String[] {"chiave","chiave 1 cabina del comandante"});
		key4.setExaminable();
		key4.setAccessible(false);
		purser.getObjects().add(key4);


		AdvObject key5 = new AdvObject (22, "Chiave 2 cabina del comandante", "...e' una delle due chiavi che apre la cabina del comandante");
		key5.setAlias(new String[] {"chiave","chiave 2 cabina del comandante"});
		key5.setExaminable();
		key5.setAccessible(false);
		secondCaptainCabin.getObjects().add(key5);

		AdvObject plates3 = new AdvObject (27, "Targhette corridoio degli ufficiali 2", "Sulla targhetta Nord c'e' scritto \"Direttore Macch. Fitzgerald\" \r\n"
				+ "su quella a Sud \"Comandante in 2 Eggman\" mentre su quella ad Est \"Comandante Basile\"");
		plates3.setAlias(new String[] {"targhetta", "targhette", "targhetta a nord", "targhetta a sud"});
		plates3.setPickupable(false);
		plates3.setExaminable();
		corridorOfOfficers2.getObjects().add(plates3);		

		AdvObject sheet2 = new AdvObject (29, "Un foglietto", "C'e' scritto \"La chiave di riserva della cabina del comandante é al sicuro,\r\n"
				+ "l'ho riposta nel baule, e nessuno potra' trovarla, a meno che non\r\n"
				+ "\"esamini meglio\"");
		sheet2.setAlias(new String[] {"foglio", "foglietto", "lettera"});
		sheet2.setExaminable();
		engineManagerCabin.getObjects().add(sheet2);

		AdvObject sheet3 = new AdvObject (31, "Un foglietto", "\"Letture Consigliate:\r\n"
				+ "1 ventimila leghe sotto i mari \r\n"
				+ "2 il piccolo lord\r\n"
				+ "3 cronache del ghiaccio e del fuoco\r\n"
				+ "4 linguaggi per la programmazione a oggetti \"");
		sheet3.setAlias(new String[] {"foglietto", "foglio"});
		sheet3.setExaminable();
		captainsCabin.getObjects().add(sheet3);

		AdvObject library1 = new AdvObject(33, "Una libreria", "Mi e' sempre piaciuto leggere");
		library1.setAlias(new String[] {"libreria"});
		library1.setPickupable(false);
		library1.setExaminable();
		captainsCabin.getObjects().add(library1);		

		AdvObject painting = new AdvObject (32, "Quadro", "Questo quadro fa venire la pelle d'oca");
		painting.setAlias(new String[] {"quadro"});
		painting.setExaminable();
		painting.setPickupable(false);
		captainsCabin.getObjects().add(painting);

		AdvObject sheet4 = new AdvObject(35, "un foglietto", "Grazie per aver giocato");
		sheet4.setAlias(new String[] {"foglietto", "foglio", "messaggio"});
		sheet4.setExaminable();

		//Inizializzazione dei contenitori
		AdvObjectContainer moult = new AdvObjectContainer(4, "Muta", "...sara' indispensabile per immergersi");
		moult.setAlias(new String[]{"muta"});
		moult.add(harpoon);
		moult.add(glove);
		moult.add(torch);
		moult.add(rubberDuck);
		moult.setPickupable(true);
		moult.setExaminable();
		moult.setOpenable(true);
		moult.setOpen(false);
		moult.setAccessible(false);
		cockpit.getObjects().add(moult); // Aggiungi alla stanza
		container.add(moult);

		AdvObjectContainer safeContainer = new AdvObjectContainer(34, "Contenitore", "All'interno c'e' messaggio...");
		safeContainer.setAlias(new String[] {"contenitore", "scatolo", "barbabietola"});
		safeContainer.setPickupable(false);
		safeContainer.setOpen(true);
		safeContainer.setExaminable();
		safeContainer.add(sheet4);
		safe.getObjects().add(safeContainer);

		AdvObjectContainer desk = new AdvObjectContainer (30, "Scrivania del capitano", "C'e' un foglio");
		desk.setAlias(new String[] {"scrivania", "scrivania del comandante"});
		desk.setPickupable(false);
		desk.setExaminable();
		desk.add(sheet3);
		captainsCabin.getObjects().add(desk);

		AdvObjectContainer bedsideTable2 = new AdvObjectContainer (28, "Comodino Cabina Nostromo", "C'e' una lettera sopra");
		bedsideTable2.setAlias(new String[] {"comodino"});
		bedsideTable2.setOpenable(true);
		bedsideTable2.setOpen(false);
		bedsideTable2.setPickupable(false);
		bedsideTable2.setExaminable();
		bedsideTable2.add(sheet2);
		container.add(bedsideTable2);
		engineManagerCabin.getObjects().add(bedsideTable2);

		AdvObjectContainer pillow = new AdvObjectContainer (25, "Cuscino cabina Comandante in Seconda", "All'interno c'e' una chiave");
		pillow.setAlias(new String[] {"baule"});
		pillow.setOpenable(true);
		pillow.setOpen(false);
		pillow.setPickupable(false);
		pillow.setExaminable();
		pillow.add(key5);
		container.add(pillow);
		secondCaptainCabin.getObjects().add(pillow);	

		AdvObjectContainer wardrobe2 = new AdvObjectContainer (24, "Armadio Cabina del Commisario di Bordo", "Uno strano rumore proviene dall'armadio");
		wardrobe2.setAlias(new String[] {"armadio"});
		wardrobe2.setOpen(true);
		wardrobe2.setPickupable(false);
		wardrobe2.setExaminable();
		container.add(wardrobe2);
		purser.getObjects().add(wardrobe2);

		AdvObjectContainer trunk2 = new AdvObjectContainer (23, "Baule Cabina Commissario Bordo", "Il Baule e' vuoto");
		trunk2.setAlias(new String[] {"baule"});
		trunk2.setOpenable(true);
		trunk2.setOpen(false);
		trunk2.setPickupable(false);
		trunk2.setExaminable();
		trunk2.add(key4);
		container.add(trunk2);
		purser.getObjects().add(trunk2);


		AdvObjectContainer bedsideTable = new AdvObjectContainer (18, "Comodino Cabina Nostromo", "All'interno c'e' la chiave del baule e sotto un foglietto");
		bedsideTable.setAlias(new String[] {"comodino"});
		bedsideTable.setOpenable(true);
		bedsideTable.setOpen(false);
		bedsideTable.setPickupable(false);
		bedsideTable.setExaminable();
		bedsideTable.add(key2);
		container.add(bedsideTable);
		nostromoCabin.getObjects().add(bedsideTable);

		AdvObjectContainer trunk = new AdvObjectContainer(15, "Baule Cabina Nostromo", "All'interno c'e' una cartolina");
		trunk.setAlias(new String[] {"baule"});
		trunk.setOpenable(true);
		trunk.setOpen(false);
		trunk.setPickupable(false);
		trunk.setExaminable();
		trunk.add(postCard);
		container.add(trunk);
		nostromoCabin.getObjects().add(trunk);

		AdvObjectContainer locker = new AdvObjectContainer(13, "Armadietto cucina", "Mi sembra di vedere una chiave sopra un foglietto");
		locker.setAlias(new String[] {"armadietto", "armadio", "contenitore", "dispensa"});
		locker.setOpenable(true);
		locker.setPickupable(false);
		locker.setExaminable();
		locker.add(note1);
		locker.add(key1);
		container.add(locker);
		kitchens.getObjects().add(locker);


		AdvObjectContainer wardrobe = new AdvObjectContainer(6, "Armadio", "All'interno c'e' una Muta che contiene la tua attrezzatura");
		wardrobe.setAlias(new String[]{"guardaroba", "vestiario", "armadio"});
		wardrobe.setOpenable(true);
		wardrobe.setOpen(false);
		wardrobe.setPickupable(false);
		cockpit.getObjects().add(wardrobe);
		wardrobe.setExaminable();
		wardrobe.add(moult);
		container.add(wardrobe);

		AdvObjectContainer cookers = new AdvObjectContainer (7, "Fornelli", "Sopra c'e' un coltello molto affilato ");
		cookers.setAlias(new String[]{"fornelli", "forno"});
		cookers.setExaminable();
		cookers.setOpen(true);
		cookers.setPickupable(false);
		container.add(cookers);
		cookers.add(knife);
		kitchens.getObjects().add(cookers);	

		//Inizializzazione delle missioni
		Mission jellyfish = new Mission ("meduse", CommandType.USE, glove, "Un banco di meduse sbarra la strada... potresti farti strada spostandole se avessi qualcosa per proteggerti", "Hai spostato le meduse senza ferirti, la via e' libera", CommandType.IMMERSE_YOURSELF,1);
		liv2.setMission(jellyfish);

		Mission shark = new Mission ("squalo", CommandType.USE, harpoon, "Oh m***a, uno squalo sta venendo verso di te... devi fare qualcosa", "Colpito, lo squalo non sara' piu' un problema", CommandType.IMMERSE_YOURSELF, 3);
		liv4.setMission(shark);

		Mission darkness = new Mission ("buio", CommandType.USE, torch, "I raggi del sole non arrivano fin qui, in queste condizioni non puoi continuare la missione!", "E luce fu", CommandType.IMMERSE_YOURSELF);
		liv5.setMission(darkness);

		Mission abyssalFish = new Mission ("pesce abissale", CommandType.USE, rubberDuck, "Un pesce dall'aria mooolto pericolosa ti impedisce di scendere ancora, devi trovare il modo di distrarlo", "Povera paperella... ma almeno ha funzionato", CommandType.IMMERSE_YOURSELF,1);
		liv6.setMission(abyssalFish);

		Mission nostromoCabinKey  = new Mission ("accesso cabina nostromo", CommandType.USE, key1, "Per accedere serve una chiave, ma quale??", "Si e' aperta", CommandType.NORD );
		nonCommissionedOfficersCorridor.setMission(nostromoCabinKey);

		Mission lockedDoor1 = new Mission ("porta bloccata ", CommandType.USE, lever, "La porta é bloccata... avrei bisogno di qualcosa per forzarla", "Si e' aperta", CommandType.EAST);
		nonCommissionedOfficersCorridor.setMission(lockedDoor1);

		Mission lockedTrunk= new Mission ("baule chiuso a chiave", CommandType.USE, key2, "Il baule e' chiuso a chiave, la chiave sara' di sicuro nei dintorni", "Si e' aperto", CommandType.OPEN, trunk);
		nostromoCabin.setMission(lockedTrunk);

		Mission impossible = new Mission ("stanza inaccessibile", null, null, "La serratura e'corrosa, penso sia inaccessibile", "Puff", CommandType.SOUTH);
		corridorOfOfficers1.setMission(impossible);

		Mission lockedDoor2 = new Mission ("porta bloccata ", CommandType.USE, key3, "La porta é bloccata... avrei bisogno di qualcosa per forzarla", "si e' aperta", CommandType.NORD);
		corridorOfOfficers1.setMission(lockedDoor2);

		Mission CaptainCabinKey1 = new Mission ("porta del comandante chiave1", CommandType.USE, key4, "La porta e' ancora chiusa, devi sbloccare le serrature rimanenti", "serratura sbloccata", CommandType.EAST);
		corridorOfOfficers2.setMission(CaptainCabinKey1);

		Mission CaptainCabinKey2 = new Mission ("porta del comandante chiave1", CommandType.USE, key5, "La porta e' ancora chiusa, devi sbloccare le serrature rimanenti", "serratura sbloccata", CommandType.EAST);
		corridorOfOfficers2.setMission(CaptainCabinKey2);

		Mission examinesBetter = new Mission ("esamina meglio il baule", CommandType.EXAMINES_BETTER, trunk2, "Il baule e' vuoto", "ma guarda un po... c'e' una chiave", CommandType.EXAMINES);
		purser.setMission(examinesBetter);

		Mission needMoult = new Mission ("muta", CommandType.IMMERSE_YOURSELF, moult, "", "",CommandType.IMMERSE_YOURSELF, 1);
		shipDeck.setMission(needMoult);

	}

}