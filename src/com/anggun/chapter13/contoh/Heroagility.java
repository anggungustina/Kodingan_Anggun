package com.anggun.chapter13.contoh;


//inheritance dari abstrak Hero
public class Heroagility extends Hero {


    public Heroagility(String name) {
        super(name);
    }


    public void levelUp() {
        this.setLevel(1);

    }
}
