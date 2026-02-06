import java.util.Scanner;

public class beeSelecaoDeVertorI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[100];
        double numeros = 0;


        for(int i =0; i <A.length ; i++){
            numeros = sc.nextDouble();
            A[i] = i;

            if(numeros <=10){
                System.out.println("A[" + A[i] +"]"+ " = " + numeros);
            }

        }


        sc.close();
    }
}
