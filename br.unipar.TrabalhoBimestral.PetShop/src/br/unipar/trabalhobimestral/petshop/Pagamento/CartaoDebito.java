package br.unipar.trabalhobimestral.petshop.Pagamento;

public class CartaoDebito extends Cartao{

    public CartaoDebito(String numCartao, String nmTitular, String dtVencimento, String cvv, Bandeira bandeira, int id, String descricao) {
        super(numCartao, nmTitular, dtVencimento, cvv, bandeira, id, descricao);
    }
}
