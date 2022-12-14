package Lista10;

import java.util.Scanner;

public class Exercício01 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int matriz[][] = new int[2][4];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matriz:");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
}
