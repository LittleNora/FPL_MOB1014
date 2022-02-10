/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.Lab05;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Lab05_ClassSanPham {

    static Scanner input = new Scanner(System.in);

    String name;
    String gender;
    int yearBirth;
    double salary;
    String status;

    public Lab05_ClassSanPham() {
    }

    public Lab05_ClassSanPham(String name, String gender, int yearBirth, double salary, String status) {
        this.name = name;
        this.gender = gender;
        this.yearBirth = yearBirth;
        this.salary = salary;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setData() {
        System.out.print("Hay nhap vao ten nhan vien: ");
        name = input.nextLine();

        do {
            System.out.print("Hay nhap vao gioi tinh cua nhan vien (Nam/Nu): ");
            gender = input.nextLine();
            if (gender.equalsIgnoreCase("Nam") || gender.equalsIgnoreCase("Nu")) {
                break;
            } else {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);

        do {
            try {
                System.out.print("Hay nhap vao nam sinh nhan vien: ");
                yearBirth = Integer.parseInt(input.nextLine());
                if (yearBirth <= 0) {
                    System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);

        do {
            try {
                System.out.print("Hay nhap vao luong nhan vien: ");
                salary = Double.parseDouble(input.nextLine());
                if (salary <= 0) {
                    System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);

        do {
            System.out.print("Hay nhap vao trang thai cua nhan vien (dang lam/da nghi): ");
            status = input.nextLine();
            if (status.equalsIgnoreCase("dang lam") || status.equalsIgnoreCase("da nghi")) {
                break;
            } else {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
    }

    public void showData() {
        System.out.printf("o\t%s, %s, %d, %.0f VND, %s.\n", name, gender, yearBirth, salary, status);
    }

    public int getAge() {
        return 2022 - yearBirth;
    }
}
