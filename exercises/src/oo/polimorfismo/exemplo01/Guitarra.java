package oo.polimorfismo.exemplo01;

public class Guitarra extends Instrumento{


    @Override
    public void tocar() {
        if (ligado) {
            System.out.println("Tocar guitarra");
        }

    }
}
