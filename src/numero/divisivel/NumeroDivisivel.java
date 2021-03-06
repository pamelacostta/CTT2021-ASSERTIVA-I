package numero.divisivel;

import java.util.Scanner;

public class NumeroDivisivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero1 =  input.nextInt();
        int resultado = numero1 % 3;

        if (resultado == 0){
            System.out.printf("Esse número elevado ao quadrado");
        }else{
            System.out.println("Esse número não é elevado ao quadrado");
        }

    }
}
