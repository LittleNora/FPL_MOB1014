/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.Lab06;

/**
 *
 * @author QuangVinh
 */
public class Student extends Person {

    public String stuID;
    public String regStuID = "^PH[0-9]{5,6}$";

    public String classOfStu;
    public String regClass = "^WE[0-9]{4,6}$";

    public int mathMark;
    public int engMark;
    public String regMark = "^10|[1-9]$";

    public Student() {
    }

    public Student(String stuID, String classOfStu, int mathMark, int engMark, String name, String birthYear, String birthPlace) {
        super(name, birthYear, birthPlace);
        this.stuID = stuID;
        this.classOfStu = classOfStu;
        this.mathMark = mathMark;
        this.engMark = engMark;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getClassOfStu() {
        return classOfStu;
    }

    public void setClassOfStu(String classOfStu) {
        this.classOfStu = classOfStu;
    }

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public int getEngMark() {
        return engMark;
    }

    public void setEngMark(int engMark) {
        this.engMark = engMark;
    }

    @Override
    public void input() {
        super.input();
        stuID = super.checkRegex("ma sinh vien", regStuID);
        classOfStu = super.checkRegex("lop cua sinh vien", regClass);
        mathMark = Integer.parseInt(super.checkRegex("diem toan cua sinh vien", regMark));
        engMark = Integer.parseInt(super.checkRegex("diem tieng anh cua sinh vien", regMark));
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ma sinh vien: " + stuID);
        System.out.println("Lop: " + classOfStu);
        System.out.println("Diem toan:  " + mathMark);
        System.out.println("Diem tieng anh: " + engMark);
        System.out.println("Trang thai: " + getStatus());
    }
    
    public String getStatus() {
        return isPass() ? "Qua mon" : "Truot mon";
    }

    public Boolean isPass() {
        if (engMark + mathMark >= 10 && engMark >= 5 && mathMark >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
