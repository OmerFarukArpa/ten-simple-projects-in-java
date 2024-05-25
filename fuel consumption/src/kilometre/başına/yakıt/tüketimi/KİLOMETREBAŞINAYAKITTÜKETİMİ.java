package kilometre.başına.yakıt.tüketimi;

import java.util.Scanner;

public class KİLOMETREBAŞINAYAKITTÜKETİMİ{
    public static void main(String[]args){
        Scanner ara=new Scanner (System.in);
        System.out.println("TOPLAM GİTTİĞİNİZ YOLU GİRİNİZ");
        double yol=ara.nextDouble();
        System.out.println("HARCANAN TOPLAM YAKITI GİRİNİZ");
        double yakıt=ara.nextDouble();
        double sonuc=yakıt/yol;
        System.out.println("KİLOMETRE BAŞINA YAKIT TÜKETİMİ="+sonuc);
    }

}