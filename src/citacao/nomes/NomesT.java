package citacao.nomes;

import java.util.Scanner;

public class NomesT {
    Scanner in = new Scanner(System.in);

    String nome = "";
    String sobrenome = "";

    public void imprime() {
        System.out.println("Didite seu nome completo: ");
        String nomes = in.nextLine().trim();

        int i = 0;
        int fim = nomes.indexOf(" ", i);

        while (fim != -1) {

            nome += nomes.substring(i, i + 1) + ". ";
            i = fim + 1;
            fim = nomes.indexOf(" ", i);

        }
        sobrenome = nomes.substring(i).toUpperCase();
        System.out.println(sobrenome + ", " + nome.toUpperCase().trim());
    }
}