package br.unipar.trabalhobimestral.petshop.Pagamento;

public class CartaoCredito extends Cartao{
    private int parcelas;

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return "CartaoCredito{" + "parcelas=" + parcelas + '}';
    }
}
