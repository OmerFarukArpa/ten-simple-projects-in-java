package sayı;

import java.util.Scanner;

public class a{
    public static void main (String[]args){
        double a,b,c,delta,n,k;
        Scanner ara=new Scanner(System.in);
            System.out.println("İKİNCİ DERECE DENKLEMİNİZİN SIRAYLA a,b,c DEĞERLERİNİ GİRİNİZ:"
                    + "(ÖRNEK:x^2+4x+3=0 denklemi için a=1 b=4 c=3)");
            a=ara.nextDouble();
            b=ara.nextDouble();
            c=ara.nextDouble();
            delta=b*b-4*a*c;
            if(delta<0){
                System.out.println("REEL KÖK YOK");
            }
            else if(delta==0){
                n=-b/(2*a);
                System.out.println("EŞİT İKİ KÖKÜ VARDIR BU KÖK" +n+"'DİR");     
            }
            else{
                n=(-b-Math.sqrt(delta))/(2*a);
                k=(-b+Math.sqrt(delta))/(2*a);
                System.out.println("FARKLI İKİ KÖKÜ VARDIR BUNLAR"+n+"ve"+k+"'DIR");
            }
            
       
    }
}