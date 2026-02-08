import java.util.Scanner;

public class beeMenorPosicao {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     int N = sc.nextInt();
     int[] vetorx = new int[N];
     int menorvalor = 0;
     int posicao = 0;

     for(int i = 0 ; i < vetorx.length ; i++){
         vetorx[i] =sc.nextInt();
         if(i ==0){
             menorvalor = vetorx[i];
             posicao = i;
         } else if( vetorx[i] < menorvalor){
             menorvalor = vetorx[i];
             posicao = i;
         }

     }
         System.out.println("Menor valor: " + menorvalor);
         System.out.println("Posicao: " + posicao );

    }
}
