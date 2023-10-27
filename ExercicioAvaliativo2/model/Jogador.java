package model;

import java.util.Random;

public class Jogador {
    private Coisa coisaEscolhida;

    public void escolherCoisa(Coisa coisa) {
        coisaEscolhida = coisa;
    }

    public Coisa getCoisaEscolhida() {
        return coisaEscolhida;
    }

    public static Coisa escolherAleatoriamente() {
        Random random = new Random();
        int escolha = random.nextInt(3);
        if (escolha == 0) {
            return new Pedra();
        } else if (escolha == 1) {
            return new Papel();
        } else {
            return new Tesoura();
        }
    }
}