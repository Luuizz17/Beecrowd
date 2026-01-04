import java.util.Scanner;
public class beeArea {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangulo = A / C;
        double circulo = 3.14159 * Math.pow(C , 2);
        double trapezio = ((A + B) * C ) / 2.0;
        double quadrado = Math.pow(B,2);
        double retangulo = A * B;

        System.out.printf("TRIANGULO : %.3f " , triangulo);
        System.out.printf("CIRCULO : %.3f" , circulo);
        System.out.printf("TRAPEZIO : %.3f" , trapezio);
        System.out.printf("QUADRADO : %.3f", quadrado);
        System.out.printf("RETANGULO : %.3f" , retangulo);

        sc.close();
    }
}
