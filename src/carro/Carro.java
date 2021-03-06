package carro;

public class Carro {
    public String cor;
    public String modelo;
    public double velocidadeAtual;

    public void liga() {
        System.out.println("Seu carro está ligado!!");
    }

    void acelera(double velocidade) {
        this.velocidadeAtual = velocidade;
    }

    public int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        } else if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40.0) {
            return 1;
        } else if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        } else {
            return 3;
        }
    }
}