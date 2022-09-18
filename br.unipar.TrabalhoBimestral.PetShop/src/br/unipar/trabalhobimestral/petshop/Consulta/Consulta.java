package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.*;
import br.unipar.trabalhobimestral.petshop.Pessoa.*;
import java.time.LocalDate;
import java.util.Date;

public class Consulta {
    private int id;
    private LocalDate dataConsulta;
    private Veterinario veterinario;
    private double valorConsulta = 0;

    public Consulta() {
    }

    public Consulta(int id, LocalDate dataConsulta, Veterinario veterinario, double valorConsulta) {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.veterinario = veterinario;
        this.valorConsulta = valorConsulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", dataConsulta=" + dataConsulta + ", veterinario=" + veterinario + ", valorConsulta=" + valorConsulta + '}';
    }
}
