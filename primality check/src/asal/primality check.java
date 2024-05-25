
package asal;

import java.util.Scanner;

public class asal {

    public static void main(String[] args) {
        Scanner ara=new Scanner(System.in);
        System.out.println("ASALLIĞINI KONTROL ETMEK İSTEDİĞİNİZ SAYINIZI GİRİNİZ");
        int number=ara.nextInt();

        boolean a=false;
        for(int i=2;i<number;i++){
            if(number%i==0){
                a=true;
                break;
            }
        }
           
         if(a){              
             System.out.println(number+"   ASAL SAYI DEĞİLDİR");
            }
         else{
             System.out.println(number+"  ASAL SAYIDIR");

         }
    }
}
  

