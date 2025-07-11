package Inheritance;
 //Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird is pecking at food");
    }

    @Override
    void sleep() {
        System.out.println("Bird is sleeping in its nest");
    }

    void fly() {
        System.out.println("Bird is flying in the sky");
    }
}

// Main class to run the program
public class Question1 {
    public static void main(String[] args) {
        // Create instance of Animal class
        Animal animal = new Animal();
        System.out.println("Animal Class Methods:");
        animal.eat();
        animal.sleep();

        // Create instance of Bird class
        Bird bird = new Bird();
        System.out.println("\nBird Class Methods:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
