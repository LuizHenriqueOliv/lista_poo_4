package br.edu.ifpb.questao4.view;

import br.edu.ifpb.questao4.model.Boleto;
import br.edu.ifpb.questao4.model.CartaoCredito;
import br.edu.ifpb.questao4.model.Pagamento;
import br.edu.ifpb.questao4.model.Pix;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new CartaoCredito("Maria", 0.03),
                new Boleto("João", 3.50),
                new Pix("Ana", "ana@email.com", 0.05)
        };

        double valor = 200.00;

        for (Pagamento p : pagamentos) {
            p.processar(valor); // polimorfismo
        }
    }
}