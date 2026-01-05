import java.util.Scanner;
public class beeSalarioComBonus {
    //beecrowd 1009
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome  = sc.nextLine();
        double salario = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        double comissão = 0.15; //sobre as vendas efetuadas

        double salarioBonus = salario + (totalVendas * comissão);
        System.out.printf("TOTAL = R$ %.2f " , salarioBonus);




        sc.close();
    }
}
