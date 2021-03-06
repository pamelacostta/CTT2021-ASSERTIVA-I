package imc;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        String nome;
        double peso = 0;
        double altura = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("É hora de descobrir como anda a sua saúde! ");

        System.out.println("Me diga o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Qual seu peso em kg? ");
        peso = sc.nextDouble();
        System.out.println("Qual sua altura em metros? ");
        altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);


        if (imc <= 18.5) {
            System.out.println(nome + " você está abaixo do peso!");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println(nome + " seu peso está normal!");
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.println(nome + " Excesso de peso!");
        } else if (imc >= 30.0 && imc < 34.9) {
            System.out.println(nome + " Obesidade grau 1!");
        } else if (imc >= 35.0 && imc < 39.9) {
            System.out.println(nome + " Obesidade grau 2!");
        } else {
            System.out.println(nome + " você se encontra em Obesidade mórbita, procure ajuda!");
        }

        sc.close();
    }
}

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
       
           