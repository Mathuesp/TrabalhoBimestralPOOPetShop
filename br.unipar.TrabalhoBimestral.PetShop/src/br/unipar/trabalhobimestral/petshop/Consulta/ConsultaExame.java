package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.*;

public class ConsultaExame extends Consulta{
    private Exame exame;
    private Medicamento medicamento;
    private String prescricaoMedicamento;

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getPrescricaoMedicamento() {
        return prescricaoMedicamento;
    }

    public void setPrescricaoMedicamento(String prescricaoMedicamento) {
        this.prescricaoMedicamento = prescricaoMedicamento;
    }

    @Override
    public String toString() {
        return "ConsultaExame{" + "exame=" + exame + ", medicamento=" + medicamento + ", prescricaoMedicamento=" + prescricaoMedicamento + '}';
    }
}
