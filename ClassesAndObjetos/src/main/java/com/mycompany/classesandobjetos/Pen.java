package com.mycompany.classesandobjetos;

public class Pen {
    String model;
    String color;
    float tip;
    int charge;
    boolean capped;
    
    void scribble() {
        if (this.capped) {
            System.out.println("Can't scribble!");
        } else {
            System.out.println("Scribble...");
        }
    }
    
    void cap() {
        this.capped = true;
    }
    
    void uncap() {
        this.capped = false;
    }

    public void status() {
        System.out.println("        >>> PEN <<<" + 
                "\n----------------------------" + 
                "\nModel: " + this.model + ", " +
                "\nColor: " + this.color + ", " +
                "\nTip: " + this.tip + ", " +
                "\nCharge: " + this.charge + ", " +
                "\nCapped: " + this.capped + 
                "\n----------------------------");
    }
}