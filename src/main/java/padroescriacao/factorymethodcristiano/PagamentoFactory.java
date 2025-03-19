    package padroescriacao.factorymethodcristiano;

    public class PagamentoFactory {

        public static IPagamento obterPagamento(String tipoPagamento) {
            Class classe = null;
            Object objeto = null;
            try {
                classe = Class.forName("padroescriacao.factorymethodcristiano.Servico" + tipoPagamento);
                objeto = classe.newInstance();
            } catch (Exception ex) {
                throw new IllegalArgumentException("Tipo de pagamento inexistente");
            }
            if (!(objeto instanceof IPagamento)) {
                throw new IllegalArgumentException("Serviço de pagamento inválido");
            }
            return (IPagamento) objeto;
        }
    }