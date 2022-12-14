package Lista04;

import java.util.Scanner;

public class Exercício08 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char sex;
        double h;
        double menorH = Integer.MAX_VALUE;
        double maiorH = Integer.MIN_VALUE;
        double mediaF = 0;
        int contM = 0;
        int contF = 0;
        char maior = 'z';
        
        for (int cont = 1; cont <= 5; cont++) {
            System.out.print("Informe o sexo da pessoa (m ou f): ");
            sex = sc.next().charAt(0);
            System.out.print("Informe a altura da pessoa: ");
            h = sc.nextDouble();
            if (sex == 'm' || sex == 'M') {
                contM++;
            } else {
                contF++;
                mediaF = mediaF + h;
            }
            if (h < menorH) {
                menorH = h;
            }
            if (h > maiorH){
                maiorH = h;
                maior = sex;
            }
        }
        
        mediaF = mediaF / contF;
        System.out.println("A menor altura do grupo é: " + menorH);
        System.out.println("A média da altura das mulheres é: " + mediaF);
        System.out.println("O número de homens é: " + contM);
        System.out.println("O sexo da maior pessoa é: " + maior);

    }
}
