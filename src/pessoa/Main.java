package pessoa;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Valentina", "000.000.000-42", "09/07/1991", "230909"); //  parametro
        System.out.println("Nome: " + aluno.nome);
        System.out.println("CPF: " + aluno.cpf);
        System.out.println("Data de nascimento: " + aluno.dataNascimento);
        System.out.println("Matricula: " + aluno.matricula);

        System.out.println("------------------------------------------------------");

        Professor professor = new Professor("Maria", "123.456.789-10",
                "29/04/1985", "JavaScript", 3.000);
        System.out.println("Nome: " + professor.nome);
        System.out.println("CPF: " + professor.cpf);
        System.out.println("Data de nascimento: " + professor.dataNascimento);
        System.out.println("Diciplina: " + professor.diciplina);
        System.out.printf("Salário: R$ %.3f%n ", professor.salario);

        System.out.println("------------------------------------------------------");

        Funcionario funcionario = new Funcionario("João", "123.789.456-36", "19/07/1996",2.000, "Desenvolvedor");
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("CPF: " + funcionario.cpf);
        System.out.println("Data de nascimento: " + funcionario.dataNascimento);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.printf("Salário: R$ %.3f%n ", funcionario.salario);
    }
}
