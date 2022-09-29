import java.util.Locale;
import java.util.Scanner;

public class ExercicioPartSeis {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double PI = 3.14159;
        int Y = 2;
        double C2 = Math.pow(C, Y);
        double B2 = Math.pow(B, Y);

        System.out.printf("TRIANGULO: %.3f%n", A * C / 2);
        System.out.printf("CIRCULO: %.3f%n", PI * C2);
        System.out.printf("TRAPEZIO: %.3f%n", (A + B) * C / 2);
        System.out.printf("QUADRADO: %.3f%n", B2);
        System.out.printf("RETANGULO: %.3f%n", A * B);

        sc.close();

    }
}
