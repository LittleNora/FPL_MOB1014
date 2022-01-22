/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class asm1 {

    static Scanner input = new Scanner(System.in);
    static Employee emp;
    static ArrayList<Employee> listEmps = new ArrayList<>();

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
                    showEmps();
                    System.out.println("\t========");
                    break;
                case 3:
                    findAsID();
                    System.out.println("\t========");
                    break;
                case 4:
                    deleteEmp();
                    System.out.println("\t========");
                    break;
                case 5:
                    updateEmp();
                    System.out.println("\t========");
                    break;
                case 6:
                    System.out.println("Ban da chon chuc nang tim nhan vien theo khoang luong");
                    break;
                case 7:
                    System.out.println("Ban da chon chuc nang sap xep nhan vien theo ho va ten");
                    break;
                case 8:
                    System.out.println("Ban da chon chuc nang sap xep nhan vien theo thu nhap");
                    break;
                case 9:
                    System.out.println("Ban da chon chuc nang in ra top 5 nhan vien thu nhap cao nhat");
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
            System.out.println("Nhap vao thong tin nhan vien thu " + (i + 1));
            emp = new Employee();
            emp.setData();
            listEmps.add(emp);
            System.out.println("\t**********");
        }
    }

    public static void showEmps() {
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }
        for (Employee x : listEmps) {
            System.out.println("Thong tin nhan vien");
            x.showData();
            System.out.println("\t**********\n");
        }
    }

    public static void findAsID() {
        String id_input;
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }
        System.out.print("Nhap ma nhan vien muon tim: ");
        id_input = input.nextLine();
        for (Employee x : listEmps) {
            if (id_input.equalsIgnoreCase(x.id)) {
                System.out.println("Thong tin nhan vien co ma " + id_input + ":");
                x.showData();
                return;
            }
        }
        System.out.println("Khong tim thay ma nhan vien.");
    }

    public static void deleteEmp() {
        String id_input;
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }
        System.out.print("Nhap ma nhan vien muon tim: ");
        id_input = input.nextLine();
        for (int i = 0; i < listEmps.size(); i++) {
            if (id_input.equalsIgnoreCase(listEmps.get(i).id)) {
                System.out.println("Da tim thay nhan vien co ma " + id_input);
                listEmps.remove(i);
                System.out.println("Xoa thanh cong nhan vien co ma " + id_input);
                return;
            }
        }
        System.out.println("Khong tim thay ma nhan vien.");
    }

    public static void updateEmp() {
        String id_input;
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }
        System.out.print("Nhap ma nhan vien muon tim: ");
        id_input = input.nextLine();
        for (int i = 0; i < listEmps.size(); i++) {
            if (id_input.equalsIgnoreCase(listEmps.get(i).id)) {
                System.out.println("Da tim thay nhan vien co ma " + id_input);
                emp = new Employee();
                emp.updateData(id_input);
                listEmps.set(i, emp);
                System.out.println("Cap nhat thong tin nhan vien co ma " + id_input + " thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay ma nhan vien.");
    }

    public static int checkNumInt(String nameNum) {
        int num;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", nameNum);
                num = Integer.parseInt(input.nextLine());
                if (num <= 0) {
                    System.out.println("Gia tri nhap khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai");
            }
        } while (true);
        return num;
    }

    public static double checkNumDou(String nameNum) {
        double num;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", nameNum);
                num = Double.parseDouble(input.nextLine());
                if (num <= 0) {
                    System.out.println("Gia tri nhap khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai");
            }
        } while (true);
        return num;
    }
}
