package exercicio01;

public class Jogador {

    String nome;
    int[] pontuacao = new int[3];

    public int calcularPontTotal (){
        int total = 0;
        for (int p : pontuacao) {
            total += p;
        }
        return total;
    }
}
