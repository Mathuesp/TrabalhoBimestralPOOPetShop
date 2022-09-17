package br.unipar.trabalhobimestral.petshop.Pessoa;

public class Pais {
    private int id;
    private String nmPais;
    private String sigla;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmPais() {
        return nmPais;
    }

    public void setNmPais(String nmPais) {
        this.nmPais = nmPais;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nmPais=" + nmPais + ", sigla=" + sigla + '}';
    }
}
