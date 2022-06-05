package com.estudonauta.www;

public class ScholarshipHolder extends Student {
    private float scholarship;

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }
    
    public void renewScholarship() {
        System.out.println("Renew Scholarship of " + this.name);
    }
    
    @Override
    public void paySchoolFees() {
        System.out.println(this.name + " has a discount.");
    }
}