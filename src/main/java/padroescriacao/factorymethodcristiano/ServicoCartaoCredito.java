package padroescriacao.factorymethodcristiano;

public class ServicoCartaoCredito implements IPagamento {

    public String executar() {
        return "Pagamento via Cartão de Crédito realizado com sucesso";
    }

    public String cancelar() {
        return "Pagamento via Cartão de Crédito cancelado";
    }
}
