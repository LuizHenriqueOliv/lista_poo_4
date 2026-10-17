package br.edu.ifpb.questao5.model;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public int atacar() {
        int dano = forca; // dano alto e constante
        System.out.println(getNome() + " (Guerreiro) golpeia com a espada! Dano: " + dano);
        return dano;
    }
}