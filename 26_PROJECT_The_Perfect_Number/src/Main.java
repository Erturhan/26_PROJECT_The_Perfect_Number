import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        System.out.print("Lütfen bir sayı giriniz: ");
        number = scan.nextInt();

        int der1 = 0;

        // 1'den başlayarak sayının kendisine kadar olan bölenlerini topla
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                der1 += i;
            }
        }

        // Bölenlerin toplamı sayının kendisine eşitse mükemmel sayı
        if (der1 == number) {
            System.out.println(number + " sayınız mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " sayınız mükemmel bir sayı değildir.");
        }
    }
}