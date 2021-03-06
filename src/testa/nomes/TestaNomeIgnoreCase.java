package testa.nomes;

public class TestaNomeIgnoreCase {
    public static void main(String[] args) {

        String nome1 = "Pâmela";
        String nome2 = "pâmela";

        // equalsIgnoreCase ele  ignora se o nome começa com maiscula ou minuscula
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Os nomes são iguais!");
        } else {
            System.out.println("Os nomes são diferentes!");
        }
    }
}
