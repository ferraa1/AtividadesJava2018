
import java.util.Random;

public class SelectionSort {
    public static void main(String args[]){
        
        Random ra = new Random();
        int vetor[] = new int[5];
        
        System.out.println("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ra.nextInt(10);
            System.out.print(vetor[i] + " ");
        }
        
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = vetor[i];
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }
        
        System.out.println("");
        System.out.println("Final: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
    }
}
