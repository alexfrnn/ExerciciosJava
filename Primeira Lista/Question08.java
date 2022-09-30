import java.util.Scanner;

public class Question08{

    public static void main(String[] args) {
        double rendaHomem;
        double rendaMulher;
        double impostoRenda;
        double aliquota, rendaConjunta, rendaLiquida;

        Scanner reader = new Scanner(System.in);
        System.out.print("Digite a renda da mulher: ");
        rendaMulher = reader.nextDouble();

        System.out.print("Digite a renda do homem: ");
        rendaHomem = reader.nextDouble();

        
        rendaConjunta = (rendaMulher + rendaHomem);

        if (rendaConjunta > 2500.00) {
            aliquota = 25;
        } else if (rendaConjunta >= 1500.01 && rendaConjunta <= 2500) {
            aliquota = 15;
        } else if (rendaConjunta >= 900.01 && rendaConjunta <= 1500) {
            aliquota = 10;
        } else {
            aliquota = 0;
        }

        rendaLiquida = rendaConjunta - (rendaConjunta*(aliquota/100)); 
        impostoRenda = rendaConjunta * (aliquota/100);

        
        System.out.printf("\nRenda conjunta: %.2f%n", rendaConjunta);
        System.out.println("aliquota: " + aliquota + " %");
        System.out.printf("Imposto de renda: %.2f%n", impostoRenda);
        System.out.printf("Renda liquida: %.2f%n",rendaLiquida);
        reader.close();
    }
}
