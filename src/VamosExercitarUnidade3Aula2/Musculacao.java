package VamosExercitarUnidade3Aula2;

public class Musculacao implements Atividade {
    @Override
    public void iniciarAtividade() {
        System.out.println("Sessão de musculação iniciada. Prepare os equipamentos." + "\n");
    }

    @Override
    public void finalizarAtividade() {
        System.out.println("Sessão de musculação finalizada. Organize os equipamentos." + "\n");
    }

}
