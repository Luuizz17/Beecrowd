import java.util.Scanner;

public class beeIntervaloII {
    public static void main(String[] args) {
        //beecrowd 1072
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int valorDentro = 0;
        int valorFora = 0;


        for(int i = 0; i < N ; i++){
            int valor = sc.nextInt();
            if(valor >= 10 && valor <=20){
                valorDentro+=1;
            } else {
                valorFora+=1;
            }
        }

        System.out.println(valorDentro + " in");
        System.out.println( valorFora+ " out");
    }
}
