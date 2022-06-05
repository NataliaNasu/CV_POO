package com.estudonauta.www;

import java.util.Random;

public class Fight {
    //Attributes
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;
    
    //special methods
    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
    //public methods
    public void scheduleFight(Fighter f1, Fighter f2) {
        if (f1.getCategory().equals(f2.getCategory()) && f1 != f2) {
            this.approved = true;
            this.challenged = f1;
            this.challenger = f2;
        } else {
            this.approved = false;
            this.challenged = null;
            this.challenger = null;
        }
    }
    
    public void fight() {
        if (this.approved) {
            System.out.println("The time has come!");
            System.out.println("# CHALLENGED: ");
            this.challenged.presentation();
            System.out.println("# CHALLENGER: ");
            this.challenger.presentation();
            
            Random r = new Random();
            int winner = r.nextInt(3);
            System.out.println("===== RESULT =====");
            switch(winner) {
                case 0: //The fight tied
                    System.out.println("Draw");
                    this.challenged.tieFight();
                    this.challenger.tieFight();
                    break;
                case 1: //challenged won
                    System.out.println("Winner: " + this.challenged.getName());
                    this.challenged.winFight();
                    this.challenger.loseFight();
                    break;
                case 2: //challenger won
                    System.out.println("Winner: " + this.challenger.getName());
                    this.challenged.loseFight();
                    this.challenger.winFight();
                    break;
            }
            System.out.println("==================");
        } else {
            System.out.println("The fight needs to be approved.");
        }
    }
}