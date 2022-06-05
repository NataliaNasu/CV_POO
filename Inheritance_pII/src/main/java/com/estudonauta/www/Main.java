package com.estudonauta.www;

public class Main {
    public static void main(String[] args) {
        // Person p1 = new Person(); Not possible, it's an abstract class
        
        /*Visitor v1 = new Visitor();
        v1.setName("Jorge");
        v1.setAge(22);
        v1.setGender("M");
        System.out.println(v1.toString());*/
        
        Student s1 = new Student();
        s1.setName("Claudio");
        s1.setEnrollment(1111);
        s1.setCourse("Informática");
        s1.setAge(18);
        s1.setGender("M");
        s1.paySchoolFees();
        
        ScholarshipHolder sh1 = new ScholarshipHolder();
        sh1.setEnrollment(1112);
        sh1.setName("Maria");
        sh1.setScholarship(12.5f);
        sh1.setGender("F");
        sh1.paySchoolFees();
        
    }
}