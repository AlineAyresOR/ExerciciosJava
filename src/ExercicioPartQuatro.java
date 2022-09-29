import java.util.Locale;
import java.util.Scanner;

public class ExercicioPartQuatro {
    public static void main ( String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        double V = sc.nextDouble();

        System.out.println("Number = " + N );
        System.out.printf("Salary = U$ %.2f", H*V);

    }
}
