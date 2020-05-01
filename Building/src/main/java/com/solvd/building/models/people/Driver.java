package com.solvd.building.models.people;

import com.solvd.building.models.ICarry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Driver extends Employee implements ICarry {

    private final Logger logger = LogManager.getLogger(Driver.class);

    public Driver (){}

    public Driver (String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        super(firstName, lastName, sex, age, userId, salaryPerHour);
    }

    @Override
    public void carry() {
        logger.info("Driver carries construction materials");

    }
}
