package Unidade3Aula5.Concessionaria;

public class Concessionaria {
    // Método principal para testar as classes Carro e Moto
    public static void main(String[] args) {
        // Cria um objeto do tipo Carro e um objeto do tipo Moto usando o construtor de
        // cada classe
        Veiculo carro = new Carro("Toyota", "Corolla");
        Veiculo moto = new Moto("Honda", "CB500");
        // Exibe as informações do carro e da moto, e chama o método dirigir para cada
        // um
        carro.exibirInformacoes();
        carro.dirigir();

        moto.exibirInformacoes();
        moto.dirigir();

    }
}
