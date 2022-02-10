/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.Lab04;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Lab04_ClassSanPham {

    static Scanner input = new Scanner(System.in);

    private String tenSP;
    private double donGia, giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public Lab04_ClassSanPham() {
    }

    public Lab04_ClassSanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Lab04_ClassSanPham(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
    }

    public void nhap() {
        System.out.print("Hay nhap vao ten san pham: ");
        tenSP = input.nextLine();
        donGia = checkNum("gia san pham");
        giamGia = checkNum("% giam gia");
    }

    public void xuat() {
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Gia san pham: " + donGia);
        System.out.println("Giam gia: " + giamGia + "%");
        System.out.println("Thue thu nhap: " + getThueNhapKhau());
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public double checkNum(String quality) {
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
