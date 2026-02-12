import java.util.Scanner;

public class beeExperiencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //quantidade de casos
        int C = 0;
        int R = 0;
        int S = 0;

        for(int i = 0; i < N ; i++){
            int valores = sc.nextInt();
            char tipo = sc.next().charAt(0);

            if(tipo == 'C'){
                C += valores;
            } else if(tipo == 'R'){
                R += valores;
            } else if( tipo == 'S'){
                S += valores;
            }
        }
        int totalCobaias = C + R + S;
        double percC = (double) C / totalCobaias * 100;
        double percR = (double) R / totalCobaias * 100;
        double percS = (double) S / totalCobaias * 100;
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + C);
        System.out.println("Total de ratos: " + R);
        System.out.println("Total de sapos: " + S);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percS);

        sc.close();
    }
}
