package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.Animal;
import java.util.Date;

public class Banho {
    private Date dataBanho;
    private double valorBanho;

    public Banho(Animal animal) {
        this.valorBanho = animal.getPorte().getValorBanho();
    }

    public Date getDataBanho() {
        return dataBanho;
    }

    public void setDataBanho(Date dataBanho) {
        this.dataBanho = dataBanho;
    }

    public double getValorBanho() {
        return valorBanho;
    }

    public void setValorBanho(double valorBanho) {
        this.valorBanho = valorBanho;
    }

    @Override
    public String toString() {
        return "Banho{" + "dataBanho=" + dataBanho + ", valorBanho=" + valorBanho + '}';
    }
}
