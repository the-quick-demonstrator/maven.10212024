package com.github.curriculeon;

public class MainApplication {
    public void greet() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Person leon1 = Leon.INSTANCE;
        Person leon2 = Leon.INSTANCE;

        Lenum lenum = Lenum.INSTANCE;


        People leon = People.LEON;
        People amanuel = People.AMANUEL;
    }

}