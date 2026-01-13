public class beeSequenciaIJ_4 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            double I = i / 5.0;

            for (int j = 1; j <= 3; j++) {
                double J = I + j;

                if (I == (int) I) {
                    System.out.println("I=" + (int) I + " J=" + (int) J);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", I, J);
                }
            }
        }
    }
}
