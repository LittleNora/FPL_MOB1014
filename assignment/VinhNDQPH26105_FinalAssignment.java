/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class VinhNDQPH26105_FinalAssignment {

    static Scanner input = new Scanner(System.in);
    static ListEmps listEmps = new ListEmps();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int choice;

        do {
            System.out.println("Menu Assignment:");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Tim nhan vien theo ma");
            System.out.println("4. Xoa nhan vien theo ma");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma");
            System.out.println("6. Tim nhan vien theo khoang luong");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Top 5 nhan vien co doanh thu cao nhat");
            System.out.println("10. Ket thuc chuong trinh");

            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 1 || choice > 10) {
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
                    addEmps();
                    System.out.println("\t========");
                    break;
                case 2:
                    listEmps.showFullData();
                    System.out.println("\t========");
                    break;
                case 3:
                    listEmps.findByID();
                    System.out.println("\t========");
                    break;
                case 4:
                    listEmps.deleteEmpByID();
                    System.out.println("\t========");
                    break;
                case 5:
                    listEmps.updateEmpByID();
                    System.out.println("\t========");
                    break;
                case 6:
                    listEmps.findBySalary();
                    System.out.println("\t========");
                    break;
                case 7:
                    listEmps.sortByName();
                    System.out.println("\t========");
                    break;
                case 8:
                    listEmps.sortBySalary();
                    System.out.println("\t========");
                    break;
                case 9:
                    listEmps.showTopSalary();
                    System.out.println("\t========");
                    break;
                case 10:
                    System.out.println("Ban da chon ket thuc chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void addEmps() {
        int quantity;

        do {
            try {
                System.out.print("Hay nhap vao so luong nhan vien muon nhap: ");
                quantity = Integer.parseInt(input.nextLine());
                if (quantity < 1) {
                    System.out.println("So luong nhap vao khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le. Hay nhap lai");
            }
        } while (true);

        for (int i = 0; i < quantity; i++) {
            System.out.println("\nThong tin nhan vien thu " + (i + 1));
            listEmps.setData();
        }
    }

}
