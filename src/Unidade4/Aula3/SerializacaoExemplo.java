package Unidade4.Aula3;

import java.io.*;

class Pessoa implements Serializable {

    private String nome;

    private int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;

        this.idade = idade;

    }

    @Override

    public String toString() {

        return nome + ", " + idade + " anos";

    }

}

public class SerializacaoExemplo {

    public static void main(String[] args) {
        // Primeiro, vamos criar um objeto da classe Pessoa e gravá-lo em um arquivo
        // usando a serialização. O objeto será convertido em uma sequência de bytes e
        // armazenado no arquivo "pessoa.dat".
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.dat"))) {
            // Criando um objeto da classe Pessoa com nome "Ana" e idade 25.
            Pessoa p = new Pessoa("Ana", 25);
            // Escreve o objeto Pessoa no arquivo "pessoa.dat" usando o método writeObject
            // do ObjectOutputStream.
            oos.writeObject(p);
            // Imprime uma mensagem indicando que o objeto foi gravado com sucesso.
            System.out.println("Objeto gravado com sucesso!");
        } catch (IOException e) {
            // Se ocorrer uma exceção de entrada/saída durante a gravação do objeto, a pilha
            // de erros será impressa usando o método printStackTrace do objeto de exceção.
            e.printStackTrace();

        }
        // Agora vamos ler o objeto do arquivo e exibir seus dados na tela
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.dat"))) {
            // Lê o objeto do arquivo "pessoa.dat" usando o método readObject do
            // ObjectInputStream
            Pessoa p = (Pessoa) ois.readObject();
            // Imprime os dados do objeto Pessoa lido do arquivo usando o método toString da
            // classe Pessoa, que retorna uma string formatada com o nome e a idade da
            // pessoa.
            System.out.println("Dados: " + p);
            // Se ocorrer uma exceção de entrada/saída ou se a classe do objeto lido não for
            // encontrada durante a leitura do objeto, a pilha de erros será impressa usando
            // o método printStackTrace do objeto de exceção.
        } catch (IOException | ClassNotFoundException e) {
            // Se ocorrer uma exceção de entrada/saída ou se a classe do objeto lido não for
            // encontrada durante a leitura do objeto, a pilha de erros será impressa usando
            // o método printStackTrace do objeto de exceção.
            e.printStackTrace();

        }

    }

}
