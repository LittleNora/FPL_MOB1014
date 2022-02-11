/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.Lab06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class VinhNDQPH26105_lab06 {

    /**
     * @param args the command line arguments
     */
    static Scanner ip = new Scanner(System.in);
    static Student student;
    static ArrayList<Person> listStudents = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
    public static void menu() {
        int choice;
        do {
            System.out.println("Menu Lab 6:");
            System.out.println("1. Nhap thong tin sinh vien: ");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Ket thuc chuong trinh");
            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(ip.nextLine());
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
                    inputInfo();
                    System.out.println("\t========");
                    break;
                case 2:
                    showInfo();
                    System.out.println("\t========");
                    break;
                case 3:
                    System.out.println("Ban da chon ket thuc chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
    
    public static void inputInfo() {
        int quantity;

        do {
            try {
                System.out.print("Hay nhap vao so luong sinh vien muon nhap: ");
                quantity = Integer.parseInt(ip.nextLine());
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
            student = new Student();
            student.input();
            listStudents.add(student);
        }
        
    }
    
    public static void showInfo() {
        if (listStudents.isEmpty()) {
            System.out.println("Danh sach dang trong. Hay nhap thong tin.");
            return;
        }
        System.out.println("Thong tin sinh vien:");
        for (Person listStudent : listStudents) {
            listStudent.display();
            System.out.println("");
        }
    }
}
