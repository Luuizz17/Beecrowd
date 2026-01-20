import java.util.Scanner;

public class beeQuadradoEAoCub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int valor = 0;
        for(int i =0 ; i < n ; i++){
            valor++;
            System.out.println(valor + " " + valor * valor + " " + valor * valor * valor);

        }
    }
}
