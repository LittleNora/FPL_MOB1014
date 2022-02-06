/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class VinhNDQPH26105_Assignment_GĐ02 {

    static Scanner input = new Scanner(System.in);
    static EmployeeClassAsm emp;
    static ArrayList<EmployeeClassAsm> listEmps = new ArrayList<>();
    static ArrayList<EmployeeClassAsm> listEmpsSortBySalary = new ArrayList<>();

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
                    findById();
                    System.out.println("\t========");
                    break;
                case 4:
                    deleteEmpById();
                    System.out.println("\t========");
                    break;
                case 5:
                    updateEmpById();
                    System.out.println("\t========");
                    break;
                case 6:
                    findBySalary();
                    System.out.println("\t========");
                    break;
                case 7:
                    sortByName();
                    System.out.println("\t========");
                    break;
                case 8:
                    sortBySalary();
                    System.out.println("\t========");
                    break;
                case 9:
                    showTopSalary();
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
            emp = new EmployeeClassAsm();

            System.out.println("Nhap vao thong tin nhan vien thu " + (i + 1));
            emp.setData();

            listEmps.add(emp);
            listEmpsSortBySalary.add(emp);

            System.out.println("\t**********");
        }
    }

    public static void showEmps() {
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        for (EmployeeClassAsm eachEmp : listEmps) {
            System.out.println("Thong tin nhan vien");
            eachEmp.showFullData();
            System.out.println("\t**********\n");
        }
    }

    public static void findById() {
        String id_input;

        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        System.out.print("Nhap ma nhan vien muon tim: ");
        id_input = input.nextLine();
        for (EmployeeClassAsm eachEmp : listEmps) {
            if (id_input.equalsIgnoreCase(eachEmp.id)) {
                System.out.println("Thong tin nhan vien co ma " + id_input + ":");
                eachEmp.showFullData();
                return;
            }
        }
        
        System.out.println("Khong tim thay ma nhan vien.");
    }

    public static void deleteEmpById() {
        String id_input;

        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        System.out.print("Nhap ma nhan vien muon xoa: ");
        id_input = input.nextLine();
        for (int i = 0; i < listEmps.size(); i++) {
            if (id_input.equalsIgnoreCase(listEmps.get(i).id)) {
                System.out.println("Da tim thay nhan vien co ma " + id_input);
                listEmps.remove(i);
                listEmpsSortBySalary = listEmps;

                System.out.println("Xoa thanh cong nhan vien co ma " + id_input);
                return;
            }
        }
        
        System.out.println("Khong tim thay ma nhan vien.");
    }

    public static void updateEmpById() {
        String id_input;

        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        System.out.print("Nhap ma nhan vien muon cap nhat: ");
        id_input = input.nextLine();

        for (int i = 0; i < listEmps.size(); i++) {
            if (id_input.equalsIgnoreCase(listEmps.get(i).id)) {
                System.out.println("Da tim thay nhan vien co ma " + id_input);
                emp = new EmployeeClassAsm();
                emp.updateData(id_input);

                listEmps.set(i, emp);
                listEmpsSortBySalary = listEmps;

                System.out.println("Cap nhat thong tin nhan vien co ma " + id_input + " thanh cong");
                return;
            }
        }

        System.out.println("Khong tim thay ma nhan vien.");

    }

    public static void findBySalary() {
        boolean check = true;
        double firstValue;
        double lastValue;

        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        firstValue = checkNumDou("gia tri luong dau (trieu dong)");
        lastValue = checkNumDou("gia tri luong cuoi (trieu dong)");

        if (firstValue >= lastValue) {
            double temp = firstValue;
            firstValue = lastValue;
            lastValue = temp;
        }

        for (EmployeeClassAsm eachEmp : listEmps) {
            if (emp.getTotalSalary() >= firstValue && eachEmp.getTotalSalary() <= lastValue) {
                check = false;
                eachEmp.showSubData();
            }
        }

        if (check) {
            System.out.println("Khong tim thay nhan vien nao trong khoang luong ban nhap");
        }

    }

    public static void sortByName() {
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        Comparator<EmployeeClassAsm> comp = new Comparator<>() {
            @Override
            public int compare(EmployeeClassAsm o1, EmployeeClassAsm o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(listEmps, comp);

        System.out.println("Sap xep nhan vien theo ten thanh cong\n");

        System.out.println("Thong tin nhan vien");
        showData(listEmps, listEmps.size());
    }

    public static void sortBySalary() {
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        sortSalary(listEmps);

        System.out.println("Sap xep nhan vien theo khoang luong thanh cong\n");

        System.out.println("Thong tin nhan vien");
        showData(listEmps, listEmps.size());
    }

    public static void showTopSalary() {
        int num = 5;

        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        sortSalary(listEmpsSortBySalary);

        if (listEmpsSortBySalary.size() <= 5) {
            num = listEmpsSortBySalary.size();
            System.out.printf("Chi co %d nhan vien. Top nhan vien co thu nhap theo thu tu giam dan la:\n", listEmpsSortBySalary.size());
        } else {
            System.out.println("Top 5 nhan vien co thu nhap cao nhat theo thu tu giam dan la:");
        }
        
        showData(listEmpsSortBySalary, num);
    }

    public static void showData(ArrayList<EmployeeClassAsm> listShow, int num) {
        for (int i = 0; i < num; i++) {
            EmployeeClassAsm eachEmp = listShow.get(i);
            eachEmp.showSubData();
        }
    }

    public static void sortSalary(ArrayList listSort) {
        Comparator<EmployeeClassAsm> comp = new Comparator<>() {
            @Override
            public int compare(EmployeeClassAsm o1, EmployeeClassAsm o2) {
                return o1.getTotalSalary() > o2.getTotalSalary() ? -1 : 1;
            }
        };

        Collections.sort(listSort, comp);
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
