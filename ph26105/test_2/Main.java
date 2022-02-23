/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.test_2;

import java.util.ArrayList;
import java.util.Scanner;
import ph26105.Lab06.VinhNDQPH26105_lab06;

/**
 *
 * @author QuangVinh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static ArrayList<QLAnimal> listAnimals = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("-----------Menu----------------");
            System.out.println("1. Nhap thong tin dong vat");
            System.out.println("2. Xuat thong tin dong vat");
            System.out.println("3. Hien thi can nang trung binh cua ds dong vat");
            System.out.println("4. In ra dong vat co can nang nho nhat");
            System.out.println("5. Thoat");
            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 1 || choice > 5) {
                        System.out.println("Lua chon khong hop le. Hay nhap lai");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
                }
            } while (true);

            switch (choice) {
                case 1:
                    setDataAnimals();
                    break;
                case 2:
                    showListAnimals();
                    break;
                case 3:
                    if (listAnimals.isEmpty()) {
                        System.out.println("Danh sach dong vat dang trong. Hay nhap vao.");
                        break;
                    }
                    System.out.printf("Can nang trung binh cua cac con vat trong ds dong vat la: %.1f kg\n", canNangTB());
                    break;
                case 4:
                    minAnimal();
                    break;
                case 5:
                    System.out.println("Ban da chon thoat chuong trinh");
                    return;
            }
        } while (true);
    }

    public static void setDataAnimals() {
        int quantity;
        do {
            try {
                System.out.printf("Hay nhap vao so luong dong vat muon nhap: ");
                quantity = Integer.parseInt(input.nextLine());
                if (quantity < 3) {
                    System.out.println("So luong nhap khong hop le. Hay nhap lai.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("So luong nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
        for (int i = 0; i < quantity; i++) {
            System.out.println("Thong tin dong vat thu " + (i + 1));
            Dog animal = new Dog();
            animal.nhapAnimal();
            listAnimals.add(animal);
            System.out.println("");
        }
    }

    public static void showListAnimals() {
        if (listAnimals.isEmpty()) {
            System.out.println("Danh sach dong vat dang trong. Hay nhap vao.");
            return;
        }
        System.out.println("Thong tin dong vat co trong danh sach");
        for (QLAnimal animal : listAnimals) {
            ((Dog) animal).xuatAnimal();
        }
    }

    public static double canNangTB() {
        double tongCanNang = 0;
        double canNangTB;
        int quantity = listAnimals.size();

        for (QLAnimal animal : listAnimals) {
            tongCanNang += animal.getWeight();
        }
        canNangTB = tongCanNang / quantity;
        return canNangTB;
    }

    public static void minAnimal() {
        if (listAnimals.isEmpty()) {
            System.out.println("Danh sach dong vat dang trong. Hay nhap vao.");
            return;
        }

        QLAnimal minWeightAnimal = listAnimals.get(0);
        for (QLAnimal animal : listAnimals) {
            if (animal.weight <= minWeightAnimal.weight) {
                minWeightAnimal = animal;
            }
        }

        System.out.println("Dong vat co can nang nho nhat la:");
        ((Dog) minWeightAnimal).xuatAnimal();
    }
}
