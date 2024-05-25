package faktöriyel;

import java.util.Scanner;

public class FAKTÖRİYEL{
    public static void main(String[]args){
        System.out.println("BİR SAYI GİRİNİZ");
        Scanner ara=new Scanner(System.in);
        int number=ara.nextInt();
        for(int i=number-1;i>0;i--){
            number*=i;
        }
        System.out.println("SONUÇ= "+number);
    }
}