package Unidade4.Aula3.GestaoEstoque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EstoqueManager {
    private static final String ARQUIVO_ESTOQUE = "estoque.txt";

    public static void main(String[] args) throws IOException {
        adicionarProduto("001", "Martelo", 8, 25.50);
        adicionarProduto("002", "Chave de Fenda", 15, 12.00);
        adicionarProduto("003", "Alicate", 3, 18.75);
        exibirEstoque();
        atualizarProduto("001", 10, 26.00);
        gerarRelatorioEstoqueBaixo();
    }

    public static void adicionarProduto(String codigo, String descricao, int quantidade, double preco)
            throws IOException {
        garantirArquivoEstoque();

        if (produtoExiste(codigo)) {
            System.out.println("Produto com código " + codigo + " já existe. \n");
            return;
        }

        Produto produto = new Produto(descricao, quantidade, preco, codigo, descricao);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_ESTOQUE, true))) {
            writer.write(produto.paraLinhaArquivo());
            writer.newLine();
        }

        System.out.println("Produto adicionado: " + descricao + "\n");
    }

    private static boolean produtoExiste(String codigo) throws IOException {
        garantirArquivoEstoque();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_ESTOQUE))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                Produto produto = Produto.deLinhaArquivo(linha);
                if (produto.getCodigo().equals(codigo)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void exibirEstoque() throws IOException {
        System.out.println("Estoque Atual: \n");
        garantirArquivoEstoque();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_ESTOQUE))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                Produto produto = Produto.deLinhaArquivo(linha);
                System.out.println(produto.paraLinhaArquivo() + "\n");
            }
        }
    }

    public static void atualizarProduto(String codigo, int novaQuantidade, double novoPreco) throws IOException {
        garantirArquivoEstoque();

        File arquivo = new File(ARQUIVO_ESTOQUE);
        File arquivoTemp = new File("estoque_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo));
                BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTemp))) {
            String linha;
            boolean produtoAtualizado = false;

            while ((linha = reader.readLine()) != null) {
                Produto produto = Produto.deLinhaArquivo(linha);

                if (produto.getCodigo().equals(codigo)) {
                    produto.atualizarEstoque(novaQuantidade, novoPreco);
                    produtoAtualizado = true;
                }

                writer.write(produto.paraLinhaArquivo());
                writer.newLine();
            }

            if (!produtoAtualizado) {
                System.out.println("Produto com código " + codigo + " não encontrado. \n");
            }
        }

        if (arquivo.delete()) {
            arquivoTemp.renameTo(arquivo);
        }

        System.out.println("Produto atualizado com sucesso. \n");
    }

    public static void gerarRelatorioEstoqueBaixo() throws IOException {
        System.out.println("Relatório de Estoque Baixo:");
        garantirArquivoEstoque();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_ESTOQUE))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                Produto produto = Produto.deLinhaArquivo(linha);

                if (produto.possuiEstoqueBaixo()) {
                    System.out.println(produto.paraLinhaArquivo());
                }
            }
        }
    }

    private static void garantirArquivoEstoque() throws IOException {
        File arquivo = new File(ARQUIVO_ESTOQUE);

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
    }
}