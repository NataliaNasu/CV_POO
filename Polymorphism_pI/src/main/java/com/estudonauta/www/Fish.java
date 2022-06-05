package com.estudonauta.www;

public class Fish extends Animal {
    private String ScaleColor;

    public String getScaleColor() {
        return ScaleColor;
    }

    public void setScaleColor(String ScaleColor) {
        this.ScaleColor = ScaleColor;
    }
    
    @Override
    public void move() {
        System.out.println("Swimming...");
    }

    @Override
    public void food() {
        System.out.println("Fish food...");
    }

    @Override
    public void sound() {
        System.out.println("Fish sound...");
    }
    
    public void dropBubble() {
        System.out.println("Released a bubble...");
    }
}