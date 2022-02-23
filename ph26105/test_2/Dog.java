/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph26105.test_2;

/**
 *
 * @author QuangVinh
 */
public class Dog extends QLAnimal {

    public Dog() {
    }

    public void nhapAnimal() {
        super.nhapAnimal();
    }
    
    public void xuatAnimal() {
        System.out.printf("Ten: %s | Can nang: %.1f kg | Mau sac: %s | Trang thai: %s\n", super.getName(), super.getWeight(), super.getColor(), super.trangThai(super.getWeight()));
    }
    
}
