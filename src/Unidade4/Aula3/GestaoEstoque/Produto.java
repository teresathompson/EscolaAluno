package Unidade4.Aula3.GestaoEstoque;

public class Produto {
    private static final int LIMITE_ESTOQUE_BAIXO = 5;

    private String nome;
    private int quantidade;
    private double preco;
    private String codigo;
    private String descricao;

    public Produto(String nome, int quantidade, double preco, String codigo, String descricao) {
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
        setCodigo(codigo);
        setDescricao(descricao);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        }
    }

    public void atualizarPreco(double novoPreco) {
        setPreco(novoPreco);
    }

    public void atualizarDescricao(String novaDescricao) {
        setDescricao(novaDescricao);
    }

    public void atualizarCodigo(String novoCodigo) {
        setCodigo(novoCodigo);
    }

    public void atualizarNome(String novoNome) {
        setNome(novoNome);
    }

    public void atualizarProduto(String novoNome, int novaQuantidade, double novoPreco, String novoCodigo,
            String novaDescricao) {
        setNome(novoNome);
        setQuantidade(novaQuantidade);
        setPreco(novoPreco);
        setCodigo(novoCodigo);
        setDescricao(novaDescricao);
    }

    public void atualizarEstoque(int novaQuantidade, double novoPreco) {
        setQuantidade(novaQuantidade);
        setPreco(novoPreco);
    }

    public boolean possuiEstoqueBaixo() {
        return quantidade < LIMITE_ESTOQUE_BAIXO;
    }

    public String paraLinhaArquivo() {
        return codigo + " | " + descricao + " | " + quantidade + " | " + preco;
    }

    public static Produto deLinhaArquivo(String linha) {
        String[] partes = linha.split(" \\| ");

        return new Produto(
                partes[1],
                Integer.parseInt(partes[2].trim()),
                Double.parseDouble(partes[3].trim()),
                partes[0].trim(),
                partes[1].trim());
    }

    public void exibirEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
    }
}
