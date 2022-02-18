/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.adventure.parser;

import di.uniba.map.b.adventure.type.AdvObject;
import di.uniba.map.b.adventure.type.AdvObjectContainer;
import di.uniba.map.b.adventure.type.Command;

/**
 *
 * @author 
 */
public class ParserOutput {

    private Command command;

    private AdvObject object;
    
    private AdvObject invObject;
    
    private AdvObjectContainer container;

    public ParserOutput(Command command, AdvObject object) {
        this.command = command;
        this.object = object;       		
        		if (this.object instanceof AdvObjectContainer) {
        			this.container = (AdvObjectContainer) object;
        		}
        			
        		
    }

    public ParserOutput(Command command, AdvObject object, AdvObject invObejct) {
        this.command = command;
        this.invObject = invObejct;
        this.object = object;
        if (this.object instanceof AdvObjectContainer) {
			this.container = (AdvObjectContainer) object;
		}
			
		
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
 
    public AdvObject getObject() {
        return object;
    }
    
    public AdvObjectContainer getContainer() {
    	return container;    	
    }
    
    public void setContainer(AdvObjectContainer container) {
    	this.container = container;
    }

    public void setObject(AdvObject object) {
        this.object = object;
    }

    public AdvObject getInvObject() {
        return invObject;
    }

    public void setInvObject(AdvObject invObject) {
        this.invObject = invObject;
    }

}
