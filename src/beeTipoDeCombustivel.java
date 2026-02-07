import java.util.Scanner;

public class beeTipoDeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipoCombustivel = 0;
        int contador = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel =0;

        while(true){
        tipoCombustivel = sc.nextInt();
        if(tipoCombustivel > 4 || tipoCombustivel < 1){
            System.out.println("código invalido");
        } else {
            contador++;
        }
        switch(tipoCombustivel){
            case 1 :
                alcool++;
                break;
            case 2 :
                gasolina++;
                break;
            case 3:
                diesel++;
                break;
        }
        if(tipoCombustivel==4){
            break;
        }

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool : " + alcool);
        System.out.println("Gasoina : " + gasolina);
        System.out.println("Diesel : " + diesel);
    }
}
