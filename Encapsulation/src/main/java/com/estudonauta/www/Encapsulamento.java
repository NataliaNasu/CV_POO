package com.estudonauta.www;

public class Encapsulamento {
    public static void main(String[] args) {
        RemoteControl r = new RemoteControl();
        r.turnOn();
        r.showMenu();
        r.closeMenu();
        r.play();
        r.increaseVolume();
        r.showMenu();
    }
}
