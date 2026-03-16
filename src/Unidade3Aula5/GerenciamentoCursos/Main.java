package Unidade3Aula5.GerenciamentoCursos;

public class Main {
    public static void main(String[] args) {
        // Criando um instrutor com nome, email e área de especialização
        Instrutor instrutor = new Instrutor("Maria Silva", "maria.silva@example.com", "Matemática");

        // Criando um curso com nome do curso, carga horária e o nome do professor
        // (instrutor)
        Curso curso = new Curso("Matemática Avançada", 60, instrutor.getNome());

        // Exibindo informações do curso usando o método exibirInformacoes da classe
        // Curso
        curso.exibirInformacoes();

    }
}
