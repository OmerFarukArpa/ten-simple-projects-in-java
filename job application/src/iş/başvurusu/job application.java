
package iş.başvurusu;

import java.util.Scanner;


public class IşBAŞVURUSU {

    public static void main(String[] args) {
        Scanner ara=new Scanner(System.in);
        System.out.println("ADINIZI SOYADINIZI GİRİNİZ");
        String name=ara.nextLine();
        System.out.println("YAŞINIZI GİRİNİZ");
        int age =ara.nextInt();
        if(age<22){
            System.out.println(name+"  YAŞIN BU İŞ İÇİN UYGUN DEĞİL İŞE ALINMADINIZ");
        }
        else{
            System.out.println("ANA DİLİNİZ DIŞINDA KAÇ DİL BİLİYORSUNUZ ");
        int language=ara.nextInt();
        if(language<2){
            System.out.println(name+"  EN AZ 2 YABANCI DİL BİLMENİZ GEREKİRDİ İŞE ALINMADINIZ");
        }
        else{    
        System.out.println("MAAŞ BEKLENTİNİZİ GİRİNİZ");
            int wage=ara.nextInt();
            if(wage>6000){
                System.out.println(name+"   BU POZİSYON İÇİN AYIRILAN MAAŞ BÜTÇESİ 6000 İLE SINIRLIDIR İŞE ALINMADINIZ");
            }
            else{
            System.out.println("ALANINIZDA KAÇ PROJE GELİŞTİRDİNİZ");
            int proje=ara.nextInt();
            if(proje<5){
                System.out.println(name+"  ALANINIZDA EN AZ 5 PROJE GELİŞTİRMENİZ BEKLENİYORDU İŞE ALINMADINIZ");
                
            }
            else{
        System.out.println(name+"   ARANAN İŞE UYGUN OLDUĞUNUZ TESPİT EDİLMİŞTİR "
                + "\nDİĞER BAŞVURULAR İNCELENDİKTEN SONRA BİZ SİZİ ARAYACAĞIZ");
            }
            }
        }
       }
    }
    
}
