package br.unipar.trabalhobimestral.petshop.Pessoa;

public class Telefone {
    private int id;
    private String descricao;
    private String numTelefone;

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

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", descricao=" + descricao + ", numTelefone=" + numTelefone + '}';
    }
}
