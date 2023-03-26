
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci dik kenari giriniz: ");
        int kenar1 = scanner.nextInt();
        System.out.print("ikinci dik kenari giriniz: ");
        int kenar2 = scanner.nextInt();
        double sonuc = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("hipotenus uzunlugu: " + sonuc);
    }
}
