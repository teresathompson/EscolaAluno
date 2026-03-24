package Unidade4.Aula3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravacaoArquivo {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saida.txt"))) {

            bw.write("Primeira linha. Teste de gravação em arquivo.");

            bw.newLine();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}