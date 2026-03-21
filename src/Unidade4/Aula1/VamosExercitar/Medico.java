package Unidade4.Aula1.VamosExercitar;

class Medico implements Observer {

    private String nome;

    public Medico(String nome) {

        setNome(nome);

    }

    @Override

    public void update(String mensagem) {

        System.out.println(Cores.VERDE + "Médico " + nome + " recebeu a notificação: " + mensagem + Cores.RESET);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do médico não pode ser vazio.");
        }
        this.nome = nome;
    }

}