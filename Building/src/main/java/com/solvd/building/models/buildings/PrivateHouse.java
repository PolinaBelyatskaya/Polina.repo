package com.solvd.building.models.buildings;

public class PrivateHouse extends Building {

    private int roomsNumber;

    public PrivateHouse (){}

    public PrivateHouse (String area, int constructionYear, int floorsNumber, String floorsHeight, String type, int roomsNumber) {
       super(area, constructionYear, floorsNumber, floorsHeight, type);
       this.roomsNumber = roomsNumber;
    }

    public int getRoomsNumber() {return roomsNumber;}
    public void setRoomsNumber(int roomsNumber) {this.roomsNumber = roomsNumber;}

@Override
public String toString() {
    return super.toString() + " Rooms Number is " + getRoomsNumber() + ".";
    }


@Override
public int hashCode(){
    return super.hashCode() + roomsNumber;
    }


@Override
public boolean equals(Object obj) {

    PrivateHouse privateHouse = (PrivateHouse) obj;
    return super.equals(obj) &&  privateHouse.getRoomsNumber() == getRoomsNumber();
    }
}