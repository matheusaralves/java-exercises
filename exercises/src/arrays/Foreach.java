package arrays;

public class Foreach {
    public static void main(String[] args) {

        double notas[] = {9.9, 8.7, 7.2, 9.4};
        // Imprimindo cada um dos elementos do array notas:
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println();

        // Imprimindo cada um dos elementos do array numeros:
        int numeros[] = {2, 4, 7, 8, 9, 13, 55, 128};
        for (int numero : numeros) {
            System.out.print(numero + " ");

        }
    }
}
