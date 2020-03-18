package ru.gb.stream200302_lesson_5;

public class Horse extends Animal {

    public Horse () {
        super(1500, 3, 100);
    }
   //@Override
    public void run (int lRun) {
        if (lRun<=lRunMax)
            System.out.println("Лошадь пробежала " + lRun + " м.");
        else
            System.out.println("Лошадь не может пробежать больше 500 метров");
    }

    //@Override
    public void leap (double hLeap) {
        if (hLeap<=hLeapMax)
            System.out.println("Лошадь прыгнула на  " + hLeap + " м.");
        else
            System.out.println("Лошадь не может прыгнуть выше 0,5 метра");
    }

   // @Override
    public void swim (int lSwim) {
        if (lSwim<=lSwimMax)
            System.out.println("Лошадь проплыла " + lSwim + " метров");
        else
            System.out.println("Лошадь не может проплыть больше 10 метров ");
    }
}
