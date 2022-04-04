package four;

class Animal {
    String name;

    void eat() {
        System.out.println("Eating");
    }
}
class Cat extends Animal{

    double weight = 5;
    void jump(){
        System.out.println("Jump");
    }


    }


class Dog extends Animal{

    String color = "White";
    int age = 3;
    void play(){
        System.out.println("Paly");
    }

    }


public class Inheritance {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.weight);
        cat.jump();
        System.out.println(cat.name);
        Dog dog = new Dog();
        System.out.println(dog.age);
        System.out.println(dog.color);


    }
}


