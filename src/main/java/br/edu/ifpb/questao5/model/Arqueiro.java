package br.edu.ifpb.questao5.model;

public class Arqueiro extends Personagem {
    private int danoBase;
    private double chanceCritico; // ex.: 0.3 = 30%

    public Arqueiro(String nome, int vida, int danoBase, double chanceCritico) {
        super(nome, vida);
        this.danoBase = danoBase;
        this.chanceCritico = chanceCritico;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public double getChanceCritico() {
        return chanceCritico;
    }

    public void setChanceCritico(double chanceCritico) {
        this.chanceCritico = chanceCritico;
    }

    @Override
    public int atacar() {
        boolean critico = Math.random() < chanceCritico;
        int dano = critico ? danoBase * 2 : danoBase;
        System.out.println(getNome() + " (Arqueiro) dispara uma flecha"
                + (critico ? " CRÍTICA" : "") + "! Dano: " + dano);
        return dano;
    }
}