package carro;

import java.util.Scanner;

public class CarroTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.println("Qual a cor do carro: ");
        String cor = input.nextLine();
        System.out.println("Diga o modelo do carro: ");
        String modelo = input.nextLine();

        System.out.println("Qual a velocidade do carro? ");
        double velocidadeAtual = input.nextDouble();
        int pegaMarcha = carro.pegaMarcha();

        System.out.println("Seu carro é " + cor + " o modelo dele é " + modelo + " e a marcha que ele está no momento é a: " + pegaMarcha);

        input.close();
    }
}
