package Unidade3Aula5.GerenciamentoCursos;

public class Curso {
    // Cores para mensagens de erro
    private static final String VERMELHO = "\u001B[31m";
    private static final String RESET = "\u001B[0m";

    // Atributos do curso, como nome do curso, carga horária e nome do professor
    private String curso;
    private int cargaHoraria;
    private String nomeProfessor;

    // Construtor da classe Curso que recebe nome do curso, carga horária e nome do
    // professor como parâmetros, e chama os métodos set para validar e inicializar
    // os atributos do curso
    public Curso(String curso, int cargaHoraria, String nomeProfessor) {
        setCurso(curso);
        setCargaHoraria(cargaHoraria);
        setNomeProfessor(nomeProfessor);
    }

    // Métodos getters para acessar os atributos do curso, como nome do curso, carga
    // horária e nome do professor
    public String getCurso() {
        return curso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    // Métodos setters para validar e definir os atributos do curso, como nome do
    // curso, carga horária e nome do professor
    public void setCurso(String curso) {
        if (curso == null || curso.trim().isEmpty()) {
            throw new IllegalArgumentException(VERMELHO + "O nome do curso não pode ser nulo ou vazio." + RESET);
        }
        this.curso = curso;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException(VERMELHO + "A carga horária deve ser maior que zero." + RESET);
        }
        this.cargaHoraria = cargaHoraria;
    }

    public void setNomeProfessor(String nomeProfessor) {
        if (nomeProfessor == null || nomeProfessor.isEmpty()) {
            throw new IllegalArgumentException(VERMELHO + "O nome do professor não pode ser nulo ou vazio." + RESET);
        }
        this.nomeProfessor = nomeProfessor;
    }

    // Método para exibir informações do curso, como nome do curso, carga horária e
    // nome do professor
    public void exibirInformacoes() {
        System.out.println("Curso: " + curso);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Professor: " + nomeProfessor);
    }

}
