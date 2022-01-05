
package hesaplama;

import java.util.Scanner;

public class HESAPLAMA {

    public static void main(String[] args) {
        System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ GİRİNİZ (1=TOPLAMA 2=ÇIKARMA 3=ÇARPMA 4=BÖLME)");
        
        Scanner ara=new Scanner(System.in);
        int islem=ara.nextInt();
        System.out.println("İŞLEM YAPMAK İSTEDİĞİNİZ İKİ SAYIYI GİRİNİZ");
        double a=ara.nextDouble();
        double b=ara.nextDouble();
        switch(islem){
            case 1:
                System.out.println( a+b );
                break;
            case 2:
                System.out.println( a-b );
                break;
            case 3:
                System.out.println( a*b);
                break;
            case 4:
                System.out.println( a/b);
                break;
                
                
                
        
                    }
        }
        
    }
    

