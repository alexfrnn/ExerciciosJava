

import java.util.Scanner;

public class Question05 {
	
	public static void main(String[] args) {
		
		int distanciaTotalPercorrida =0;
		double consumoMedio = 0;
		double totalCombustivelLitros =0;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite a distância percorrida");
		distanciaTotalPercorrida = input.nextInt();
		
		System.out.println("Digite a quantidade combustivel");
		totalCombustivelLitros = input.nextDouble();
		
		consumoMedio = distanciaTotalPercorrida / totalCombustivelLitros;
		System.out.printf("%.1f",consumoMedio,"Km/L");
		
		
		input.close();
	}
}