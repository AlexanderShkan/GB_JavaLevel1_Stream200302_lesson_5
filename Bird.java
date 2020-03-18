package ru.gb.stream200302_lesson_5;

public class Bird extends Animal {

    public Bird () {
        super(5,0.2, 0);
    }
    //@Override
    public void run (int lRun) {
        if (lRun<=lRunMax)
            System.out.println("Птица пробежала " + lRun + " м.");
        else
            System.out.println("Птица не может пробежать больше 500 метров");
    }

    //@Override
    public void leap (double hLeap) {
        if (hLeap<=hLeapMax)
            System.out.println("Птица прыгнула на  " + hLeap + " м.");
        else
            System.out.println("Птица не может прыгнуть выше 0,5 метра");
    }

    //@Override
    public void swim (int lSwim) {
            System.out.println("Птица не может плавать ");
    }

}
