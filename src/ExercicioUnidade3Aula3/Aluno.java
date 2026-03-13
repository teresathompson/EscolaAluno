package ExercicioUnidade3Aula3;

// Aluno é uma subclasse de Pessoa, herda de Pessoa e implementa o método abstrato apresentar()
public class Aluno extends Pessoa {

    // Atributo específico da classe Aluno

    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    // Sobrescreve o método apresentar() da classe Pessoa para fornecer uma
    // implementação específica para Aluno
    @Override
    public void apresentar() {
        // Exibe as informações do aluno, incluindo o nome e a matrícula
        System.out.println("Olá, eu sou o(a) aluno(a) " + nome + " e minha matrícula é " + matricula + "." + "\n");
    }
}