package Lista09;

import java.util.Scanner;

public class Exercício2 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String nomes[] = new String[10];
        int tempos[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o nome do piloto: ");
            nomes[i] = sc.nextLine();
            System.out.print("Informe o tempo dele:");
            tempos[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            int menor = tempos[i];
            int indice = i;
            String nome;
            for (int j = i + 1; j < 10; j++) {
                if (tempos[j] < menor) {
                    menor = tempos[i];
                    indice = j;
                }
            }
            tempos[indice] = tempos[i];
            
        }
        
    }
}
