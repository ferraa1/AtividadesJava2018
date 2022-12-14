package Stuff;

import java.util.Scanner;

public class JurassicPark {

    public static void main(String args[]) {
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inform operation:");
            String operation = sc.nextLine();
            if (operation.equalsIgnoreCase("access security grid")) {
                System.out.println("Access denied.");
            } else if (operation.equalsIgnoreCase("access main security grid")) {
                System.out.println("Access denied.");
            } else if (operation.equalsIgnoreCase("give permission")) {
                System.out.println("Access denied. and...");
                String what = sc.next();
                do {
                    System.out.println("YOU DIDN'T SAY THE MAGIC WORD!");
                } while (true);
                
            } else {
                System.out.println("Error, operation doesn't exist.");
            }
        } while (true);
        
    }
}
