/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_2;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class QLAnimal {

    String name;
    double weight;
    String color;
    static Scanner input = new Scanner(System.in);

    public QLAnimal() {
    }

    public QLAnimal(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void nhapAnimal() {
        name = inputString("ten dong vat");
        weight = inputDou("can nang (kg)");
        color = inputString("mau cua dong vat");
    }

    public String trangThai(double weight) {
        String status;
        if (weight < 2) {
            status = "bad";
        } else if (weight >= 2 && weight <= 5) {
            status = "normal";
        } else {
            status = "good";
        }
        return status;
    }

    public String inputString(String nameString) {
        String stringInput;
        System.out.printf("Hay nhap vao %s: ", nameString);
        stringInput = input.nextLine();
        return stringInput;
    }

    public double inputDou(String nameNum) {
        double numDou;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", nameNum);
                numDou = Double.parseDouble(input.nextLine());
                if (numDou <= 0) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
                } else {
                    return numDou;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
    }
}
