package ano.bissexto;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um ano:");
        int ano = input.nextInt();

        if((ano % 400==0)|| (ano % 4 == 0 && ano% 100!=0)){
            System.out.println("ANO BISSEXTO!!");
        }else{
            System.out.println("Esse ano não é BISSEXTO!");
        }
    }
}
