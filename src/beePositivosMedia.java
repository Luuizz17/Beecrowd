import java.util.Scanner;
public class beePositivosMedia {
    public static void main(String[] args) {
        //beecrowd 1064
        Scanner sc = new Scanner(System.in);

        int totalPositivos = 0;
        double valorTotal = 0;

        for( int i = 0 ; i < 6; i++ ){
           double valor = sc.nextDouble();

           if(valor > 0){
               valorTotal = valor + valorTotal;
               totalPositivos++ ;
           }

        }
        double valorMedia = valorTotal / totalPositivos;

        System.out.println(totalPositivos  + " valores positivos");
        System.out.println(valorMedia);

    }
}
