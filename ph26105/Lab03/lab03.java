/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph26105.Lab03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class lab03 {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        do {
            System.out.println("Menu Lab 3:");
            System.out.println("1. Kiem tra so nguyen to");
            System.out.println("2. In ra bang cuu chuong tu 1 den n");
            System.out.println("3. Chuong trinh nhap mang");
            System.out.println("4. Chuong trinh nhap thong tin sinh vien");
            System.out.println("5. Bai tap them");
            System.out.println("6. Ket thuc chuong trinh");
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
                    bai1();
                    break;
                case 2:
                    bai2_2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai4();
                    break;
                case 5:
                    bai_them();
                    break;
                case 6:
                    System.out.println("Ban da chon thoat chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void bai1() {
        int num;
        boolean checkNum = true;
        do {
            try {
                System.out.print("Hay nhap vao so muon kiem tra: ");
                num = Integer.parseInt(input.nextLine());
                if (num <= 0) {
                    System.out.println("So nhap vao khong duoc am hoac bang 0. Hay nhap lai.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                checkNum = false;
                break;
            }
        }
        if (checkNum == true) {
            System.out.println(num + " la so nguyen to");
        } else {
            System.out.println(num + " khong la so nguyen to");
        }
    }

    /*
    public static void bai2() {
        System.out.println("Chuong trinh bang cuu chuong tu 1 den 10:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.print("\n");
        }
    }
     */

    public static void bai2_2() {
        int num;
        do {
            try {
                System.out.print("Ban muon in ra bang cuu chuong tu 1 den bao nhieu: ");
                num = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Gia tri nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
        System.out.println("Day la bang cuu chuong tu 1 den " + num + " cua ban");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.print("\n");
        }
    }

    public static void bai3() {
        int n, count = 0, sum = 0;
        do {
            try {
                System.out.print("Hay nhap vao so phan tu cua mang: ");
                n = Integer.parseInt(input.nextLine());
                if (n <= 1) {
                    System.out.println("So nhap vao khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le. Hay nhap lai");
            }
        } while (true);
        int[] arrNums = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                try {
                    System.out.printf("Nhap gia tri vao index [%d]: ", i);
                    arrNums[i] = Integer.parseInt(input.nextLine());
                    if (arrNums[i] % 3 == 0) {
                        count++;
                        sum += arrNums[i];
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
                }
            } while (true);
        }
        Arrays.sort(arrNums);
        System.out.print("Mang so nguyen ban vua nhap theo thu tu tang dan la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrNums[i] + " ");
        }
        System.out.println("\nSo be nhat trong mang = " + arrNums[0]);
        System.out.printf("Trung binh cong cac so chia het cho 3 co trong mang = %.2f\n", (double) sum / count);
    }

    public static void bai4() {
        int n;
        do {
            try {
                System.out.print("Hay nhap vao so luong sinh vien: ");
                n = Integer.parseInt(input.nextLine());
                if (n <= 1) {
                    System.out.println("So nhap vao khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le. Hay nhap lai");
            }
        } while (true);
        String[] arrNames = new String[n];
        double[] arrScores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Hay nhap vao ho ten cua sinh vien tai index [%d]: ", i);
            arrNames[i] = input.nextLine();
            do {
                try {
                    System.out.printf("Nhap diem cho sinh vien %s: ", arrNames[i]);
                    arrScores[i] = Double.parseDouble(input.nextLine());
                    if (arrScores[i] >= 0 && arrScores[i] <= 10) {
                        break;
                    } else {
                        System.out.println("Diem khong hop le. Hay nhap lai.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
                }
            } while (true);
        }
        show_info(n, arrNames, arrScores);
        sortStudent(n, arrNames, arrScores);
    }

    public static void show_info(int n, String[] arrNames, double[] arrScores) {
        System.out.println("Thong tin sinh vien ban vua nhap vao la:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Index [%d]:\n", i);
            System.out.printf("\tHo ten: " + arrNames[i]);
            System.out.printf("\n\tDiem: " + arrScores[i]);
            System.out.println("\n\tHoc luc: " + checkHocLuc(arrScores[i]));
            System.out.println("");
        }
    }

    public static String checkHocLuc(double score) {
        String hoc_luc;
        if (score >= 9) {
            hoc_luc = "Xuat sac";
        } else if (score < 9 && score >= 7.5) {
            hoc_luc = "Gioi";
        } else if (score < 7.5 && score >= 6.5) {
            hoc_luc = "Kha";
        } else if (score < 6.5 && score >= 5) {
            hoc_luc = "Trung binh";
        } else {
            hoc_luc = "Yeu";
        }
        return hoc_luc;
    }

    public static void sortStudent(int n, String[] arrNames, double[] arrScores) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrScores[i] > arrScores[j]) {
                    double temp = arrScores[i];
                    arrScores[i] = arrScores[j];
                    arrScores[j] = temp;

                    String temp_string = arrNames[i];
                    arrNames[i] = arrNames[j];
                    arrNames[j] = temp_string;
                }
            }
        }
        System.out.println("Thong tin sinh vien theo diem tang dan la:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Diem: %.2f\t\tTen: %s\n", arrScores[i], arrNames[i]);
        }
    }

    public static void bai_them() {
        int n, sum = 0;
        do {
            try {
                System.out.print("Hay nhap vao so phan tu cua mang: ");
                n = Integer.parseInt(input.nextLine());
                if (n <= 0 || n > 20) {
                    System.out.println("So nhap vao khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le. Hay nhap lai");
            }
        } while (true);
        int[] arrNums = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                try {
                    System.out.printf("Nhap so tai index [%d]: ", i);
                    arrNums[i] = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
                }
            } while (true);
            sum += arrNums[i];
        }
        System.out.println("So lon nhat trong mang = " + findMax(n, arrNums));
        System.out.println("Tong cac phan tu trong mang = " + sum);
    }

    public static int findMax(int n, int[] arrNums) {
        int max = arrNums[0];
        for (int i = 1; i < n; i++) {
            if (arrNums[i] >= max) {
                max = arrNums[i];
            }
        }
        return max;
    }
}