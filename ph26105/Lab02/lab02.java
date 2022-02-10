/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.Lab02;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class lab02 {

    static Scanner input = new Scanner(System.in);
    static Scanner input_string = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac hai");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Bai them 1");
            System.out.println("5. Bai them 2");
            System.out.println("6. Ket thuc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chon chuc nang: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int a,
                     b;
                    System.out.println("Chuong trinh giai phuong trinh bac nhat ax + b = 0");
                    do {
                        try {
                            System.out.print("Hay nhap he so a: ");
                            a = Integer.parseInt(input_string.nextLine());
                            System.out.print("Hay nhap he so b: ");
                            b = Integer.parseInt(input_string.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Gia tri nhap khong hop le. Hay nhap lai");
                        }
                    } while (true);
                    ptb1(a, b);
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai_them_1();
                    break;
                case 5:
                    bai_them_2();
                    break;
                case 6:
                    System.out.println("Ban da chon ket thuc chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon cua ban khong hop le. Hay nhap lai!");
                    break;
            }
        } while (true);
    }

    public static void ptb1(int a, int b) {
        double x;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            x = (double) -b / a;
            System.out.printf("Phuong trinh co nghiem x = %.1f\n", x);
        }
    }

    public static void bai2() {
        int a, b, c, delta;
        double x, x1, x2;
        System.out.println("Chuong trinh giai phuong trinh bac hai ax^2 + bx + c");
        do {
            try {
                System.out.print("Hay nhap he so a: ");
                a = Integer.parseInt(input_string.nextLine());
                System.out.print("Hay nhap he so b: ");
                b = Integer.parseInt(input_string.nextLine());
                System.out.print("Hay nhap he so c: ");
                c = Integer.parseInt(input_string.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai");
            }
        } while (true);
        if (a == 0) {
            System.out.println("Day la phuong trinh bac nhat");
            ptb1(b, c);
        } else {
            delta = (int) (Math.pow(b, 2) - 4 * a * c);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                x = (double) -b / (2 * a);
                System.out.printf("Phuong trinh co nghiem kep x = %.1f\n", x);
            } else {
                x1 = ((double) -b + Math.sqrt(delta)) / (2 * a);
                x2 = ((double) -b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.printf("x1 = %.1f\n", x1);
                System.out.printf("x2 = %.1f\n", x2);
            }
        }
    }

    public static void bai3() {
        int so_dien, tien = 0;
        System.out.println("Chuong trinh tinh tien dien");
        do {
            System.out.print("Hay nhap vao so dien su dung: ");
            so_dien = input.nextInt();
            if (so_dien <= 0) {
                System.out.println("So dien ban vua nhap khong hop le. Hay nhap lai.");
            } else if (so_dien <= 50 && so_dien > 0) {
                tien = so_dien * 1000;
            } else {
                tien = 50 * 1000 + (so_dien - 50) * 1200;
            }
        } while (so_dien <= 0);
        System.out.println("Tien dien cua ban la: " + tien + "VND");
    }

    public static void bai_them_1() {
        int id, so_ngay_1, so_ngay_2, so_ngay_3;
        double chi_phi_1, chi_phi_2, chi_phi_3, tong;
        do {
            try {
                System.out.print("Hay nhap vao id: ");
                id = Integer.parseInt(input_string.nextLine());
                System.out.print("Hay nhap vao so ngay lam viec nhan vien he thong: ");
                so_ngay_1 = Integer.parseInt(input_string.nextLine());
                System.out.print("Hay nhap vao so ngay lam viec nhan vien lap trinh: ");
                so_ngay_2 = Integer.parseInt(input_string.nextLine());
                System.out.print("Hay nhap vao so ngay lam viec nhan vien quan tri van phong: ");
                so_ngay_3 = Integer.parseInt(input_string.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
            }
        } while (true);

        chi_phi_1 = 115 * so_ngay_1;
        chi_phi_2 = 100 * so_ngay_2;
        chi_phi_3 = 100 * so_ngay_3;
        tong = chi_phi_1 + chi_phi_2 + chi_phi_3;
        System.out.println("Cust ID " + id);
        System.out.println("Profession                Days                Cost");
        System.out.println("----------------------------------------------");
        System.out.printf("Networker                    %d                $%.2f\n", so_ngay_1, chi_phi_1);
        System.out.printf("Office                           %d                $%.2f\n", so_ngay_3, chi_phi_3);
        System.out.printf("Programmer                %d                $%.2f\n", so_ngay_2, chi_phi_2);
        System.out.println("----------------------------------------------");
        System.out.printf("Total Cost                                          $%.2f\n", tong);
    }

    public static void bai_them_2() {
        int time, quantity;
        double price = 5.5;
        do {
            try {
                System.out.print("Hay nhap vao so luong pizza duoc dat: ");
                quantity = Integer.parseInt(input_string.nextLine());
                System.out.print("Hay nhap vao thoi gian giao hang(phut): ");
                time = Integer.parseInt(input_string.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai");
            }
        } while (true);
        if (time >= 30) {
            System.out.println("Ban khong phai tra tien");
        } else {
            if (time > 0 && time < 10) {
                price = 5.5;
            } else if (time >= 10 && time < 20) {
                price = 4;
            } else if (time >= 20 && time < 30) {
                price = 2.5;
            }
            System.out.printf("So tien ban phai tra la $%.1f\n", quantity * price);
        }
    }
}