package ExemploTextoUnidade3Aula2;

public class PagamentoCartao implements MeiosPagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão..." + "\n");
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com cartão no valor de R$" + valor + " ..." + "\n");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento com cartão cancelado." + "\n");
    }

}
