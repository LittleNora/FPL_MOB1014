/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.practice_7;

/**
 *
 * @author QuangVinh
 */
public class Congnhan extends Nhanvien {

    public Congnhan() {
    }

    public void indulieu() {
        super.indulieu();
        System.out.printf("| Luong: %.0f\n", tinhluong());
    }

    public double tinhluong() {
        return lcb * 1.5;
    }
}
