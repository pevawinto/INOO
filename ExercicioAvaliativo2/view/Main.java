package view;

import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo Pedra, Papel, Tesoura!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Dois jogadores automáticos");
        System.out.println("2 - Humano x Computador");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            Jogador jogador1 = new Jogador();
            Jogador jogador2 = new Jogador();

            jogador1.escolherCoisa(Jogador.escolherAleatoriamente());
            jogador2.escolherCoisa(Jogador.escolherAleatoriamente());

            String vencedor = Jogo.jogar(jogador1, jogador2);
            System.out.println("O vencedor é: " + vencedor);
        } else if (escolha == 2) {
            Jogador jogadorHumano = new Jogador();
            Jogador jogadorComputador = new Jogador();

            System.out.println("Escolha uma opção para o jogador humano:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            int escolhaHumano = scanner.nextInt();

            Coisa[] opcoes = {new Pedra(), new Papel(), new Tesoura()};
            jogadorHumano.escolherCoisa(opcoes[escolhaHumano - 1]);
            jogadorComputador.escolherCoisa(Jogador.escolherAleatoriamente());

            String vencedor = Jogo.jogar(jogadorHumano, jogadorComputador);
            System.out.println("O vencedor é: " + vencedor);
        } else {
            System.out.println("Escolha inválida. Encerrando o jogo.");
        }

        scanner.close();
    }
}