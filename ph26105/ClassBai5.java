/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class ClassBai5 {

    static Scanner input = new Scanner(System.in);
    String ten, diaChi, quan, bienSo, maVung, tenVung;

    public ClassBai5() {
    }

    public ClassBai5(String ten, String diaChi, String quan, String bienSo, String maVung, String tenVung) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.quan = quan;
        this.bienSo = bienSo;
        this.maVung = maVung;
        this.tenVung = tenVung;
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        ClassBai5.input = input;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public String getTenVung() {
        return tenVung;
    }

    public void setTenVung(String tenVung) {
        this.tenVung = tenVung;
    }

    public void setData() {
        System.out.print("Nhap vao ho ten: ");
        ten = input.nextLine();
        System.out.print("Nhap vao dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Nhap vao quan: ");
        quan = input.nextLine();
        System.out.print("Nhap vao bien so xe: ");
        bienSo = input.nextLine();
        System.out.print("Nhap vao ma vung: ");
        maVung = input.nextLine();
        System.out.print("Nhap vao ten vung: ");
        tenVung = input.nextLine();
    }

    public void showData() {
        System.out.println("Ho ten: " + ten);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Quan: " + quan);
        System.out.println("Bien so xe: " + bienSo);
        System.out.println("Ma vung: " + maVung + " | Ten vung: " + tenVung);
    }
}
