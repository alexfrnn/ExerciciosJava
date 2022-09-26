import java.util.Scanner;

public class Question07 {
	public static void main(String[] args) {
		int cedulasInseridas;
		
		int notasDeCem,
		// int notasDeCinquenta, notasDeVinte, notasDeDez, notasDeCinco, notasDeDois, umReal;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade de cédulas");
		cedulasInseridas = input.nextInt();
		
		notasDeCem = cedulasInseridas / 100;
		
		/* notasDeCinquenta = cedulasInseridas / 50;
		notasDeVinte = cedulasInseridas / 20;
		notasDeDez = cedulasInseridas / 10;
		notasDeCinco = cedulasInseridas / 5;
		notasDeDois = cedulasInseridas / 2; 
		umReal =  cedulasInseridas / 1; */
		
		
		System.out.println("valor lido "+ cedulasInseridas);
		System.out.println(notasDeCem + " notas de R$100");

		/*System.out.println(notasDeCinquenta + " notas de R$50");
		System.out.println(notasDeVinte + " notas de R$20");
		System.out.println(notasDeDez + " notas de R$10");
		System.out.println(notasDeCinco + " notas de R$5");
		System.out.println(notasDeDois + " notas de R$5");
		System.out.println(umReal + " valor de R$1"); */

	input.close();
	
	}
	
}
