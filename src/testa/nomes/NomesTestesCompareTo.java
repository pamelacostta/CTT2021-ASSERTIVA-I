package testa.nomes;

public class NomesTestesCompareTo {
    public static void main(String[] args) {

        String nome1 = "Pâmela";
        String nome2 = "Pâm";

        System.out.println("nome2.compareTo(nome1)=" + nome2.compareTo(nome1));
        System.out.println("nome1.compareTo(nome2)=" + nome1.compareTo(nome2));
    }
}