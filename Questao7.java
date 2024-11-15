import java.util.Scanner;

public class Questao7 {
      public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numeroDigitado = scnr.nextInt();

        while (numeroDigitado != 1) {
            if (numeroDigitado % 2 == 0) {
                numeroDigitado = numeroDigitado / 2;
            } else {
                numeroDigitado = 3 * numeroDigitado + 1;
            }
            System.out.print(numeroDigitado + " => ");
        }

        scnr.close();
    }
}
