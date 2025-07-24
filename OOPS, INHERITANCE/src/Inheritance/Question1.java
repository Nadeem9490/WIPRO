package  Inheritance;
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Bird extends Animal {
    public void eat() {
        System.out.println("Bird is pecking food");
    }
    public void sleep() {
        System.out.println("Bird is sleeping in the nest");
    }
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}