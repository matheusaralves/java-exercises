package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        p1.preco = 4356.89;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.29;

        Produto p3 = new Produto ("Teclado", 79.99);



        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p3.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double precoFinal3 = p3.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3) / 3;
        System.out.printf("Media do carrinho: R$ %.2f", mediaCarrinho);

        System.out.println("\nValor do desconto: " + Math.ceil(Produto.desconto * 100) + "%");



    }

}