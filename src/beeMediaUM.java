        import java.util.Scanner;
        public class beeMediaUM {
            static void main(String[] args) {
                //beecrowd 1005
                Scanner sc = new Scanner(System.in);

                double A = sc.nextDouble();
                double B = sc.nextDouble();

                double media = (A * 3.5 + B * 7.5) /11.0;
                System.out.printf("MEDIA = %.5f\n", media);


                sc.close();
            }
        }
