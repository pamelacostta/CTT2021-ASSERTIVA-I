package dados.pessoais;

public class Dados {
    public static void main(String[] args) {

        String nome = "Pâmela da Palma Costa";
        String endereco = "Rua farrapos 394, Guaiba/RS";
        int idade = 29;
        char estadoCivil = 'C';
        float salario = 500.00f;

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.printf("Salario: R$ %.2f%n", salario);
    }
}