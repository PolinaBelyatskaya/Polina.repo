package com.solvd.building.runner;

import com.solvd.building.models.Project;
import com.solvd.building.models.buildings.ApartmentHouse;
import com.solvd.building.models.buildings.PrivateHouse;
import com.solvd.building.models.constructionEngineering.*;
import com.solvd.building.models.exceptions.CannotCarryException;
import com.solvd.building.models.exceptions.CannotDigException;
import com.solvd.building.models.exceptions.CannotLiftException;
import com.solvd.building.models.organisations.Organisation;
import com.solvd.building.models.organisations.PrivateOrganisation;
import com.solvd.building.models.organisations.StateOrganisation;
import com.solvd.building.models.people.Architect;
import com.solvd.building.models.people.Chief;
import com.solvd.building.models.people.Sex;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private final static Logger logger = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {

        PrivateHouse privateHouse = new PrivateHouse();
        privateHouse.setArea("150 m2");
        privateHouse.setConstructionYear(2020);
        privateHouse.setFloorsNumber(2);
        privateHouse.setFloorsHeight("3m");
        privateHouse.setType("civilianConstruction");

        System.out.println(privateHouse.toString());

        ApartmentHouse apartmentHouse = new ApartmentHouse();
        apartmentHouse.setArea("1000 m2");
        apartmentHouse.setConstructionYear(2022);
        apartmentHouse.setFloorsNumber(19);
        apartmentHouse.setType("civilianConstruction");

        Lorry lorry = new Lorry();
        lorry.setBrand("Volvo");
        lorry.setColor(Color.BLACK);
        lorry.setCargoCapacity(7);
        lorry.setPricePerHour(5);

        TipTruck tipTruck = new TipTruck();
        tipTruck.setBrand("Ford");
        tipTruck.setColor(Color.GREEN);
        tipTruck.setCargoCapacity(5);
        tipTruck.setPricePerHour(5);

        try {
            tipTruck.carry(20, 30);}
        catch (CannotCarryException c){
            logger.error(c);
        }

        Crane crane = new Crane();
        crane.setBrand("Liebherr");
        crane.setColor(Color.YELLOW);
        crane.setCargoCapacity(10);
        crane.setMaximumHeight(30);
        crane.setPricePerHour(20);

        try {
            crane.lift(lorry, 40f);}
        catch (CannotLiftException e) {
            logger.error(e);
        }

        Excavator excavator = new Excavator();
        excavator.setBrand("Hyundai");
        excavator.setColor(Color.RAD);
        excavator.setCargoCapacity(2);
        excavator.setMaximumHeight(15);
        excavator.setPricePerHour(10);

        try {
            excavator.lift(tipTruck, 20f);}
        catch (CannotLiftException e){
            logger.error(e);
        }

        try {
            excavator.dig(5f, 10);}
        catch (CannotDigException d){
            logger.error(d);
        }

        PrivateOrganisation privateOrganisation = new PrivateOrganisation();
        privateOrganisation.setName("Avantgarde");
        privateOrganisation.setBudget("1000000$");
        privateOrganisation.setPropertyType("private");

        StateOrganisation stateOrganisation = new StateOrganisation();
        stateOrganisation.setName("Ministry of Architecture and Construction");
        stateOrganisation.setBudget("23000000$");
        stateOrganisation.setPropertyType("public");

        Chief chief = new Chief();
        chief.setFirstName("Dmitry");
        chief.setLastName("Soloviev");
        chief.setSex(Sex.MALE);
        chief.setAge(45);
        chief.setUserId(1);
        chief.setSalaryPerHour(60);

        Architect architect = new Architect();
        architect.setFirstName("Ilya");
        architect.setLastName("Federov");
        architect.setSex(Sex.MALE);
        architect.setAge(30);
        architect.setUserId(5);
        architect.setSalaryPerHour(20);

        Project project = new Project();
        project.setTypeOfHouse("PrivateHouse");
        project.setCraneWorkingHours(120);
        project.setExcavatorWorkingHours(160);
        project.setLorryWorkingHours(240);
        project.setTipTruckWorkingHours(40);
        project.setAdjusterWorkingHours(240);
        project.setArchitectWorkingHours(80);
        project.setCleanerWorkingHours(80);
        project.setConstructorWorkingHours(480);
        project.setDriverWorkingHours(280);
        project.setFinisherWorkingHours(200);
        project.setForemanWorkingHours(248);

        Organisation org = new PrivateOrganisation();
        org.makeProject(project);
    }


}
