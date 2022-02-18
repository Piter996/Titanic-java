package di.uniba.map.b.adventure.more;

import di.uniba.map.b.adventure.Mission;
import di.uniba.map.b.adventure.games.Game;
import di.uniba.map.b.adventure.parser.ParserOutput;
import di.uniba.map.b.adventure.type.CommandType;
import di.uniba.map.b.adventure.type.Room;

@SuppressWarnings("serial")
public class ControlEffect extends Effect{
	
	Room currentRoom;
	
	public ControlEffect(Game game) {
		
	currentRoom = game.getCurrentRoom();
	
	}
			
			
	public void checkCase (Game game, ParserOutput p, Mission mission) {
		boolean gears = false;
		
		if (currentRoom != game.getCurrentRoom()) {
			
			if(game.getCurrentRoom().getId() >=16 && game.getCurrentRoom().getId() <=22 ) {
			
				this.playImmersion();
			
			} else if (game.getCurrentRoom().getId() == 14 || game.getCurrentRoom().getId() == 15) {
			
				this.playDoorBoat();	
			
			} else {
				
				this.playDoor();
			
			}
			currentRoom = game.getCurrentRoom();
		}
		
		else {
			
		switch (game.getCurrentRoom().getId()) {
		
		case 10:
			
			if(game.getCurrentRoom().getMission().getActive()) {
				
				if (p.getInvObject() != null) {
					
					this.playForceDoor();
				
				if(p.getCommand().getType() == CommandType.USE && p.getInvObject().getId() == 14 ) {
				}
			}
		}
		case 12:
			
			if (game.getCurrentRoom().getEast().isVisible()) {
				
				if (!gears)
				this.playGears();
			}
			
			break;
		
		case 19:
			if (mission != null) {
				if (mission.getAttempts() == 0) {
					
					if (mission.getActive()) {
					this.playShark1();
					} else {
						this.stopShark1();
					}
					
				}
				if (mission.getAttempts() == 1) {
					
					this.stopShark1();
										
					if (mission.getActive()) {

					this.playShark2();					
					
				}
				}
				if (mission.getAttempts() == 2) {
					
					this.stopShark2();
					
					if (mission.getActive()) {

					this.playShark3();
					
				}
				}
				if (mission.getAttempts() == 3) {
					
					this.stopShark3();
				
					if (mission.getActive()) {

					this.playShark4();
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						System.out.println("#############################################");
						System.err.println(e.getMessage());
						System.out.println("#############################################");
					} finally {
						this.stopShark4();
					}
					
				}
				}
			}
			
		  break;
		
		case 4:
			
			if (p.getCommand() != null && p.getContainer() != null) {
				
			if (p.getCommand().getType() == CommandType.EXAMINES) {
				
				if(p.getContainer().getId() == 24) {
					
					this.playJumpscare();
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("#############################################");
						System.err.println(e.getMessage());
						System.out.println("#############################################");					
						} finally {
							this.stopJumpscare();
						}
									}
				
			}
		
		
		}
		
		}
		
	}
	}

	
	
}
