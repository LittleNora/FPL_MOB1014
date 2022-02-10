/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.Lab04;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class VinhNDQ_PH26105_lab04 {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("Menu Lab 3:");
            System.out.println("1. Bai 2");
            System.out.println("2. Bai 3");
            System.out.println("3. Ket thuc chuong trinh");
            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 1 || choice > 3) {
                        System.out.println("Lua chon khong hop le. Hay nhap lai.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
                }
            } while (true);
            switch (choice) {
                case 1:
                    bai2();
                    break;
                case 2:
                    bai3();
                    break;
                case 3:
                    System.out.println("Ban da chon thoat chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void bai2() {
        Lab04_ClassSanPham sp1 = new Lab04_ClassSanPham();
        Lab04_ClassSanPham sp2 = new Lab04_ClassSanPham();

        System.out.println("Nhap vao thong tin san pham 1:");
        sp1.nhap();

        System.out.println("\nNhap vao thong tin san pham 2:");
        sp2.nhap();

        System.out.println("\t=========");
        System.out.println("Thong tin san pham 1:");
        sp1.xuat();

        System.out.println("\nThong tin san pham 2:");
        sp2.xuat();
    }

    public static void bai3() {
        String name1, name2;
        
        System.out.println("Nhap vao thong tin san pham 1:");
        System.out.print("Hay nhap vao ten san pham: ");
        name1 = input.nextLine();
        Lab04_ClassSanPham sp1 = new Lab04_ClassSanPham(name1, checkNum("gia san pham"), checkNum("% giam gia"));
        
        System.out.println("Nhap vao thong tin san pham 2:");
        System.out.print("Hay nhap vao ten san pham: ");
        name2 = input.nextLine();
        Lab04_ClassSanPham sp2 = new Lab04_ClassSanPham(name2, checkNum("gia san pham"), checkNum("% giam gia"));

        System.out.println("\t=========");
        System.out.println("Thong tin san pham 1:");
        sp1.xuat();

        System.out.println("\nThong tin san pham 2:");
        sp2.xuat();
    }

    public static double checkNum(String quality) {
        double num;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", quality);
                num = Double.parseDouble(input.nextLine());
                if (num <= 0) {
                    System.out.println("Gia tri khong hop le. Hay nhap lai.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
        return num;
    }
}
