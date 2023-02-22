package com.anggun.chapter13.contoh;

public class HeroStrength extends Hero {

    public HeroStrength(String name) {
        super(name);
    }

    public void levelUp() {
        this.setLevel(10);
    }
}
