package di.uniba.map.b.adventure.more;


import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;





@SuppressWarnings("serial")
public class Effect extends JDialog {

	 

	 private File TypeWriterPath = new File("./media/Typewriter.wav"); 
	 private File MusicPath = new File("./media/Ice.wav");
	 private File ImmersionPath = new File("./media/Immersion.wav");
	 private File GearsPath = new File("./media/Gears.wav"); 
	 private File DoorPath = new File("./media/Door.wav"); 
	 private File DoorBoatPath = new File("./media/DoorBoat.wav"); 
	 private File JumpscarePath = new File("./media/Jumpscare.wav"); 
	 private File ForceDoorPath = new File("./media/PortaForzata.wav"); 
	 private File Shark1Path = new File("./media/Squalo1.wav"); 
	 private File Shark2Path = new File("./media/Squalo2.wav"); 
	 private File Shark3Path = new File("./media/Squalo3.wav"); 
	 private File Shark4Path = new File("./media/Squalo4.wav");

	 
    private AudioInputStream ImmersionInput;
    private AudioInputStream TypeWriterInput;
    private AudioInputStream MusicInput;
    private AudioInputStream GearsInput;
    private AudioInputStream DoorInput;
    private AudioInputStream JumpscareInput;
    private AudioInputStream ForceDoorInput;
    private AudioInputStream Shark1Input;
    private AudioInputStream Shark2Input;
    private AudioInputStream Shark3Input;
    private AudioInputStream Shark4Input;
    private AudioInputStream DoorBoatInput;


    
    
