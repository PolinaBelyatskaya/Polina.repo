package com.solvd.building.models;

import com.solvd.building.models.constructionEngineering.ConstructionEngineering;
import com.solvd.building.models.constructionEngineering.Crane;

public class Project {

    private String typeOfHouse;
    private int craneWorkingHours;
    private int excavatorWorkingHours;
    private int lorryWorkingHours;
    private int tipTruckWorkingHours;
    private int adjusterWorkingHours;
    private int architectWorkingHours;
    private int cleanerWorkingHours;
    private int constructorWorkingHours;
    private int driverWorkingHours;
    private int finisherWorkingHours;
    private int foremanWorkingHours;
    private String totalCost;

    public Project (){}

    public Project(String typeOfHouse, int craneWorkingHours, int excavatorWorkingHours, int lorryWorkingHours, int tipTruckWorkingHours, int adjusterWorkingHours, int architectWorkingHours, int cleanerWorkingHours, int constructorWorkingHours, int driverWorkingHours, int finisherWorkingHours, int foremanWorkingHours, String totalCost){

        this.typeOfHouse = typeOfHouse;
        this.craneWorkingHours = craneWorkingHours;
        this.excavatorWorkingHours = excavatorWorkingHours;
        this.lorryWorkingHours = lorryWorkingHours;
        this.tipTruckWorkingHours = tipTruckWorkingHours;
        this.adjusterWorkingHours = adjusterWorkingHours;
        this.architectWorkingHours = architectWorkingHours;
        this.cleanerWorkingHours = cleanerWorkingHours;
        this.constructorWorkingHours = constructorWorkingHours;
        this.driverWorkingHours = driverWorkingHours;
        this.finisherWorkingHours = finisherWorkingHours;
        this.foremanWorkingHours = foremanWorkingHours;
        this.totalCost = totalCost;
    }

    public String getTypeOfHouse(){return typeOfHouse;}
    public void setTypeOfHouse(String typeOfHouse){this.typeOfHouse = typeOfHouse;}

    public int getCraneWorkingHours() {return craneWorkingHours;}
    public void setCraneWorkingHours(int craneWorkingHours) {this.craneWorkingHours = craneWorkingHours;}

    public int getExcavatorWorkingHours() {return excavatorWorkingHours;}
    public void setExcavatorWorkingHours(int excavatorWorkingHours) {this.excavatorWorkingHours = excavatorWorkingHours;}

    public int getLorryWorkingHours() {return lorryWorkingHours;}
    public void setLorryWorkingHours(int lorryWorkingHours) {this.lorryWorkingHours = lorryWorkingHours;}

    public int getTipTruckWorkingHours() {return tipTruckWorkingHours;}
    public void setTipTruckWorkingHours(int tipTruckWorkingHours) {this.tipTruckWorkingHours = tipTruckWorkingHours;}

    public int getAdjusterWorkingHours() {return adjusterWorkingHours;}
    public void setAdjusterWorkingHours(int adjusterWorkingHours) {this.adjusterWorkingHours = adjusterWorkingHours;}

    public int getArchitectWorkingHours() {return architectWorkingHours;}
    public void setArchitectWorkingHours(int architectWorkingHours) {this.architectWorkingHours = architectWorkingHours;}

    public int getCleanerWorkingHours() {return cleanerWorkingHours;}
    public void setCleanerWorkingHours(int cleanerWorkingHours) {this.cleanerWorkingHours = cleanerWorkingHours;}

    public int getConstructorWorkingHours() {return constructorWorkingHours;}
    public void setConstructorWorkingHours(int constructorWorkingHours) {this.constructorWorkingHours = constructorWorkingHours;}

    public int getDriverWorkingHours() {return driverWorkingHours;}
    public void setDriverWorkingHours(int driverWorkingHours) {this.driverWorkingHours = driverWorkingHours;}

    public int getFinisherWorkingHours() {return finisherWorkingHours;}
    public void setFinisherWorkingHours(int finisherWorkingHours) {this.finisherWorkingHours = finisherWorkingHours;}

    public int getForemanWorkingHours() {return foremanWorkingHours;}
    public void setForemanWorkingHours(int foremanWorkingHours) {this.foremanWorkingHours = foremanWorkingHours;}

    public String getTotalCost(){return totalCost;}
    public void setTotalCost(String totalCost) {this.totalCost = totalCost;}

//    public int getTotalCost(){
//        int cost = craneWorkingHours * Crane.getPricePerHour();
//        return cost;
//    }
}



