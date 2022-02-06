/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Employee {

    int choice;
    int id, salary, commissionRate, responSalary, sale, position_id;
    String fullName;

    Scanner input = new Scanner(System.in);

    public int setData() {
        System.out.println("Phan loai nhan vien");
        System.out.println("1. Nhan vien hanh chinh");
        System.out.println("2. Nhan vien tiep thi");
        System.out.println("3. Truong phong");
        do {
            try {
                System.out.print("Lua chon cua ban: ");
                position_id = Integer.parseInt(input.nextLine());
                if (position_id < 1 || position_id > 3) {
                    System.out.println("Lua chon khong hop le. Hay nhap lai.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);

        id = inputNum("ma nhan vien");
        System.out.print("Hay nhap vao ten cua nhan vien: ");
        fullName = input.nextLine();
        id = inputNum("luong nhan vien (trieu dong)");

        switch (position_id) {
            case 1:
                break;
            case 2:
                sale = inputNum("doanh so ban hang");
                commissionRate = inputNum("ti le hoa hong (%)");
                break;
            case 3:
                responSalary = inputNum("luong trach nhiem");
                break;
        }
        return position_id;
    }

    public void showData(int choice) {
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ten nhan vien: " + fullName);
        System.out.println("Luong: " + salary);
        switch (choice) {
            case 1:
                break;
            case 2:
                System.out.println("Doanh so ban hang: " + sale);
                System.out.println("Ty le hoa hong: " + commissionRate);
                break;
            case 3:
                System.out.println("Luong trach nhiem: " + responSalary);
                break;
        }
    }

    public int inputNum(String nameNum) {
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
}