package adivinhe.um.numero;

import java.util.Scanner;
import java.util.Random;

public class AdivinheNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(10);
        int palpite = numeroAleatorio;
        int vidas = 5;

        while (vidas > -1) {

            System.out.println("digite um numero de 0 a 10: ");
            numeroAleatorio = entrada.nextInt();

            if (numeroAleatorio == palpite) {
                System.out.println("Parabéns você acertou ! ");
            } else {
                System.out.println("Você errou, restaram " + vidas-- + " vidas !");
            }
            if (vidas == -1) {
                System.out.println("GAME OVER , YOU LOSE , ACABOU ! ");
            }
        }
    }
}
