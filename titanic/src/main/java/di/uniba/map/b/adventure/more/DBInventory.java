package di.uniba.map.b.adventure.more;


import java.io.File;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@SuppressWarnings("serial")
public class DBInventory implements Serializable {

	private Connection conn;
	
	private Statement stm;
		
	public DBInventory() {
		
		 availableINSERT_MOULT = true;
		
		availableINSERT_HARPOON = true;
		
	    availableINSERT_GLOVE = true;
		
		availableINSERT_RUBBERDUCK = true;
		
		availableINSERT_KNIFE = true;
		
		availableINSERT_KEY1 = true;
		
		availableINSERT_KEY2 = true;
		
		availableINSERT_KEY3 = true;
		
		availableINSERT_KEY4 = true;
		
		availableINSERT_KEY5 = true;
		
		availableINSERT_NOTE1 = true;
		
	    availableINSERT_LEVER = true;
			
		availableINSERT_TORCH = true;
		
		File f1 = new File("./database/inventario.mv.db");
		File f2 = new File("./database/inventario.trace.db");

		if(f1.exists()) { 

	//		System.err.println("inventario.mv.db gia esistente...\n Inventario Inizializzato");

			f1.delete();
			
		}
		
		if(f2.exists()) { 

	//		System.err.println("inventario.mv.db gia esistente...\n Inventario Inizializzato");

			f2.delete();
		}

		try {
		
	conn = DriverManager.getConnection("jdbc:h2:" + "./database/inventario");
	
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile inizializzare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
    		System.exit(0);

		}
	
	}
	
	public void createTable() {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(CREATE_TABLE);
		
		stm.close();

		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
    		System.exit(0);
		}
	}
	
	
	public void deleteTable() {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_TABLE);
				stm.close();

		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
    		System.exit(0);
		}
	}
	
	//rileva l'oggetto da aggiungere al DB
	public void addToDBInventory (int Id) {
		
		switch (Id) {
		
		case 1:
			addTorch();
			
			break;
		
		case 2:
			addGlove();
			
			break;
			
		case 3:
			addHarpoon();
			break;
			
		case 4:
			addMoult();
			break;
			
		case 5:
			addRubberDuck();
			break;
			
		case 9:
			addKnife();
			break;
			
		case 10:
			addKey1();
			break;
			
		case 11:
			addNote1();
			break;
			
		case 14:
			addLever();
			break;
			
		case 17:
			addKey2();
			break;
			
		case 21:
			addKey3();
			break;
			
		case 26:
			addKey4();
			break;
			
		case 22:
			addKey5();
			break;
			
			default:
				System.out.println("Impossibile trovare l'oggetto da inserire nel DB"); // da eliminare
		
		}
		
	}
	
