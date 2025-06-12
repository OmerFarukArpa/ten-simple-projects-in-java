package faktöriyel;

import java.util.Scanner;

public class FactorialCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir pozitif tamsayı giriniz: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negatif sayılar için faktöriyel hesaplanamaz.");
        } else {
            long result = faktoriyelHesapla(number);
            System.out.printf("%d! = %d\n", number, result);
        }

        scanner.close();
    }

    /**
     * Verilen bir sayının faktöriyelini hesaplar.
     *
     * @param n Pozitif tamsayı
     * @return n! sonucu
     */
    public static long faktoriyelHesapla(int n) {
        long sonuc = 1;
        for (int i = 2; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}
