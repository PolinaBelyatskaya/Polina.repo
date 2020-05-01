package com.solvd.building.models.constructionEngineering;

import com.sun.org.apache.bcel.internal.Const;
import com.sun.org.apache.xpath.internal.operations.String;

public abstract class ConstructionEngineering {

    private String brand;
    private Color color;
    private float cargoCapacity;
    private float pricePerHour;
    private int weight;

    public ConstructionEngineering(){}

    public ConstructionEngineering (String brand, Color color, float cargoCapacity, float pricePerHour){
        this.brand = brand;
        this.color = color;
        this.cargoCapacity = cargoCapacity;
        this.pricePerHour = pricePerHour;
    }

//    public abstract void work();

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public Color getColor() {return color;}
    public void setColor(Color color) {this.color = color;}

    public float getCargoCapacity() {return cargoCapacity;}
    public void setCargoCapacity(float cargoCapacity) {this.cargoCapacity = cargoCapacity;}

    public float getPricePerHour() {return pricePerHour;}
    public void setPricePerHour(float pricePerHour) {this.pricePerHour = pricePerHour;}

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //    public Color setColor (Color color){
//        color.getColor();
//        return color;
//    }
}
