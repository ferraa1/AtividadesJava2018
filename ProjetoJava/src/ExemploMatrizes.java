
import java.util.Scanner;

public class ExemploMatrizes {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][4];//5 linhas e 4 colunas
        //int matriz[][] = {{1,2}{3,4}}; ({1,2} é uma linha e 1,2 são duas colunas)

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valores: ");
                matriz[i][j] = sc.nextInt();
            }
        }

    }
}
