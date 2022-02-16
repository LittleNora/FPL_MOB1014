/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice_7;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Nhanvien {

    String hoTen;

    String maNV;
    String regMaNV = "^PH[0-9]{5,6}$";

    String ngaySinh;
    String regNgaySinh = "^\\d{1,2}-(\\d{1}|1[0-2]{1})-\\d{4}$";

    double lcb;
    static Scanner input = new Scanner(System.in);

    public Nhanvien() {
    }

    public Nhanvien(String hoTen, String maNV, String ngaySinh, double lcb) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.ngaySinh = ngaySinh;
        this.lcb = lcb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getLcb() {
        return lcb;
    }

    public void setLcb(double lcb) {
        this.lcb = lcb;
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Nhanvien.input = input;
    }

    public void nhap() {
        System.out.print("Hay nhap vao ho ten: ");
        hoTen = input.nextLine();
        maNV = checkRegexChuoi("ma nhan vien", regMaNV);
        ngaySinh = checkRegexChuoi("ngay sinh (ngay-thang-nam)", regNgaySinh);
        lcb = nhapSoThuc("luong co ban");
    }

    public void indulieu() {
        System.out.printf("Ma nhan vien: %s | Ho ten: %s | Ngay sinh: %s ", maNV, hoTen, ngaySinh);
    }
    
    public double tinhluong() {
        return lcb;
    }
    
    public String checkRegexChuoi(String tenChuoi, String regexChuoi) {
        String chuoi;
        do {
            System.out.printf("Hay nhap vao %s: ", tenChuoi);
            chuoi = input.nextLine();
            if (!chuoi.matches(regexChuoi)) {
                System.out.println("Du lieu nhap vao khong dung dinh dang. Hay nhap lai.");
            } else {
                return chuoi;
            }
        } while (true);
    }

    public double nhapSoThuc(String tenSo) {
        double so;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", tenSo);
                so = Double.parseDouble(input.nextLine());
                if (so <= 0) {
                    System.out.println("Du lieu nhap khong hop le, hay nhap lai");
                } else {
                    return so;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le, hay nhap lai");
            }
        } while (true);
    }
}
