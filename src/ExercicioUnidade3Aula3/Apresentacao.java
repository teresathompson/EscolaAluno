package ExercicioUnidade3Aula3;

public class Apresentacao {
    public static void main(String[] args) {

        // Exibe uma mensagem de apresentação para o aluno utilizando herança e
        // polimorfismo

        System.out.println("Apresentação de Aluno utilizando herança e polimorfismo:\n");

        System.out.println("           __________________");
        System.out.println("          /                  \\");
        System.out.println("         /__________________ \\");
        System.out.println("        |  []   []   []   [] |");
        System.out.println("        |                    |");
        System.out.println("        |  []   []   []   [] |");
        System.out.println("        |                    |");
        System.out.println("        |        ____        |");
        System.out.println("        |       |    |       |");
        System.out.println("        |       |____|       |");
        System.out.println("        |____________________|" + "\n");

        // Criando um objeto do tipo Aluno e chamando o método apresentar() para exibir
        // as informações do aluno
        Aluno aluno1 = new Aluno("Lais", 1234);
        // Chamando o método apresentar() para exibir as informações do aluno
        aluno1.apresentar();
    }

}
