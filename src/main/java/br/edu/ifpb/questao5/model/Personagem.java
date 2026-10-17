package br.edu.ifpb.questao5.model;

public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(vida, 0); // vida nunca fica negativa
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        setVida(vida - dano);
    }

    // Retorna o dano causado
    public abstract int atacar();
}