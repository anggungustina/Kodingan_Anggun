package com.anggun.chapter13.contoh;


//abstrak class
public abstract class Hero {
    private final String name;
    private int level;

    public Hero(String name) {
        this.name = name;
        this.level = level = 1;
    }

    public void display() {
        System.out.println("aku adalah " + this.name);
        System.out.println("level " + this.level);
    }

    //abstrak method
    public abstract void levelUp();

    //setter
    public void setLevel(int deltaLevel) {
        this.level += deltaLevel;
    }
}
