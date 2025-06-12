
package gider.hesaplama;

import java.util.Scanner;

public class ExpenseCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gelir bilgileri
        System.out.print("Maaşınızı giriniz: ");
        double salary = scanner.nextDouble();

        System.out.print("Ek gelirinizi giriniz (yoksa 0 giriniz): ");
        double extraIncome = scanner.nextDouble();

        // Gider bilgileri
        System.out.print("Kira tutarını giriniz (yoksa 0 giriniz): ");
        double rent = scanner.nextDouble();

        System.out.print("Fatura tutarını giriniz: ");
        double bills = scanner.nextDouble();

        System.out.print("Market masrafını giriniz: ");
        double groceries = scanner.nextDouble();

        System.out.print("Ulaşım masrafını giriniz: ");
        double transportation = scanner.nextDouble();

        System.out.print("Diğer masrafları giriniz: ");
        double others = scanner.nextDouble();

        // Hesaplamalar
        double totalIncome = salary + extraIncome;
        double totalExpenses = rent + bills + groceries + transportation + others;
        double remaining = totalIncome - totalExpenses;

        // Sonuçlar
        System.out.println("\n--- Gider Raporu ---");
        System.out.printf("Toplam Geliriniz     : %.2f TL\n", totalIncome);
        System.out.printf("Toplam Gideriniz     : %.2f TL\n", totalExpenses);
        System.out.printf("Size Kalan Miktar    : %.2f TL\n", remaining);

        scanner.close();
    }
}
