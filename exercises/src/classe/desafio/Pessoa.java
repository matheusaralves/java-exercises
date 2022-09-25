package classe.desafio;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    public Pessoa(String nomePessoa, double pesoPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

     double comer(Comida comida) {
        if(comida != null) {
            return this.pesoPessoa += comida.pesoComida;
        } else {
            return 0;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + nomePessoa + " e tenho " + pesoPessoa + " Kgs.";
    }
}
