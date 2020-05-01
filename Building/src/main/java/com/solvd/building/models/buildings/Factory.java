package com.solvd.building.models.buildings;

import com.solvd.building.models.buildings.Building;

public class Factory extends Building {

    public Factory (){}

    public Factory (String area, int constructionYear, int floorsNumber, String floorsHeight, String type){
        super(area, constructionYear, floorsNumber, floorsHeight, type);
    }
}
