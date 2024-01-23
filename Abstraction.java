import java.util.*;

public class Abstraction {
    public static void main(String[] args) {
        
        Horse h = new Horse();
        h.eat();
        h.walk();

        System.out.println("===============================");

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    String color;

    Animal(){
        color = "brown";

    }
    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.println("walk on two legs");
    }
}