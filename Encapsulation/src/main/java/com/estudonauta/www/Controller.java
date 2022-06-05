package com.estudonauta.www;

public interface Controller {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void showMenu();
    public abstract void closeMenu();
    public abstract void increaseVolume();
    public abstract void decreaseVolume();
    public abstract void activateMute();
    public abstract void disableMute();
    public abstract void play();
    public abstract void pause();
    
}