package com.solvd.building.models.constructionEngineering;

import com.solvd.building.models.IDig;
import com.solvd.building.models.ILift;
import com.solvd.building.models.exceptions.CannotDigException;
import com.solvd.building.models.exceptions.CannotLiftException;
import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Excavator extends ConstructionEngineering implements ILift, IDig {

    private final Logger logger = LogManager.getLogger(Excavator.class);

    private float maximumHeight;
    private float maximumDepth;

    public Excavator(String brand, Color color, float cargoCapacity, float pricePerHour, float maximumHeight, float maximumDepth) {
        super(brand, color, cargoCapacity, pricePerHour);
    }

    public float getMaximumHeight() {return maximumHeight;}
    public void setMaximumHeight(float maximumHeight) {this.maximumHeight = maximumHeight;}

    public float getMaximumDepth() {return maximumDepth;}
    public void setMaximumDepth(float maximumDepth) {this.maximumDepth = maximumDepth;}

    @Override
    public void dig(Float maximumDepth, float d) throws CannotDigException {
        if (d > getMaximumDepth()) {
            logger.info("Excavator can't dig a pit");
            throw new CannotDigException("Excavator can't dig a pit");

        }
    }


    @Override
    public void lift(ConstructionEngineering engineering, Float maximumHeight) throws CannotLiftException {
        if (engineering.getWeight() > getCargoCapacity()) {
            logger.error("Excavator can't lift a load");
            throw new CannotLiftException("Excavator can't lift a load");
        }
    }

}
