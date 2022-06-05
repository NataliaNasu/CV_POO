package com.estudonauta.www;

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.model = "Bic crystal";
        p1.color = "Black";
        p1.charge = 90;
        p1.uncap();
        p1.status();
        p1.scribble();
        
        Pen p2 = new Pen();
        p2.model = "Bic";
        p2.color = "Blue";
        p2.charge = 65;
        p2.cap();
        p2.status();
        p2.scribble();
    }          
}