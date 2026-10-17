package br.edu.ifpb.questao5.model;

public class Mago extends Personagem {
    private int poderMagico;

    public Mago(String nome, int vida, int poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    @Override
    public int atacar() {
        int dano = poderMagico + (int) (Math.random() * 11); // poder + 0 a 10 (variável)
        System.out.println(getNome() + " (Mago) lança uma bola de fogo! Dano: " + dano);
        return dano;
    }
}