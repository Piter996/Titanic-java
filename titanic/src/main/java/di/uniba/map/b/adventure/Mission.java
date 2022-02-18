package di.uniba.map.b.adventure;

import di.uniba.map.b.adventure.more.Visual;
import di.uniba.map.b.adventure.parser.ParserOutput;
import di.uniba.map.b.adventure.type.CommandType;
import di.uniba.map.b.adventure.type.AdvObjectContainer;
import di.uniba.map.b.adventure.type.AdvObject;

import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("serial")
public class Mission implements Serializable {

	private String name;
	
	private CommandType commandSolution;
	
	private AdvObject objectSolution;
	
	private boolean active = true;
	
	private String msgProblem;
	
	private String msgSolved;
	
	private int attempts = 0;
	
	private CommandType lockedCommand;
	
	private AdvObjectContainer lockedObject;
	
	private int attemptsLimit = -1;
	
	private Visual message = new Visual(); 
	
	private boolean isDead = false;

public Mission(String name, CommandType commandSolution, AdvObject objectSolution, String msgProblem, String msgSolved, CommandType lockedCommand) {

		this.name = name;
		this.commandSolution = commandSolution;
		this.objectSolution = objectSolution;
		this.msgProblem = msgProblem;
		this.msgSolved = msgSolved;
		this.lockedCommand = lockedCommand;
	}

public Mission(String name, CommandType commandSolution, AdvObject objectSolution, String msgProblem, String msgSolved, CommandType lockedCommand, AdvObjectContainer lockedObject) {

	this.name = name;
	this.commandSolution = commandSolution;
	this.objectSolution = objectSolution;
	this.msgProblem = msgProblem;
	this.msgSolved = msgSolved;
	this.lockedCommand = lockedCommand;
	this.lockedObject = lockedObject;
}
	
public Mission(String name, CommandType commandSolution, AdvObject objectSolution, String msgProblem, String msgSolved, CommandType blockedWay, int attemptsLimit) {

		this.name = name;
		this.commandSolution = commandSolution;
		this.objectSolution = objectSolution;
		this.msgProblem = msgProblem;
		this.msgSolved = msgSolved;
		this.lockedCommand = blockedWay;
		this.attemptsLimit = attemptsLimit;
	}
	

public boolean isSolution(ParserOutput p, ListIterator<AdvObject> inventory ) {

	  if (name.contentEquals("muta")) {
		boolean found = false;
		  
				while(inventory.hasNext() && !found) {

if(inventory.next().getId() == 4) {
	
	found = true;
}
				}	
				
	  if (found) {
		
			try{
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.println(".");

			} catch (InterruptedException ex) {

				ex.getMessage();

			} finally {

			active = false;

			}
			
		} else {
						
			this.addAttempts();
			this.checkAttempts();

	  
	  }
	  }
	
	return isDead;

}


public List<AdvObject> isSolution(ParserOutput p, List<AdvObject> inventory) {
		
	if (p.getCommand().getType() == commandSolution) {
				
		if(p.getInvObject() == objectSolution) {
		
			try{
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.println(".");

			} catch (InterruptedException ex) {

				ex.getMessage();

			} finally {

			getMsgSolved();
			active = false;

			}
		} else {
			this.addAttempts();
			this.checkAttempts();
			
			if (!isDead) {
			System.out.println("Potresti farlo, ma non servirebbe a nulla");
			}
		}
	} else {
		this.addAttempts();	
		this.checkAttempts();
		if (!isDead) {
		System.out.println("Potresti farlo, ma non servirebbe a nulla");
		}

	}

			return inventory;
}

public void setActive(boolean bool) {
	active = bool;
}

public boolean getActive() {
	return active;
}

public String getName() {
	return name;
}

public CommandType getCommandSolution() {
	return commandSolution;
}

public AdvObject getObjectSolution() {
	return objectSolution;
}

public void getMsgProblem() {
	System.out.println(msgProblem);
}

private void getMsgSolved() {
	System.out.println(msgSolved);
}

public CommandType getLockedCommand() {
	return lockedCommand;
}

public int getAttempts() {
	return attempts;
}

public int getAttemptsLimit() {
	return attemptsLimit;
}

public AdvObjectContainer getLockedObject() {
	return lockedObject;
}

public void addAttempts() {
	attempts++;	
}

private void checkAttempts() {
	int attemptsLeft = attemptsLimit - attempts;
	
	
if (attemptsLimit != -1) {
	
	if (attemptsLeft > 0) {
		
		System.out.println("Ti sono rimasti " + attemptsLeft + " tentativi");

	} else {
		
		message.Dead();
		isDead = true;	

	}	
  }
}

public boolean checkIsDead() {
	return isDead;
}

}