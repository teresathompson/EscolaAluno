package Unidade3Aula4.ExcecaoLogin;

public class TesteLogin {
    public static void main(String[] args) {
        try {
            SistemaLogin.autenticar("user", "wrongpassword"); // Login inválido
        } catch (LoginInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
