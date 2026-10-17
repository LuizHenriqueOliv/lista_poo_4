package br.edu.ifpb.questao4.model;

public class Boleto extends Pagamento {
    private double taxaFixa; // ex.: 3.50

    public Boleto(String titular, double taxaFixa) {
        super(titular);
        this.taxaFixa = taxaFixa;
    }

    public double getTaxaFixa() {
        return taxaFixa;
    }

    public void setTaxaFixa(double taxaFixa) {
        this.taxaFixa = taxaFixa;
    }

    @Override
    public void processar(double valor) {
        double total = valor + taxaFixa;
        System.out.printf("[Boleto] %s: R$ %.2f + taxa fixa de R$ %.2f = R$ %.2f%n",
                getTitular(), valor, taxaFixa, total);
    }
}