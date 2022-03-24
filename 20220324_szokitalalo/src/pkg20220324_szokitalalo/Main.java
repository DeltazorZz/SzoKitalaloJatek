package pkg20220324_szokitalalo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        kiiras();
    }

    private static void kiiras() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        String valasz;
        String nev;
        System.out.print("Hello! Hogy hivnak?\n");
        nev = sc.nextLine();
        
        System.out.printf("Üdvözöllek kedves %s!\n", nev);
        System.out.print("Kezdődhet a játék? (I/N): ");
        valasz= sc.nextLine();
        if("I" == valasz){
            System.out.print("Akkor gyerünk!");
        }else{
            System.out.print("Köszi hogy itt voltal!");
        }
        
              
                
    }
    
}
