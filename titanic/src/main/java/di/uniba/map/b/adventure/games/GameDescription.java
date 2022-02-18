/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.adventure.games;

import di.uniba.map.b.adventure.parser.ParserOutput;
import di.uniba.map.b.adventure.type.AdvObject;
import di.uniba.map.b.adventure.type.Command;
import di.uniba.map.b.adventure.type.Room;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UnaZatteraPerDue
 */
@SuppressWarnings("serial")
public abstract class GameDescription implements Serializable {

    private final List<Room> rooms = new ArrayList<>();

    private final List<Command> commands = new ArrayList<>();

    private List<AdvObject> inventory = new ArrayList<>();

    private Room currentRoom;

    public  List<Room> getRooms() {
        return rooms;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
    
    public void setCurrentRoom(Room currentRoom) {
    		this.currentRoom = currentRoom;
    	}
    	

     public List<AdvObject> getInventory() {
         return inventory;
    }
     
    public void setInventory (List<AdvObject> inventory) {
    	
    	this.inventory = inventory;
    	
    }

    public abstract void NewGame() throws Exception;

    public abstract void nextMove(ParserOutput p, PrintStream out);
    
}
