package br.unipar.trabalhobimestral.petshop.Pessoa;

import java.util.ArrayList;
import br.unipar.trabalhobimestral.petshop.Animal.Animal;

public class Proprietario extends Pessoa{
    private ArrayList<Animal> animal;

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "animal=" + animal + '}';
    }
}
