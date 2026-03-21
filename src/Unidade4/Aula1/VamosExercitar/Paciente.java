package Unidade4.Aula1.VamosExercitar;

class Paciente implements Observer {

    private String nome;

    public Paciente(String nome) {

        setNome(nome);
    }

    @Override
    // Método para receber notificações do agendamento
    public void update(String mensagem) {

        System.out.println(Cores.ROSA + "Paciente " + nome + " recebeu a notificação: " + mensagem + Cores.RESET);

    }

    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do paciente não pode ser vazio.");
        }
        this.nome = nome;
    }
}
