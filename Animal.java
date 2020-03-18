package ru.gb.stream200302_lesson_5;

public class Animal {

    protected int lRunMax;
    protected int lSwimMax;
    protected double hLeapMax;


    public Animal (int lRun, double hLeap, int lSwim) { // создаем конструктор класса энимал
        this.lRunMax = lRun;
        this.lSwimMax = lSwim;
        this.hLeapMax = hLeap;

    }

    protected void run (int lRun) {
    }

    protected void swim (int lSwim) {
    }

    protected void leap (double hLeap) {

    }


}


