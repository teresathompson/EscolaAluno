package Unidade4.Aula3;

import java.util.LinkedList;

import java.util.Queue;

// A classe ExemploQueue demonstra o uso da interface Queue em Java, que é uma estrutura de dados que segue a ordem FIFO (First In, First Out). 

public class ExemploQueue {

    public static void main(String[] args) {

        // Criando uma fila usando LinkedList, que é uma implementação da interface
        // Queue em Java. A fila é usada para armazenar pedidos, onde o primeiro pedido
        // adicionado será o primeiro a ser processado.

        Queue<String> fila = new LinkedList<>();

        // Adicionando pedidos à fila usando o método add da interface Queue. Cada
        // pedido é representado como uma string.

        fila.add("Pedido 1");

        fila.add("Pedido 2");

        fila.add("Pedido 3");

        // Processando os pedidos na fila usando um loop while que continua enquanto a
        // fila não estiver vazia. O método poll é usado para remover e retornar o
        // próximo pedido da fila, seguindo a ordem FIFO. Cada pedido processado é
        // impresso na tela.

        while (!fila.isEmpty()) {

            System.out.println("Processando: " + fila.poll());

        }

    }

}
