package oo.heranca.desafio;

public class Carro {
    int velocidadeAtual = 0;


    int acelerar() {
        velocidadeAtual += 5;
        return velocidadeAtual;
    }

    int frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        }

        return velocidadeAtual;
    }
}
