package Unidade3Aula5.Concessionaria;

// A classe Veiculo é uma classe abstrata, o que significa que ela não pode ser instanciada diretamente e pode conter métodos abstratos que devem ser implementados pelas subclasses
abstract class Veiculo {
    // Atributos comuns a todos os veículos, como marca e modelo
    String marca;
    String modelo;

    // Construtor da classe Veiculo que recebe marca e modelo como parâmetros
    public Veiculo(String marca, String modelo) {
        // Inicializa os atributos marca e modelo com os valores fornecidos
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para exibir as informações do veículo, como marca e modelo
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    // Método abstrato dirigir que deve ser implementado pelas subclasses Carro e
    // Moto para fornecer uma implementação específica de como dirigir cada tipo de
    // veículo
    public abstract void dirigir();

}
