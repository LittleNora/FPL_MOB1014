/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_3;

/**
 *
 * @author QuangVinh
 */
public class MayTinhBang extends Laptop {

    private double price;

    public MayTinhBang() {
    }

    public MayTinhBang(double price) {
        this.price = price;
    }

    public MayTinhBang(double price, String name, int version, String color) {
        super(name, version, color);
        this.price = price;
    }

    public void setData() {
        super.setData();
        price = super.inputNumDou("gia (trieu VND)");
    }

    public void showData() {
        super.showData();
        System.out.printf("| Price: %.1f trieu VND", price);
    }

}
