package Unidade4.Aula3.ExemploQueueClinicaVeterinaria;

import java.util.LinkedList;
import java.util.Queue;

import java.util.*;

public class ClinicaVeterinariaQueue {

    public static void main(String[] args) {

        Queue<Paciente> fila = new LinkedList<>();

        fila.add(new Paciente("Rex", "Cachorro", 2, 1, "Vacina"));
        fila.add(new Paciente("Mimi", "Gato", 2, 2, "Corte na pata"));
        fila.add(new Paciente("Thor", "Cachorro", 1, 3, "Mordida no pescoço, emergência"));
        fila.add(new Paciente("Luna", "Coelho", 2, 4, "Vermifugação"));

        System.out.println("Fila na ORDEM REAL DE ATENDIMENTO priorizada:\n");

        // Copia para lista para ordenar
        List<Paciente> listaOrdenada = new ArrayList<>(fila);

        // Ordena por prioridade e depois por ordem de chegada
        listaOrdenada.sort((p1, p2) -> {
            if (p1.prioridade != p2.prioridade) {
                return Integer.compare(p1.prioridade, p2.prioridade); // menor prioridade = primeiro
            }
            return Integer.compare(p1.ordemChegada, p2.ordemChegada);
        });

        // Imprime na ordem correta
        int posicao = 1;
        for (Paciente p : listaOrdenada) {
            System.out.println(posicao + "º - " + p);
            posicao++;
        }

        System.out.println("\nAtendimentos sem ordenar prioridade, apenas triagem:\n");

        // Continua usando a fila normal
        while (!fila.isEmpty()) {
            Paciente pacienteAtual = fila.poll();

            if (pacienteAtual.prioridade == 1) {
                System.out.println(
                        pacienteAtual.ordemChegada + "º - EMERGENCIA! Atendendo imediatamente: " + pacienteAtual);
            } else {
                System.out.println(pacienteAtual.ordemChegada + "º - Atendendo: " + pacienteAtual);
            }
        }

    }
}