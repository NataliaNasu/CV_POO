package com.estudonauta.www;

public class Pen {
    private String model;
    private String color; 
    private float tip;
    private int charge;
    private boolean capped;

    public Pen(String model, String color, float tip) {
        this.model = model;
        this.color = color;
        this.tip = tip;
        this.charge = 100;
        this.cap();
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTip() {
        return this.tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public int getCharge() {
        return this.charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public boolean isCapped() {
        return this.capped;
    }

    public void setCapped(boolean capped) {
        this.capped = capped;
    }
    
    public void cap() {
        this.capped = true;
    }
    
    public void uncapp() {
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
/*    public String toString() {
        return "        >>> PEN <<<" + 
                "\n----------------------------" + 
                "\nModel: " + this.getModel() + ", " +
                "\nColor: " + this.getColor() + ", " +
                "\nTip: " + this.getTip() + ", " +
                "\nCharge: " + this.getCharge() + ", " +
                "\nCapped: " + this.isCapped() + 
                "\n----------------------------";
    }*/
}