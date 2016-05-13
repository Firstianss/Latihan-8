/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class classtest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        template a1 = new template();
        System.out.print("Masukkan angka: ");
        String x = in.next();
        char [] a = x.toCharArray();
        for (char z :a) {
            String b = String.valueOf(z);
            if (b.equalsIgnoreCase(",")){
                a1.methodD1();
            System.exit(0);}
        }
        a1.methodI1();
    }
}
