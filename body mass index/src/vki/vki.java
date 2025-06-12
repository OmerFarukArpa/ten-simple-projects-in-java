
package vki;

import java.util.Scanner;
import java.util.Locale;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Boyunuzu giriniz (örn: 1.80): ");
        double height = scanner.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        double weight = scanner.nextDouble();

        double bmi = calculateBMI(height, weight);
        String result = classifyBMI(bmi);

        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", bmi);
        System.out.println("Durumunuz: " + result);

        scanner.close();
    }

    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static String classifyBMI(double bmi) {
        if (bmi < 18.5)
            return "Zayıf";
        else if (bmi < 24.9)
            return "Normal kilolu";
        else if (bmi < 29.9)
            return "Fazla kilolu";
        else if (bmi < 34.9)
            return "1. Derece obez";
        else if (bmi < 39.9)
            return "2. Derece obez";
        else
            return "3. Derece obez";
    }
}

