package br.edu.ifpb.questao4.model;

public class CartaoCredito extends Pagamento {
    private double taxa; // ex.: 0.03 = 3%

    public CartaoCredito(String titular, double taxa) {
        super(titular);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public void processar(double valor) {
        double total = valor + (valor * taxa);
        System.out.printf("[Cartão de Crédito] %s: R$ %.2f + taxa de %.0f%% = R$ %.2f%n",
                getTitular(), valor, taxa * 100, total);
    }
}