package Unidade4.Aula3;

public class Main {

    public static void main(String[] args) {

        System.out.println("ArrayList de nomes:\n");

        ListaNomes lista = new ListaNomes();

        lista.addNome("Alice");
        lista.addNome("Bob");
        lista.addNome("Charlie");

        System.out.println("Lista após nomes adicionados:\n");
        lista.imprimirLista();

        lista.removerNome("Alice");

        System.out.println("\nLista após nomes removidos:\n");
        lista.imprimirLista();
    }
}
