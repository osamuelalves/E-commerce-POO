import java.time.LocalDate;

public class PagamentoBoleto implements IPagamento {
    private String codigoBarras;
    private StatusPagamento statusPagamento;
    private double valor;
    private LocalDate dataVencimento;

    public PagamentoBoleto(String codigoBarras, double valor, LocalDate dataVencimento) {
        this.codigoBarras = codigoBarras;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public boolean ProcessarPagamento(double valor)  {
        this.statusPagamento = StatusPagamento.APROVADO;
        return true;
    }
}
