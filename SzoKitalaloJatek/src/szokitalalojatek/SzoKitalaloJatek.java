
package javaapplication5;

import java.util.Random;
import java.util.Scanner;
public class JavaApplication5 {
    
    public static void main(String[] args) {
       kiiras();
       String[] szavak = {"ab","cb","db","kn","ea","xd"};
       Random rnd = new Random();
       Scanner sc = new Scanner(System.in);
       String kivalasztott;
       int rnszam = rnd.nextInt(5);
       kivalasztott = szavak[rnszam];
       System.out.println(kivalasztott);
       String tipp;
       System.out.println("----------------");
       System.out.print("Kérek egy két karakterből álló szavat:");
       tipp = sc.nextLine();
       String kbetu1 = kivalasztott.substring(0,1);
       String kbetu2 = kivalasztott.substring(1,2);
       String tbetu1 = tipp.substring(0,1);
       String tbetu2 = tipp.substring(1,2);
       boolean eldontes = false;
       while(!(kbetu1 == tbetu1 && kbetu2 == tbetu2)){
           System.out.print("Kérek egy két karakterből álló szavat újra:");
           tipp = sc.nextLine();
           tbetu1 = tipp.substring(0,1);
           tbetu2 = tipp.substring(1,2);
           if(kbetu1 == tbetu1 || kbetu2 == tbetu2 ){
               System.out.println("Az eggyik karakter jó");
           }
           else{
               System.out.print("Sajnos nem talált eggyik sem");
           }
       }
       
    }

    private static void kiiras() {
        
    }
    
}
