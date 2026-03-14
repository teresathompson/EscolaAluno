package Unidade3Aula4.ExcecaoLogin;

public class SistemaLogin {
    public static void autenticar(String usuario, String senha) throws LoginInvalidoException {
        // Simulando um processo de autenticação
        if (!usuario.equals("admin") || !senha.equals("1234")) {
            // Lançando a exceção personalizada para login inválido
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }
        // Se o login for bem-sucedido, podemos exibir uma mensagem de sucesso
        System.out.println("Login bem-sucedido!");

    }
}
