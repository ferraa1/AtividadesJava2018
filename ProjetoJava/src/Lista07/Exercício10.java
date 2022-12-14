package Lista07;

import java.util.Scanner;

public class Exercício10 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int gabarito[] = new int[6];
        int aposta[] = new int[10];
        int pontos = 0;
        
        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor do gabarito: ");
            gabarito[i] = sc.nextInt();
        }
        
        for (int i = 0; i < aposta.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor da aposta: ");
            aposta[i] = sc.nextInt();
        }
        
        for (int i = 0; i < gabarito.length; i++) {
            for (int j = 0; j < aposta.length; j++) {
                if (gabarito[i] == aposta[j]) {
                    pontos++;
                    break;
                }
            }
        }
        
        System.out.println("Resultado: " + pontos + " pontos.");
    }
}
