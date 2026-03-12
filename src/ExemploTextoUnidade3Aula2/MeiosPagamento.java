package ExemploTextoUnidade3Aula2;

public interface MeiosPagamento {
    void processarPagamento();

    void cancelarPagamento();

    void processarPagamento(double valor);
}
