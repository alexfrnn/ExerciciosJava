import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        String nome;
        double salario, totalVendasNoMes, comissao, totalSalario;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o seu primeiro nome");
        nome = input.nextLine();

        System.out.println("Informe o seu salário");
        salario = input.nextDouble();

        System.out.println("Informe o total de vendas");
        totalVendasNoMes = input.nextDouble();

        comissao= (totalVendasNoMes * 15)/100;
        totalSalario = salario + comissao; 

        System.out.println("Funcionário " + nome);
        System.out.printf("Total = R$  %.2f%n", totalSalario);


        input.close();
    }
}
