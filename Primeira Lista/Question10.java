import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
    int idadeEmDias, anos, dias, meses;
    Scanner reader = new Scanner(System.in);  

    System.out.print("Digite sua idade em dias: ");
    idadeEmDias = reader.nextInt();

    anos = idadeEmDias  / 365;
    idadeEmDias %= 365;

    meses= idadeEmDias / 30 ;
    idadeEmDias %= 30;
    
    dias= idadeEmDias;

    System.out.println(anos+" anos(s)");
    System.out.println(meses+" mês(es)");
    System.out.println(dias+" dias(s)");
   
    reader.close();
    }
}
