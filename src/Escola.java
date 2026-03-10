public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Juliana", 1, 12);
        aluno1.setNota(12);

        aluno1.exibirInformacoes();

        System.out.println("\n" + "***************************************" + "\n");

        Avaliacao alunoGrad = new AlunoGraduacao("Juanita", 2, 7);
        Avaliacao alunoPos = new AlunoPosGraduacao("Maria", 3, 7);

        System.out.println("Média de Juanita - aluna de graduação: " +   alunoGrad.calcularMedia()+ "\n");
        System.out.println("Média de Maria - aluna de pós-graduação: " + alunoPos.calcularMedia());

        
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("James", 4, 8);        

        System.out.println("Média de " + alunoGraduacao.getNome() +   " aluna (0) de pós-graduação: " + alunoPos.calcularMedia());
            
        };
    }

