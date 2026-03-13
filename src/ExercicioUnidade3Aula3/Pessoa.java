package ExercicioUnidade3Aula3;

// Pessoa é uma classe abstrata, não pode ser instanciada diretamente, e possui um método abstrato apresentar()

public abstract class Pessoa {
    protected String nome;

    // Construtor para inicializar o nome da pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void apresentar();

}