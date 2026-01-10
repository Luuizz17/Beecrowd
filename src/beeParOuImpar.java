import java.util.Scanner;

public class beeParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros : ");
        int N = sc.nextInt();


        for(int i= 0 ; i < N ; i++) {
            int valor = sc.nextInt();
            if (valor == 0) {
                System.out.println("NULL");
            } else {
                if (valor % 2 == 0) {
                    if (valor > 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("EVEN NEGATIVE");
                    }
                } else {
                    if (valor > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }

        }
    }
}
