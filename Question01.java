import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double firstGrade = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double secondGrade = input.nextDouble();
        
        double media = ((firstGrade * 3.5 )+(secondGrade * 7.5))/11;

        System.out.printf("A média é: %.2f%n", media);
        input.close();
    }
}
