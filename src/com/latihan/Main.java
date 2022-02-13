package com.latihan;

public class Main {

    public static void main(String[] args) {
        //Print Name

        System.out.print("Ayu1");

        System.out.println("Ayu2");
        System.out.println("Ayu3");

        //Ayu1Ayu2
        //Ayu3

        //Variable
        // Penampung, Wadah:
//      int, String, boolean, double, float

        String name = "Misrudin";

        System.out.println("Halo nama saya: " + name + " hehe");

        //Tipe Data:
        int beratBadan = 50;
        double weight = 50.5;

        // print nama sebanyak 10 baris
//        System.out.println("Ujang");

        //do while
        int index = 1;
        do {
            System.out.println("Ujang do while index ke: " + index);
            index += 1;
        } while (index < 1);

//        //while
        int index2 = 1;
        while (index2 < 1) {
            System.out.println("Ujang index ke while");
            index2 += 1;
        }

        //for
        for (int i = 0; i <= 5; i++) {
            System.out.println("i =" + i);
        }

        //tambah
        System.out.println("Halo nama saya boot");
    }
}


//github
// git config --global user.name ""
// git config --global user.email ""
// git config --global user.password ""