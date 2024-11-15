import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        
        System.err.print("Digite o numero de linhas: ");
        int numeroLinhas = scnr.nextInt();

        for (int i = 1; i <= numeroLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.printf("%n");
        }

        scnr.close();
    }
}
