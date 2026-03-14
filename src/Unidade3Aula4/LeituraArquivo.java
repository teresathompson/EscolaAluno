package Unidade3Aula4;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class LeituraArquivo {

    public static void main(String[] args) {

        Scanner scanner = null;

        try {
            // Criando um objeto File para representar o arquivo a ser lido

            // Using relative path to access arquivo.txt in the parent src directory

            File arquivo = new File("arquivo.txt");

            // Criando um objeto Scanner para ler o conteúdo do arquivo
            scanner = new Scanner(arquivo);

            // Lendo o conteúdo do arquivo linha por linha e exibindo no console
            while (scanner.hasNextLine()) {
                // Exibe a linha lida do arquivo
                System.out.println(scanner.nextLine());

            }

        } catch (FileNotFoundException e) {

            System.out.println("Erro: O arquivo não foi encontrado.");
            System.out.println(new File("arquivo.txt").getAbsolutePath());

        } finally {

            if (scanner != null) {

                scanner.close();

                System.out.println("Scanner fechado.");

            }

        }

    }

}