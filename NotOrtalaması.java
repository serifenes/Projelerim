
package notortalaması;

import java.util.Scanner;


public class NotOrtalaması {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen vize notunuzu giriniz : ");
        int vize = scanner.nextInt();
        System.out.print("Lütfen final notunuzu giriniz : ");
        int fınal = scanner.nextInt();
        double ortalama = (vize * 0.4) + (fınal * 0.6);
        if(ortalama < 50){
            System.out.println("Kaldın.Ortalama : " + ortalama);
        }
        else{
            System.out.println("Geçtin.Ortalama : " + ortalama);
        }
        
    }
    
}
