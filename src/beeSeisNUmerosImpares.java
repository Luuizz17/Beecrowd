import java.util.Scanner;
public class beeSeisNUmerosImpares {
    //beecrowd 1070
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int valoresImpares = 0;
        int valoresPares = 0;
        //impares
        if(X % 2 == 1){
            System.out.println(X);
            for(int i = 0; i < 5 ; i++){
                valoresImpares= X+=2;
                System.out.println(valoresImpares);
            }
        } else if( X % 2 == 0){
            int Pares = X + 1;
            System.out.println(Pares);
            for(int j = 0; j < 5 ; j++){
                valoresPares = Pares+=2;
                System.out.println(valoresPares);
            }
        }
    }
}
