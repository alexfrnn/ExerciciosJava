import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int num;
        int horasTrabalhadas, valorRecebido;
        double salario;
        

        System.out.println("Digite o seu número");
        num = input.nextInt();
        
        System.out.println("Digite o valor que recebe por hora");
        valorRecebido = input.nextInt();
        
        System.out.println("Digite o numero de horas trabalhadas");
        horasTrabalhadas = input.nextInt();

        salario = horasTrabalhadas * valorRecebido;

        System.out.println("Número: " + num);
        System.out.printf("salário R$  %.2f%n", salario);
        
        input.close();
    }
}
