package ru.gb.stream200302_lesson_5;

public class Cat extends Animal {

   public Cat () {
       super (200,2,0);
    }
    //@Override
    public void run (int lRun) {
        if (lRun<=lRunMax)
            System.out.println("Кошка пробежала " + lRun + " м.");
        else
            System.out.println("Кошка не может пробежать больше 500 метров");
    }

    //@Override
    public void leap (double hLeap) {
        if (hLeap<=hLeapMax)
            System.out.println("Кошка прыгнула на  " + hLeap + " м.");
        else
            System.out.println("Кошка не может прыгнуть выше 0,5 метра");
    }

    //@Override
    public void swim (int lSwim) {
        System.out.println("Кошка не может плавать ");
    }

}

