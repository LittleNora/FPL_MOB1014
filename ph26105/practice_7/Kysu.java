/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.practice_7;

/**
 *
 * @author QuangVinh
 */
public class Kysu extends Nhanvien {

    String email;
    String regEmail = "^\\w+@\\w+\\.\\w+$";

    String skill;

    public Kysu() {
    }

    public Kysu(String email, String skill, String hoTen, String maNV, String ngaySinh, double lcb) {
        super(hoTen, maNV, ngaySinh, lcb);
        this.email = email;
        this.skill = skill;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void nhap() {
        super.nhap();
        email = super.checkRegexChuoi("email", regEmail);
        System.out.print("Hay nhap vao ky nang cua ky su: ");
        skill = input.nextLine();
    }

    public void indulieu() {
        super.indulieu();
        System.out.printf("| Luong: %.0f | Email: %s | Skill: %s\n", tinhluong(), email, skill);
    }

    public double tinhluong() {
        return lcb * 2.5;
    }

}
