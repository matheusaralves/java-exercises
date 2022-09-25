package classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 96.5);

        Comida c1 = new Comida("Hamburger", 0.7);
        Comida c2 = new Comida("Pizza", 0.9);
        Comida c3 = new Comida("Pamonha", 0.5);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());

        p1.comer(c2);
        System.out.println(p1.apresentar());

        p1.comer(c3);
        System.out.println((p1.apresentar()));


    }
}
