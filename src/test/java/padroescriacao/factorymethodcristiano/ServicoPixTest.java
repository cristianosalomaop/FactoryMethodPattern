package padroescriacao.factorymethodcristiano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPixTest {

    @Test
    void deveExecutarPagamentoPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via PIX realizado com sucesso", pagamento.executar());
    }

    @Test
    void deveCancelarPagamentoPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via PIX cancelado", pagamento.cancelar());
    }
}
