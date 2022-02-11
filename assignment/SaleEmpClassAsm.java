/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author QuangVinh
 */
public class SaleEmpClassAsm extends EmployeeClassAsm {

    public double commissionRate;
    public double sale;

    public SaleEmpClassAsm() {
    }

    public SaleEmpClassAsm(double commissionRate, double sale) {
        this.commissionRate = commissionRate;
        this.sale = sale;
    }

    public SaleEmpClassAsm(double commissionRate, double sale, String id, String name, double salary) {
        super(id, name, salary);
        this.commissionRate = commissionRate;
        this.sale = sale;
    }

    public void setData() {
        super.setData();
        sale = super.inputNum("doanh so ban hang (trieu dong)");
        commissionRate = super.inputNum("ti le hoa hong (%)");
    }

    public void showFullData() {
        super.showFullData();
        System.out.println("Doanh so ban hang: " + sale + " trieu VND");
        System.out.println("Ty le hoa hong:  " + commissionRate + "%");
    }
    
     public void showSubData() {
        super.showSubData();
        System.out.printf("| Luong: %.1f trieu VND\n", getTotalSalary(), super.getIncomeTax(getTotalSalary()));
    }
     
     public void updateData(String id_input) {
        super.updateData(id_input);
        sale = super.inputNum("doanh so ban hang (trieu dong)");
        commissionRate = super.inputNum("ti le hoa hong (%)");
    }

    public double getTotalSalary() {
        return salary + (sale * (commissionRate / 100));
    }
}
