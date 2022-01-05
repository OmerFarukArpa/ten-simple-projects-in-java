
package gider.hesaplama;

import java.util.Scanner;

public class GİDERHESAPLAMA {

    public static void main(String[] args) {
        Scanner ara=new Scanner(System.in);

        System.out.println("MAAŞINIZI GİRİNİZ");
        double t=ara.nextDouble();
        System.out.println("EK GELİRİİZİ GİRİNİZ YOKSA SIFIR GİRİNİZ");
        double p=ara.nextDouble();
        System.out.println("KİRA TUTARINI GİRİNİZ YOKSA SIFIR GİRİNİZ");
        double a=ara.nextDouble();
        System.out.println("FATURA TUTARINI GİRİNİZ");
        double b=ara.nextDouble();
        System.out.println("MARKET MASRAFINI GİRİNİZ");
        double c=ara.nextDouble();
        System.out.println("ULAŞIM MASRAFINI GİRİNİZ");
        double d=ara.nextDouble();
        System.out.println("DİĞER MASRAFLARI GİRİNİZ");
        double e=ara.nextDouble();
        System.out.println("TOPLAM MASRAFINIZ="+(a+b+c+d+e)+"  \nGELİRİNİZDEN SİZE KALAN="+((p+t)-(a+b+c+d+e)));
    }
    
}
