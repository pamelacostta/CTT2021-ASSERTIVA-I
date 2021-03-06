package pessoa;

public class Aluno extends Pessoa {

    public String matricula;

    public Aluno(String nome, String cpf, String dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }
}