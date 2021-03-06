package operadores.aritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = 10 + 5;
        System.out.println(resultado); // imprime 15

        resultado = resultado - 5;
        System.out.println(resultado); // imprime 10

        resultado = resultado / 2;
        System.out.println(resultado); // imprime 5

        resultado = resultado * 10;
        System.out.println(resultado); // imprime 50

        resultado = resultado + 2;
        resultado = resultado % 5;
        System.out.println(resultado); // imprime 2
        System.out.println("Resultado: " + resultado); // imprime "Resultado:2"
    }
}
