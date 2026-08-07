package Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meeooowww");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Dog();
        Cat b = new Cat();

        a.sound();
        b.sound();
    }
}
