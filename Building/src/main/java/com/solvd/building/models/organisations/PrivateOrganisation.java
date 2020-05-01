package com.solvd.building.models.organisations;

import com.solvd.building.models.Project;
import com.solvd.building.models.constructionEngineering.*;
import com.solvd.building.models.people.*;

public class PrivateOrganisation extends Organisation {

    private String propertyType;

    public PrivateOrganisation (){}

    public PrivateOrganisation (String name, String budget, String propertyType){
        super(name, budget);
        this.propertyType = propertyType;
    }

    public String getPropertyType() {return propertyType;}
    public void setPropertyType(String propertyType) {this.propertyType = propertyType;}

    @Override
    public float makeProject(Project project) {
        float sum = 0;
        for (Employee e: getEmployees()) {
            if (e instanceof Architect) {
                sum += e.getSalaryPerHour() * project.getArchitectWorkingHours();
            }
            if (e instanceof Adjuster) {
                sum += e.getSalaryPerHour() * project.getAdjusterWorkingHours();
            }
            if (e instanceof Cleaner) {
                sum += e.getSalaryPerHour() * project.getCleanerWorkingHours();
            }
            if (e instanceof Constructor) {
                sum += e.getSalaryPerHour() * project.getConstructorWorkingHours();
            }
            if (e instanceof Driver) {
                sum += e.getSalaryPerHour() * project.getDriverWorkingHours();
            }
            if (e instanceof Finisher) {
                sum += e.getSalaryPerHour() * project.getFinisherWorkingHours();
            }
            if (e instanceof Foreman) {
                sum += e.getSalaryPerHour() * project.getForemanWorkingHours();
            }
        }
         for (ConstructionEngineering c: getConstructionEngineering()){
             if (c instanceof Crane){
                 sum += c.getPricePerHour() *  project.getCraneWorkingHours();
             }
             if (c instanceof Excavator){
                 sum += c.getPricePerHour() * project.getExcavatorWorkingHours();
             }
             if (c instanceof Lorry){
                 sum += c.getPricePerHour() * project.getLorryWorkingHours();
             }
             if (c instanceof TipTruck){
                 sum += c.getPricePerHour() * project.getTipTruckWorkingHours();
             }
         }
        return sum;
    }

}
