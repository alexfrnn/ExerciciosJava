import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        double rendaConjunta = 0;
        double ALIO = 0;
        double rendaHomem, rendaMulher;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a renda do homem");
        rendaHomem = input.nextDouble();

        System.out.println("Digite a renda da mulher");
        rendaMulher = input.nextDouble();

        rendaConjunta = (rendaHomem + rendaMulher);

        System.out.println("");
    }
}
