package Unidade4.Aula3;

import java.util.ArrayList;

class ListaNomes {
    // Atributo privado que armazena a lista de nomes usando a classe ArrayList
    private ArrayList<String> nomes;

    // Construtor da classe ListaNomes que inicializa a lista de nomes como um
    // ArrayList vazio
    public ListaNomes() {
        // Inicializa a lista de nomes como um ArrayList vazio
        this.nomes = new ArrayList<>();
    }

    // Método público para adicionar um nome à lista de nomes que recebe uma string
    // como parâmetro
    public void addNome(String nome) {
        // Adiciona um nome à lista
        this.nomes.add(nome);
        // Imprime uma mensagem indicando que o nome foi adicionado
        System.out.println("Adicionado: " + nome + "\n");
    }

    // Método público para remover um nome da lista de nomes que recebe uma string
    // como parâmetro e remove o nome da lista usando o método remove da classe
    // ArrayList
    public void removerNome(String nome) {
        this.nomes.remove(nome);

        System.out.println("Removido: " + nome + "\n");
    }

    // Método público para imprimir a lista de nomes usando um loop for-each para
    // iterar sobre a lista de nomes e imprimir cada nome na tela usando o método
    // println da classe System
    public void imprimirLista() {
        // Imprime uma mensagem indicando que a lista de nomes está sendo exibida
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}