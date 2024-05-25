
package iş.başvurusu;

import java.util.Scanner;


public class IşBAŞVURUSU {

    public static void main(String[] args) {
        Scanner ara=new Scanner(System.in);
        System.out.println("ADINIZI SOYADINIZI GİRİNİZ");
        String ad=ara.nextLine();
        System.out.println("YAŞINIZI GİRİNİZ");
        int yas =ara.nextInt();
        if(yas<22){
            System.out.println(ad+"  YAŞIN BU İŞ İÇİN UYGUN DEĞİL İŞE ALINMADINIZ");
        }
        else{
            System.out.println("ANA DİLİNİZ DIŞINDA KAÇ DİL BİLİYORSUNUZ ");
        int dil=ara.nextInt();
        if(dil<2){
            System.out.println(ad+"  EN AZ 2 YABANCI DİL BİLMENİZ GEREKİRDİ İŞE ALINMADINIZ");
        }
        else{    
        System.out.println("MAAŞ BEKLENTİNİZİ GİRİNİZ");
            int maas=ara.nextInt();
            if(maas>6000){
                System.out.println(ad+"   BU POZİSYON İÇİN AYIRILAN MAAŞ BÜTÇESİ 6000 İLE SINIRLIDIR İŞE ALINMADINIZ");
            }
            else{
            System.out.println("ALANINIZDA KAÇ PROJE GELİŞTİRDİNİZ");
            int proje=ara.nextInt();
            if(proje<5){
                System.out.println(ad+"  ALANINIZDA EN AZ 5 PROJE GELİŞTİRMENİZ BEKLENİYORDU İŞE ALINMADINIZ");
                
            }
            else{
        System.out.println(ad+"   ARANAN İŞE UYGUN OLDUĞUNUZ TESPİT EDİLMİŞTİR "
                + "\nDİĞER BAŞVURULAR İNCELENDİKTEN SONRA BİZ SİZİ ARAYACAĞIZ");
            }
            }
        }
       }
    }
    
}
