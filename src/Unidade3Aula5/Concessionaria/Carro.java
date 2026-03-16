package Unidade3Aula5.Concessionaria;

// A classe Carro é uma subclasse da classe Veiculo, o que significa que ela herda os atributos e métodos da classe Veiculo
public class Carro extends Veiculo {
    // Construtor da classe Carro que recebe marca e modelo como parâmetros

    public Carro(String marca, String modelo) {
        // Chama o construtor da classe pai (Veiculo) para inicializar marca e modelo
        super(marca, modelo);
    }

    // Sobrescreve o método dirigir da classe Veiculo para fornecer uma
    // implementação específica para a classe Carro
    @Override
    public void dirigir() {
        // Implementação do método dirigir para a classe Carro
        System.out.println("Dirigindo o carro " + marca + " " + modelo + "\n");
    }
}
