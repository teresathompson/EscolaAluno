package ExemploTextoUnidade3Aula2;

public class TesteTransporte {
    public static void main(String[] args) {
        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();

        System.out.println("Teste do Carro:" + "\n");

        carro.iniciar();
        carro.parar();

        System.out.println("************************" + "\n");
        System.out.println("Teste da Bicicleta:" + "\n");

        bicicleta.iniciar();
        bicicleta.parar();
    }

}
