package com.estudonauta.www;

public class Main {
    public static void main(String[] args) {
        People p1 = new People();
        Student p2 = new Student();
        Teacher p3 = new Teacher();
        Employee p4 = new Employee();
        
        p1.setName("Peter");
        p2.setName("Maria");
        p3.setName("Cláudio");
        p4.setName("Fabiana");
        
        p1.setGender("M");
        p2.setAge(18);
        p3.setGender("M");
        p4.setAge(40);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
