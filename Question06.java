import java.util.Scanner;

public class Question06 {
	public static void main(String[] args) {

		
		Scanner reader = new Scanner(System.in);

		int distanciaPercorrida;
		double combustivelGasto, quantidadeLitrosConsumida;
		
		System.out.println("Quantos kilometros rodou?");
		distanciaPercorrida = reader.nextInt();
		
		System.out.println("Quantos litros consumiu?");
		quantidadeLitrosConsumida = reader.nextDouble();

		 combustivelGasto = (double) distanciaPercorrida / quantidadeLitrosConsumida;

		
		System.out.printf("Consumo médio do automóvel %.3f km/L",combustivelGasto );

		reader.close();
	}
}
