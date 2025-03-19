package padroescriacao.factorymethodcristiano;

public class ServicoPix implements IPagamento {

    public String executar() {
        return "Pagamento via PIX realizado com sucesso";
    }

    public String cancelar() {
        return "Pagamento via PIX cancelado";
    }
}