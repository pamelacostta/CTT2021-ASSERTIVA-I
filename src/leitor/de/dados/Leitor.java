package leitor.de.dados;

import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ", qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.println("Ah! então você tem: " + idade + " anos " + nome + "!");

        sc.close();
    }
}