package ExemploTextoUnidade3Aula2;

public class TestePagamentos {
    public static void main(String[] args) {

        MeiosPagamento cartaoCredito = new PagamentoCartao();
        MeiosPagamento boleto = new PagamentoBoleto();

        System.out.println("Teste do Cartão de Crédito:" + "\n");

        cartaoCredito.processarPagamento();
        cartaoCredito.cancelarPagamento();
        cartaoCredito.processarPagamento(150.00);

        System.out.println("************************" + "\n");
        System.out.println("Teste do Boleto:" + "\n");

        boleto.processarPagamento();
        boleto.cancelarPagamento();
        boleto.processarPagamento(200.00);
    }
}
