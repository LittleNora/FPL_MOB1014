/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_4;

/**
 *
 * @author QuangVinh
 */
public class TruongPhong extends NhanVien {

    private int thuong;

    public TruongPhong() {
    }

    public TruongPhong(int thuong, String ten, String maNV, int luong) {
        super(ten, maNV, luong);
        this.thuong = thuong;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.printf("| Thuong: %d\n", thuong);
    }

}
