package Unidade3Aula4.ExcecaoIdade;

// Definindo a classe de exceção personalizada para idade inválida
public class IdadeInvalidaException extends Exception {

    // Construtor que recebe uma mensagem de erro e a passa para a classe pai
    // (Exception)
    public IdadeInvalidaException(String message) {
        super(message);
    }

}
