import java.util.Scanner;

public class beeMaiorPosicao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores = 0;
        int maior = 0;
        int indice = 0 ;

        for(int i = 0; i < 100; i++){
            valores= sc.nextInt();
            if(valores > maior){
                maior = valores;
                indice = i+1;
            }

        }
        System.out.println(maior);
        System.out.println(indice);
        sc.close();
    }
}
