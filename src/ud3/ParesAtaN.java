package ud3;
import java.util.Scanner;

public class ParesAtaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) { 
            if (i % 2 == 0)
                System.out.println(i);
            i++; 
        }
    }
}
