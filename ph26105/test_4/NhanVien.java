/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_4;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class NhanVien {

    private String ten;
    private String maNV;
    private int luong;
    static Scanner input = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String ten, String maNV, int luong) {
        this.ten = ten;
        this.maNV = maNV;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    public void inThongTin() {
        System.out.printf("Ma nhan vien: %s | Ten: %s | Luong: %d ", maNV, ten, tinhLuong());
    }

    public int tinhLuong() {
        return luong * 22;
    }
}
