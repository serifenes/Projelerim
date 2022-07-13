
package butunlemesorusu;

import java.util.Scanner;



public class ButunlemeSorusu {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen x değerini giriniz : ");
        int x = scanner.nextInt();
        System.out.print("Lütfen y değerini giriniz : ");
        int y = scanner.nextInt();
        if(x > 0 && y > 0){
            System.out.println("Belirttiğiniz nokta 1. bölgededir");
        }
        else if(x < 0 && y > 0){
            System.out.println("Belirttiğiniz nokta 2. bölgededir");           
        }
        else if(x < 0 && y < 0 ){
            System.out.println("Belirttiğiniz nokta 3. bölgededir");
        }
        else if(x > 0 && y < 0 ){
            System.out.println("Belirttiğiniz nokta 4. bölgededir");
        }
        else{
            System.out.println("Belirttiğiniz nokta orijindir");
        }
    }
    
}
