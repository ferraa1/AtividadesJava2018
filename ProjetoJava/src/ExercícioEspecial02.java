
import java.util.Random;
import java.util.Scanner;

public class ExercícioEspecial02 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        String palavras[] = {"pato","girafa","elefante","papagaio","tigre","gato","cachorro","porco","galinha","vaca"};
        int num = ra.nextInt(10);
        String sortida = palavras[num];
        char resposta[] = new char[sortida.length()];
        int cont;
        int erros = 0;
        char letra;
        int end = 0;
        
        System.out.println("JOGO DA FORCA:");
        for (int i = 0; i < (resposta.length); i++) {
            resposta[i] = '_';
        }
        
        do {
            cont = 0;
            System.out.println("");
            System.out.println("Dica: Animais");
            for (int i = 0; i < resposta.length; i++) {
                System.out.print(resposta[i]);
                System.out.print(" ");
            }
            System.out.println("");
            System.out.print("Informe uma letra: ");
            letra = sc.next().charAt(0);
            letra = Character.toLowerCase(letra);
            for (int i = 0; i < sortida.length(); i++) {
                if (letra == sortida.charAt(i)) {
                    resposta[i] = letra;
                    cont++;
                }
            }
            if (cont == 0) {
                erros++;
                System.out.println("Você errou! Erros: (" + erros + "/5)");
            }
            for (int i = 0; i < sortida.length(); i++) {
                if (resposta[i] == sortida.charAt(i)) {
                    end = 1;
                } else {
                    end = 0;
                    break;
                }
            }
            if (erros == 5) {
                System.out.println("Você perdeu!");
                end = 2;
            }
            if (end == 1) {
                System.out.println("Você ganhou!");
                System.out.println("Palavra: " + sortida);
            }
        } while (end == 0);
                
    }
}
