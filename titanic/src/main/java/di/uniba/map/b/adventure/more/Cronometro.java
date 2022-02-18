package di.uniba.map.b.adventure.more;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cronometro extends Thread implements Serializable{

	  /** Accumulatore contenente il numero dei millisecondi trascorsi. */
	  private long contatore;

	  /** Istante temporale dell'ultimo avvio del cronometro. */
	  private long avviato_a;

	  /** Variabile di stato che indica se il cronometro sta avanzando oppure no. */
	  private boolean avanzando;


	  public Cronometro() { azzera(); }

	  /** Metodo per (fermare ed) azzerare del cronometro. */
	  public void azzera() {
	    synchronized (this) {
	      contatore = 0;
	      avanzando = false;
	    }
	  }


	  public void run() {
	    synchronized (this) {
	      avviato_a = System.currentTimeMillis();
	      avanzando = true;
	    }
	  }


	  public void ferma() {
	    synchronized (this) {
	      contatore += System.currentTimeMillis() - avviato_a;
	      avanzando = false;
	    }
	  }


	  public int leggiSecondi() {
	    synchronized (this) {
	      return (int)(((avanzando ? contatore + System.currentTimeMillis() - avviato_a
	                       : contatore) / 1000 ) %60);
	    }
	  }
	}
