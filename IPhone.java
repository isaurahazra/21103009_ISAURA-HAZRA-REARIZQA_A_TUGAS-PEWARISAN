/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.teoripbo.phonetrial;

import static edu.teoripbo.phonetrial.Phone.MAX_VOLUME;
import static edu.teoripbo.phonetrial.Phone.MIN_VOLUME;
/**
 *
 * @author Lenovo
 */
public class IPhone {

    private int volume;
    private boolean isPowerOn;

    public IPhone() {
        // set volume awal
        this.volume = 50;
    }

    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di IPHONE");
        System.out.println("IOS version 6");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    public void volumeUp() {
        if (isPowerOn) {
            int MAX_VOLUME = 0;
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    public void volumeDown() {
        if (isPowerOn) {
            int MIN_VOLUME = 0;
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
