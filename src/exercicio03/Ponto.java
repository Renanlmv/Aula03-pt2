package exercicio03;

public class Ponto {

    int x;
    int y;

    // método para calcular e retornar a distância entre dois pontos
    public double calcularDist(Ponto p) {
        double dist;

        dist = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));

        return dist;
    }

    // método para calcular e retornar  a distância de um ponto até a origem
    public double calcDistAteOrigem() {
        Ponto origem = new Ponto();
        return calcularDist(origem);
    }

    // método para imprimir o ponto mais próximo da origem
    public static Ponto maisProxOrigem(Ponto p1, Ponto p2) {

        if (p2.calcDistAteOrigem() < p1.calcDistAteOrigem()) {
            return p2;
        }
        return p1;
    }

    // método para formatar o ponto
    public String formatarPonto() {
        return"(" + x + ", " + y + ")";
    }
}



