package poo;
import java.time.LocalDate;


public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private LocalDate dataValidade;
    private StatusPagamento statusPagamento;
    private double valor;

    public PagamentoCartaoCredito(String numeroCartao, String nomeTitular, LocalDate dataValidade, double valor) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.valor = valor;
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    public double getValor() {
        return valor;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    public boolean ProcessarPagamento(double valor)  {
        if(valor<5000) {
            this.statusPagamento = StatusPagamento.APROVADO;
            return true;
        }
        this.statusPagamento = StatusPagamento.RECUSADO;
        return false;
    }
}

