import java.util.Scanner;

public class beeMediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //quantidade de teste

        for(int k = 0; k < N ; k++){
          double  valor1= sc.nextDouble();
          double valor2= sc.nextDouble();
          double  valor3= sc.nextDouble();

          double media = (valor1 * 2 + valor2 * 3 + valor3 * 5)/10.0;
            System.out.printf("%.1f\n",media);
            sc.close();
        }
    }
}
