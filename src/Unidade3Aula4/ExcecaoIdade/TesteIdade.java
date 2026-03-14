package Unidade3Aula4.ExcecaoIdade;

public class TesteIdade {
    public static void main(String[] args) {
        try {
            ValidaIdade.validarIdade(150); // Idade inválida
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
