package ExemploTextoUnidade3Aula2;

public class Carro implements Transporte {
    @Override
    public void iniciar() {
        System.out.println("O carro ligado." + "\n");
    }

    @Override
    public void parar() {
        System.out.println("O carro desligado." + "\n");
    }

}
