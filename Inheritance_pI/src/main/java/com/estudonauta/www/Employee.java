package com.estudonauta.www;

public class Employee extends People {
    private String department;
    private boolean working;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
        
    public void changeJobs() {
        this.working = ! this.working;
    }
}