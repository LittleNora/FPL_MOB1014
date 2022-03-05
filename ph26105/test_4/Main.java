/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.test_4;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Xoa nhan vien theo ma");
            System.out.println("4. Xuat danh sach nhan vien theo khoang luong");
            System.out.println("5. Ke thua");
            System.out.println("0. Thoat chuong trinh");
            do {
                try {
                    System.out.printf("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 0 || choice > 5) {
                        System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
                }
            } while (true);
            switch (choice) {
                case 1:
                    quanLyNhanVien.nhapDanhSach();
                    inputRepeat();
                    break;
                case 2:
                    quanLyNhanVien.xuatDanhSach();
                    break;
                case 3:
                    quanLyNhanVien.xoaNvTheoMa();
                    break;
                case 4:
                    quanLyNhanVien.timNvTheoKhoangLuong();
                    break;
                case 5:
                    quanLyNhanVien.taoTruongPhong();
                    break;
                case 0:
                    System.out.println("Ban da chon thoat chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void inputRepeat() {
        int choice;
        System.out.println("Ban co muon nhap tiep khong? (1. Co/ 2. Khong)");
        do {
            try {
                System.out.printf("Lua chon cua ban: ");
                choice = Integer.parseInt(input.nextLine());
                if (choice <= 0 || choice > 2) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
            }
        } while (true);
        switch (choice) {
            case 1:
                quanLyNhanVien.nhapDanhSach();
                inputRepeat();
                break;
            case 2:
                return;
        }
    }
}
