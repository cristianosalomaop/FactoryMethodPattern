package padroescriacao.factorymethodcristiano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPagamentoInexistente() {
        try {
            IPagamento pagamento = PagamentoFactory.obterPagamento("Dinheiro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInvalido() {
        try {
            IPagamento pagamento = PagamentoFactory.obterPagamento("CartaoDebito");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço de pagamento inválido", e.getMessage());
        }
    }
}
