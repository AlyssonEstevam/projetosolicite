package bean;

public class Pagamento {
    int id;
    String data;
    String motivo;
    String fornecedor;
    double valorTotal;
    String responsavel;
    double ValoresAPagar;
    String vencimento;
    double valoresPagos;
    String classificacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public double getValoresAPagar() {
        return ValoresAPagar;
    }

    public void setValoresAPagar(double ValoresAPagar) {
        this.ValoresAPagar = ValoresAPagar;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public double getValoresPagos() {
        return valoresPagos;
    }

    public void setValoresPagos(double valoresPagos) {
        this.valoresPagos = valoresPagos;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
    
}
