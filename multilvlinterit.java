// multilevel inheritance example


class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}   
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // inherited from Animal
        dog.walk(); // inherited from Mammal
        dog.bark(); // own method of Dog

        Mammal m=new Mammal();
        m.eat(); // inherited from Animal
        m.bark();
        m.walk(); // own method of Mammal
    }
}