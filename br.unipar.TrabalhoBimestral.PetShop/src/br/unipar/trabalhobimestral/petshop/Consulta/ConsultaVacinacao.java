package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.Vacina;
import br.unipar.trabalhobimestral.petshop.Pessoa.Veterinario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ConsultaVacinacao extends Consulta{
    private Vacina vacina;
    private boolean doseUnica;
    private ArrayList<LocalDate> proximasDoses;

    public ConsultaVacinacao() {
        vacina = new Vacina();
    }

    public ConsultaVacinacao(Vacina vacina, boolean doseUnica, int id, LocalDate dataConsulta, Veterinario veterinario, double valorConsulta) {
        super(id, dataConsulta, veterinario, valorConsulta);
        this.vacina = vacina;
        this.doseUnica = doseUnica;
    }

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

    public ArrayList<LocalDate> getProximasDoses() {
        return proximasDoses;
    }

    public void setProximasDoses(ArrayList<LocalDate> proximasDoses) {
        this.proximasDoses = proximasDoses;
    }
    
    public ArrayList<LocalDate> defineProximaDose(Vacina vacina){
        ArrayList<LocalDate> proxDose = new ArrayList();
        
        for (int i = 1; i <= vacina.getDosesNecessarias(); i++) {
            if(i == 1){
                proxDose.add(this.getDataConsulta());
            }else{
                proxDose.add(getDataConsulta().plusDays(vacina.getIntervaloDoses()*(i-1)));
            }
        }
        return proxDose;
    }

    @Override
    public String toString() {
        return "ConsultaVacinacao{" + "vacina=" + vacina + ", doseUnica=" + doseUnica + ", proximasDoses=" + proximasDoses + '}';
    }
}
