package com.solvd.building.models.people;

public class Cleaner extends Employee {

    public Cleaner (){}

    public Cleaner (String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        super(firstName, lastName, sex, age, userId, salaryPerHour);
    }
}
