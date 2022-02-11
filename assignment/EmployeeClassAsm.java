/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class EmployeeClassAsm {

    String id;
    String name;
    double salary;
    static Scanner input = new Scanner(System.in);

    public EmployeeClassAsm() {
    }

    public EmployeeClassAsm(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setData() {
        System.out.print("Hay nhap vao ma nhan vien: ");
        this.id = input.nextLine();
        System.out.print("Hay nhap vao ten cua nhan vien: ");
        this.name = input.nextLine();
        this.salary = inputNum("luong nhan vien (trieu dong)");
    }

    public void showFullData() {
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ten nhan vien: " + name);
        System.out.printf("Luong nhan vien: %.1f trieu VND\n", salary);
    }
    
    public void updateData(String id_input) {
        id = id_input;
        System.out.print("Hay nhap vao ten cua nhan vien: ");
        name = input.nextLine();
        salary = inputNum("luong nhan vien (trieu dong)");
    }
    
    public void showSubData() {
        System.out.printf("Ma: %s | Ten: %s ", id, name);
    }
    
    public double getIncomeTax(double totalSalary) {
        double incomeTaxPer;

        if (totalSalary< 9) {
            incomeTaxPer = 0;
        } else if (totalSalary>= 9 && totalSalary <= 15) {
            incomeTaxPer = 0.1;
        } else {
            incomeTaxPer = 0.12;
        }
        return totalSalary * incomeTaxPer;
    }

    public double inputNum(String nameNum) {
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
