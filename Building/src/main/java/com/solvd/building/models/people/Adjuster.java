package com.solvd.building.models.people;

import com.solvd.building.models.ICarry;
import com.solvd.building.models.ILift;
import com.solvd.building.models.constructionEngineering.Excavator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Adjuster extends Employee implements ICarry, ILift {

    private final Logger logger = LogManager.getLogger(Adjuster.class);



    public Adjuster (){}

    public Adjuster (String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        super(firstName, lastName, sex, age, userId, salaryPerHour);
    }

    @Override
    public void carry() {
        logger.info("Adjuster carries fixtures");

    }

    @Override
    public void lift() {
        logger.info("Adjuster lifts construction materials");

    }
}
