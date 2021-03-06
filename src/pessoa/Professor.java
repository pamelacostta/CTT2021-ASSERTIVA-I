package pessoa;

public class Professor extends Pessoa {

    public String diciplina;
    public double salario;

    public Professor(String nome, String cpf, String dataNascimento, String diciplina, double salario) {
        super(nome, cpf, dataNascimento);
        this.diciplina = diciplina;
        this.salario = salario;
    }
}