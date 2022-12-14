
import java.util.Scanner;

public class Subprogramas2 {

    static int matriz[][] = new int[5][5];

    public static void main(String args[]) {
        preencher();
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("A soma da diagonal secundária é: " + soma());
    }

    public static void preencher() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Informe um valor para a " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static int soma() {
        int soma = 0;
        int cont = 4;
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][cont];
            cont--;
        }
        return soma;
    }
}
