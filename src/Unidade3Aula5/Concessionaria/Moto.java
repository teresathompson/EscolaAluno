package Unidade3Aula5.Concessionaria;

public class Moto extends Veiculo {
    // Construtor da classe Moto que recebe marca e modelo como parâmetros
    public Moto(String marca, String modelo) {
        // Chama o construtor da classe pai (Veiculo) para inicializar marca e modelo
        super(marca, modelo);
    }

    // Sobrescreve o método dirigir da classe Veiculo para fornecer uma
    // implementação específica para a classe Moto
    @Override
    public void dirigir() {
        // Implementação do método dirigir para a classe Moto
        System.out.println("Dirigindo a moto " + marca + " " + modelo + "\n");
    }

}
