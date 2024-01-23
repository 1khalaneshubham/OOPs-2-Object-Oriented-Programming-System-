public class HierachialInheritance {
    
    public static void main(String[] args) {

        Fish Shark = new Fish();
        Shark.eat();
        Shark.breath();
        // System.out.println(Fish.walk);
        
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
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("Flying");
    }
}
