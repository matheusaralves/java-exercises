package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Fusca fusca = new Fusca();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();
        ferrari.acelerar();
        ferrari.frear();
        ferrari.acelerar();

        fusca.acelerar();
        fusca.acelerar();
        fusca.frear();
        fusca.acelerar();
        fusca.acelerar();
        fusca.frear();

        ferrari.ligarTurbo();
        ferrari.desligarTurbo();
        ferrari.ligarTurbo();

        System.out.println("A velocidade da Ferrari é: " + ferrari.velocidadeAtual + " km/h");
        System.out.println("A velocidade do Fusca é: " + fusca.velocidadeAtual + " km/h");

    }
}
