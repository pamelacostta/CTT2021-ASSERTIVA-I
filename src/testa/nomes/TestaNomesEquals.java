package testa.nomes;

public class TestaNomesEquals {
    public static void main(String[] args) {

        String nome1 = "Pâmela";
        String nome2 = "Pâmela";

        //Equals é um método de classe Object utilizafo para testar a relação de igualdade entre dois objetos
        if (nome1.equals(nome2)) {   // equalsIgnoreCase ele  ignora se o nome começa com maiscula ou minuscula
            System.out.println("Os nomes são iguais!");
        } else {
            System.out.println("Os nomes são diferentes!");
        }
    }
}