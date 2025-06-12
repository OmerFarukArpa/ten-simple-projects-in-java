
package hesaplama;

import java.util.Scanner;

public class Hesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi giriniz:\n" +
                           "1 = Toplama\n" +
                           "2 = Çıkarma\n" +
                           "3 = Çarpma\n" +
                           "4 = Bölme\n" +
                           "Seçiminiz: "
                          );
        int operation = scanner.nextInt();

        System.out.print("Birinci sayıyı giriniz: ");
        double number1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double number2 = scanner.nextDouble();

        double result;
        switch (operation) {
            case 1:
                result = add(number1, number2);
                System.out.println("Sonuç: " + result);
                break;
            case 2:
                result = subtract(number1, number2);
                System.out.println("Sonuç: " + result);
                break;
            case 3:
                result = multiply(number1, number2);
                System.out.println("Sonuç: " + result);
                break;
            case 4:
                if (number2 == 0) {
                    System.out.println("Hata: Sıfıra bölme yapılamaz.");
                } else {
                    result = divide(number1, number2);
                    System.out.println("Sonuç: " + result);
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçtiniz. Lütfen 1 ile 4 arasında bir sayı giriniz.");
        }

        scanner.close();
    }

    // İşlem metotları
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}   

