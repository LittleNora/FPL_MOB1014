/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.Lab06;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Person {

    public String name;

    public String birthYear;
    public String regBirthYear = "^([1-2][0-9]|3[0-1]|0?[1-9]{1})/(0?[1-9]|1[0-2])/[1-2][0-9]{3}$";

    public String birthPlace;
    static Scanner ip = new Scanner(System.in);

    public Person() {
    }

    public Person(String name, String birthYear, String birthPlace) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthPlace = birthPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public void input() {
        System.out.print("Hay nhap vao ten: ");
        name = ip.nextLine();
        birthYear = checkRegex("ngay sinh (ngay/thang/nam)", regBirthYear);
        System.out.print("Hay nhap vao noi sinh: ");
        birthPlace = ip.nextLine();
    }

    public void display() {
        System.out.println("Ten: " + name);
        System.out.println("Ngay sinh: " + birthYear);
        System.out.println("Noi sinh: " + birthPlace);
    }

    public String checkRegex(String nameVari, String regVari) {
        String vari;
        do {
            System.out.printf("Hay nhap vao %s: ", nameVari);
            vari = ip.nextLine();
            if (!vari.matches(regVari)) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
            } else {
                break;
            }
        } while (true);
        return vari;
    }
}
