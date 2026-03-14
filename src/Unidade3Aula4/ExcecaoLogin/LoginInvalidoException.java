package Unidade3Aula4.ExcecaoLogin;

// Definindo a classe de exceção personalizada para login inválido
public class LoginInvalidoException extends Exception {
    // Construtor que recebe uma mensagem de erro e a passa para a classe pai //
    // (Exception)
    public LoginInvalidoException(String message) {
        // Chama o construtor da classe pai (Exception) para inicializar a mensagem de
        // erro
        super(message);
    }

}
