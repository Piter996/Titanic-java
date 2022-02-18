/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.adventure.type;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
@SuppressWarnings("serial")
public class AdvObject implements Serializable {

    private final int id;
    private String name;
    private String description;
    private Set<String> alias;
    
    private boolean accessible = true;
    private boolean openable = false;
    private boolean pickupable = true;
    private boolean pushable = false;
    private boolean open = true;
    private boolean push = false;
    private boolean usable = false;
    private boolean switched_on = false;
    private boolean examinable = false;
   
    @SuppressWarnings("unused")
	private boolean switchable = false;

    public AdvObject(int id) {
        this.id = id;
    }

    public AdvObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public AdvObject(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public AdvObject(int id, String name, String description, Set<String> alias) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    
    public void setAccessible(boolean accessible) {
    	this.accessible = accessible;
    }

    public boolean isAccessible() {
    	return accessible;
    }
  
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOpenable() {
        return openable;
    }

    public void setOpenable(boolean openable) {
        this.openable = openable;
    }

    public boolean isPickupable() {
        return pickupable;
    }

    public void setPickupable(boolean pickupable) {
        this.pickupable = pickupable;
    }

    public boolean isPushable() {
        return pushable;
    }
    
    public void setUsable (boolean usable) {
    	this.usable = usable;
    }
    public boolean isUsable() {
    	return usable;
    }

    public void setPushable(boolean pushable) {
        this.pushable = pushable;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isPush() {
        return push;
    }

    public void setPush(boolean push) {
        this.push = push;
    }

    public boolean isSwitched_on () {
    	return switched_on;
    }
    
    public void setSwitched_on(boolean switched_on) {
    this.switched_on = switched_on;
    }
    
    public void setSwitchable() {
    this.switchable = true;	
    }
    
    public Set<String> getAlias() {
        return alias;
    }

    public void setAlias(Set<String> alias) {
        this.alias = alias;
    }
    
    public void setAlias(String[] alias) {
        this.alias = new HashSet<>(Arrays.asList(alias));
    }

    public int getId() {
        return id;
    }

    public boolean isExaminable() {
    	return examinable;    	
    }
    
    public void setExaminable() {
    	this.examinable = true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdvObject other = (AdvObject) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
