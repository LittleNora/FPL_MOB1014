/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author QuangVinh
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class ListEmps {

    static ArrayList<EmployeeClassAsm> listEmps = new ArrayList<>();
    static ArrayList<EmployeeClassAsm> listEmpsSortBySalary = new ArrayList<>();
    static int position_id;
    static Scanner input = new Scanner(System.in);

    public void setData() {
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

        switch (position_id) {
            case 1:
                OfficeEmpClassAsm officeEmp = new OfficeEmpClassAsm();
                officeEmp.setData();
                listEmps.add(officeEmp);
                break;
            case 2:
                SaleEmpClassAsm saleEmp = new SaleEmpClassAsm();
                saleEmp.setData();
                listEmps.add(saleEmp);
                break;
            case 3:
                ManageEmpClassAsm manageEmp = new ManageEmpClassAsm();
                manageEmp.setData();
                listEmps.add(manageEmp);
                break;
        }
        listEmpsSortBySalary = listEmps;
    }

    public void showFullData() {
        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        System.out.print("Thong tin nhan vien:\n\n");
        for (EmployeeClassAsm eachEmp : listEmps) {
            if (eachEmp instanceof OfficeEmpClassAsm) {
                ((OfficeEmpClassAsm) eachEmp).showFullData();
            } else if (eachEmp instanceof SaleEmpClassAsm) {
                ((SaleEmpClassAsm) eachEmp).showFullData();
            } else if (eachEmp instanceof ManageEmpClassAsm) {
                ((ManageEmpClassAsm) eachEmp).showFullData();
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void showSubData() {
        for (EmployeeClassAsm eachEmp : listEmps) {
            if (eachEmp instanceof OfficeEmpClassAsm) {
                ((OfficeEmpClassAsm) eachEmp).showSubData();
            } else if (eachEmp instanceof SaleEmpClassAsm) {
                ((SaleEmpClassAsm) eachEmp).showSubData();
            } else if (eachEmp instanceof ManageEmpClassAsm) {
                ((ManageEmpClassAsm) eachEmp).showSubData();
            }
        }
    }

    public static void findByID() {
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

    public static void deleteEmpByID() {
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

    public static void updateEmpByID() {
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

                switch (position_id) {
                    case 1:
                        OfficeEmpClassAsm officeEmp = new OfficeEmpClassAsm();
                        officeEmp.updateData(id_input);
                        listEmps.set(i, officeEmp);
                        break;
                    case 2:
                        SaleEmpClassAsm saleEmp = new SaleEmpClassAsm();
                        saleEmp.updateData(id_input);
                        listEmps.set(i, saleEmp);
                        break;
                    case 3:
                        ManageEmpClassAsm manageEmp = new ManageEmpClassAsm();
                        manageEmp.updateData(id_input);
                        listEmps.set(i, manageEmp);
                        break;
                }
                listEmpsSortBySalary = listEmps;
                System.out.println("Cap nhat thong tin nhan vien co ma " + id_input + " thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay ma nhan vien");
    }

    public static void findBySalary() {
        boolean check = true;
        double min;
        double max;
        double totalSalary = 0;

        if (listEmps.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay them nhan vien.");
            return;
        }

        min = checkNumDou("gia tri luong dau (trieu dong)");
        max = checkNumDou("gia tri luong cuoi (trieu dong)");

        if (min >= max) {
            double temp = min;
            min = max;
            max = temp;
        }

        for (EmployeeClassAsm eachEmp : listEmps) {
            if (eachEmp instanceof OfficeEmpClassAsm) {
                totalSalary = ((OfficeEmpClassAsm) eachEmp).getTotalSalary();
            } else if (eachEmp instanceof SaleEmpClassAsm) {
                totalSalary = ((SaleEmpClassAsm) eachEmp).getTotalSalary();
            } else if (eachEmp instanceof ManageEmpClassAsm) {
                totalSalary = ((ManageEmpClassAsm) eachEmp).getTotalSalary();
            }

            if (totalSalary >= min && totalSalary <= max) {
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
                double salary1 = 0;
                double salary2 = 0;
                if (o1 instanceof OfficeEmpClassAsm) {
                    salary1 = ((OfficeEmpClassAsm) o1).getTotalSalary();
                } else if (o1 instanceof SaleEmpClassAsm) {
                    salary1 = ((SaleEmpClassAsm) o1).getTotalSalary();
                } else if (o1 instanceof ManageEmpClassAsm) {
                    salary1 = ((ManageEmpClassAsm) o1).getTotalSalary();
                }

                if (o2 instanceof OfficeEmpClassAsm) {
                    salary2 = ((OfficeEmpClassAsm) o2).getTotalSalary();
                } else if (o2 instanceof SaleEmpClassAsm) {
                    salary2 = ((SaleEmpClassAsm) o2).getTotalSalary();
                } else if (o2 instanceof ManageEmpClassAsm) {
                    salary2 = ((ManageEmpClassAsm) o2).getTotalSalary();
                }

                return salary1 > salary2 ? -1 : 1;
            }
        };

        Collections.sort(listSort, comp);
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
