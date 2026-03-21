package Unidade4.Aula1.ExemploLoja;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s | Preço: R$ %.2f%n", nome, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Produto sem nome";
        } else {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido! Definido como 0.");
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }
}