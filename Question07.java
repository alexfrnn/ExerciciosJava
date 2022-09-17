import java.util.Scanner;

public class Question07 {
	public static void main(String[] args) {
		int cedulasInseridas;
		
		int notasDeCem;
		//notasDeCinquenta, notasDeVinte, notasDeDez, notasDeCinco, notasDeDois, umReal;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade de cédulas");
		cedulasInseridas = input.nextInt();
		
		notasDeCem = cedulasInseridas / 100;
		
		System.out.println("valor lido "+ cedulasInseridas);
		System.out.println(notasDeCem + " notas de R$100");
	input.close();
	
	}
	
}
