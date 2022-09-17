package br.unipar.trabalhobimestral.petshop.Pagamento;

import br.unipar.trabalhobimestral.petshop.Pessoa.Proprietario;

public class Pix extends FormaPagamento{
    private String chave;
    private String origem;

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Pix{" + "chave=" + chave + ", origem=" + origem + '}';
    }
}
