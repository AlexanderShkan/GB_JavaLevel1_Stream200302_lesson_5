package ru.gb.stream200302_lesson_5;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog ();
        Horse horse = new Horse ();
        Cat cat = new Cat ();
        Bird bird = new Bird ();

        dog.run(1000);
        dog.run(500);
        horse.run(1500);
        cat.run(200);
        bird.run(5);

        dog.leap(1.5);
        dog.leap(0.5);
        horse.leap(3);
        cat.leap(2);
        bird.leap(0.2);

        dog.swim(100);
        dog.swim(10);
        horse.swim(100);
        cat.swim(1);
        bird.swim(1);

    }

}
