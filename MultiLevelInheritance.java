import java.util.*;

public class MultiLevelInheritance {
    public static void main(String[] args) {

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        
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

class Mammal extends Animal {
    
    int legs;
}

class Dog extends Mammal{
    
    String breed;
}