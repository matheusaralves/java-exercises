package oo.polimorfismo.exemplo01;

public class Instrumento {
    public String tipo;
    public boolean ligado = false;

    public void ligar() {
        ligado = true;
    }

    public void tocar() {
        System.out.println("Tocar um instrumento");
    }

}
