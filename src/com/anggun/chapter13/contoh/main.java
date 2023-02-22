package com.anggun.chapter13.contoh;

public class main {
    public static void main(String[] args) {


        //buat object non abstract
        HeroIntel hero1 = new HeroIntel("Spiderman");
        hero1.display();

        Heroagility hero2 = new Heroagility("Thor");
        hero2.display();

        hero1.levelUp();
        hero2.levelUp();
        hero1.display();
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Captain");
        hero3.levelUp();
        hero3.display();

        //buat object dari kelas abstract
//        Hero hero3 = new Hero("Hulk");
//        hero3.display();


    }
}
