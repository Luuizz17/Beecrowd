import java.util.Scanner;
 public class beeGastoCombustivel {
     //beecrowd 1017
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempoViagem = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double gastoCombustivel = (double)(tempoViagem * velocidadeMedia)/ 12.0;
        System.out.printf("%.3f\n" , gastoCombustivel);
    }
}
