import java.util.Scanner;

public class beeSubstituiçãoEmVetores1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[10];

        for(int i = 0; i < x.length ; i++){
            x[i] = sc.nextInt();

            if(x[i] < 0){
                x[i] = 1;
            }
            System.out.println("X" + "[" + i + "] = " + x[i]);
        }
    }
}
