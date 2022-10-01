import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        int firstValue, secondValue, thirdValue;
        int maior = 0, menor = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        firstValue = input.nextInt();

        System.out.println("Digite o segundo valor");
        secondValue = input.nextInt();

        System.out.println("Digite o terceiro valor");
        thirdValue = input.nextInt();

        if (firstValue > secondValue) {
            maior = firstValue;
        } else{
            menor = firstValue;
        }
        if (maior > secondValue){
            menor = secondValue;
        } else if (maior > thirdValue){
            menor = thirdValue;
        }
        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
        
        input.close();

    }
}