package Unidade4.Aula1.ExemploLoja;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private Produto produto;

    public Pedido(int numero, Cliente cliente, Produto produto) {
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
    }

    public void exibirDetalhes() {
        System.out.println("Número do Pedido: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}
