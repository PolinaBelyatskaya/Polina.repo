package com.solvd.building.models.buildings;

public class ApartmentHouse extends Building {

    private int apartmentsNumber;
    private int utilityRoomsNumber;

    public ApartmentHouse (){}

    public ApartmentHouse (String area, int constructionYear, int floorsNumber, String floorsHeight, String type, int apartmentsNumber, int utilityRoomsNumber) {
        super(area, constructionYear, floorsNumber, floorsHeight, type);
        this.apartmentsNumber = apartmentsNumber;
        this.utilityRoomsNumber = utilityRoomsNumber;
    }

    public int getApartmentsNumber() {return apartmentsNumber;}
    public void setApartmentsNumber(int apartmentsNumber) {this.apartmentsNumber = apartmentsNumber;}

    public int getUtilityRoomsNumber() {return utilityRoomsNumber;}
    public void setUtilityRoomsNumber(int utilityRoomsNumber) {this.utilityRoomsNumber = utilityRoomsNumber;}
}
