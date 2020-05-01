package com.solvd.building.models;

import com.solvd.building.models.constructionEngineering.ConstructionEngineering;
import com.solvd.building.models.exceptions.CannotLiftException;

public interface ILift {

    public void lift(ConstructionEngineering engineering, Float maximumHeight) throws CannotLiftException;

}
