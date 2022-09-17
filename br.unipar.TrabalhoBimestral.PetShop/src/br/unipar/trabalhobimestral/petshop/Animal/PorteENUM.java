package br.unipar.trabalhobimestral.petshop.Animal;

public enum PorteENUM {
    PEQUENO(45,10),
    MEDIO(55,10),
    GRANDE(70,15),
    EXTRAGRANDE(90,15);
    
    private double valorBanho;
    private double valorTosa;

    private PorteENUM(double valorBanho, double valorTosa) {
        this.valorBanho = valorBanho;
        this.valorTosa = valorTosa;
    }

    public double getValorBanho() {
        return valorBanho;
    }

    public double getValorTosa() {
        return valorTosa;
    }
}
