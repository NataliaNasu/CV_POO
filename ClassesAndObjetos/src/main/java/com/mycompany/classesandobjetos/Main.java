package com.mycompany.classesandobjetos;

public class Main {
    public static void main(String[] args) {
        //Instantiating an object
        Pen p1 = new Pen();        
        p1.model = "Bic";
        p1.color = "Blue";
        p1.tip = 0.5f;
        p1.charge = 80;
        p1.cap();
        p1.status(); 
        p1.scribble();
        
        Pen p2 = new Pen();
        p2.model = "Bic";
        p2.color = "Red";
        p2.tip = 0.5f;
        p2.charge = 100;
        p2.uncap();
        p2.status();
        p2.scribble();
    }
}