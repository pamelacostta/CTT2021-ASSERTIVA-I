package gerente.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Gerente gerente = new Gerente("Pamela costa", "000.000.000-00", 3.000);

        System.out.println("Digite sua senha: ");
        int senha = input.nextInt();
        gerente.autentica(senha);

        input.close();
    }
}