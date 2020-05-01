package com.solvd.building.models.people;

public class Accountant extends Employee {

    public Accountant (){}

    public Accountant (String firstName, String lastName, Sex sex, int age, int userId, float salaryPerHour){
        super(firstName, lastName, sex, age, userId, salaryPerHour);
    }
}
