/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author QuangVinh
 */
public class OfficeEmpClassAsm extends EmployeeClassAsm {

    public OfficeEmpClassAsm() {
    }

    public OfficeEmpClassAsm(String id, String name, double salary) {
        super(id, name, salary);
    }

    public void setData() {
        super.setData();
    }

    public void showFullData() {
        super.showFullData();
    }

    public void showSubData() {
        super.showSubData();
        System.out.printf("| Luong: %.1f trieu VND\n", getTotalSalary(), super.getIncomeTax(getTotalSalary()));
    }

    public double getTotalSalary() {
        return salary;
    }
    
    public void updateData(String id_input) {
        super.updateData(id_input);
    }

}
