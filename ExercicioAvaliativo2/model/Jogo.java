package model;


public class Jogo {
    public static String jogar(Jogador jogador1, Jogador jogador2) {
        Coisa coisa1 = jogador1.getCoisaEscolhida();
        Coisa coisa2 = jogador2.getCoisaEscolhida();

        if (coisa1.getNome().equals(coisa2.getNome())) {
            return "Empate";
        }

        if ((coisa1 instanceof Pedra && coisa2 instanceof Tesoura) ||
            (coisa1 instanceof Papel && coisa2 instanceof Pedra) ||
            (coisa1 instanceof Tesoura && coisa2 instanceof Papel)) {
            return "Jogador 1";
        } else {
            return "Jogador 2";
        }
    }

    public static String jogarMelhorDeN(int rodadas, Jogador jogador1, Jogador jogador2) {
        int vitoriasJogador1 = 0;
        int vitoriasJogador2 = 0;

        for (int i = 0; i < rodadas; i++) {
            String vencedor = jogar(jogador1, jogador2);
            if (vencedor.equals("Jogador 1")) {
                vitoriasJogador1++;
            } else if (vencedor.equals("Jogador 2")) {
                vitoriasJogador2++;
            }
        }

        if (vitoriasJogador1 > vitoriasJogador2) {
            return "Jogador 1";
        } else if (vitoriasJogador2 > vitoriasJogador1) {
            return "Jogador 2";
        } else {
            return "Empate";
        }
    }
}