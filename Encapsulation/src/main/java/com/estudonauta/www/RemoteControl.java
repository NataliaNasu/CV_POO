package com.estudonauta.www;

public class RemoteControl implements Controller {
    private int volume;
    private boolean on;
    private boolean playing;

    public RemoteControl() {
        this.volume = 50;
        this.on = true;
        this.playing = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
    
    //Métodos Abstratos
    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void showMenu() {
        System.out.println("--------- MENU ---------" +
                "\nOn: " + this.isOn() +
                "\nPlaying: " + this.isPlaying() +
                "\nVolume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("[] ");
        }
        System.out.println("\n-----------------------");
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing the menu...");
    }

    @Override
    public void increaseVolume() {
        if (this.isOn()) {
            this.setVolume(this.getVolume() + 10);
        } else {
            System.out.println("Remote control is off. \nIt's impossible to turn up the volume.");
        }
    }

    @Override
    public void decreaseVolume() {
        if (this.isOn()) {
            this.setVolume(this.getVolume() - 10);
        } else {
            System.out.println("Remote control is off. \nIt's impossible to turn down the volume.");
        }
    }

    @Override
    public void activateMute() {
        if (this.isOn() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void disableMute() {
        if (this.isOn() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isOn() && !(this.isPlaying())) {
            this.setPlaying(true);
        } else {
            System.out.println("Remote control is off.");

        }
    }

    @Override
    public void pause() {
        if (this.isOn() && this.isPlaying()) {
            this.setPlaying(false);
        } else {
            System.out.println("Remote control is off.");
        }
    }
}