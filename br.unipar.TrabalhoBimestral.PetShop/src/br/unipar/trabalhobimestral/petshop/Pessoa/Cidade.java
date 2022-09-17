package br.unipar.trabalhobimestral.petshop.Pessoa;

public class Cidade {
    private int codIbge;
    private String nmCidade;
    private Estado estado;

    public int getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(int codIbge) {
        this.codIbge = codIbge;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "codIbge=" + codIbge + ", nmCidade=" + nmCidade + ", estado=" + estado + '}';
    }
}
