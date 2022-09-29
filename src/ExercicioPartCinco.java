import java.util.Locale;
import java.util.Scanner;

public class ExercicioPartCinco {

    public static void main (String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double valPeca1 = sc.nextDouble();
        int codPeca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valPeca2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: %.2f ",(numPeca1*valPeca1)+(numPeca2*valPeca2));

        sc.close();


    }
}
