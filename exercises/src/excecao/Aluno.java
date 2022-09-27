package excecao;

public class Aluno {

    public int idade;
    public String nome;
    public String sobrenome;


    public Aluno(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public Aluno(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }


    // Getter

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    // Setter
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade); // transforma negativo em positivo
        if(novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
