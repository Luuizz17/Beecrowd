import java.util.Scanner;
public class beeSalario {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();
        double salario = horasTrabalhadas*valorPorHora;

        System.out.println("NUMBER = " + N);
        System.out.println("SALARY = " + salario );



        sc.close();
    }
}
