/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class asm1 {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        int position_id[] = new int[n];
        Employee objEmployee[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            objEmployee[i] = new Employee();
            System.out.printf("Hay nhap thong tin cho nhan vien thu [%d]\n", i + 1);
            position_id[i] = objEmployee[i].setData();
            System.out.println("\t==========");
        }
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
                    create();
                    System.out.println("\t========");
                case 2:
                    showEmployee(n, objEmployee, position_id);
                    System.out.println("\t========");
                    break;
                case 3:
                    findAsId(n, objEmployee, position_id);
                    System.out.println("\t========");
                    break;
                case 4:
                    System.out.println("Ban da chon chuc nang xoa nhan vien theo ma");
                    break;
                case 5:
                    System.out.println("Ban da chon chuc nang cap nhat nhan vien theo ma");
                    break;
                case 6:
                    System.out.println("Ban da chon chuc nang tim nhan vien theo khoang luong");
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

    public static void create() {
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
        int[] position_id = new int[n];
        Employee[] objEmployee = new Employee[n];
        inputEmployee(n, objEmployee, position_id);
    }
    public static void inputEmployee(int n, Employee[] objEmployee, int[] position_id) {
        for (int i = 0; i < n; i++) {
            objEmployee[i] = new Employee();
            System.out.printf("Hay nhap thong tin cho nhan vien thu [%d]: ", i);
            objEmployee[i].setData();
        }
    }
    
    public static void showEmployee(int n, Employee[] objEmployee, int[] position_id) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhan vien thu %d: \n", i + 1);
            objEmployee[i].showData(position_id[i]);
            System.out.println("");
        }
    }

    public static void findAsId(int n, Employee[] objEmployee, int[] position_id) {
        String id_input;
        int count = 0;
        System.out.print("Nhap vao ma nhan vien muon tim kiem: ");
        id_input = input.nextLine();
        System.out.println("\t========");
        for (int i = 0; i < n; i++) {
            if (objEmployee[i].id.equalsIgnoreCase(id_input)) {
                System.out.println("Thong tin cua nhan vien co ma " + id_input);
                objEmployee[i].showData(position_id[i]);
                System.out.println("");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay ma");
        }
        System.out.println("\t========");
    }
}
