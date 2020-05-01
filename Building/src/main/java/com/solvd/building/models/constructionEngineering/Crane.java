package com.solvd.building.models.constructionEngineering;

import com.solvd.building.models.ILift;
import com.solvd.building.models.exceptions.CannotLiftException;
import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.print.attribute.standard.MediaSize;

public class Crane extends ConstructionEngineering implements ILift {

    private final Logger logger = LogManager.getLogger(Crane.class);

    private float maximumHeight;

    public Crane (String brand, Color color, float cargoCapacity, float pricePerHour, float maximumHeight){
        super(brand, color, cargoCapacity, pricePerHour);
    }

    public float getMaximumHeight() {return maximumHeight;}
    public void setMaximumHeight(float maximumHeight) {this.maximumHeight = maximumHeight;}

    @Override
    public void lift(ConstructionEngineering engineering, Float maximumHeight) throws CannotLiftException {
        if (engineering.getWeight() > getCargoCapacity()) {
            logger.error("Crane can't lift a load");
            throw new CannotLiftException("Crane can't lift a load");
        }
    }

//        System.out.println("Crane lifts a load");
}
