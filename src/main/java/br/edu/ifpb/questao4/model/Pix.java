package br.edu.ifpb.questao4.model;

public class Pix extends Pagamento {
    private String chave;
    private double desconto; // ex.: 0.05 = 5%

    public Pix(String titular, String chave, double desconto) {
        super(titular);
        this.chave = chave;
        this.desconto = desconto;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void processar(double valor) {
        double total = valor - (valor * desconto);
        System.out.printf("[Pix] %s (chave: %s): R$ %.2f - desconto de %.0f%% = R$ %.2f%n",
                getTitular(), chave, valor, desconto * 100, total);
    }
}