package com.estudonauta.www;

public class Mammal extends Animal {
    protected String furColor;
    
    @Override
    public void makingSound() {
        System.out.println("Mammal sound");
    }
    
}