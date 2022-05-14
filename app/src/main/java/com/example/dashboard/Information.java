package com.example.dashboard;

public class Information {
    private String Colour;
    private String Owner;
    private String Registered;
    private String Resident;
    private String Type;
    private String Vehicle;

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getRegistered() {
        return Registered;
    }

    public void setRegistered(String registered) {
        Registered = registered;
    }

    public String getResident() {
        return Resident;
    }

    public void setResident(String resident) {
        Resident = resident;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getVehicle() {
        return Vehicle;
    }

    public void setVehicle(String vehicle) {
        Vehicle = vehicle;
    }

    public Information(String colour, String owner, String registered, String resident, String type, String vehicle) {
        Colour = colour;
        Owner = owner;
        Registered = registered;
        Resident = resident;
        Type = type;
        Vehicle = vehicle;
    }
}
