package pessoa;

public class Funcionario extends Pessoa {

    public double salario;
    public String cargo;

    public Funcionario(String nome, String cpf, String dataNascimento, double salario, String cargo) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.cargo = cargo;
    }
}
