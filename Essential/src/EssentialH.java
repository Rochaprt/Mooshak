import java.util.Scanner;

public class EssentialH {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        boolean naoprimo;

        numero = ler.nextInt();
        naoprimo = false;

        for (int i = 1; i <= numero; i++) {

            if (numero == 1) {
                naoprimo = true;
            } else {
                if (numero % i == 0 && i != 1 && i != numero) {
                    naoprimo = true;
                }
            }
        }

        if (naoprimo == false) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
