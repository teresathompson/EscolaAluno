package Unidade4.Aula3;

import java.util.HashSet;

//serve para armazenar elementos únicos, ou seja, não permite duplicatas. Ele é baseado em uma tabela hash, o que proporciona uma busca rápida e eficiente. 
// O HashSet é útil quando você precisa garantir que não haja elementos repetidos em uma coleção, como por exemplo, para armazenar um conjunto de palavras ou números sem repetições.

public class ExemploHashSet {

    public static void main(String[] args) {

        HashSet<String> linguagens = new HashSet<>();

        linguagens.add("Java");

        linguagens.add("Python");

        linguagens.add("Java"); // Não será adicionado novamente

        for (String linguagem : linguagens) {

            System.out.println(linguagem);

        }

    }

}