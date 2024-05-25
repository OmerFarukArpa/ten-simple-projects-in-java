package hipotenüs.hesaplama;

import java.util.Scanner;

public class HipotenüsHesaplama{
    public static void main(String[]args){
            
            Scanner ara=new Scanner(System.in);
            System.out.println("DİK KENARLARDAN BİRİNİ GİRİNİZ");
            double a=ara.nextDouble();
            System.out.println("DİK KENARLARDAN DİĞERİNİ GİRİNİZ");
            
            double b=ara.nextDouble();
            
            
            System.out.println("HİPOTENÜS UZUNLUĞU="+Math.sqrt(a*a+b*b));
    }
}