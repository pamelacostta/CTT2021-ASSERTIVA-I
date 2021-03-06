package aprendendoArray;

public class TabelasDados {
    public static void main(String[] args) {

        // Como chamar dois dados

        String nome[] = {"Pedro: ", "Thiago: ", "João: ", "Matheus: ", "Messia: "};
        double altura[] = {1.70, 1.78, 1.80, 1.60, 1.90};

        System.out.println("--------------------------------------------");
        System.out.println("TABELA");
        System.out.println("--------------------------------------------");

        for (int posicao = 0; posicao < 5; posicao++) {
            System.out.printf(nome[posicao] + "%.2f%n", altura[posicao]);
        }
    }
}
