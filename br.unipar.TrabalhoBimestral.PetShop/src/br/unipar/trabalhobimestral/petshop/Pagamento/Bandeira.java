package br.unipar.trabalhobimestral.petshop.Pagamento;

public class Bandeira {
    private String descBandeira;

    public Bandeira(String descBandeira) {
        this.descBandeira = descBandeira;
    }

    public String getDescBandeira() {
        return descBandeira;
    }

    public void setDescBandeira(String descBandeira) {
        this.descBandeira = descBandeira;
    }

    @Override
    public String toString() {
        return "Bandeira{" + "descBandeira=" + descBandeira + '}';
    }
}
