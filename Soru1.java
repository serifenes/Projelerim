
package soru1;

import java.util.Scanner;


public class Soru1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz : ");
        int sayi2 = scanner.nextInt();
        System.out.print("Lütfen 3. sayıyı giriniz : ");
        int sayi3 = scanner.nextInt();
        System.out.println("En büyük sayı : " + Math.max(sayi1,Math.max(sayi2, sayi3)));
}
}