package com.estudonauta.www;

public class Teacher extends People {
    private String specialty;
    private float salary;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
        
    public void receiveIncrease(float increase) {
        this.salary += increase;
    }
}