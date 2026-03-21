package Unidade4.Aula1.ExemploLoja;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
