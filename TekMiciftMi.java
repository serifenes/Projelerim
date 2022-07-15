
package tekmiciftmi;

import java.util.Scanner;


public class TekMiciftMi {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Lütfen bir sayı giriniz : ");
       int sayi = scanner.nextInt();
       if(sayi % 2 == 0 ){
           System.out.println("Girdiğiniz sayı çifttir");
       }
       else{
           System.out.println("Girdiğiniz sayı tektir");
       }
    }
    
}
