package notortalama;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fizik , kimya , türkce, tarih , müzik, matematik; 
        System.out.print("fizik notunuz : ");
         fizik = scanner.nextInt();
         System.out.print("matematik notunuz : ");
          matematik = scanner.nextInt();
         System.out.print("kimya notunuz : ");
         kimya = scanner.nextInt();
         System.out.print("müzik notunuz : ");
         müzik = scanner.nextInt();
         System.out.print("türkçe notunuz : ");
         türkce = scanner.nextInt();
         System.out.print("tarih notunuz : ");
         tarih = scanner.nextInt();
         int ortalama = (matematik + fizik + kimya + müzik + türkce + tarih)/6 ; 
         System.out.println("Ortalamanız : " + ortalama );
    }
}