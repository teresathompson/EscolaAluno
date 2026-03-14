package Unidade3Aula4;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LeituraArquivo {

    public static void main(String[] args) throws IOException {

        Scanner scanner = null;

        try {
            // Criando um objeto File para representar o arquivo a ser lido

            // Using relative path to access arquivo.txt in the parent src directory

            File arquivo = new File("arquivo.txt");

            // Criando um Scanner para ler o conteúdo do arquivo, especificando o charset
            // UTF-8
            // evitando problemas de codificação, especialmente em sistemas operacionais que
            // não usam UTF-8 por padrão

            scanner = new Scanner(arquivo, StandardCharsets.UTF_8);

            // Lendo o conteúdo do arquivo linha por linha e exibindo no console
            while (scanner.hasNextLine()) {
                // Exibe a linha lida do arquivo
                System.out.println(scanner.nextLine());

            }

        } catch (FileNotFoundException e) {

            System.out.println("Erro: O arquivo não foi encontrado.");

        } finally {

            if (scanner != null) {

                scanner.close();

                System.out.println("Scanner fechado.");

            }

        }

    }

}