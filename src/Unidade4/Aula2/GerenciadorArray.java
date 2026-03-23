package Unidade4.Aula2;

import java.util.ArrayList;

public class GerenciadorArray {
    private int[] array;
    private int tamanho;

    public GerenciadorArray(int capacidade) {
        array = new int[capacidade];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho < array.length) {
            array[tamanho++] = valor;
        }
    }

    public void remover(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                array[i] = array[tamanho - 1];
                tamanho--;
                return;
            }

        }
    }

    public boolean pesquisar(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public void exibir() {

        System.out.println(java.util.Arrays.toString(java.util.Arrays.copyOf(array, tamanho)));
    }

    public static void main(String[] args) {
        GerenciadorArray gerenciador = new GerenciadorArray(10);
        gerenciador.inserir(5);
        gerenciador.inserir(10);
        gerenciador.inserir(15);
        gerenciador.exibir();

        gerenciador.remover(10);
        gerenciador.exibir();

        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(gerenciador.pesquisar(array, 3)); // true
        System.out.println(gerenciador.pesquisar(array, 6)); // false
    }
}
