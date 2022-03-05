/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class QuanLyNhanVien {

    static Scanner input = new Scanner(System.in);
    static ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public void nhapDanhSach() {
        int quantity;
        quantity = inputNumInt("so luong nhan vien muon nhap");
        for (int i = 0; i < quantity; i++) {
            String ten;
            String maNV;
            int luong;
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
            maNV = inputString("ma nhan vien");
            ten = inputString("ten nhan vien");
            luong = inputNumInt("luong nhan vien");
            NhanVien nhanVien = new NhanVien(ten, maNV, luong);
            listNhanVien.add(nhanVien);
            System.out.println("");
        }
    }

    public void xuatDanhSach() {
        if (listNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay nhap vao.");
            return;
        }
        for (NhanVien nhanVien : listNhanVien) {
            nhanVien.inThongTin();
            System.out.println("");
        }
    }

    public void xoaNvTheoMa() {
        if (listNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay nhap vao.");
            return;
        }

        String id_input;
        int quantity = listNhanVien.size();
        id_input = inputString("ma nhan vien muon tim kiem");
        for (int i = 0; i < quantity; i++) {
            NhanVien nhanVien = listNhanVien.get(i);
            String maNV = nhanVien.getMaNV();
            if (id_input.equalsIgnoreCase(maNV)) {
                System.out.println("Da tim thay nhan vien co ma " + id_input);
                listNhanVien.remove(i);
                System.out.println("Xoa thanh cong.");
                return;
            }
        }

        System.out.println("Khong tim thay nhan vien co ma " + id_input);
    }

    public void timNvTheoKhoangLuong() {
        if (listNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong. Hay nhap vao.");
            return;
        }

        int quantity = listNhanVien.size();
        int luongDau;
        int luongCuoi;
        Boolean check = false;
        luongDau = inputNumInt("gia tri luong dau");
        luongCuoi = inputNumInt("gia tri luong cuoi");
        for (int i = 0; i < quantity; i++) {
            NhanVien nhanVien = listNhanVien.get(i);
            int luong = nhanVien.tinhLuong();
            if (luong >= luongDau && luong <= luongCuoi) {
                check = true;
                nhanVien.inThongTin();
                System.out.println("");
            }
        }

        if (!check) {
            System.out.println("Khong tim thay nhan vien trong khoang luong yeu cau");
        }
    }

    public void taoTruongPhong() {
        String ten;
        String maNV;
        int luong;
        int thuong;
        System.out.println("Nhap thong tin truong phong");
        maNV = inputString("ma nhan vien");
        ten = inputString("ten nhan vien");
        luong = inputNumInt("luong nhan vien");
        thuong = inputNumInt("thuong cua nhan vien");
        TruongPhong truongPhong = new TruongPhong(luong, ten, maNV, thuong);
        truongPhong.inThongTin();
    }

    public String inputString(String nameOfString) {
        String stringInput;
        System.out.printf("Hay nhap vao %s: ", nameOfString);
        stringInput = input.nextLine();
        return stringInput;
    }

    public int inputNumInt(String nameOfNum) {
        int numInput;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", nameOfNum);
                numInput = Integer.parseInt(input.nextLine());
                if (numInput <= 0) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
                } else {
                    return numInput;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
            }
        } while (true);
    }
}
