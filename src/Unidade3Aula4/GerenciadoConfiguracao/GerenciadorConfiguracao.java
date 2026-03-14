package Unidade3Aula4.GerenciadoConfiguracao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GerenciadorConfiguracao {
    public static void main(String[] args) throws IOException {

        Scanner scanner = null;

        try {

            // Tenta abrir o arquivo de configuração

            File arquivoConfig = new File("config.txt");

            scanner = new Scanner(arquivoConfig, StandardCharsets.UTF_8);

            System.out.println("Arquivo de configuração encontrado: \n");

            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine()); // Lê e exibe o conteúdo do arquivo

            }

        } catch (FileNotFoundException e) {

            // Trata a exceção caso o arquivo não exista

            System.out.println("Erro: O arquivo de configuração não foi encontrado.");

        } finally {

            // Finaliza os recursos utilizados

            if (scanner != null) {

                scanner.close();

                System.out.println("Recurso liberado: Scanner fechado.");

            } else {

                System.out.println("Nenhum recurso para fechar.");

            }

        }

    }

}