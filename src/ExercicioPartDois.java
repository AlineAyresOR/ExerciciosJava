import java.util.Locale;
import java.util.Scanner;

public class ExercicioPartDois {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int Y = 2;
        double P = 3.14159;
        double R = sc.nextDouble();
        R = Math.pow(R, Y);

        System.out.printf("A = %.4f ", P * R);
        sc.close();
    }

}
