package br.unipar.trabalhobimestral.petshop.Animal;

public class Medicamento {
    private int id;
    private String lote;
    private String descricao;
    private String seloAnvisa;
    private double valor;

    public Medicamento(int id, String lote, String descricao, String seloAnvisa, double valor) {
        this.id = id;
        this.lote = lote;
        this.descricao = descricao;
        this.seloAnvisa = seloAnvisa;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSeloAnvisa() {
        return seloAnvisa;
    }

    public void setSeloAnvisa(String seloAnvisa) {
        this.seloAnvisa = seloAnvisa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", lote=" + lote + ", descricao=" + descricao + ", seloAnvisa=" + seloAnvisa + ", valor=" + valor + '}';
    }
}
