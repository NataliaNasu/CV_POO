package com.estudonauta.www;

public class Kangaroo extends Mammal {
  
    @Override
    public void move() {
        System.out.println("Jumping...");
    }
    
    public void usingPouch() {
        System.out.println("Carrying your baby...");
    }
}