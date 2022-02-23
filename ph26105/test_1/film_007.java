/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_1;

/**
 *
 * @author QuangVinh
 */
public class film_007 extends Film_info {

    String Nam_chinh;
    String Nu_chinh;
    double tien_catse_nam_chinh;
    double tien_catse_nu_chinh;

    public film_007() {
    }

    public film_007(String Nam_chinh, String Nu_chinh, double tien_catse_nam_chinh, double tien_catse_nu_chinh, String tenFilm, String hangFilm, int namSX, double doanhThu, String email) {
        super(tenFilm, hangFilm, namSX, doanhThu, email);
        this.Nam_chinh = Nam_chinh;
        this.Nu_chinh = Nu_chinh;
        this.tien_catse_nam_chinh = tien_catse_nam_chinh;
        this.tien_catse_nu_chinh = tien_catse_nu_chinh;
    }

    public String getNam_chinh() {
        return Nam_chinh;
    }

    public void setNam_chinh(String Nam_chinh) {
        this.Nam_chinh = Nam_chinh;
    }

    public String getNu_chinh() {
        return Nu_chinh;
    }

    public void setNu_chinh(String Nu_chinh) {
        this.Nu_chinh = Nu_chinh;
    }

    public double getTien_catse_nam_chinh() {
        return tien_catse_nam_chinh;
    }

    public void setTien_catse_nam_chinh(double tien_catse_nam_chinh) {
        this.tien_catse_nam_chinh = tien_catse_nam_chinh;
    }

    public double getTien_catse_nu_chinh() {
        return tien_catse_nu_chinh;
    }

    public void setTien_catse_nu_chinh(double tien_catse_nu_chinh) {
        this.tien_catse_nu_chinh = tien_catse_nu_chinh;
    }

    public void Input_film() {
        super.Input_film();
        Nam_chinh = super.inputString("ten nam chinh");
        tien_catse_nam_chinh = super.inputDou("tien cat xe cua nam chinh (trieu VND)");
        Nu_chinh = super.inputString("ten nu chinh");
        tien_catse_nu_chinh = super.inputDou("tien cat xe cua nu chinh (trieu VND)");
    }

    public void Output_film() {
        super.Output_film();
        System.out.printf("Ten nam chinh: %s | Tien cat xe: %.1f\n", Nam_chinh, tien_catse_nam_chinh);
        System.out.printf("Ten nu chinh: %s | Tien cat xe: %.1f\n", Nu_chinh, tien_catse_nu_chinh);
        System.out.println("");
    }
}
