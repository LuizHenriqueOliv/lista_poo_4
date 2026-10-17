package br.edu.ifpb.questao5.view;

import br.edu.ifpb.questao5.model.Arqueiro;
import br.edu.ifpb.questao5.model.Guerreiro;
import br.edu.ifpb.questao5.model.Mago;
import br.edu.ifpb.questao5.model.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = {
                new Guerreiro("Thorin", 120, 25),
                new Mago("Merlin", 80, 20),
                new Arqueiro("Legolas", 90, 18, 0.3)
        };

        System.out.println("=== Turno de combate ===");

        for (int i = 0; i < personagens.length; i++) {
            Personagem atacante = personagens[i];
            Personagem alvo = personagens[(i + 1) % personagens.length]; // ataca o próximo

            if (atacante.estaVivo()) {
                int dano = atacante.atacar(); // polimorfismo
                alvo.receberDano(dano);
                System.out.println("  -> " + alvo.getNome() + " ficou com "
                        + alvo.getVida() + " de vida\n");
            }
        }
    }
}