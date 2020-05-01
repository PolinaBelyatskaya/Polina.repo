package com.solvd.building.models.organisations;

import com.solvd.building.models.Project;
import com.solvd.building.models.constructionEngineering.ConstructionEngineering;
import com.solvd.building.models.people.Employee;

import java.util.ArrayList;
import java.util.List;

public abstract class Organisation {
    private String name;
    private String budget;
    private List<Employee> employees;
    private List<ConstructionEngineering> constructionEngineering;

    public Organisation (){}

    public Organisation(String name, String budget){
        this.name = name;
        this.budget = budget;
    }

    public abstract float makeProject(Project project);

    public String getName() {return name;}
    public void setName(String name) { this.name = name;}

    public String getBudget() {return budget;}
    public void setBudget(String budget) {this.budget = budget;}

    public List<Employee> getEmployees() {return employees;}
    public void setEmployees(List<Employee> employees) {this.employees = employees;}

    public List<ConstructionEngineering> getConstructionEngineering() {return constructionEngineering;}
    public void setConstructionEngineering(List<ConstructionEngineering> constructionEngineering) {this.constructionEngineering = constructionEngineering;}
}