public void deleteFromDBInventory (int Id) {
		
	//rileva l'oggetto da rimuovere dal DB
		switch (Id) {
		
		case 1:
			removeTorch();
			
			break;
		
		case 2:
			removeGlove();
			
			break;
			
		case 3:
			removeHarpoon();
			break;
			
		case 4:
			removeMoult();
			break;
			
		case 5:
			removeRubberDuck();
			break;
			
		case 9:
			removeKnife();
			break;
			
		case 10:
			removeKey1();
			break;
			
		case 11:
			removeNote1();
			break;
			
		case 14:
			removeLever();
			break;
			
		case 17:
			removeKey2();
			break;
			
		case 21:
			removeKey3();
			break;
			
		case 26:
			removeKey4();
			break;
			
		case 22:
			removeKey5();
			break;
			
			default:
				System.out.println("Impossibile trovare l'oggetto da inserire nel DB"); // da eliminare
		
		}
		
	}
	
	private void removeMoult() {			

		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_MOULT);

		availableINSERT_MOULT = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	
	}
	
	private void removeRubberDuck() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_RUBBERDUCK);

		availableINSERT_RUBBERDUCK = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeGlove() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_GLOVE);

		availableINSERT_GLOVE = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeTorch() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_TORCH);

		availableINSERT_TORCH = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeKnife() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_KNIFE);

		availableINSERT_KNIFE = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	
	}
	
	private void removeHarpoon() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_HARPOON);

		availableINSERT_HARPOON = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeKey1() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_KEY1);

		availableINSERT_KEY1 = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeKey2() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_KEY2);

		availableINSERT_KEY2 = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeKey3() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_KEY3);

		availableINSERT_KEY3 = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeKey4() {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_KEY4);

		availableINSERT_KEY4 = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeKey5() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_KEY5);

		availableINSERT_KEY5 = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeLever() {
				
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_LEVER);

		availableINSERT_LEVER = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	private void removeNote1() {
		
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(DELETE_NOTE1);

		availableINSERT_NOTE1 = true;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
		
	private void addHarpoon() {
		
		if(this.availableINSERT_HARPOON) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_HARPOON);
		//System.out.println("Hai Preso 'Arpione' ");
		
		availableINSERT_HARPOON = false;

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
		}
		
	private void addMoult() {
		
		if(this.availableINSERT_MOULT) {
		
		try {
			
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_MOULT);

		availableINSERT_MOULT = false;

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
		}
	}
	
	private void addGlove() {
		
		if (this.availableINSERT_GLOVE) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_GLOVE);

		availableINSERT_GLOVE = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
		
	private void addRubberDuck() {
		
		if (this.availableINSERT_RUBBERDUCK) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_RUBBERDUCK);

		availableINSERT_RUBBERDUCK = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
	
	private void addKnife() {
		
		if (this.availableINSERT_KNIFE) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_KNIFE);

		availableINSERT_KNIFE = false;
		
		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
	
	private void addKey1() {
		
		if (this.availableINSERT_KEY1) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_KEY1);
		
		availableINSERT_KEY1 = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
		
	private void addKey2() {
		
		if (this.availableINSERT_KEY2) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_KEY2);
		
		availableINSERT_KEY2 = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
		
	private void addKey3() {
		
		if (this.availableINSERT_KEY3) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_KEY3);
		
		availableINSERT_KEY3 = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
		
	private void addKey4() {
		
		if (this.availableINSERT_KEY4) {
					
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_KEY4);

		availableINSERT_KEY4 = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
		
	private void addKey5() {
		
		if (this.availableINSERT_KEY5) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_KEY5);
		
		availableINSERT_KEY5 = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
		
	private void addNote1() {
		
		if (this.availableINSERT_NOTE1) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_NOTE1);
		
		availableINSERT_NOTE1 = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
		
	private void addLever() {
		
		if (this.availableINSERT_LEVER) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_LEVER);
		
		availableINSERT_LEVER = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
		
	private void addTorch() {
		
		if (this.availableINSERT_TORCH) {
		
		try {
		
		stm = conn.createStatement();

		stm.executeUpdate(INSERT_TORCH);
		
		availableINSERT_TORCH = false;

		stm.close();

		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	}
	
	public void showInventory() {
		
		try {
		
		stm = conn.createStatement();

		ResultSet result = stm.executeQuery(SHOW_CONTENT);
		System.out.println("================================================");
		while (result.next()) {
			
		
		System.out.println(result.getString(2) + " "  + result.getString(3));
		

		}
		System.out.println("================================================\n");
		
		result.close();
		
		stm.close();
		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile aggiornare inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	
	public void close() {
		
		try {
		
		stm.close();
		
		} catch (SQLException e) {
    		System.out.println("######################################################");
    		System.err.println("Impossibile chiudere inventario\n" + e.getMessage());
    		System.err.println(e.getErrorCode());
    		System.out.println("######################################################");
		}
	}
	//
	public static final String DELETE_TABLE = "DELETE FROM store";
	
	public static final String DELETE_MOULT = "DELETE FROM store WHERE artId = 4";
	
	public static final String DELETE_HARPOON = "DELETE FROM store WHERE artId = 3";

	public static final String DELETE_GLOVE = "DELETE FROM store WHERE artId = 2";

	public static final String DELETE_RUBBERDUCK = "DELETE FROM store WHERE artId = 5";

	public static final String DELETE_KNIFE = "DELETE FROM store WHERE artId = 9";

	public static final String DELETE_KEY1 = "DELETE FROM store WHERE artId = 10";

	public static final String DELETE_KEY2 = "DELETE FROM store WHERE artId = 17";

	public static final String DELETE_KEY3 = "DELETE FROM store WHERE artId = 21";

	public static final String DELETE_KEY4 = "DELETE FROM store WHERE artId = 26";

	public static final String DELETE_KEY5 = "DELETE FROM store WHERE artId = 22";

	public static final String DELETE_NOTE1 = "DELETE FROM store WHERE artId = 11";

	public static final String DELETE_LEVER = "DELETE FROM store WHERE artId = 14";

	public static final String DELETE_TORCH = "DELETE FROM store WHERE artId = 1";


	public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS store (artId INT PRIMARY KEY, name VARCHAR(30), desc VARCHAR(1024))";

	public static final String INSERT_MOULT = "INSERT INTO store VALUES(4, 'Muta', '...sara indispensabile per immergersi.')";
	
	public static final String INSERT_HARPOON = "INSERT INTO store VALUES(3,'Arpione', '...potrebbe tornarmi utile contro i pericoli.')";

	public static final String INSERT_GLOVE = "INSERT INTO store VALUES(2,'Guanto Protettivo', '...potrebbe tornarmi utile.')";
	
	public static final String INSERT_RUBBERDUCK = "INSERT INTO store VALUES(5,'Papera di Gomma', '...potrebbe portarmi fortuna.')";
	
	public static final String INSERT_KNIFE = "INSERT INTO store VALUES(9,'Coltello ', '...potrebbe tornarmi utile.')";
	
	public static final String INSERT_KEY1 = "INSERT INTO store VALUES(10,'Chiave Cabina Nostromo', '...chissa cosa apre.')";
	
	public static final String INSERT_NOTE1 = "INSERT INTO store VALUES(11,'Bigliettino', '...il biglietto ormai e illeggibile, riesco a leggere solamente la firma, Nostromo Smith.')";
	
	public static final String INSERT_LEVER = "INSERT INTO store VALUES(14,'Leva', '...potrei usarlo come leva.')";
	
	public static final String INSERT_KEY2 = "INSERT INTO store VALUES(17,'Chiave del baule', '...questa chiave apre il baule situato nella cabina del Nostromo.')";
	
	public static final String INSERT_KEY3 = "INSERT INTO store VALUES(21,'Chiave commissario di Bordo', '...apre la Cabina del Commisario di Bordo')";

	public static final String INSERT_KEY4 = "INSERT INTO store VALUES(26,'Chiave 1 cabina del comandante', '...e una delle due chiavi che apre la cabina del Comandante')";

	public static final String INSERT_KEY5 = "INSERT INTO store VALUES(22,'Chiave 2 cabina del comandante', '...e una delle due chiavi che apre la cabina del comandante')";

	public static final String INSERT_TORCH = "INSERT INTO store VALUES(1, 'Torcia Marina', '...potrebbe illuminarmi il cammino nei percorsi piu bui.')";

	public static final String SHOW_CONTENT = "SELECT artId, name, desc FROM store";
	

	//
	
	private boolean availableINSERT_MOULT = true;
	
	private boolean availableINSERT_HARPOON = true;
	
	private boolean availableINSERT_GLOVE = true;
	
	private boolean availableINSERT_RUBBERDUCK = true;
	
	private boolean availableINSERT_KNIFE = true;
	
	private boolean availableINSERT_KEY1 = true;
	
	private boolean availableINSERT_KEY2 = true;
	
	private boolean availableINSERT_KEY3 = true;
	
	private boolean availableINSERT_KEY4 = true;
	
	private boolean availableINSERT_KEY5 = true;
	
	private boolean availableINSERT_NOTE1 = true;
	
    private boolean availableINSERT_LEVER = true;
		
	private boolean availableINSERT_TORCH = true;


}