package aprendendoArray;

import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;

        int vetor[] = {1, 3, 5, 7, 9};
        int numero;
        boolean achou = false;

        System.out.println("Qual número deseja procurar? ");
        numero = input.nextInt();

        for (int posicao = 0; posicao < 5; posicao++) {

            if (vetor[posicao] == numero) {

                System.out.println("Encontrando a posição: " + posicao + "\n");
                achou = true;
            }
        }

        input.close();
    }
}
