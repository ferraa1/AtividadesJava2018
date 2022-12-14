
import java.util.Scanner;


public class ExemploRepetir {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int n = sc.nextInt();
        int contador = 1;
        while (contador <= n) {
            System.out.println(contador + " ");
            contador++;
        }
        
        do {
            
        } while (contador <= n);
        
        /*
        
        for (int contador = 1; contador <=n; contador++) {
            System.out.println(contador + " ");
        }
        
        */
        
        //break; ou continue; para quebrar o laço
        //soma += i; (soma = soma + i)
        
    }
}
