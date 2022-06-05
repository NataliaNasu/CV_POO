package com.estudonauta.www;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Fighter f[] = new Fighter[6];
        
        f[0] = new Fighter("Pretty Boy", "France", 21, 1.75, 
                68.9, 11, 2, 1);
        f[1] = new Fighter("Putscript", "Brazil", 29, 1.68, 
                57.8, 14, 2, 3);
        f[2] = new Fighter("Snapshadow", "EUA", 35, 1.65,
                80.9, 12, 2, 1);
        f[3] = new Fighter("Dead Code", "Australia", 28, 1.93,
                81.6, 13, 0, 2);
        f[4] = new Fighter("UFO Cobol", "Brazil", 37, 1.70,
                119.3, 5, 4, 3);
        f[5] = new Fighter("Nerdaart", "EUA", 30, 1.81, 
                105.7, 12, 2, 4);
        
        Fight UEC01 = new Fight();
        UEC01.scheduleFight(f[0], f[1]);
        UEC01.fight();
        f[0].status();
        f[1].status();
    }
}