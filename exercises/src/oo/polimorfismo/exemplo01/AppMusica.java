package oo.polimorfismo.exemplo01;

public class AppMusica {
    public static void main(String[] args) {
        Instrumento instrumento1 = new Instrumento();

        Instrumento guitarra1 = new Guitarra();

        Trompete trompete1 = new Trompete();

        Guitarra guitarra2 = new Guitarra();

        instrumento1.tocar();

        guitarra1.ligar();
        guitarra1.tocar();

        trompete1.tocar();
        guitarra2.tocar();

        guitarra2.ligar();
        guitarra2.tocar();
    }



}
