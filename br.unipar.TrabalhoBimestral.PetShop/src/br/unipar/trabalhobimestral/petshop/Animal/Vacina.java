package br.unipar.trabalhobimestral.petshop.Animal;

public class Vacina {
    private int id;
    private String lote;
    private String descricao;
    private String seloAnvisa;
    private int dosesNecessarias;
    private int intervaloDoses;
    private double valorDose = 0;

    public Vacina() {
    }

    public Vacina(int id, String lote, String descricao, String seloAnvisa, int dosesNecessarias, int intervaloDoses, double valorDose) {
        this.id = id;
        this.lote = lote;
        this.descricao = descricao;
        this.seloAnvisa = seloAnvisa;
        this.dosesNecessarias = dosesNecessarias;
        this.intervaloDoses = intervaloDoses;
        this.valorDose = valorDose;
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

    public int getDosesNecessarias() {
        return dosesNecessarias;
    }

    public void setDosesNecessarias(int dosesNecessarias) {
        this.dosesNecessarias = dosesNecessarias;
    }

    public int getIntervaloDoses() {
        return intervaloDoses;
    }

    public void setIntervaloDoses(int intervaloDoses) {
        this.intervaloDoses = intervaloDoses;
    }

    public double getValorDose() {
        return valorDose;
    }

    public void setValorDose(double valorDose) {
        this.valorDose = valorDose;
    }

    @Override
    public String toString() {
        return "Vacina{" + "id=" + id + ", lote=" + lote + ", descricao=" + descricao + ", seloAnvisa=" + seloAnvisa + ", dosesNecessarias=" + dosesNecessarias + ", intervaloDoses=" + intervaloDoses + ", valorDose=" + valorDose + '}';
    }
}
