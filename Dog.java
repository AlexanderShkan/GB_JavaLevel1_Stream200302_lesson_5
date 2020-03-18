package ru.gb.stream200302_lesson_5;

public class Dog extends Animal {

    public Dog () {
       super (500, 0.5,10);

    }
    public void run (int lRun) {
        if (lRun<=lRunMax)
        System.out.println("Собака пробежала " + lRun + " м.");
        else
        System.out.println("Собака не может пробежать " + lRun + " м., может только 500 метров");
    }

    public void leap (double hLeap) {
        if (hLeap<=hLeapMax)
            System.out.println("Собака прыгнула на  " + hLeap + " м.");
        else
            System.out.println("Собака не может прыгнуть на " + hLeap + " м., может только до 0,5 метра");
    }

    public void swim (int lSwim) {
        if (lSwim<=lSwimMax)
            System.out.println("Собака проплыла " + lSwim + " метров");
        else
            System.out.println("Собака не может проплыть " +lSwim+" м., может не больше 10 метров ");
    }

}

