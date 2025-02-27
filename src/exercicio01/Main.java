package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner e = new Scanner (System.in);

        Jogador jogador = new Jogador();

        System.out.print("Digite o seu nome: ");
        jogador.nome = e.nextLine();

        for (int i = 0; i < jogador.pontuacao.length; i++) {
            System.out.print("Digite a pontuação " + (i+1) + ": ");
            jogador.pontuacao[i] = e.nextInt();
        }

        System.out.println();
        System.out.println("Nome do Jogador: " + jogador.nome);
        System.out.println("Pontuação: " + jogador.calcularPontTotal());
    }
}
