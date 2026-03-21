package Unidade4.Aula1.VamosExercitar;

public class SistemaClinica {

    public static void main(String[] args) {

        // Criando o objeto Agendamento

        Agendamento agendamento = new Agendamento();

        // Criando pacientes e médicos (observadores)

        Paciente paciente1 = new Paciente("João Silva");

        Medico medico1 = new Medico("Dr. Pedro");

        // Adicionando observadores

        agendamento.adicionarObserver(paciente1);

        agendamento.adicionarObserver(medico1);

        // Agendando consulta

        agendamento.agendarConsulta("João Silva", "Dr. Pedro", "10/12/2024", "14:00");

        // Criando outro paciente para notificar

        Paciente paciente2 = new Paciente("Maria Oliveira");

        agendamento.adicionarObserver(paciente2);

        // Agendando nova consulta

        agendamento.agendarConsulta("Maria Oliveira", "Dr. Pedro", "11/12/2024", "09:00");

    }

}