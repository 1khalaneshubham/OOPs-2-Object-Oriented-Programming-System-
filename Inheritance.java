import java.util.*;

public class Inheritance {

    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.eat();
        
    }
}
// Base class or Parent class
class Animal {
    String Color;
    
    void eat(){
        System.err.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

// Derived class or Child Class
class Fish extends Animal{
    int fish;
    void swim(){
        System.out.println("Swims in Water");
    }
}