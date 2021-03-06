package pessoa;

public class Pessoa {
    public String nome;
    public String cpf;
    public String dataNascimento;

    public Pessoa(String nome, String cpf, String dataNascimento) { // Metodo construtor (com parametros)
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}