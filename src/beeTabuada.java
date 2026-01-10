import java.util.Scanner;

public class beeTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int valor = 0;
        int multiplicação = 0;

        for(int i = 0; i < 10 ; i++){

            valor++;
            multiplicação = valor * N;
            System.out.println(valor + " x "+ N +" = "+multiplicação);
        }
    }
}
