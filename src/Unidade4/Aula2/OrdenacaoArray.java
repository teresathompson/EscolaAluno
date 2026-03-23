package Unidade4.Aula2;

import java.util.Arrays;
import java.util.Collections;

public class OrdenacaoArray {
    public static void main(String[] args) {
        int[] numeros = { 40, 10, 20, 30, 50 };
        Arrays.sort(numeros);

        System.out.println("Os numeros ordenados são: \n");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // inverter o array para ordem decrescente
        // para inverter o array, podemos usar um loop para trocar os elementos
        for (int i = 0; i < numeros.length / 2; i++) {
            // trocar o elemento na posição i com o elemento na posição numeros.length - 1 -
            // i que é o elemento correspondente do outro lado do array
            int temp = numeros[i];
            // numeros.length - 1 - i é a posição do elemento correspondente do outro lado
            // do array que deve ser trocado com o elemento na posição i do array que é
            // armazenado na variável temp
            numeros[i] = numeros[numeros.length - 1 - i];
            // agora o elemento na posição i é o elemento do outro lado do array, e o
            // elemento do outro lado do array é o elemento original na posição i que foi
            // armazenado na variável temp e agora é colocado na posição do outro lado do
            // array
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("Ordem decrescente: \n");
        for (int numero : numeros) {
            System.out.println(numero + "\n");
        }

        String[] palavras = { "banana", "abacaxi", "laranja", "uva", "maçã" };
        Arrays.sort(palavras);

        System.out.println("As palavras ordenadas são: \n");
        for (String palavra : palavras) {
            System.out.println(palavra + "\n");
        }

        // inverter o array para ordem decrescente
        for (int i = 0; i < palavras.length / 2; i++) {
            String temp = palavras[i];
            palavras[i] = palavras[palavras.length - 1 - i];
            palavras[palavras.length - 1 - i] = temp;
        }
        // ou podemos usar o método sort da classe Arrays com o comparador
        // Collections.reverseOrder() para ordenar em ordem decrescente

        Arrays.sort(palavras, Collections.reverseOrder());

        System.out.println("Ordem decrescente: \n");
        for (String palavra : palavras) {
            System.out.println(palavra + "\n");
        }

    }
}
