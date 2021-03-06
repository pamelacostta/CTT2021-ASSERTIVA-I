package metodofinal;

import java.util.Scanner;

public class NumerosIf {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero1, numero2, numero3;
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;

        System.out.println("Digite o primeiro:  ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo: ");
        numero2 = leitor.nextInt();
        System.out.println("Digite o terceiro: ");
        numero3 = leitor.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número: " + numero2);
        } else {
            System.out.println("O maior número: " + numero3);
        }

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("O menor número: " + numero1);
        } else if
        (numero2 < numero3) {
            System.out.println("O menor número: " + numero2);
        } else {
            System.out.println("O menor número: " + numero3);
            leitor.close();
        }
    }
}