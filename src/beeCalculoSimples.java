import java.util.Scanner;
public class beeCalculoSimples {
    //beecrowd 1010
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double valorAPagar = qtd1 * valor1 + qtd2 * valor2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);







        sc.close();
    }
}
