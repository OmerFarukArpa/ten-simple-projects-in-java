
package ehliyet;

import java.util.Scanner;

public class EHLİYET {

    public static void main(String[] args) {
        System.out.println("HOŞGELDİNİZ LÜTFEN YAŞINIZI GİRİNİZ");
        Scanner ara=new Scanner(System.in);
        int yas=ara.nextInt();
        if(yas<18){
            System.out.println("YAŞINIZ EHLİYET ALMAK İÇİN YETERLİ DEĞİL");
        }
        else{
            System.out.println("LÜTFEN YAZILI SINAV NOTUNUZU GİRİNİZ");
            int not=ara.nextInt();
            if(not<70){
                System.out.println("SÖZLÜ SINAVDAN EN AZ 70 PUAN ALMALIYDINIZ KALDINIZ");
            }
            else{
                
                    System.out.println("TEBRİKLER EHLİYET ALMAYI HAK ETTİNİZ");
                }
                
            }
        }
        
        
    }
    

