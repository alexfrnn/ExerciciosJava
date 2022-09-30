import java.util.Scanner;

public class Question11 {
   public static void main(String[] args) {
    int horaDoInicio, horaDoFim;

    Scanner reader = new Scanner(System.in);

    System.out.print("Digite a hora que o jogo começou: ");
    horaDoInicio = reader.nextInt();
    
    System.out.print("Digite a hora que o jogo terminou: ");
    horaDoFim = reader.nextInt();
    

    int durancaoDoJogo = horaDoFim - horaDoInicio;
    
    
    System.out.println("O jogo durou: "+(durancaoDoJogo));
   
   reader.close();
   } 
}
