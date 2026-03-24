package Unidade4.Aula3;

public class Main {

    public static void main(String[] args) {
        // ArrayList é uma classe que implementa a interface List, e é usada para
        // armazenar uma coleção de objetos. Ela é dinâmica, ou seja, pode crescer ou
        // diminuir de tamanho conforme necessário. O ArrayList é baseado em um array,
        // mas oferece métodos adicionais para manipulação de elementos, como adicionar,
        // remover e acessar elementos.
        System.out.println("ArrayList de nomes:\n");
        // Criando uma instância de ListaNomes
        ListaNomes lista = new ListaNomes();
        // Adicionando nomes à lista
        lista.addNome("Alice");
        lista.addNome("Bob");
        lista.addNome("Charlie");
        // Imprimindo a lista de nomes
        System.out.println("Lista após nomes adicionados:\n");
        // Imprime a lista de nomes usando o método imprimirLista da classe ListaNomes
        lista.imprimirLista();
        // Removendo um nome da lista usando o método removerNome da classe ListaNomes
        lista.removerNome("Alice");

        System.out.println("\nLista após nomes removidos:\n");
        // Imprime a lista de nomes novamente para mostrar a atualização após a remoção
        lista.imprimirLista();
    }
}
