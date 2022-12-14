package Lista07;

public class Exercício02 {

    public static void main(String args[]) {
        
        int vetor[] = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = 0;
            } else {
                vetor[i] = 1;
            }
            System.out.println(vetor[i]);
        }
        
    }
}
