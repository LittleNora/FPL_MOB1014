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
public class lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        do {
            int choice;
            System.out.println("Menu bai tap:");
            System.out.println("1. Bai 1");
            System.out.println("2. Bai 2");
            System.out.println("3. Bai 3");
            System.out.println("4. Bai 4");
            System.out.println("5. Bai tap them");
            System.out.println("6. Bai tap them 2");
            System.out.println("7. Bai tap them 3");
            System.out.println("8. Ket thuc chuong trinh");

            System.out.print("Nhap vao lua chon: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai4();
                    break;
                case 5:
                    bai_tap_them();
                    break;
                case 6:
                    bai_tap_them_2();
                case 7:
                    bai_tap_them_3();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public static void bai1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Hay nhap vao ten cua ban: ");
        String ten_sv = input.nextLine();
        double diem_tb;
        do {
            System.out.print("Hay nhap vao diem trung binh cua ban: ");
            diem_tb = input.nextDouble();
            if (diem_tb < 0 || diem_tb > 10) {
                System.out.println("Diem khong hop le. Hay nhap lai.");
            }
        } while (diem_tb < 0 || diem_tb > 10);

        System.out.println("Ten sinh vien: " + ten_sv + ". Diem trung binh: " + diem_tb);
    }

    public static void bai2() {
        Scanner input = new Scanner(System.in);
        double dai, rong, chu_vi, dien_tich;
        System.out.print("Hay nhap vao chieu dai: ");
        dai = input.nextDouble();
        System.out.print("Hay nhap vao chieu rong: ");
        rong = input.nextDouble();
        chu_vi = (dai + rong) * 2;
        dien_tich = dai * rong;

        System.out.println("Chu vi cua hinh chu nhat la: " + chu_vi);
        System.out.println("Dien tich cua hinh chu nhat la: " + dien_tich);
        System.out.println("Canh nho nhat la: " + Math.min(dai, rong));
    }

    public static void bai3() {
        Scanner input = new Scanner(System.in);
        double canh;
        do {
            System.out.print("Hay nhap vao 3 canh cua khoi lap phuong: ");
            canh = input.nextDouble();
            if (canh <= 0) {
                System.out.println("Canh khong hop le. Hay nhap lai.");
            }
        } while (canh <= 0);

        System.out.println("The tich cua khoi lap phuong la: " + Math.pow(canh, 3));
    }

    public static void bai4() {
        Scanner input = new Scanner(System.in);
        int a, b, c, delta;
        System.out.print("Hay nhap vao he so a: ");
        a = input.nextInt();
        System.out.print("Hay nhap vao he so b: ");
        b = input.nextInt();
        System.out.print("Hay nhap vao he so c: ");
        c = input.nextInt();
        delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta <= 0) {
            System.out.println("Delta <= 0 nen khong the tinh can bac hai.");
        } else {
            System.out.printf("Can delta = %.2f\n", Math.sqrt(delta));
        }
    }

    public static void bai_tap_them() {
        /* Nhập thong tin cho n nhân viên bao gồm:
        -        nhập tên nv
        -        năm sinh
        -        địa chỉ, số nhà, quận
        -        số tháng làm việc
        -        mức lương của nv
        -        hệ số lương của nv
        -        Tính lương của nv  =  (mức lương) x (hệ số)
        -        Tính thưởng cho nv =  (Lương x số tháng làm việc)/ 12
        -        Tính tuổi của nv đến thời điểm hiện tại
        In tất cả các thong tin của nv và lương, thưởng vừa nhập ra màn hình*/
        Scanner input = new Scanner(System.in);
        int nam_sinh, so_thang, luong;
        double muc_luong, he_so_luong, thuong;
        System.out.println("Chuong trinh nhap thong tin nhan vien");
        System.out.print("Hay nhap vao ten nhan vien: ");
        String ten_nv = input.nextLine();
        System.out.print("Hay nhap vao nam sinh cua nhan vien: ");
        nam_sinh = Integer.parseInt(input.nextLine());
        System.out.print("Hay nhap vao dia chi cua nhan vien: ");
        String dia_chi = input.nextLine();
        System.out.print("Hay nhap vao so thang lam viec cua nhan vien: ");
        so_thang = input.nextInt();
        System.out.print("Hay nhap vao muc luong cua nhan vien: ");
        muc_luong = input.nextDouble();
        System.out.print("Hay nhap vao he so luong cua nhan vien: ");
        he_so_luong = input.nextDouble();
        luong = (int) (muc_luong * he_so_luong);
        thuong = (luong * so_thang) / 12;

        System.out.println("Thong tin nhan vien ban vua nhap la: ");
        System.out.println("Ten nhan vien: " + ten_nv);
        System.out.println("Nam sinh: " + nam_sinh + " | Tuoi: " + (2021 - nam_sinh));
        System.out.println("Dia chi: " + dia_chi);
        System.out.printf("Luong = %d VND\n", luong);
        System.out.printf("Thuong = %.0f VND\n", thuong);
    }

    public static void bai_tap_them_2() {
        Scanner input = new Scanner(System.in);
        int tien1, tien2, tien3, tien4, tien5, tien6, tong;
        System.out.println("1$ = 100 xu");
        System.out.print("Trong tui co bao nhieu to 2$: ");
        tien1 = input.nextInt();
        System.out.print("Trong tui co bao nhieu to 1$: ");
        tien2 = input.nextInt();
        System.out.print("Trong tui co bao nhieu to 50 xu: ");
        tien3 = input.nextInt();
        System.out.print("Trong tui co bao nhieu to 20 xu: ");
        tien4 = input.nextInt();
        System.out.print("Trong tui co bao nhieu to 10 xu: ");
        tien5 = input.nextInt();
        System.out.print("Trong tui co bao nhieu to 5 xu: ");
        tien6 = input.nextInt();
        
        tong = (tien1 * 2 * 100) + (tien2 * 100) + (tien3 * 50) + (tien4 * 20) + (tien5 * 10) + (tien6 * 5);
        System.out.println("Tong tien co trong tui la " + tong + " xu");
    }

    public static void bai_tap_them_3() {
        int tien_vay, lai_suat, nam;
        Scanner input = new Scanner(System.in);
        System.out.println("Chuong trinh tinh tien hang thang phai tra");
        System.out.print("Hay nhap so tien vay: ");
        tien_vay = input.nextInt();
        System.out.print("Hay nhap lai suat hang nam(%): ");
        lai_suat = input.nextInt();
        System.out.print("Hay nhap so nam vay: ");
        nam = input.nextInt();
        
        double so_tien_tra = tien_vay * (1 + (lai_suat * nam) / 100.0) / (12 * nam);
        System.out.printf("So tien phai tra trong 1 thang la: %.2f\n", so_tien_tra);
    }
}