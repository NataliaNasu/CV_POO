package com.estudonauta.www;

public class Main {
    public static void main(String[] args) {
        
        Mammal m = new Mammal();
        Reptile r = new Reptile();
        Fish f = new Fish();
        Bird b = new Bird();
        
/*        m.move();
        r.move();
        f.move();
        b.move();*/

        Kangaroo k = new Kangaroo();
        Dog d = new Dog();
        Snake s = new Snake();
        Turtle t = new Turtle();
        Goldfish g = new Goldfish();
        Parrot p = new Parrot();
        
        k.move();
        d.move();
        k.sound();
        d.sound();
        
                
    }
}
