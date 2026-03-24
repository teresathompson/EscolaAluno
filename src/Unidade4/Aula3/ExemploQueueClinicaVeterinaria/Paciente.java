package Unidade4.Aula3.ExemploQueueClinicaVeterinaria;

public class Paciente {
    String nome;
    String especie;
    int prioridade; // 1 = emergência, 2 = normal
    int ordemChegada;
    String descricaoPrioridadeAtendimento;

    public Paciente(String nome, String especie, int prioridade, int ordemChegada,
            String descricaoPrioridadeAtendimento) {
        this.nome = nome;
        this.especie = especie;
        this.prioridade = prioridade;
        this.ordemChegada = ordemChegada;
        this.descricaoPrioridadeAtendimento = descricaoPrioridadeAtendimento;
    }

    @Override
    public String toString() {
        return nome + " (" + especie + ") - Prioridade: " + prioridade + " - Ordem de chegada: " + ordemChegada
                + " - Descrição: " + descricaoPrioridadeAtendimento;
    }
}
