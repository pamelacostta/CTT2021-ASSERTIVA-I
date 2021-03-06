package tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0;
        int Tabuada[] = new int[10];
        int i = 0;
        String resultado = "";

        do {
            System.out.println("Insira um valor entre 1 e 10");
            numero = input.nextInt();

            if (numero < 1 || numero > 10)
                System.out.println("ERROR\nPor favor digitar número entre 1 e 10!");

        } while (numero < 1 || numero > 10);
        for (int x = 1; x <= 10; x++) {

            Tabuada[i] = (int) (i * numero);
            resultado += numero + " x " + x + " = " + Tabuada[i] + "\n";
            i++;
        }

        System.out.println(resultado);

        input.close();
    }
}