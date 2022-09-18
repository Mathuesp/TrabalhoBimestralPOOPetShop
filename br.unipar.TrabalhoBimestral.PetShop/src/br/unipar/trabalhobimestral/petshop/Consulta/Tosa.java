package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.Animal;
import java.time.LocalDate;
import java.util.Date;

public class Tosa {
    private LocalDate dataTosa;
    private double valorTosa = 0;

    public Tosa() {
    }

    public Tosa(Animal animal, LocalDate dataTosa) {
        this.valorTosa = animal.getPorte().getValorTosa();
        this.dataTosa = dataTosa;
    }

    public LocalDate getDataTosa() {
        return dataTosa;
    }

    public void setDataTosa(LocalDate dataTosa) {
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
