package padroescriacao.factorymethodcristiano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoBoletoTest {

    @Test
    void deveExecutarPagamentoBoleto() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Boleto");
        assertEquals("Pagamento via Boleto realizado com sucesso", pagamento.executar());
    }

    @Test
    void deveCancelarPagamentoBoleto() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Boleto");
        assertEquals("Pagamento via Boleto cancelado", pagamento.cancelar());
    }
}
