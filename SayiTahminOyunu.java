
package sayitahminoyunu;

import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi =(int) (Math.random() * 15);
        int i = 5 ;
        while(true){
            System.out.print("Lütfen bir tahmin giriniz : ");
            int tahmin = scanner.nextInt();
            if(tahmin > 15){
                System.out.println("Lütfen 0 - 15 arasında bir sayı giriniz ");
                continue ;
            }
            if(tahmin == sayi){
                System.out.println("Doğru tahmin tebrikler");
                break;
            }
            else{
                System.out.println("Yanlış tahmin.Kalan tahmin hakkınız : " + --i);
                if(i == 0){
                    System.out.println("Tahmin hakkınız bitmiştir.Oyun sonlandırıldı");
                    break;
                }
            }
        }
        }
    } 