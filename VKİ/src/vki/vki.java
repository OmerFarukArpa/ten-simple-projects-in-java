
package vki;

import java.util.Scanner;

public class vki {

    public static void main(String[] args) {
        Scanner ara=new Scanner(System.in);
        
        System.out.println("BOYUNUZU GİRİNİZ:(örnek:1,80)");
        double boy=ara.nextDouble();
        
        System.out.println("KİLONUZU GİRİNİZ");
        double kilo=ara.nextInt();
        
        double wki=kilo/(boy*boy);
        if (wki<=18.5){
            System.out.println("AZ KİLOLU");
        }
        else if(wki>=18.5&&wki<24.9){
            System.out.println("NORMAL KİLOLU");
        }
        else if(wki>=24.9&&wki<29.9){
            System.out.println("KİLOLU");
        }
        else if(wki>=29.9&&wki<34.9){
            System.out.println("1.DERECE OBEZ");
        }
        else if(wki>=34.9&&wki<39.9){
            System.out.println("2.DERECE OBEZ");
        }
        else {
            System.out.println("3.DERECE OBEZ");
        }
    }
    
}
