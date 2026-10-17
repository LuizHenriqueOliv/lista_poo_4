package br.edu.ifpb.questao4.model;

public abstract class Pagamento {
    private String titular;

    public Pagamento(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public abstract void processar(double valor);
}