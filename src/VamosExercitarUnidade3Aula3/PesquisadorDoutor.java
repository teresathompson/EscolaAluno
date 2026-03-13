package VamosExercitarUnidade3Aula3;

// PesquisadorDoutor é uma subclasse de Pesquisador, herda de Pesquisador e implementa o método abstrato calcularFinanciamento()

public class PesquisadorDoutor extends Pesquisador {

    // Construtor para inicializar os atributos do pesquisador doutor
    public PesquisadorDoutor(String nome, String areaPesquisa, int numeroProjetos) {
        super(nome, areaPesquisa, numeroProjetos);
    }

    // Sobrescreve o método calcularFinanciamento() da classe Pesquisador para
    // fornecer uma implementação específica para PesquisadorDoutor
    @Override
    public double calcularFinanciamento() {
        // Cálculo do financiamento para um pesquisador doutor
        return numeroProjetos * 15000; // R$ 15.000 por projeto
    }

}
