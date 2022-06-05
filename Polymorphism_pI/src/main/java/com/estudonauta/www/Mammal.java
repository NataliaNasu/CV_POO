package com.estudonauta.www;

public class Mammal extends Animal {
    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    @Override
    public void move() {
        System.out.println("Running...");
    }
    
    @Override
    public void food() {
        System.out.println("Mammal food...");
    }
    
    @Override
    public void sound() {
        System.out.println("Mammal sound...");
    }
}