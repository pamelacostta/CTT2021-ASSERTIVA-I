package swith;

import java.util.Scanner;

public class Swith {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha sua liguagem favorita: Java ou C");
        String linguagem = entrada.nextLine();
        switch (linguagem) {
            case "Java":
                System.out.println("Melhor escolha! Esta linguagem é Orientada a Objetos");
                break;
            case "C":
                System.out.println("Esta linguagem é estruturada");
                break;
            default:
                System.out.println("Linguagem desconhecida");
        }
    }
}