package padroescriacao.factorymethodcristiano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCartaoCreditoTest {

    @Test
    void deveExecutarPagamentoCartaoCredito() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("CartaoCredito");
        assertEquals("Pagamento via Cartão de Crédito realizado com sucesso", pagamento.executar());
    }

    @Test
    void deveCancelarPagamentoCartaoCredito() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("CartaoCredito");
        assertEquals("Pagamento via Cartão de Crédito cancelado", pagamento.cancelar());
    }
}
