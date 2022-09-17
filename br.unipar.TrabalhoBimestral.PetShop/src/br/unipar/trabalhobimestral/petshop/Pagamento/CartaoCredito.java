package br.unipar.trabalhobimestral.petshop.Pagamento;

public class CartaoCredito extends Cartao{
    private int parcelas;

    public CartaoCredito(int parcelas, String numCartao, String nmTitular, String dtVencimento, String cvv, Bandeira bandeira, int id, String descricao) {
        super(numCartao, nmTitular, dtVencimento, cvv, bandeira, id, descricao);
        this.parcelas = parcelas;
    }

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
