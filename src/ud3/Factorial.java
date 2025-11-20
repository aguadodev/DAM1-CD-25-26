package ud3;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número enteiro: ");
        int n = sc.nextInt();
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }

        System.out.println("O factorial de " + n + " é " + resultado);
    }
}
