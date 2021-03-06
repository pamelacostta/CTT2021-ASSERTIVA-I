package metodofinal;

import java.util.Scanner;

public class NumerosFor {
    public static void main(String[] args) {
        final int N = 3;
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            System.out.println("Digite um número: ");
            int n = sc.nextInt();

            if (i == 0) {
                maior = n;
                menor = n;
            }
            if (n > maior) {
                maior = n;
            }

            if (n < menor)
                menor = n;
        }

        System.out.println("O número menor é: " + menor);
        System.out.println("O número maior é: " + maior);

        sc.close();
    }
}