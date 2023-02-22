package com.anggun.chapter13.contoh;


//inheritance dari abstrak Hero
public class HeroIntel extends Hero {

    public HeroIntel(String name) {
        super(name);
    }

    @Override
    public void levelUp() {
        this.setLevel(2);

    }
}
