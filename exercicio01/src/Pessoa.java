public class Pessoa {
    private String nome;
    private String dataNascimento;
    private int idade;

    public Pessoa(String nome, String dataNascimento, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public Pessoa(int idade) {
        this.idade = idade;
        this.nome = "Manuel Gomes";
        this.dataNascimento = "02/07/2000";
    }

    public Pessoa(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        this.nome = "Matheus Cornelhos";
        this.idade = 45;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
