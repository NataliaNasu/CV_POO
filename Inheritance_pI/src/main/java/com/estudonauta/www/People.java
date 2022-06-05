package com.estudonauta.www;

public class People {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
        
    public void birthday() {
        this.age++;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
    
}
