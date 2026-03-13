package VamosExercitarUnidade3Aula3;

public class PesquisadorMestre extends Pesquisador {

    // Construtor para inicializar os atributos do pesquisador mestre
    public PesquisadorMestre(String nome, String areaPesquisa, int numeroProjetos) {
        super(nome, areaPesquisa, numeroProjetos);
    }

    // Sobrescreve o método calcularFinanciamento() da classe Pesquisador para
    // fornecer uma implementação específica para PesquisadorMestre
    @Override
    public double calcularFinanciamento() {
        // Cálculo do financiamento para um pesquisador mestre
        return numeroProjetos * 10000; // R$ 10.000 por projeto
    }

}
