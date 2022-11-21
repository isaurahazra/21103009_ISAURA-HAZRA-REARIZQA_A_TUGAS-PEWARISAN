/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.teoripbo.phonetrial;

/**
 *
 * @author Lenovo
 */
public class PhoneUser {

    private final Phone Phone;

    public PhoneUser(Phone Phone) {
        this.Phone = Phone;
    }

    void turnOnThePhone() {
        this.Phone.powerOn();
    }

    void turnOffThePhone() {
        this.Phone.powerOff();
    }

    void makePhoneLouder() {
        this.Phone.volumeUp();
    }

    void makePhoneSilent() {
        this.Phone.volumeDown();
    }

}
