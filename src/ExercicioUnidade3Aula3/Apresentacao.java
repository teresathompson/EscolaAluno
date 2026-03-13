package ExercicioUnidade3Aula3;

public class Apresentacao {
    public static void main(String[] args) {
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

        Aluno aluno1 = new Aluno("Lais", 1234);
        aluno1.apresentar();
    }

}
