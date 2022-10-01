import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        int timeSpended;
        int hours=0, minutes=0, seconds=0;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite a quantidade de segundos: ");
        timeSpended = reader.nextInt();

        hours = timeSpended / 3600;
        timeSpended %= 3600;

        minutes = timeSpended / 60 ;
        timeSpended %= 60;
        seconds = timeSpended;
        
        System.out.printf("HH:MM:SS = "+hours+":"+minutes+":"+seconds);
        reader.close();
    }
}
