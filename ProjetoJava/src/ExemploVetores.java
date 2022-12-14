
import java.util.Scanner;

public class ExemploVetores {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[10];
        //you can change int for String
        //(0,1,2,3,4,5,6,7,8 and 9)
        //int numeros[] = {1,2,3,4}
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um valor: ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
    }
}
