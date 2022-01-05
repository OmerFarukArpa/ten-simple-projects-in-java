package faktöriyel;

import java.util.Scanner;

public class FAKTÖRİYEL{
    public static void main(String[]args){
        System.out.println("BİR SAYI GİRİNİZ");
        Scanner ara=new Scanner(System.in);
        int sayi=ara.nextInt();
        for(int i=sayi-1;i>0;i--){
            sayi=sayi*i;
        }
        System.out.println("SONUÇ= "+sayi);
    }
}