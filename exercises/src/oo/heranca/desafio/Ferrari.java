package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo  {
    int acelerar () {
        velocidadeAtual += 15;
        return velocidadeAtual;
    }


    @Override
    public void ligarTurbo() {
        velocidadeAtual += 35;
    }

    @Override
    public void desligarTurbo() {
        velocidadeAtual -= 15;

    }


}
