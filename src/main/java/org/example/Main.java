package org.example;

import java.util.ArrayList;
import java.util.List;

abstract class Bird{
    String color;
    String legs;
    String hands;

    void eat(){};
    abstract void fly();

}

class sparrow extends Bird{

    void eat(){
        System .out.println("Sparrow eats");
    }

    @Override
    void fly() {
        System .out.println("Sparrow eats");
    }
}

public class Main {

    public static void main(String[] args) {

        sparrow sparrow=new sparrow();
        Bird bird=new Bird() {
            @Override
            void fly() {
                System.out.println("this is abstract class");
            }
        };
        sparrow.color="white";
        sparrow.eat();
        bird.fly();
        System.out.println("Hello world!");



    }
}