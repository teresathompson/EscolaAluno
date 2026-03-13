package VamosExercitarUnidade3Aula3;

public abstract class Pesquisador {

    protected String nome;

    protected String areaPesquisa;

    protected int numeroProjetos;

    public Pesquisador(String nome, String areaPesquisa, int numeroProjetos) {

        this.nome = nome;

        this.areaPesquisa = areaPesquisa;

        this.numeroProjetos = numeroProjetos;

    }

    // Método abstrato

    public abstract double calcularFinanciamento();
}
