package ExercicioUnidade3Aula3;

// Aluno é uma subclasse de Pessoa, herda de Pessoa e implementa o método abstrato apresentar()
public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o(a) aluno(a) " + nome + " e minha matrícula é " + matricula + "." + "\n");
    }
}