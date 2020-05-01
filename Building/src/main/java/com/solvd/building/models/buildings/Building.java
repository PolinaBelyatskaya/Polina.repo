package com.solvd.building.models.buildings;

public abstract class Building {

    private String area;
    private int constructionYear;
    private int floorsNumber;
    private String floorsHeight;
    private String type;

    public Building(){}

    public Building(String area, int constructionYear, int floorsNumber, String floorsHeight, String type) {

        this.area = area;
        this.constructionYear = constructionYear;
        this.floorsNumber = floorsNumber;
        this.floorsHeight = floorsHeight;
        this.type = type;
    }

    @Override
    public int hashCode() {
      return area.hashCode() + constructionYear + floorsNumber + floorsHeight.hashCode() + type.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;

        if(obj == null || obj.getClass() != this.getClass())
            return false;

        Building building = (Building) obj;
        return (building.getArea().equals(getArea()) && building.getConstructionYear() == getConstructionYear() && building.getFloorsNumber() == getFloorsNumber() && building.getFloorsHeight().equals(getFloorsHeight()) && building.getType().equals(getType()));
    }


    @Override
    public String toString() {

        return "Area is " + getArea() + ". Construction Year is " + getConstructionYear() + ". Floors' Number is " + getFloorsNumber() + ". Floors' Height is " + getFloorsHeight() + ". Type os " + "." ;
    }



    public String getArea() {return area;}
    public void setArea(String area) {this.area = area;}

    public int getConstructionYear() {return constructionYear;}
    public void setConstructionYear(int constructionYear) {this.constructionYear = constructionYear;}

    public int getFloorsNumber() {return floorsNumber;}
    public void setFloorsNumber(int floorsNumber) {this.floorsNumber = floorsNumber;}

    public String getFloorsHeight() {return floorsHeight;}
    public void setFloorsHeight(String floorsHeight) {this.floorsHeight = floorsHeight;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
}
