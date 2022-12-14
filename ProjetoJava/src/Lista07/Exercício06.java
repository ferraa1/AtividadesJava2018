package Lista07;

import java.util.Scanner;

public class Exercício06 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int A[] = new int[10];
        int B[] = new int[10];
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("Informe um valor: ");
            A[i] = sc.nextInt();
            if (i % 2 == 0) {
                B[i] = A[i] * 5;
            } else {
                B[i] = A[i] + 5;
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " = " + B[i]);
        }
    }
}
