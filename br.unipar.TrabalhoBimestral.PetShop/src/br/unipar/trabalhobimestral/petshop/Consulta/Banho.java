package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.Animal;
import java.time.LocalDate;
import java.util.Date;

public class Banho {
    private LocalDate dataBanho;
    private double valorBanho = 0;

    public Banho() {
    }

    public Banho(Animal animal, LocalDate dataBanho) {
        this.dataBanho = dataBanho;
        this.valorBanho = animal.getPorte().getValorBanho();
    }

    public LocalDate getDataBanho() {
        return dataBanho;
    }

    public void setDataBanho(LocalDate dataBanho) {
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
