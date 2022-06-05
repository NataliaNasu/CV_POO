package com.estudonauta.www;

public class Bird extends Animal {
    private String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
    
    @Override
    public void move() {
        System.out.println("Flying...");
    }

    @Override
    public void food() {
        System.out.println("Bird food...");
    }

    @Override
    public void sound() {
        System.out.println("Bird sound...");
    }
    
    public void nidificate() {
        System.out.println("Built a nest...");
    }
}