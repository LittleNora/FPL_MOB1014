/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.practice_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Test {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Nhanvien> listNhanVien = new ArrayList<>();
    static ArrayList<Kysu> listKySu = new ArrayList<>();
    static ArrayList<Congnhan> listCongNhan = new ArrayList<>();

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
            System.out.println("Menu Lab 7");
            System.out.println("1. Nhap thong tin ky su");
            System.out.println("2. Nhap thong tin cong nhan");
            System.out.println("3. In danh sach nhan vien");
            System.out.println("4. In danh sach ky su");
            System.out.println("5. In danh sach cong nhan");
            System.out.println("6. Thoat chuong trinh");
            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 1 || choice > 6) {
                        System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
                }
            } while (true);
            switch (choice) {
                case 1:
                    taoKySu();
                    break;
                case 2:
                    taoCongNhan();
                    break;
                case 3:
                    inDSNV();
                    break;
                case 4:
                    inDSKySu();
                    break;
                case 5:
                    inDSCongNhan();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

    public static void taoKySu() {
        Kysu kysu = new Kysu();
        kysu.nhap();
        listNhanVien.add(kysu);
        listKySu.add(kysu);
        kysu.indulieu();
        System.out.println("Luong: " + kysu.tinhluong());
    }

    public static void taoCongNhan() {
        Congnhan congnhan = new Congnhan();
        congnhan.nhap();
        listNhanVien.add(congnhan);
        listCongNhan.add(congnhan);
        congnhan.indulieu();
        System.out.println("Luong: " + congnhan.tinhluong());
    }

    public static void inDSNV() {
        if (listNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay nhap lai.");
            return;
        }
        System.out.println("Thong tin nhan vien:");
        for (Nhanvien nhanvien : listNhanVien) {
            if (nhanvien instanceof Kysu) {
                ((Kysu) nhanvien).indulieu();
            } else if (nhanvien instanceof Congnhan) {
                ((Congnhan) nhanvien).indulieu();
            }
        }
    }

    public static void inDSKySu() {
        if (listKySu.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay nhap lai.");
        }

        System.out.println("Danh sach ky su:");
        for (Kysu nhanvien : listKySu) {
            nhanvien.indulieu();
        }
    }

    public static void inDSCongNhan() {
        if (listCongNhan.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay nhap lai.");
        }

        System.out.println("Danh sach cong nhan:");
        for (Congnhan nhanvien : listCongNhan) {
            nhanvien.indulieu();
        }
    }
}
