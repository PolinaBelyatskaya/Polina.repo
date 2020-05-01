package com.solvd.building.models.people;

public class Foreman extends Employee {

    public Foreman (){}

    public Foreman (String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        super(firstName, lastName, sex, age, userId, salaryPerHour);
    }
}
