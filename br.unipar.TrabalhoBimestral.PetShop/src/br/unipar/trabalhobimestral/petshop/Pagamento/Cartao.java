package br.unipar.trabalhobimestral.petshop.Pagamento;

public class Cartao extends FormaPagamento{
    private String numCartao;
    private String nmTitular;
    private String dtVencimento;
    private String cvv;
    private Bandeira bandeira;

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getNmTitular() {
        return nmTitular;
    }

    public void setNmTitular(String nmTitular) {
        this.nmTitular = nmTitular;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Bandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public String toString() {
        return "Cartao{" + "numCartao=" + numCartao + ", nmTitular=" + nmTitular + ", dtVencimento=" + dtVencimento + ", cvv=" + cvv + ", bandeira=" + bandeira + '}';
    }
}
