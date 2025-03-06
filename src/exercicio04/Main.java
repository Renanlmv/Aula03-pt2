package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String nome, cargo;
        double salario;
        double aumento, aumentoCargo;
        Funcionario f;

        System.out.print("Digite o nome do funcionário: ");
        nome = e.next();
        System.out.print("Digite o cargo do funcionário: ");
        cargo = e.next();
        System.out.print("Digite o salário do funcionário: ");
        salario = e.nextDouble();

        f = new Funcionario(nome, cargo, salario);

        // aumentar o salário de acordoi com uma porcentagem
        System.out.print("Digite a porcentagem de aumento de salário (0 - 100): ");
        aumento = e.nextDouble();
        f.aumentarSalario(salario, aumento);
        System.out.println("Novo salário: R$" + f.salario);

        // aumentar o salário de acordo com o cargo e uma porcentagem
        System.out.print("Digite a porcentagem de aumento de salário de cargo (0 - 100): ");
        aumentoCargo = e.nextDouble();
        System.out.print("Digite o cargo que terá aumento: ");
        cargo = e.next();
        f.aumentarSalario(cargo, aumentoCargo);
        System.out.println("Novo salário: R$" + f.salario);
    }
}
