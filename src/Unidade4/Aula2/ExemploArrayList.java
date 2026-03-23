package Unidade4.Aula2;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String[] args) {
        // ArrayList é uma classe da biblioteca Java que implementa a interface List e é
        // usada para armazenar uma coleção de objetos. Ela é baseada em um array
        // dinâmico, o que significa que pode crescer ou diminuir de tamanho conforme
        // necessário. O ArrayList é parte do pacote java.util e oferece métodos para
        // adicionar, remover, acessar e manipular os elementos da lista.
        ArrayList<String> nomes = new ArrayList<>();
        // Para criar um ArrayList, você pode usar a sintaxe ArrayList<Tipo> nomeDaLista
        // = new ArrayList<>();, onde Tipo é o tipo de dados que você deseja armazenar
        // na lista. No exemplo acima, estamos criando um ArrayList de Strings chamado
        // nomes.
        nomes.add("João");

        nomes.add("Maria");

        nomes.add("Carlos");
        // O método add() é usado para adicionar elementos ao ArrayList. No exemplo
        // acima, estamos adicionando os nomes "João", "Maria" e "Carlos" à lista.
        for (String nome : nomes) {

            System.out.println(nome + "\n");

        }

    }

}