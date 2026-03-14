package Unidade3Aula4.ExcecaoIdade;

// Classe responsável por validar a idade e lançar uma exceção personalizada
public class ValidaIdade {
    // Método estático para validar a idade, lançando uma IdadeInvalidaException se
    // a idade for inválida
    public static void validarIdade(int idade) throws IdadeInvalidaException {
        // Verifica se a idade é menor que 0 ou maior que 120, o que é considerado
        // inválido
        if (idade < 0 || idade > 120) {
            // Lança uma IdadeInvalidaException com uma mensagem de erro personalizada
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
    }

}
