package exercicio04;

public class Funcionario {
    // atributos ou variáveis de instância
    String nome, cargo;
    double salario;

    // construtor para inicializar os atributos com valores recebidos por parâmetro
    public Funcionario (String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // método para aplicar um aumento no salário
    public double aumentarSalario(double salario, double aumento) {
        salario = salario + (salario * aumento / 100);
        return salario;
    }

    public void aumentarSalario(String cargo, double aumentoCargo) {

        if (this.cargo.equalsIgnoreCase(cargo)) {
            salario += (salario * aumentoCargo);
        }
    }

    public void promover(String cargo) {
        this.cargo = cargo;
    }

}
