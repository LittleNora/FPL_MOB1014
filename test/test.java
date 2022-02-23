/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author QuangVinh
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        while (i <= 1901) {            
            System.out.printf("else if (sonhap == %d) {\n", i);
            if (i % 2 == 0) {
                System.out.println("\tSystem.out.println(\"La so chan\");");
            } else {
                System.out.println("\tSystem.out.println(\"La so le\");");
            }
            System.out.println("\t}");
            i++;
        }
    }
    
}
