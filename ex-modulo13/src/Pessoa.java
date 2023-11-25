public abstract class Pessoa {

    private String nome;
    private String endereco;

    public <T> void imprimirPessoa(T codigo) {
        System.out.println(nome + ", " + endereco + ", " + codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}