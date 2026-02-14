import java.io.IOException;
import java.util.Scanner;
public class beeSequenciaNumeroSoma{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            if (M <= 0 || N <= 0) {
                break;
            }

            int inicio = Math.min(N, M);
            int fim = Math.max(N, M);

            int soma = 0;

            for (int i = inicio; i <= fim; i++) {
                System.out.print(i + " ");
                soma += i;

            }
            System.out.println("Sum=" + soma);
        }
    }

}