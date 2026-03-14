package ExercicioUnidade3Aula3;

// Aluno é uma subclasse de Pessoa, herda de Pessoa e implementa o método abstrato apresentar()
public class Aluno extends Pessoa {

    // Atributo específico da classe Aluno

    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        super(nome);
        this.matricula = matricula;
        setNota(nota);
    }

    public void setNota(double nota) {
        try {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Nota deve ser entre 0 e 10.");
            }
            this.nota = nota;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage() + "\n");

        } finally {
            System.out.println("Operação finalizada." + "\n");
        }

    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota + "\n");
    }

    // Sobrescreve o método apresentar() da classe Pessoa para fornecer uma
    // implementação específica para Aluno
    @Override
    public void apresentar() {
        // Exibe as informações do aluno, incluindo o nome, a matrícula e a nota
        System.out.println("Olá, eu sou o(a) aluno(a) " + nome + ", minha matrícula é " + matricula + " e minha nota é "
                + nota + "." + "\n");
    }
}