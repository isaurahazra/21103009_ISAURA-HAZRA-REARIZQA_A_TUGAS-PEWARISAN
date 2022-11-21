/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.teoripbo.phonetrial;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PhoneTrial {

    public static void main(String[] args) {
        // membuat objek HP
        Phone redmiNote8 = (Phone) new Xiaomi();
        Phone IPhone9 = (Phone) new IPhone();
        Phone SamsungA13 = (Phone) new Samsung();
        Phone OppoA57 = (Phone) new Oppo();

        // membuat objek user
        PhoneUser Isaura = new PhoneUser(redmiNote8);

        // kita coba nyalakan HP-nya
        Isaura.turnOnThePhone();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;
        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                Isaura.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                Isaura.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                Isaura.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                Isaura.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
