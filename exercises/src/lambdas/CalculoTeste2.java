package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        // Utilizando Lambdas
        Calculo calcular = (x, y) -> { return x + y; };
        System.out.println(calcular.executar(2, 3));


        calcular = (x,y) -> x * y;
        System.out.println(calcular.executar(2, 3));
    }
}
