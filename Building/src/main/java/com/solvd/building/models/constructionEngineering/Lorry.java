package com.solvd.building.models.constructionEngineering;

import com.solvd.building.models.ICarry;
import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Lorry extends ConstructionEngineering implements ICarry {

    private final Logger logger = LogManager.getLogger(Lorry.class);

    public Lorry (String brand, Color color, float cargoCapacity, float pricePerHour){
        super(brand, color, cargoCapacity, pricePerHour);
    }

    @Override
    public void carry(){
        logger.info("truck carries construction materials");
    }
}
