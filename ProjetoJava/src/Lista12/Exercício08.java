package Lista12;

import java.util.Scanner;

public class Exercício08 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double m1;
        double m2;
        double m3;
        double m4;
        double cont = 0;
        int aproveitamento = 0;
        double somaExemplar = 0;
        double porcentExemplar;
        char repetir;
        do {
            cont = cont + 1;
            System.out.print("Informe o nome do aluno: ");
            nome = sc.next();
            System.out.print("Informe a primeira média bimestral: ");
            m1 = sc.nextDouble();
            System.out.print("Informe a segunda média bimestral: ");
            m2 = sc.nextDouble();
            System.out.print("Informe a terceira média bimestral: ");
            m3 = sc.nextDouble();
            System.out.print("Informe a quarta média bimestral: ");
            m4 = sc.nextDouble();
            System.out.println("O aluno " + nome + " obteve: ");
            System.out.println("Média Anual: " + mediaAnual(m1, m2, m3, m4));
            if (mediaAnual(m1, m2, m3, m4) >= 7) {
                System.out.println("Citação: " + citacao(mediaAnual(m1, m2, m3, m4), duasMediasBimestraisDez(m1, m2, m3, m4)));
                if (citacao(mediaAnual(m1, m2, m3, m4),duasMediasBimestraisDez(m1, m2, m3, m4)).equals("Honras pelo Bom Aproveitamento")) {
                    aproveitamento++;
                } else if (citacao(mediaAnual(m1, m2, m3, m4), duasMediasBimestraisDez(m1, m2, m3, m4)).equals("Aluno Exemplar")) {
                    somaExemplar = somaExemplar + 1;
                }
            } else {
                System.out.println("Citação: Nenhuma");
            }
            System.out.print("Deseja informar outro aluno? (S ou N): ");
            repetir = sc.next().charAt(0);
        } while (repetir == 's' || repetir == 'S');
        System.out.println(aproveitamento + " dos alunos informados obtiveram a citação Honras pelo Bom Aproveitamento.");
        porcentExemplar = (somaExemplar / cont) * 100;
        System.out.println(porcentExemplar + "% dos alunos informados obtiveram a citação Aluno Exemplar.");
    }
    
    public static double mediaAnual(double m1, double m2, double m3, double m4) {
        return (m1 + m2 + m3 + m4) / 4;
    }
    
    public static boolean duasMediasBimestraisDez(double m1, double m2, double m3, double m4) {
        int cont = 0;
        if (m1 == 10) {
            cont++;
        }
        if (m2 == 10) {
            cont++;
        }
        if (m3 == 10) {
            cont++;
        }
        if (m4 == 10) {
            cont++;
        }
        if (cont >= 2) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String citacao(double media, boolean duasDez) {
        if (media < 8) {
            return "Honras pelo Bom Aproveitamento";
        } else if (media < 9) {
            return "Honras pelo Ótimo Aproveitamento";
        } else {
            if (duasDez = true) {
                return "Aluno Exemplar";
            }
            return "Honras pelo Excelente Aproveitamento";
        }
    }
}
