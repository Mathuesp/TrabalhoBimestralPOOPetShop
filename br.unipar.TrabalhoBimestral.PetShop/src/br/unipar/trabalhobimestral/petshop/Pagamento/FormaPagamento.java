package br.unipar.trabalhobimestral.petshop.Pagamento;

public class FormaPagamento {
    private int id;
    private String descricao;
    private double valorPagamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "id=" + id + ", descricao=" + descricao + ", valorPagamento=" + valorPagamento + '}';
    }
}
