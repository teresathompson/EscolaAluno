package Unidade4.Aula1.ExemploLoja;

public class Loja {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.00);
        produto1.exibirInformacoes();

        Pedido pedido1 = new Pedido(1, new Cliente("Jonas"), produto1);
        pedido1.exibirDetalhes();
    }
}
