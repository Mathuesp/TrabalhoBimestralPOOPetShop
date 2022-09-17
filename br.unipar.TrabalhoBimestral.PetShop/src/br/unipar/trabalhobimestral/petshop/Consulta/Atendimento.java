package br.unipar.trabalhobimestral.petshop.Consulta;

import br.unipar.trabalhobimestral.petshop.Animal.Animal;
import br.unipar.trabalhobimestral.petshop.Pagamento.FormaPagamento;
import br.unipar.trabalhobimestral.petshop.Pessoa.Proprietario;

public class Atendimento {
    private int id;
    private Animal animal;
    private Proprietario proprietario;
    private FormaPagamento formaPagamento;    
    private double valorTotal;
    private boolean possuiExame;
    private boolean possuiVacinacao;
    private boolean possuibanho;
    private boolean possuitosa;
    private ConsultaExame consultaExame;
    private ConsultaVacinacao consultaVacinacao;
    private Banho banho;
    private Tosa tosa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isPossuiExame() {
        return possuiExame;
    }

    public void setPossuiExame(boolean possuiExame) {
        this.possuiExame = possuiExame;
    }

    public boolean isPossuiVacinacao() {
        return possuiVacinacao;
    }

    public void setPossuiVacinacao(boolean possuiVacinacao) {
        this.possuiVacinacao = possuiVacinacao;
    }

    public boolean isPossuibanho() {
        return possuibanho;
    }

    public void setPossuibanho(boolean possuibanho) {
        this.possuibanho = possuibanho;
    }

    public boolean isPossuitosa() {
        return possuitosa;
    }

    public void setPossuitosa(boolean possuitosa) {
        this.possuitosa = possuitosa;
    }

    public ConsultaExame getConsultaExame() {
        return consultaExame;
    }

    public void setConsultaExame(ConsultaExame consultaExame) {
        this.consultaExame = consultaExame;
    }

    public ConsultaVacinacao getConsultaVacinacao() {
        return consultaVacinacao;
    }

    public void setConsultaVacinacao(ConsultaVacinacao consultaVacinacao) {
        this.consultaVacinacao = consultaVacinacao;
    }

    public Banho getBanho() {
        return banho;
    }

    public void setBanho(Banho banho) {
        this.banho = banho;
    }

    public Tosa getTosa() {
        return tosa;
    }

    public void setTosa(Tosa tosa) {
        this.tosa = tosa;
    }
    
    public void calculaValorTotal(){
        
    }
}
