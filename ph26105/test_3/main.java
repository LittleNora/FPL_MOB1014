/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.test_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class main {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static ArrayList<Laptop> listLaps = new ArrayList<>();
    static ArrayList<MayTinhBang> listMayTinhBang = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhap danh sach Laptop");
            System.out.println("2. Xuat danh sach Laptop");
            System.out.println("3. Xuat danh sach Laptop theo khoang version");
            System.out.println("4. Tim Laptop co version > 2015");
            System.out.println("5. Nhap thong tin may tinh bang (Ke thua tu Laptop)");
            System.out.println("0. Thoat");
            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 0 || choice > 5) {
                        System.out.println("Lua chon cua ban khong hop le. Hay nhap lai");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Lua chon cua ban khong hop le. Hay nhap lai");
                }
            } while (true);
            switch (choice) {
                case 1:
                    inputLaptop();
                    break;
                case 2:
                    showListLaps();
                    break;
                case 3:
                    showListLapsByVersion();
                    break;
                case 4:
                    showListLaps2015();
                    break;
                case 5:
                    setMayTinhBang();
                    break;
                case 0:
                    System.out.println("Ban da chon thoat chuong trinh.");
                    return;
            }
        } while (true);
    }

    public static void inputLaptop() {
        int quantity;
        int choice;
        quantity = inputQuantity();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Nhap thong tin laptop thu " + (i + 1));
            Laptop laptop = new Laptop();
            laptop.setData();
            System.out.println("");
            listLaps.add(laptop);
        }
        repeatInput();
    }

    public static void repeatInput() {
        int choice;
        System.out.print("Ban co muon nhap tiep Laptop hay khong (1. Co | 2.Khong)\n");
        do {
            try {
                System.out.print("Lua chon cua ban: ");
                choice = Integer.parseInt(input.nextLine());
                if (choice < 0 || choice > 2) {
                    System.out.println("Lua chon cua ban khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lua chon cua ban khong hop le. Hay nhap lai");
            }
        } while (true);
        switch (choice) {
            case 1:
                inputLaptop();
                break;
            case 2:
                return;
        }
    }

    public static void showListLaps() {
        if (listLaps.isEmpty()) {
            System.out.println("Danh sach Laptop dang trong. Hay nhap lai.");
            return;
        }

        System.out.println("Thong tin laptop");
        for (Laptop laptop : listLaps) {
            laptop.showData();
            System.out.println("");
        }
    }

    public static void showListLapsByVersion() {
        if (listLaps.isEmpty()) {
            System.out.println("Danh sach Laptop dang trong. Hay nhap lai.");
            return;
        }

        int minValue;
        int maxValue;
        Boolean check = false;
        minValue = inputVersion("khoang version dau");
        maxValue = inputVersion("khoang version cuoi");
        if (minValue > maxValue) {
            int temp = minValue;
            minValue = maxValue;
            maxValue = temp;
        }
        System.out.printf("Danh sach Laptop trong khoang version tu %d den %d la:\n", minValue, maxValue);
        for (Laptop laptop : listLaps) {
            int version = laptop.getVersion();
            if (version >= minValue && version <= maxValue) {
                check = true;
                laptop.showData();
                System.out.println("");
            }
        }
        if (!check) {
            System.out.println("Khong co laptop trong khoang version da nhap.");
        }
    }

    public static void showListLaps2015() {
        if (listLaps.isEmpty()) {
            System.out.println("Danh sach Laptop dang trong. Hay nhap lai.");
            return;
        }

        Boolean check = false;
        System.out.println("Danh sach Laptop co version > 2015 la:");
        for (Laptop laptop : listLaps) {
            int version = laptop.getVersion();
            if (version > 2015) {
                check = true;
                laptop.showData();
            }
        }
        if (!check) {
            System.out.println("Khong co laptop co version > 2015 trong danh sach");
        }
    }

    public static void setMayTinhBang() {
        int quantity;
        quantity = inputQuantity();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Nhap thong tin may tinh bang thu " + (i + 1));
            MayTinhBang mayTinhBang = new MayTinhBang();
            mayTinhBang.setData();
            listMayTinhBang.add(mayTinhBang);
            System.out.println("");
        }
        System.out.println("\n Thong tin may tinh bang vua nhap:");
        for (MayTinhBang mayTinhBang : listMayTinhBang) {
            mayTinhBang.showData();
            System.out.println("");
        }
    }

    public static int inputQuantity() {
        int quantity;
        do {
            try {
                System.out.print("Hay nhap vao so luong: ");
                quantity = Integer.parseInt(input.nextLine());
                if (quantity <= 0) {
                    System.out.println("Lua chon cua ban khong hop le. Hay nhap lai");
                } else {
                    return quantity;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lua chon cua ban khong hop le. Hay nhap lai");
            }
        } while (true);
    }

    public static int inputVersion(String nameOfNum) {
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
}
