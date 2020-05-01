package com.solvd.building.models.constructionEngineering;

import com.solvd.building.models.ICarry;
import com.solvd.building.models.exceptions.CannotCarryException;
import com.solvd.building.models.exceptions.CannotLiftException;
import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TipTruck extends ConstructionEngineering implements ICarry {

    private final Logger logger = LogManager.getLogger(TipTruck.class);

    public TipTruck (String brand, Color color, float cargoCapacity, float pricePerHour){
        super(brand, color, cargoCapacity, pricePerHour);
    }

    @Override
    public void carry(Float cargoCapacity, float t) throws CannotCarryException{
        if (t > getCargoCapacity()) {
            logger.info("TipTruck can't carry a load");
            throw new CannotCarryException("TipTruck can't carry a load");
        }
    }
}
