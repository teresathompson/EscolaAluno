package Unidade3Aula5.GerenciamentoCursos;

public class Instrutor {
    // Constantes para formatação de texto em vermelho e resetar a formatação
    private static final String VERMELHO = "\u001B[31m";
    private static final String RESET = "\u001B[0m";

    // Atributos do instrutor, como nome, email e área de especialização
    private String nome;
    private String email;
    private String areaEspecializacao;

    // Construtor da classe Instrutor que recebe nome, email e área de
    // especialização como parâmetros
    public Instrutor(String nome, String email, String areaEspecializacao) {
        // Chama os métodos set para validar e inicializar os atributos do instrutor
        setNome(nome);
        setEmail(email);
        setAreaEspecializacao(areaEspecializacao);
    }

    // Métodos getters para acessar os atributos do instrutor, como nome, email e
    // área de especialização
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    // Métodos setters para validar e definir os atributos do instrutor, como nome,
    // email e área de especialização, adicionando validação para garantir que os
    // valores fornecidos sejam válidos e não nulos ou vazios
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException(VERMELHO + "O nome não pode ser nulo ou vazio." + RESET);
        }
        this.nome = nome;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException(
                    VERMELHO + "O email não pode ser nulo ou vazio: " + email + "'" + RESET);
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException(
                    VERMELHO + "O email deve ser válido e conter '@': Você forneceu '" + email + "'" + RESET);
        }
        this.email = email;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        if (areaEspecializacao == null || areaEspecializacao.isEmpty()) {
            throw new IllegalArgumentException(
                    VERMELHO + "A área de especialização não pode ser nula ou vazia." + RESET);
        }
        this.areaEspecializacao = areaEspecializacao;
    }
}
