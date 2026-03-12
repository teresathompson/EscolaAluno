package ExemploTextoUnidade3Aula2;

public class PagamentoBoleto implements MeiosPagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via boleto..." + "\n");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando pagamento via boleto..." + "\n");
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via boleto no valor de R$" + valor + "..." + "\n");
    }

}
