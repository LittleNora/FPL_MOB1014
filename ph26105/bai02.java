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
public class bai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int luong, thuong, thu_nhap;
        double thue;
        do {
            try {
                System.out.print("Hay nhap vao luong(trieu dong): ");
                luong = Integer.parseInt(input.nextLine());
                System.out.print("Hay nhap vao tien thuong(trieu dong): ");
                thuong = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le!");
            }
        } while (true);
        thu_nhap = luong + thuong;
        if (thu_nhap >= 0 && thu_nhap < 9) {
            System.out.println("Khong phai dong thue");
            return;
        } else if (thu_nhap >= 9 && thu_nhap <= 15) {
            thue = 0.1;
        } else if (thu_nhap > 15 && thu_nhap <= 30) {
            thue = 0.15;
        } else {
            thue = 0.2;
        }
        System.out.printf("Tien thue cua ban la: %.1f trieu dong\n", thu_nhap * thue);
    }

}