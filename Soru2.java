
package soru2;

import java.util.Scanner;

public class Soru2 {
    
    public static void main(String[] args) {
        /*
        0! = 1
        1! = 1
        2! = 1.2 = 2
        3! = 1.2.3 = 6
        4! = 1.2.3.4 = 24
        5! = 1.2.3.4.5 = 120
        6! = 1.2.3.4.5.6 = 720
        7! = 1.2.3.4.5.6.7 = 5040
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen faktöriyelini hesaplamak istediğiniz sayıyı giriniz : ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1 ; 
        for(int i = 1 ; i <= sayi ; i++){
            faktoriyel *= i ; 
        }
        System.out.println("Faktöriyeli : " + faktoriyel);
    }
    
}
