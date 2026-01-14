import java.util.Scanner;

public class beeValidaçãoDeNota {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double media = 0;
        double soma=0;
        int contador =0;

        while(contador<2){

            nota = sc.nextDouble();
            if(nota >=0 && nota <=10){
                soma +=nota;
                contador++;
            } else{
                System.out.println("nota invalida");
            }
        }
         media= soma/2;
        System.out.println("media = " +media);


     sc.close();
    }
}
