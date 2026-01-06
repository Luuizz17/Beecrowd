import java.util.Scanner;

public class beeParesImparPositivoNegativo {
    static void main(String[] args) {
        //beecrowd 1066
       Scanner sc = new Scanner(System.in);

       int valorPar = 0;
       int valorImpar = 0;
       int valorPositivo = 0;
       int valorNegativo = 0;

       for(int i =0 ; i < 5 ; i++){
           int valor = sc.nextInt();

           if(valor > 0){
               valorPositivo++;
           }
           if(valor<0){
               valorNegativo++;
           }
           if(valor % 2 == 0){
               valorPar++;
           }
           if(valor % 2 !=0){
               valorImpar++;
           }

       }
        System.out.println(valorPar +  " valor(es) par(es)");
        System.out.println(valorImpar+  " valor(es) impar(es)");
        System.out.println(valorPositivo + " valor(es) positivo(s)");
        System.out.println(valorNegativo + " valor(es) negativo(s)");
    }
}
