package VamosExercitarUnidade3Aula2;

public class Yoga implements Atividade {
    @Override
    public void iniciarAtividade() {
        System.out.println("Aula de yoga iniciada. Concentre-se na respiração." + "\n");
    }

    @Override
    public void finalizarAtividade() {
        System.out.println("Aula de yoga finalizada. Relaxe e hidrate-se." + "\n");
    }

}
