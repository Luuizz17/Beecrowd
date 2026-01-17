import java.util.Scanner;

public class beeGrenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorGrenais = 0 ;
        int vitoriaGremio =0;
        int vitoriaInter =0;
        int empates = 0;
        int novogrenal =0;
        while(novogrenal!=2) {
            contadorGrenais++;
            int gremio = sc.nextInt();
            int inter = sc.nextInt();

            //quantidade de vitorias ou empates
            if (gremio > inter) {
                vitoriaGremio++;
            } else if (gremio < inter) {
                vitoriaInter++;
            } else if (gremio == inter) {
                empates++;
            }

            //repete?
            System.out.println("novo grenal (1-sim 2-nao)");
            novogrenal = sc.nextInt();
        }
        System.out.println(contadorGrenais + " grenais");
        System.out.println("Inter: " + vitoriaInter);
        System.out.println("Gremio: " + vitoriaGremio);
        System.out.println("Empate: " + empates);
        if (vitoriaGremio > vitoriaInter) {
            System.out.println("Gremio venceu mais");
        } else if (vitoriaGremio < vitoriaInter) {
            System.out.println("Inter venceu mais");
           } else if(vitoriaGremio == vitoriaInter){
            System.out.println("Empates");
        }

        }
    }
