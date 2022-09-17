package br.unipar.trabalhobimestral.petshop.Pessoa;

public class Estado {
    private int id;
    private String nmEstado;
    private String sigla;
    private Pais pais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmEstado() {
        return nmEstado;
    }

    public void setNmEstado(String nmEstado) {
        this.nmEstado = nmEstado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", nmEstado=" + nmEstado + ", sigla=" + sigla + ", pais=" + pais + '}';
    }
}
