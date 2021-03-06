package menu.dowhile;

import java.util.Scanner;

public class ExercicioMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Menu de Opções");
            System.out.println("--------------------");
            System.out.println("1: Ver Menu");
            System.out.println("2: Ler o Menu");
            System.out.println("3: Repetir Menu");
            System.out.println("4: Tudo de Novo");
            System.out.println("5: Não li, pode repetir?");
            System.out.println("0: Sair");
            opcao = input.nextInt();

        } while(opcao != 0);
        System.out.println("Você acabou de sair do menu");
    }
}



