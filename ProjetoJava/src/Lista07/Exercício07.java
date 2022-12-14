package Lista07;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Informe um número para o primeiro vetor: ");
            a[i] = sc.nextInt();
            System.out.print("Informe um número para o segundo vetor: ");
            b[i] = sc.nextInt();
            c[i] = b[i];
        }
        
        System.out.println("Valores informados:");
        System.out.print("Vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Vetor B: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            a[i] = c[i];
        }
        
        System.out.println("");
        System.out.println("Valores trocados:");
        System.out.print("Vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Vetor B: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
