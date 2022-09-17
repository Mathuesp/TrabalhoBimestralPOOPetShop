package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.Animal;
import java.util.Date;

public class Tosa {
    private Date dataTosa;
    private double valorTosa;

    public Tosa(Animal animal) {
        this.valorTosa = animal.getPorte().getValorTosa();
    }

    public Date getDataTosa() {
        return dataTosa;
    }

    public void setDataTosa(Date dataTosa) {
        this.dataTosa = dataTosa;
    }

    public double getValorTosa() {
        return valorTosa;
    }

    public void setValorTosa(double valorTosa) {
        this.valorTosa = valorTosa;
    }

    @Override
    public String toString() {
        return "Tosa{" + "dataTosa=" + dataTosa + ", valorTosa=" + valorTosa + '}';
    }
}
