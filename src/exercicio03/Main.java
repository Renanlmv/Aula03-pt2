package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat fD = new DecimalFormat("0.000");
        Scanner e = new Scanner(System.in);

        // Criação dos objetos
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        // Entrada de dados
        System.out.println("Informe as coordenadas do ponto 1 ");
        System.out.print("X: ");
        p1.x = e.nextInt();
        System.out.print("Y: ");
        p1.y = e.nextInt();
        System.out.println("Informe as coordenadas do ponto 2: ");
        System.out.print("X: ");
        p2.x = e.nextInt();
        System.out.print("Y: ");
        p2.y = e.nextInt();

        //  Impressão da distância entre os dois pontos
        System.out.println("Distância de p1 para p2: " + fD.format(p1.calcularDist(p2)));
        System.out.println("Distância de p2 para p1: " + fD.format(p2.calcularDist(p1)));

        //  Impressão da distância de cada ponto até a origem
        System.out.println();
        System.out.println("Distância do p1 até a origem: " + fD.format(p1.calcDistAteOrigem()));
        System.out.println("Distância do p2 até a origem: " + fD.format(p2.calcDistAteOrigem()));

        // Impressão do ponto mais próximo da origem
        System.out.println();
        Ponto aux = Ponto.maisProxOrigem(p1, p2);
        System.out.println("Ponto mais próximo da origem: " + aux.formatarPonto());
    }
}
