package com.estudonauta.www;

public class Student extends People {
    private int schoolEnrollment;
    private String course;

    public int getSchoolEnrollment() {
        return schoolEnrollment;
    }

    public void setSchoolEnrollment(int schoolEnrollment) {
        this.schoolEnrollment = schoolEnrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
    
    public void cancelEnrollment() {
        System.out.println("School enrollment will be cancelled.");
    }
}
