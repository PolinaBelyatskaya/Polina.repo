package com.solvd.building.models;

import com.solvd.building.models.constructionEngineering.ConstructionEngineering;
import com.solvd.building.models.exceptions.CannotDigException;
import com.solvd.building.models.exceptions.CannotLiftException;

public interface IDig {

    public void dig(Float maximumDepth, float d) throws CannotDigException;

}