    private Clip typeWriter ;
    private Clip music;
    private Clip Gears;
    private Clip Door;
    private Clip Jumpscare;
    private Clip ForceDoor;
    private Clip Shark1;
    private Clip Shark2;
    private Clip Shark3;
    private Clip Shark4;
    private Clip DoorBoat;
    private Clip Immersion;



    
    public void playImmersion() {

        try {

            if (ImmersionPath.exists()) {
                this.ImmersionInput = AudioSystem.getAudioInputStream(ImmersionPath);
                this.Immersion = AudioSystem.getClip();
                Immersion.open(ImmersionInput);
                Immersion.start();
                Immersion.loop(0);
                }
               

        } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("################################################");
            System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
            System.out.println("################################################");
        }

    }
    
   public void playTypeWriter() {

       try {

           if (TypeWriterPath.exists()) {
               this.TypeWriterInput = AudioSystem.getAudioInputStream(TypeWriterPath);
               this.typeWriter = AudioSystem.getClip();
               typeWriter.open(TypeWriterInput);
               typeWriter.start();
               typeWriter.loop(Clip.LOOP_CONTINUOUSLY);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }

   public void playGears() {

       try {

           if (GearsPath.exists()) {
               this.GearsInput = AudioSystem.getAudioInputStream(GearsPath);
               this.Gears = AudioSystem.getClip();
               Gears.open(GearsInput);
                   Gears.start();
                   Gears.loop(0);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
      
   public void playDoor() {

       try {

           if (DoorPath.exists()) {
               this.DoorInput = AudioSystem.getAudioInputStream(DoorPath);
               this.Door = AudioSystem.getClip();
               Door.open(DoorInput);
                   Door.start();
                   Door.loop(0);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
    
   public void playDoorBoat() {

       try {

           if (DoorBoatPath.exists()) {
               this.DoorBoatInput = AudioSystem.getAudioInputStream(DoorBoatPath);
               this.DoorBoat = AudioSystem.getClip();
               DoorBoat.open(DoorBoatInput);
               DoorBoat.start();
               DoorBoat.loop(0);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
   
   public void playJumpscare() {

       try {

           if (JumpscarePath.exists()) {
               this.JumpscareInput = AudioSystem.getAudioInputStream(JumpscarePath);
               this.Jumpscare = AudioSystem.getClip();
               Jumpscare.open(JumpscareInput);
               Jumpscare.start();
               Jumpscare.loop(0);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
      
   public void playShark1() {

       try {

           if (Shark1Path.exists()) {
               this.Shark1Input = AudioSystem.getAudioInputStream(Shark1Path);
               this.Shark1 = AudioSystem.getClip();
               Shark1.open(Shark1Input);
               Shark1.start();
               Shark1.loop(Clip.LOOP_CONTINUOUSLY);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
     
   public void playShark2() {

       try {

           if (Shark2Path.exists()) {
               this.Shark2Input = AudioSystem.getAudioInputStream(Shark2Path);
               this.Shark2 = AudioSystem.getClip();
               Shark2.open(Shark2Input);
               Shark2.start();
               Shark2.loop(Clip.LOOP_CONTINUOUSLY);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
      
   public void playShark3() {

       try {

           if (Shark3Path.exists()) {
               this.Shark3Input = AudioSystem.getAudioInputStream(Shark3Path);
               this.Shark3 = AudioSystem.getClip();
               Shark3.open(Shark3Input);
               Shark3.start();
               Shark3.loop(Clip.LOOP_CONTINUOUSLY);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
     
   public void playShark4() {

       try {

           if (Shark4Path.exists()) {
               this.Shark4Input = AudioSystem.getAudioInputStream(Shark4Path);
               this.Shark4 = AudioSystem.getClip();
               Shark4.open(Shark4Input);
               Shark4.start();
               Shark4.loop(0);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
     
   public void playForceDoor() {

       try {

           if (ForceDoorPath.exists()) {
               this.ForceDoorInput = AudioSystem.getAudioInputStream(ForceDoorPath);
               this.ForceDoor = AudioSystem.getClip();
               ForceDoor.open(ForceDoorInput);
               ForceDoor.start();
               ForceDoor.loop(0);
               }
              

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }
   
   public void stopTypeWriter() {
	   typeWriter.stop();
	   typeWriter.close();
   }
   
   public void stopDoor() {
	   	Door.stop();
	       Door.close();
	   }
   
   public void stopForceDoor() {
	   	ForceDoor.stop();
	       ForceDoor.close();
	   }
   
   public void stopJumpscare() {
	   	Jumpscare.stop();
	       Jumpscare.close();
	   }
   
   public void stopShark1() {
	   	Shark1.stop();
	       Shark1.close();
	   }
   
   public void stopShark2() {
	   	Shark2.stop();
	       Shark2.close();
	   }
   
   public void stopShark3() {
	   	Shark3.stop();
	       Shark3.close();
	   }
   
   public void stopShark4() {
	   	Shark4.stop();
	       Shark4.close();
	   }
   
   public void stopGears() {
	   	Gears.stop();
	       Gears.close();
	   }
   
   public void playMusic() {

       try {

           if (MusicPath.exists()) {
               this.MusicInput = AudioSystem.getAudioInputStream(MusicPath);
               this.music = AudioSystem.getClip();
               music.open(MusicInput);

               Object[] message = {"Vuoi attivare la musica?"};

               Object[] options = {"Si", "No"};
               JFrame jf = new JFrame();
               jf.setAlwaysOnTop(true);
               int selectedOption = JOptionPane.showOptionDialog(jf,
                       message, "Titanic: The Lost Treasure",
                       JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                       options, options[1]);

               if (selectedOption == JOptionPane.OK_OPTION) { // Risposta affermativa
               
                   music.start();
                   music.loop(Clip.LOOP_CONTINUOUSLY);
               }
               if (selectedOption == JOptionPane.NO_OPTION) { // Risposta negativa
                   music.stop();
                   music.close();
               }
           } else {
               System.out.println("######################################################");
               System.err.println("Impossibile riprodurre la musica, file non trovato.");
               System.out.println("######################################################");
           }

       } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
           System.out.println("################################################");
           System.err.println("Impossibile riprodurre la musica.\nEccezione verificata: " + ex);
           System.out.println("################################################");
       }

   }

   public void stopMusic() {
	   music.stop();
       music.close();
   }
}


