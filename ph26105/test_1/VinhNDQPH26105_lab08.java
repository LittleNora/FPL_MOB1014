/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangVinh
 */
public class VinhNDQPH26105_lab08 {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Film_info> listFilms = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("Menu bai test");
            System.out.println("===Quan ly Film===");
            System.out.println("1. Nhap thong tin film");
            System.out.println("2. Hien thi danh sach film");
            System.out.println("3. Tim kiem film theo nam");
            System.out.println("4. In ra film co doanh thu cao nhat");
            System.out.println("5. Thoat");
            do {
                try {
                    System.out.print("Lua chon cua ban: ");
                    choice = Integer.parseInt(input.nextLine());
                    if (choice < 1 || choice > 5) {
                        System.out.println("Lua chon khong hop le. Hay nhap lai");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
                }
            } while (true);

            switch (choice) {
                case 1:
                    setInfoFilm();
                    break;
                case 2:
                    showListFilms();
                    break;
                case 3:
                    searchByYear();
                    break;
                case 4:
                    showBestFilm();
                    break;
                case 5:
                    System.out.println("Ban da chon thoat chuong trinh");
                    return;
            }
        } while (true);
    }

    public static void setInfoFilm() {
        int quantity;

        do {
            try {
                System.out.printf("Nhap so luong film muon nhap: ");
                quantity = Integer.parseInt(input.nextLine());
                if (quantity < 3) {
                    System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap khong hop le. Hay nhap lai");
            }
        } while (true);

        for (int i = 0; i < quantity; i++) {
            System.out.println("Nhap thong tin cho film thu " + (i + 1));
            film_007 film = new film_007();
            film.Input_film();
            listFilms.add(film);
            System.out.println("");
        }
    }

    public static void showListFilms() {
        if (listFilms.isEmpty()) {
            System.out.println("Danh sach film dang trong. Hay nhap film.");
            return;
        }

        System.out.println("Danh sach film:");
        for (Film_info film : listFilms) {
            if (film instanceof film_007) {
                ((film_007) film).Output_film();
            }
            System.out.println("");
        }
    }

    public static void searchByYear() {
        if (listFilms.isEmpty()) {
            System.out.println("Danh sach film dang trong. Hay nhap film.");
            return;
        }

        int inputYear;
        Boolean checkConstain = false;

        do {
            try {
                System.out.printf("Nhap vao nam muon tim kiem: ");
                inputYear = Integer.parseInt(input.nextLine());
                if (inputYear < 0) {
                    System.out.println("Nam nhap vao khong hop le. Hay nhap lai.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu nhap vao khong hop le. Hay nhap lai.");
            }
        } while (true);

        for (Film_info film : listFilms) {
            if (inputYear == film.namSX) {
                if (film instanceof film_007) {
                    checkConstain = true;
                    ((film_007) film).Output_film();
                    System.out.println("");
                }
            }
        }

        if (!checkConstain) {
            System.out.println("Khong tim thay film theo yeu cau.");
        }
    }

    public static void showBestFilm() {
        if (listFilms.isEmpty()) {
            System.out.println("Danh sach film dang trong. Hay nhap film.");
            return;
        }

        int quantity = listFilms.size();
        Film_info bestFilm = listFilms.get(0);
        for (int i = 1; i < quantity; i++) {
            Film_info film = listFilms.get(i);
            if (bestFilm.doanhThu <= film.doanhThu) {
                bestFilm = film;
            }
        }

        System.out.println("Film co doanh thu cao nhat la:");
        if (bestFilm instanceof film_007) {
            ((film_007) bestFilm).Output_film();
            System.out.println("");
        }
    }
}
