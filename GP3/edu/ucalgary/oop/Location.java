package edu.ucalgary.oop;

import java.util.ArrayList;

public class Location {
    // Member Variables
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants = new ArrayList<DisasterVictim>();
    private ArrayList<Supply> supplies = new ArrayList<Supply>();

    // Constructor
    Location(String name, String address) {
        this.setName(name);
        this.setAddress(address);
    }

    // name Methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // address Methods
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // occupants Methods
    public void setOccupants(ArrayList<DisasterVictim> occupants) {
        this.occupants = occupants;
    }

    public ArrayList<DisasterVictim> getOccupants() {
        return occupants;
    }

    public void addOccupant(DisasterVictim occupant) {
        occupants.add(occupant);
    }

    public void removeOccupant(DisasterVictim occupant) {
        occupants.remove(occupant);
    }

    // supplies Methods
    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
    }

    public ArrayList<Supply> getSupplies() {
        return supplies;
    }

    public void addSupply(Supply supply) {
        supplies.add(supply);
    }

    public void removeSupply(Supply supply) {
        supplies.remove(supply);
    }
}
