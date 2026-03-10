package ExercicioAula1Unidade3;

public class LojaVirtual {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 3500.00, 10);
        Produto produto2 = new Produto("Tablet", 2100, 64);
        Produto produto3 = new Produto("Geladeira", 2000, 50);

 

        // Exibir detalhes do produto

        produto.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();

 

        // Atualizar preço e quantidade

        produto.setPreco(3600.00);

        produto.setQuantidade(8);

 

        // Exibir detalhes atualizados

        System.out.println("\nDetalhes atualizados:" + "\n");

        produto.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();

    }
}
