package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 12;
        d1.mes = 11;
        d1.ano = 1990;

        var d2 = new Data();
        d2.dia = 11;
        d2.mes = 9;
        d2.ano = 2022;

        System.out.printf("Eu nasci no dia %d do mês %d de %d\n", d1.dia, d1.mes, d1.ano);
        System.out.println(d1.obterDataFormatada());
        d1.imprimirDataFormatada();
        System.out.printf("\nHoje é dia %d do mês %d de %d\n", d2.dia, d2.mes, d2.ano);
        System.out.println(d2.obterDataFormatada());
        d2.imprimirDataFormatada();
    }

}