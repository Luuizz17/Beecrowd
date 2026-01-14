import java.util.Scanner;

public class beeSenhaFixa {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int talvez = 0;
        while(talvez!= senha){
            talvez = sc.nextInt();
            if(senha != talvez){
                System.out.println("senha invalida");
            } else if(senha == talvez){
                System.out.println("senha valida");
            }
        }
    }
}
