package tipos.primitivos;
/*
 *
 *Exemplo de utilização dos tipos primitivos float e double.
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
//Definindo explicitamente que o valor é float.

        float a = 10.99f;

//Definindo explicitamente que o valor é float.
        double b = 10.3D;

//Atribuindo o valor inteiro para um tipo double.
        double c = 5;

/* Atribuindo um valor double, por padrão todos números
com casas decimais são do tipo double. */
        double d = 7.2;

        System.out.println(a); // imprime 10.99
        System.out.println(b); // imprime 10.3
        System.out.println(c); // imprime 5.0
        System.out.println(d); // imprime 7.2

    }
}
