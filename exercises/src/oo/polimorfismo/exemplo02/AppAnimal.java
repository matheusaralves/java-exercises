package oo.polimorfismo.exemplo02;

public class AppAnimal {
    public static void main(String[] args) {
        Animal random = new Animal();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        random.fazerSom();
        gato.fazerSom();
        cachorro.fazerSom();
    }
}
