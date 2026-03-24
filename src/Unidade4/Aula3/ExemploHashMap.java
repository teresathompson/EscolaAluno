package Unidade4.Aula3;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> alunos = new HashMap<>();
        alunos.put(1, "Alice");
        alunos.put(2, "Bob");
        alunos.put(3, "Charlie");
        alunos.put(4, "Diana");

        for (int chave : alunos.keySet()) {
            System.out.println("ID: " + chave + " - Nome: " + alunos.get(chave));
        }

    }
}
