package Unidade4.Aula1.VamosExercitar;

import java.util.ArrayList;
import java.util.List;

// Classe Subject
public class Agendamento {
    private String data;

    private String horario;

    private String medico;

    private String paciente;

    private List<Observer> observadores = new ArrayList<>();

    // Método para adicionar um observador
    public void adicionarObserver(Observer observer) {

        observadores.add(observer);

    }

    // Método para remover um observador
    public void removerObserver(Observer observer) {

        observadores.remove(observer);

    }

    // Método para notificar os observadores sobre um novo agendamento
    public void notificarObservers() {

        for (Observer observer : observadores) {

            observer.update(
                    "Novo agendamento: " + paciente + " com o médico " + medico + " no dia " + data + " às " + horario);

        }

    }

    // Método para agendar consulta e notificar os observadores

    public void agendarConsulta(String paciente, String medico, String data, String horario) {

        setPaciente(paciente);

        setMedico(medico);

        setData(data);

        setHorario(horario);

        notificarObservers();

    }

    // Getters e Setters com validação
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do paciente não pode ser vazio.");
        }
        this.paciente = nome;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do médico não pode ser vazio.");
        }
        this.medico = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("A data não pode ser vazia.");
        }
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        if (horario == null || horario.isEmpty()) {
            throw new IllegalArgumentException("O horário não pode ser vazio.");
        }
        this.horario = horario;
    }

}