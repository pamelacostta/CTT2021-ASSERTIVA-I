package exercicio.whille;

import java.util.Scanner;

public class WhileScanner {
    public static void main(String[] args) {

        int contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número de telefone: ");
        String numero = sc.nextLine();

        while (contador < 5) {
            System.out.println("Seu número é: " + numero);
            contador++;
        }

        contador = 0;

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        while (contador < 5) {
            System.out.println(frase);
            contador++;

                sc.close();
        }
    }
}