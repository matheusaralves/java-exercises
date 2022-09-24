package classe;

public class Produto {

// atributos
    String nome;
    double preco;
    static double desconto = 0.25;

    // construtor com um atributo
    public Produto(String nome) {
        this.nome = nome;
    }

    // construtor com três atributos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // construtor padrão (default)
    public Produto() {

    }

    public double precoComDesconto() {
        return preco * (1 - desconto);

    }

    public double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto);

    }

}