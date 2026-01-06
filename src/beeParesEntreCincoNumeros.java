import java.util.Scanner;
public class beeParesEntreCincoNumeros {
    static void main(String[] args) {
        //beecrowd 1065
        Scanner sc = new Scanner(System.in);

        int valorPar = 0;
        for(int i = 0; i < 5 ; i++){
            int valor = sc.nextInt();

            if(valor % 2 ==0){
                valorPar++;
            }
        }

        System.out.println(valorPar + " valores pares");

    }
}
