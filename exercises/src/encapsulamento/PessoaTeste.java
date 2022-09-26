package encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Matheus", "Alves", 32);
        p1.setIdade(-20); //alterar
        p1.setNome("Zé");


        System.out.println(p1.getIdade()); //ler
        System.out.println(p1.getNome());
        System.out.println(p1.getNomeCompleto());

    }
}
