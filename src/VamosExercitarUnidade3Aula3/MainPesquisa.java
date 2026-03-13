package VamosExercitarUnidade3Aula3;

public class MainPesquisa {
    public static void main(String[] args) {
        // Criando um objeto do tipo Pesquisador utilizando uma classe concreta que
        // estende Pesquisador
        Pesquisador pesquisadorDoutor = new PesquisadorDoutor("Dr. Silva", "Inteligência Artificial", 5);
        Pesquisador pesquisadorMestre = new PesquisadorMestre("Mestre Souza", "Biologia Molecular", 3);

        // Chamando o método calcularFinanciamento() para exibir o financiamento
        // calculado para o pesquisador

        double financiamentoDoutor = pesquisadorDoutor.calcularFinanciamento();
        double financiamentoMestre = pesquisadorMestre.calcularFinanciamento();

        // O printf é utilizado para formatar a saída de texto, onde %s é um placeholder
        // para uma string (nome do pesquisador), %.0f é um placeholder para um número
        // de ponto flutuante com 0 casas decimais (financiamento calculado) e %d é um
        // placeholder para um número inteiro (número de projetos). O \n é utilizado
        // para adicionar uma nova linha após a mensagem.

        System.out.printf(
                "O financiamento calculado para %s é: R$ %.0f pelo total de %d projetos.\n\n",
                pesquisadorDoutor.nome,
                financiamentoDoutor,
                pesquisadorDoutor.numeroProjetos);
        System.out.printf(
                "O financiamento calculado para %s é: R$ %.0f pelo total de %d projetos.\n\n",
                pesquisadorMestre.nome,
                financiamentoMestre,
                pesquisadorMestre.numeroProjetos);
    }
}
