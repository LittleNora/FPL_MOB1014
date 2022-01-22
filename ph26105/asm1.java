/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class asm1 {

    static Scanner input = new Scanner(System.in);
    static int n;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        do {
            System.out.println("Menu Assignment:");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Tim nhan vien theo ma");
            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 1 || choice > 6) {
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
                    inputEmployee(n, objEmployee, position_id);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Ban da chon thoat chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void inputEmployee(int n, Employee[] objEmployee, int[] position_id) {
        for (int i = 0; i < n; i++) {
            objEmployee[i] = new Employee();
            System.out.printf("Hay nhap thong tin cho nhan vien thu [%d]: ", i);
            position_id[i] = objEmployee[i].setData();
        }
    }

    public static void showEmployee(int n, Employee[] objEmployee, int[] position_id) {
        for (int i = 0; i < n; i++) {
            objEmployee[i] = new Employee();
            System.out.printf("Hay nhap thong tin cho nhan vien thu [%d]: ", i);
            objEmployee[i].showData(position_id[i]);
        }
    }
}