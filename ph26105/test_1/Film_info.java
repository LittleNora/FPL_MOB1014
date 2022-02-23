/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_1;

import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class Film_info {

    static Scanner input = new Scanner(System.in);
    String tenFilm;
    String hangFilm;

    int namSX;
    double doanhThu;

    String email;
    String regexEmail = "^\\w+@\\w+.\\w+$";

    public Film_info() {
    }

    public Film_info(String tenFilm, String hangFilm, int namSX, double doanhThu, String email) {
        this.tenFilm = tenFilm;
        this.hangFilm = hangFilm;
        this.namSX = namSX;
        this.doanhThu = doanhThu;
        this.email = email;
    }

    public String getTenFilm() {
        return tenFilm;
    }

    public void setTenFilm(String tenFilm) {
        this.tenFilm = tenFilm;
    }

    public String getHangFilm() {
        return hangFilm;
    }

    public void setHangFilm(String hangFilm) {
        this.hangFilm = hangFilm;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Input_film() {
        tenFilm = inputString("ten film");
        hangFilm = inputString("hang film");
        namSX = inputInt("nam san xuat");
        doanhThu = inputDou("doanh thu (trieu VND)");
        email = inputStringWithRegex("email hang san xuat", regexEmail);
    }

    public void Output_film() {
        System.out.println("Ten film: " + tenFilm);
        System.out.println("Hang film: " + hangFilm);
        System.out.println("Nam san xuat: " + namSX);
        System.out.printf("Doanh thu: %.1f trieu VND\n", doanhThu);
        System.out.println("Email hang san xuat: " + email);
    }

    public String inputString(String nameOfString) {
        String stringReturn;
        System.out.printf("Hay nhap vao %s: ", nameOfString);
        stringReturn = input.nextLine();
        return stringReturn;
    }

    public String inputStringWithRegex(String nameOfString, String regexString) {
        String stringReturn;
        do {
            System.out.printf("Hay nhap vao %s: ", nameOfString);
            stringReturn = input.nextLine();
            if (!stringReturn.matches(regexString)) {
                System.out.println("Du lieu nhap khong dung dinh dang. Hay nhap lai");
            } else {
                return stringReturn;
            }
        } while (true);
    }

    public int inputInt(String nameOfNum) {
        int num;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", nameOfNum);
                num = Integer.parseInt(input.nextLine());
                if (num <= 0) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
            }
        } while (true);
    }

    public double inputDou(String nameOfNum) {
        double num;
        do {
            try {
                System.out.printf("Hay nhap vao %s: ", nameOfNum);
                num = Integer.parseInt(input.nextLine());
                if (num <= 0) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai.");
            }
        } while (true);

    }
}
