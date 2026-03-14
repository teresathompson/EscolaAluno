package Unidade3Aula4;

public class TratamentoExcecao {

    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        int a = 10;

        int b = 0;

        try {
            // Tenta realizar uma operação que pode lançar uma exceção (divisão por zero)
            int resultado = a / b; // Tenta realizar a operação

            // Se a operação for bem-sucedida, exibe o resultado
            System.out.println("Resultado: " + resultado + "\n");

        } catch (ArithmeticException e) {

            // Captura a exceção específica de divisão por zero e exibe uma mensagem de erro
            System.out.println("\n" + RED + "Erro: Divisão por zero não é permitida." + RESET + "\n");

        }

    }
}
