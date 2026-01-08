import java.util.Scanner;

public class beeSomaImparesConsecutivosI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X =sc.nextInt();
        int Y = sc.nextInt();
        int soma = 0;

        if(X > Y){
            int temp =X ;
            X =Y ;
            Y =temp;
        }

        for(int i = X + 1; i< Y ; i++){
            if(i%2!=0){
                soma+=i;
            }
        }
        System.out.println(soma);
    }
}
