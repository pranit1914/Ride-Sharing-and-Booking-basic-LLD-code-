// this is heirarchical inheritance example

//here one parent class and multiple child class is there. here all the child class can access the properties of parent class but they cannot access each other properties.
//eg cow class cannot access the properties of dog class and cat class. similarly dog class cannot access the properties of cow class and cat class. and cat class cannot access the properties of cow class and dog class.
// but cow can access properties o amimal --> eat() and it own method moo() similarly dog can access properties of animal --> eat() and it own method bark() and cat can access properties of animal --> eat() and it own method meow()
//c.meow() is not possible because cow class cannot access the properties of cat class similarly c.bark() is not possible because cow class cannot access the properties of dog class. and same for dog and cat class. they cannot access each other properties but they can access the properties of parent class which is animal class.

//Inheritance is NOT for accessing sibling classes. it is for accessing parent class properties. if you want to access sibling class properties then you have to create object of that class and then you can access the properties of that class. but if you want to access parent class properties then you can directly access it without creating object of parent class because child class can access the properties of parent class directly.

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

class Cow extends Animal {
    void moo() {
        System.out.println("The cow moos.");
    }
}

public class Main {
    public static void main(String[] args) {

        Cow c = new Cow();
        c.eat();  // inherited
        c.moo();  // own

        System.out.println("***********************");

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        System.out.println("***********************");

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
