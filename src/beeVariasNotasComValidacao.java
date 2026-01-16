import java.util.Scanner;

public class beeVariasNotasComValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int contador = 0;
            double x;
            double soma = 0;

            while (contador < 2) {
                x = sc.nextDouble();

                if (x >= 0 && x <= 10) {
                    contador++;
                    soma += x;
                } else {
                    System.out.println("nota invalida");
                }
            }

            double media = soma / 2.0;
            System.out.printf("media = %.2f\n", media);

            int opcao;

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = sc.nextInt();
            } while (opcao != 1 && opcao != 2);

            if (opcao == 2) {
                break;
            }
        }

        sc.close();
    }
}
