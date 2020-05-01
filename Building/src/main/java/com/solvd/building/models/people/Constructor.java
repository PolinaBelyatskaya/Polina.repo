package com.solvd.building.models.people;

import com.solvd.building.models.ICarry;
import com.solvd.building.models.IDig;
import com.solvd.building.models.ILift;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Constructor extends Employee implements IDig, ILift, ICarry {

    private final Logger logger = LogManager.getLogger(Constructor.class);

    public Constructor (){}

    public Constructor (String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        super(firstName, lastName, sex, age, userId, salaryPerHour);
    }

    @Override
    public void dig() {
        logger.info("Constructor digs a ditch");

    }

    @Override
    public void lift() {
        logger.info("Constructor lifts construction materials");

    }

    @Override
    public void carry() {
        logger.info("Constructor carries construction materials");

    }
}
