package Unidade4.Aula2;

import java.util.Scanner;

public class GerenciamentoNotas {

    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Criar um array para armazenar as notas dos alunos
        double[] notas = new double[5];
        // Inserir notas dos alunos
        inserirNotas(scanner, notas);
        // Atualizar nota de um aluno específico
        atualizarNota(scanner, notas);
        // Calcular e exibir resultados (média, maior e menor nota)
        exibirResultados(notas);
        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Método para inserir notas dos alunos com validação
    public static void inserirNotas(Scanner scanner, double[] notas) {
        // Solicitar ao usuário que insira as notas dos alunos, garantindo que sejam
        // válidas (entre 0 e 10)
        System.out.println("Insira as notas dos alunos: \n");
        // O método lerNotaValida é chamado para cada aluno, garantindo que a nota
        // inserida seja válida antes de armazená-la no array de notas.
        for (int i = 0; i < notas.length; i++) {
            // O método lerNotaValida é chamado para cada aluno, garantindo que a nota
            // inserida seja válida antes de armazená-la no array de notas.
            notas[i] = lerNotaValida(scanner, i + 1);
        }
    }

    // Método para atualizar nota de um aluno específico
    public static void atualizarNota(Scanner scanner, double[] notas) {
        // Solicitar ao usuário que insira o índice do aluno para atualizar a nota,
        // garantindo que o índice seja válido (entre 1 e o número de alunos)
        System.out.print("\nDigite o índice do aluno para atualizar (1 a " + notas.length + "): \n");
        // O índice do aluno é lido do usuário e ajustado para corresponder ao índice do
        // array (subtraindo 1, já que os índices do array começam em 0). Em seguida, o
        // método lerNotaValida é chamado para obter a nova nota do aluno, garantindo
        // que seja válida antes de atualizar o array de notas.
        int indice = scanner.nextInt() - 1;
        // O índice do aluno é lido do usuário e ajustado para corresponder ao índice do
        // array (subtraindo 1, já que os índices do array começam em 0). Em seguida, o
        // método lerNotaValida é chamado para obter a nova nota do aluno, garantindo
        // que seja válida antes de atualizar o array de notas.
        if (indice >= 0 && indice < notas.length) {
            // O índice do aluno é lido do usuário e ajustado para corresponder ao índice do
            // array (subtraindo 1, já que os índices do array começam em 0). Em seguida, o
            // método lerNotaValida é chamado para obter a nova nota do aluno, garantindo
            // que seja válida antes de atualizar o array de notas.
            notas[indice] = lerNotaValida(scanner, indice + 1);
        } else {
            // Se o índice for inválido, uma mensagem de erro é exibida.
            System.out.println("Índice inválido!");
        }
    }

    // Método para calcular e exibir resultados (média, maior e menor nota)
    public static void exibirResultados(double[] notas) {
        // O método exibirResultados calcula a soma das notas, bem como a maior e menor
        // nota, iterando sobre o array de notas. Em seguida, a média é calculada
        // dividindo a soma pelo número de alunos, e os resultados são exibidos
        // formatados com duas casas decimais.
        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];
        // O método exibirResultados calcula a soma das notas, bem como a maior e menor
        // nota, iterando sobre o array de notas. Em seguida, a média é calculada
        // dividindo a soma pelo número de alunos, e os resultados são exibidos
        // formatados com duas casas decimais.
        for (double nota : notas) {
            soma += nota;
            // O método exibirResultados calcula a soma das notas, bem como a maior e menor
            // nota, iterando sobre o array de notas. Em seguida, a média é calculada
            // dividindo a soma pelo número de alunos, e os resultados são exibidos
            // formatados com duas casas decimais.
            if (nota > maior)
                maior = nota;
            if (nota < menor)
                menor = nota;
        }
        // O método exibirResultados calcula a soma das notas, bem como a maior e menor
        // nota, iterando sobre o array de notas. Em seguida, a média é calculada
        double media = soma / notas.length;
        // O método exibirResultados calcula a soma das notas, bem como a maior e menor
        // nota, iterando sobre o array de notas. Em seguida, a média é calculada
        // dividindo a soma pelo número de alunos, e os resultados são exibidos
        // formatados com duas casas decimais.
        System.out.printf("\nMédia da turma: %.2f\n", media);
        System.out.printf("Maior nota: %.2f\n", maior);
        System.out.printf("Menor nota: %.2f\n", menor);
    }

    // Método para validar nota (0 a 10) e ler do usuário
    public static double lerNotaValida(Scanner scanner, int aluno) {
        // O método lerNotaValida é responsável por solicitar ao usuário que insira uma
        // nota para um aluno específico, garantindo que a nota seja válida (entre 0 e
        // 10). Ele utiliza um loop para continuar solicitando a nota até que uma
        // entrada válida seja fornecida. Se a nota for inválida, uma mensagem de erro é
        // exibida, e o processo se repete até que uma nota válida seja inserida.
        double nota;
        // O método lerNotaValida é responsável por solicitar ao usuário que insira uma
        // nota para um aluno específico, garantindo que a nota seja válida (entre 0 e
        // 10). Ele utiliza um loop para continuar solicitando a nota até que uma
        // entrada válida seja fornecida. Se a nota for inválida, uma mensagem de erro é
        // exibida, e o processo se repete até que uma nota válida seja inserida.
        while (true) {
            // O método lerNotaValida é responsável por solicitar ao usuário que insira uma
            // nota para um aluno específico, garantindo que a nota seja válida (entre 0 e
            // 10). Ele utiliza um loop para continuar solicitando a nota até que uma
            // entrada válida seja fornecida. Se a nota for inválida, uma mensagem de erro é
            // exibida, e o processo se repete até que uma nota válida seja inserida.
            System.out.print("Nota do aluno " + aluno + ": ");
            // O método lerNotaValida é responsável por solicitar ao usuário que insira uma
            // nota para um aluno específico, garantindo que a nota seja válida (entre 0 e
            // 10). Ele utiliza um loop para continuar solicitando a nota até que uma
            // entrada válida seja fornecida. Se a nota for inválida, uma mensagem de erro é
            // exibida, e o processo se repete até que uma nota válida seja inserida.
            nota = scanner.nextDouble();
            // O método lerNotaValida é responsável por solicitar ao usuário que insira uma
            // nota para um aluno específico, garantindo que a nota seja válida (entre 0 e
            // 10). Ele utiliza um loop para continuar solicitando a nota até que uma
            // entrada válida seja fornecida. Se a nota for inválida, uma mensagem de erro é
            // exibida, e o processo se repete até que uma nota válida seja inserida.
            if (nota >= 0 && nota <= 10) {
                break;
            } else {
                System.out.println("❌ Nota inválida! Digite um valor entre 0 e 10.");
            }
        }
        // O método lerNotaValida é responsável por solicitar ao usuário que insira uma
        // nota para um aluno específico, garantindo que a nota seja válida (entre 0 e
        // 10). Ele utiliza um loop para continuar solicitando a nota até que uma
        // entrada válida seja fornecida. Se a nota for inválida, uma mensagem de erro é
        // exibida, e o processo se repete até que uma nota válida seja inserida.
        return nota;
    }
}