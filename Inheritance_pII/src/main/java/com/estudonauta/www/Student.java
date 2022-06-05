package com.estudonauta.www;

public class Student extends Person {
    private int enrollment;
    private String course;

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public void paySchoolFees() {
        System.out.println("Paying school fees of " + this.name);
    }
}