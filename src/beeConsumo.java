import java.util.Scanner;
public class beeConsumo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); //Distancia total percorrida KM
        double Y = sc.nextDouble(); //valor em real

        double consumo = X / Y;
        System.out.printf("%.3f km/l\n", consumo);



    }
}
