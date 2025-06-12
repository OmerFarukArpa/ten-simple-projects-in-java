
package ehliyet;

import java.util.Scanner;

public class DrivingLicense {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoşgeldiniz! Lütfen yaşınızı giriniz:");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Yaşınız ehliyet almak için yeterli değil.");
        } else {
            System.out.println("Lütfen yazılı sınav notunuzu giriniz:");
            int score = scanner.nextInt();

            if (score < 70) {
                System.out.println("Yazılı sınavdan en az 70 puan almalısınız. Kaldınız.");
            } else {
                System.out.println("Tebrikler! Ehliyet almaya hak kazandınız.");
            }
        }

        scanner.close();
    }
}


