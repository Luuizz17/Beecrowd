import java.util.Scanner;

public class beePUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int valor = 1;
        System.out.println((valor)+ " " + (valor+1) + " " + (valor+2) + " PUM" );
        for(int i =1 ; i < n ; i++){
           valor+=4;
            System.out.println(valor + " " + (valor+1) + " " + (valor+2) + " PUM");
        }
        sc.close();
    }
}
