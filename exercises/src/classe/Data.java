package classe;

public class Data {
    int dia, mes, ano;

    // construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // construtor default
    public Data() {
        dia = 1;
        mes = 1;
        ano = 1971;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.printf(obterDataFormatada());
    }

}