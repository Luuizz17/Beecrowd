import java.util.Scanner;
public class beeEsfera {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Raio = sc.nextInt();
        double formula = (4/3.0 )* 3.14159 * Math.pow(Raio , 3)  ;
        System.out.printf("VOLUME = %.3f" , formula);




        sc.close();
    }
}
