package com.anggun.chapter9.tugas;

public class Ex8_TheFanclass {
    public static void main(String[] args) {

        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        fan2.setSpeed(FAST);
        fan2.setRadius(10);
        fan2.setColor("yellow");
        fan2.turnOn();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
