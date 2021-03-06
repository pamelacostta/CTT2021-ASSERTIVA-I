package temperatura;

import java.util.Scanner;

public class TemperaturaCelsius {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double C;
        double F;

        System.out.println("\n Convertendo a temperatura Graus Celsius para Graus Fahrenheit \n");

        System.out.println(" Digite a temperatura em Celsius: ");
        C = entrada.nextDouble();

        F = (9 * C + 160) / 5;

        System.out.println(" A medida convertida é " + F + "ºF");

        entrada.close();
    }
}

