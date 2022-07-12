
package hipotenus;

import java.util.Scanner;







public class Hipotenus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1. kenarı giriniz : ");
        int kenar1 = scanner.nextInt();
        System.out.print("Lütfen 2. kenarı giriniz : ");
        int kenar2 = scanner.nextInt();
        double hipotenus = Math.sqrt(kenar1 * kenar1  + kenar2 * kenar2);
        System.out.println("Hipotenüs : " + hipotenus);
    }
    
}
