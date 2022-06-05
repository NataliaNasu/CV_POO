package com.estudonauta.www;

public class Dog extends Wolf {
    
    @Override
    public void makingSound() {
        System.out.println("Au!Au! Au!");
    }
    
    public void reaction(String phrase) {
        if (phrase.equals("Hello!") || phrase.equals("Here's the food!")) {
            System.out.println("Wag the tail and bark.");
        } else {
            System.out.println("Growl");
        }
    }
    
    public void reaction(int hour, int min) {
        if (hour < 12) {
            System.out.println("Wag the tail.");
        } else if (hour >= 18) {
            System.out.println("Ignore");
        } else {
            System.out.println("Wag the tail and bark.");
        }
    }
    
    public void reaction(boolean tutor) {
        if (tutor) {
            System.out.println("Wag the tail.");
        } else {
            System.out.println("Growl and bark.");
        }
    }
    
    public void reaction(int age, float weight) {
        if (age < 5) {
            if (weight < 10) {
                System.out.println("Wag the tail.");
            } else {
                System.out.println("Bark");
            }
        } else {
            if (weight < 10) {
                System.out.println("Growl");
            } else {
                System.out.println("Ignore");
            }
                }
    }
}