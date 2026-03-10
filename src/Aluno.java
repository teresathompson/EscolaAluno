class Aluno {
    
    private String nome;
    private int matricula;
    private double nota;

    //cor vermelha para mensagem de erro usada no método setNota

    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public Aluno(String nome, int matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota >= 0 && nota <= 10){
           this.nota = nota;
        }
        else{
            System.out.println("");
            System.out.println(RED + "Nota inválida! Deve estar entre 0 e 10." + RESET);
            System.out.println("");
        }
        
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }

}
