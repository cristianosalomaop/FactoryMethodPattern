package padroescriacao.factorymethodcristiano;

public class ServicoBoleto implements IPagamento {

    public String executar() {
        return "Pagamento via Boleto realizado com sucesso";
    }

    public String cancelar() {
        return "Pagamento via Boleto cancelado";
    }
}