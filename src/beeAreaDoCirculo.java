import java.util.Scanner;
public class beeAreaDoCirculo {
    static void main(String[] args) {
        //Beecrowd 1002
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;
        double raio = sc.nextDouble();
        double area = pi * Math.pow(raio ,2);

        System.out.printf(" %.4f A =" ,  area);




        sc.close();
    }
}
