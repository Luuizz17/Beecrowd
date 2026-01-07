import java.util.Scanner;

public class beeIdadeDias {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        int entrada = h1 * 60 + m1;
        int saida = h2 * 60 + m2;

        if (saida <= entrada) {
            saida += 24 * 60;
        }

        int duracao = saida - entrada;
        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);

        sc.close();
    }
}
