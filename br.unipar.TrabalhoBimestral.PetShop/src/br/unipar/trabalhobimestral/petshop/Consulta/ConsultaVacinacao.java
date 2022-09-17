package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.Vacina;
import java.util.ArrayList;
import java.util.Date;

public class ConsultaVacinacao extends Consulta{
    private Vacina vacina;
    private boolean doseUnica;
    private ArrayList<Date> proximasDoses;

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public boolean isDoseUnica() {
        return doseUnica;
    }

    public void setDoseUnica(boolean doseUnica) {
        this.doseUnica = doseUnica;
    }

    public ArrayList<Date> getProximasDoses() {
        return proximasDoses;
    }

    public void setProximasDoses(ArrayList<Date> proximasDoses) {
        this.proximasDoses = proximasDoses;
    }

    @Override
    public String toString() {
        return "ConsultaVacinacao{" + "vacina=" + vacina + ", doseUnica=" + doseUnica + ", proximasDoses=" + proximasDoses + '}';
    }
}
