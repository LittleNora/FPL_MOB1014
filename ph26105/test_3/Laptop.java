/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_3;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Laptop {

    static Scanner input = new Scanner(System.in);
    private String name;
    private int version;
    private String color;

    public Laptop() {
    }

    public Laptop(String name, int version, String color) {
        this.name = name;
        this.version = version;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setData() {
        name = inputString("ten");
        version = inputVersion("nam san xuat");
        color = inputString("mau sac");
    }

    public void showData() {
        System.out.printf("Name: %s | Version: %d | Color: %s ", name, version, color);
    }

    public String inputString(String nameOfString) {
        String stringInput;
        System.out.printf("Hay nhap vao %s: ", nameOfString);
        stringInput = input.nextLine();
        return stringInput;
    }

    public int inputVersion(String nameOfNum) {
        int numInput;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", nameOfNum);
                numInput = Integer.parseInt(input.nextLine());
                if (numInput < 1900 || numInput > 2022) {
                    System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
                } else {
                    return numInput;
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
    }

    public double inputNumDou(String nameOfNum) {
        double numInput;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", nameOfNum);
                numInput = Double.parseDouble(input.nextLine());
                if (numInput <= 0) {
                    System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
                } else {
                    return numInput;
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
    }
}
