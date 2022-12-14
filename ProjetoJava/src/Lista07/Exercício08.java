package Lista07;

import java.util.Scanner;

public class Exercício08 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int cont = A.length - 1;
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("Informe um número: ");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            B[cont] = A[i];
            cont--;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " = " + B[i]);
        }
    }
}