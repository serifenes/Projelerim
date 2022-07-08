
package sicaklikdonusumu;

import java.util.Scanner;




public class SicaklikDonusumu {

   
    public static void main(String[] args) {
      // °F = °C × 1.8 + 32
      Scanner scanner = new Scanner(System.in);
      System.out.print("Lütfen derece cinsinden sıcaklık giriniz : ");
      double derece = scanner.nextDouble();
      double fahrenheit = ((derece * 1.8) + 32);
      System.out.println("Fahrenheit cinsinden değeri : " + fahrenheit);
      
    }
    
}
