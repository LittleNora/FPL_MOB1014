/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.Lab05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class VinhNDQ_PH26105_lab05 {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static Lab05_ClassSanPham emp;
    static ArrayList<Lab05_ClassSanPham> listEmps = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("Menu Lab 5:");
            System.out.println("1. Nhap danh sach N nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Dem nhan vien nam. nu");
            System.out.println("4. In thong tin nhan vien theo khoang luong");
            System.out.println("5. In ra nhan vien theo tuoi va gioi tinh");
            System.out.println("6. Tim va xoa cac nhan vien co trang thai \"da nghi\"");
            System.out.println("7. Ket thuc chuong trinh");
            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 1 || choice > 7) {
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
                    bai1();
                    System.out.println("\t========");
                    break;
                case 2:
                    bai2();
                    System.out.println("\t========");
                    break;
                case 3:
                    bai3();
                    System.out.println("\t========");
                    break;
                case 4:
                    bai4();
                    System.out.println("\t========");
                    break;
                case 5:
                    bai5();
                    System.out.println("\t========");
                    break;
                case 6:
                    bai6();
                    System.out.println("\t========");
                    break;
                case 7:
                    System.out.println("Ban da chon ket thuc chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void bai1() {
        int n;
        do {
            try {
                System.out.print("Hay nhap vao so luong nhan vien muon nhap: ");
                n = Integer.parseInt(input.nextLine());
                if (n > 0 && n < 20) {
                    break;
                } else {
                    System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);

        for (int i = 0; i < n; i++) {
            emp = new Lab05_ClassSanPham();
            System.out.println("Nhap vao thong tin nhan vien thu " + (i + 1));

            emp.setData();
            listEmps.add(emp);
            System.out.println("");
        }
    }

    public static void bai2() {
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay nhap vao.");
            return;
        }
        System.out.println("Thong tin nhan vien");
        for (Lab05_ClassSanPham eachEmp : listEmps) {
            eachEmp.showData();
        }
    }

    public static void bai3() {
        int countMale = 0;
        int countFemale = 0;

        System.out.println("Chuong trinh dem so nhan vien Nam, Nu");
        for (Lab05_ClassSanPham eachEmp : listEmps) {
            if (eachEmp.gender.equalsIgnoreCase("Nam")) {
                countMale++;
            } else if (eachEmp.gender.equalsIgnoreCase("Nu")) {
                countFemale++;
            }
        }

        if (countMale == 0) {
            System.out.println("- Khong co nhan vien co gioi tinh \"Nam\"");
        } else {
            System.out.println("- Tong so nhan vien Nam: " + countMale);
        }
        
        if (countFemale == 0) {
            System.out.println("- Khong co nhan vien co gioi tinh \"Nu\"");
        } else {
            System.out.println("- Tong so nhan vien Nu: " + countFemale);
        }
    }

    public static void bai4() {
        boolean check = true;

        System.out.println("Chuong trinh tim nhan vien co luong trong khoang 8-10 trieu");
        for (Lab05_ClassSanPham eachEmp : listEmps) {
            if (eachEmp.salary >= 8000000 && eachEmp.salary <= 10000000) {
                check = false;
                eachEmp.showData();
            }
        }

        if (check) {
            System.out.println("Khong tim thay nhan vien co luong trong khoang 8 trieu den 10 trieu.");
        }
    }

    public static void bai5() {
        boolean check = true;

        System.out.println("Chuong trinh in ra thong tin nhan vien co tuoi:");
        System.out.println("\ta. >= 60 doi voi gioi tinh \"Nam\"");
        System.out.println("\tb. >= 55 doi voi gioi tinh \"Nu\"");

        for (Lab05_ClassSanPham eachEmp : listEmps) {
            if ((eachEmp.getAge() >= 60 && eachEmp.gender.equalsIgnoreCase("Nam")) || (eachEmp.getAge() >= 55 && eachEmp.gender.equalsIgnoreCase("Nu"))) {
                check = false;
                eachEmp.showData();
            }
        }

        if (check) {
            System.out.println("Khong tim thay nhan vien theo yeu cau");
        }
    }

    public static void bai6() {
        boolean check = true;

        System.out.println("Chuong trinh xoa cac nhan vien co trang thai \"da nghi\"");
        for (int i = 0; i < listEmps.size(); i++) {
            if (listEmps.get(i).status.equalsIgnoreCase("da nghi")) {
                check = false;
                listEmps.remove(i);
            }
        }

        if (check) {
            System.out.println("Khong co nhan vien nao trong trang thai \"da nghi\"");
        } else {
            System.out.println("Xoa thanh cong");
        }
    }

}
