package ExemploTextoUnidade3Aula2;

public class Bicicleta implements Transporte {
    @Override
    public void iniciar() {
        System.out.println("Pedalando..." + "\n");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta parada." + "\n");
    }

}
