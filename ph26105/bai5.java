/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class bai5 {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static ClassBai5 obj;
    static ArrayList<ClassBai5> listBai5 = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhap thong tin bien so xe");
            System.out.println("2. In thong tin bien so xe");
            System.out.println("3. Tim va in ra bien so xe co ma vung la 29");
            System.out.println("4. Tim va in ra bien so xe co ten vung la Hanoi va dang ki o quan Dongda");
            System.out.println("5. Ket thuc");
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
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    showAsId();
                    break;
                case 4:
                    showAsArea();
                    break;
                case 5:
                    System.out.println("Ban da chon thoat chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void add() {
        int n;
        do {
            try {
                System.out.print("Hay nhap vao so luong nhan vien muon nhap: ");
                n = Integer.parseInt(input.nextLine());
                if (n <= 1) {
                    System.out.println("So luong nhap vao khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le. Hay nhap lai");
            }
        } while (true);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin thu " + (i + 1));
            obj = new ClassBai5();
            obj.setData();
            listBai5.add(obj);
            System.out.println("\t===========");
        }
    }

    public static void show() {
        if (listBai5.isEmpty()) {
            System.out.println("Danh sach dang trong. Hay nhap vao.");
            return;
        }
        for (ClassBai5 x : listBai5) {
            System.out.println("Thong tin bien so xe:");
            x.showData();
            System.out.println("\t===========");
        }
    }

    public static void showAsId() {
        int count = 0;
        if (listBai5.isEmpty()) {
            System.out.println("Danh sach dang trong. Hay nhap vao.");
            return;
        }
        for (ClassBai5 x : listBai5) {
            if ("29".equalsIgnoreCase(x.maVung)) {
                x.showData();
                count++;
                System.out.println("\t===========");
            }
        }
        if (count == 0) {
            System.out.println("Khong co xe nao co ma vung la 29");
        }
    }

    public static void showAsArea() {
        int count = 0;
        if (listBai5.isEmpty()) {
            System.out.println("Danh sach dang trong. Hay nhap vao.");
            return;
        }
        for (ClassBai5 x : listBai5) {
            if ("Hanoi".equalsIgnoreCase(x.tenVung) && "DongDa".equalsIgnoreCase(x.quan)) {
                x.showData();
                count++;
                System.out.println("\t===========");
            }
        }
        if (count == 0) {
            System.out.println("Khong co xe nao thoa man yeu cau");
        }
    }

}
