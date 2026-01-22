import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int soma= 0;
        int contador = 0;

        while (true) {
            idade = sc.nextInt();
            if (idade < 0) {
                break;
            }
          soma += idade;
            contador++;
        }

        double media = (double) soma / contador;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
