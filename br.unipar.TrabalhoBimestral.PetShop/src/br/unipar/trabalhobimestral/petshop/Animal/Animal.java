package br.unipar.trabalhobimestral.petshop.Animal;

import java.util.ArrayList;

public class Animal {
    private int id;
    private String nome;
    private TipoAnimalENUM tipoAnimal;
    private PorteENUM porte;
    private ArrayList<Vacina> vacina;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAnimalENUM getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimalENUM tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public PorteENUM getPorte() {
        return porte;
    }

    public void setPorte(PorteENUM porte) {
        this.porte = porte;
    }

    public ArrayList<Vacina> getVacina() {
        return vacina;
    }

    public void setVacina(ArrayList<Vacina> vacina) {
        this.vacina = vacina;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", tipoAnimal=" + tipoAnimal + ", porte=" + porte + ", vacina=" + vacina + '}';
    }    
}
