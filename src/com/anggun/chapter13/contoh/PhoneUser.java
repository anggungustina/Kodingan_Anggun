package com.anggun.chapter13.contoh;

public class PhoneUser {
    private final phone phone;

    public PhoneUser(phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone() {
        this.phone.powerOn();
    }

    void turnOfThePhone() {
        this.phone.powerOff();
    }

    void makePhoneLouder() {
        this.phone.volumeUp();
    }

    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}
