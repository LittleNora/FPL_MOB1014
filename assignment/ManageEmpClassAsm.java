/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author QuangVinh
 */
public class ManageEmpClassAsm extends EmployeeClassAsm {

    double responSalary;

    public ManageEmpClassAsm(double responSalary) {
        this.responSalary = responSalary;
    }

    public ManageEmpClassAsm(double responSalary, String id, String name, double salary) {
        super(id, name, salary);
        this.responSalary = responSalary;
    }

    public ManageEmpClassAsm() {
    }

    public void setData() {
        super.setData();
        responSalary = super.inputNum("luong trach nhiem (trieu dong)");
    }

    public void showFullData() {
        super.showFullData();
        System.out.printf("Luong trach nhiem: %.1f trieu VND\n", responSalary);
    }

    public void showSubData() {
        super.showSubData();
        System.out.printf("| Luong: %.1f trieu VND\n", getTotalSalary(), super.getIncomeTax(getTotalSalary()));
    }
    
    public void updateData(String id_input) {
        super.updateData(id_input);
        responSalary = super.inputNum("luong trach nhiem (trieu dong)");
    }

    public double getTotalSalary() {
        return salary + responSalary;
    }

}
