package gerente.funcionario;

public class Gerente extends Funcionario {

    public void setSenha(int senha) {
        this.setSenha(senha);
    }

    @Override
    public int getSenha() {
        return getSenha();
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public boolean autentica(int senha) {
        if (super.getSenha() == senha) {
            System.out.println("Acesso Permitido!");
            System.out.println("Nome do(a) gerente: " + getNome());
            System.out.println("CPF: " + getCpf());
            System.out.printf("Salario: R$ %.3f%n ", getSalario());
            return true;
        } else {
            System.out.println("Senha incorreta!");
            System.out.println("Dados não podem ser consultado");
            return false;
        }
    }
}