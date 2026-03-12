package VamosExercitarUnidade3Aula2;

public class SistemaAcademia {
    public static void main(String[] args) {
        Atividade musculacao = new Musculacao();
        Atividade yoga = new Yoga();

        System.out.println("Musculação:" + "\n");

        musculacao.iniciarAtividade();
        musculacao.finalizarAtividade();

        System.out.println("************************" + "\n");
        System.out.println("Yoga:" + "\n");

        yoga.iniciarAtividade();
        yoga.finalizarAtividade();
    }
}
