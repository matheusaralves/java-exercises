package classe;

public class AreaCirc {

    double raio;
    final static double pi = 3.14;

    // construtor
    public AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    // método
    double area() {
        return raio * raio * pi;
    }

    // método estático
    static double area(double raio) {
        return pi * Math.pow(raio, 2);
    }
}
