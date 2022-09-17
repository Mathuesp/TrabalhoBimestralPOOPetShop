package br.unipar.trabalhobimestral.petshop.Pessoa;

import java.util.ArrayList;

public class Veterinario extends Pessoa{
    private String crmv;
    private ArrayList<String> especialidade;

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public ArrayList<String> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(ArrayList<String> especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Veterinario{" + "crmv=" + crmv + ", especialidade=" + especialidade + '}';
    }
}
