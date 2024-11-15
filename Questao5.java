/*Em Java, INT é um tipo de dado de 32 bits, quando os valores chegam no limite da capacidade de armazenamento da variavel, ocorre o overflow, e o valor "transborda" para 
o lado negativo ou para um número incorreto. Ja o tipo LONG tem uma capacidade de 64 bits, isso permite que o cálculo do fatorial funcione corretamente para valores um pouco 
maiores, mas eventualmente ainda ocorrera overflow para números maiores, ja que a capacidade dele é maior que a do INT, mas não é infinita. */
public class Questao5 {

    public static void main(String[] args) {

        //Estrutura com a variavel recebendo o tipo int
        int numeroFatorial = 1;

        for (int i = 1; i <= 40; i++) {
            numeroFatorial *= i; 
            System.out.printf("Fatorial de %d é = %d%n", i, numeroFatorial);
        }

        System.out.printf("%n");
        System.out.printf("--------------------------------------------------------------------------%n");
        System.out.printf("%n");
        
        //Estrutura com a variavel recebendo o tipo long
        long numeroFatorialLng = 1;

        for (int i = 1; i <= 40; i++) {
            numeroFatorialLng *= i; 
            System.out.printf("Fatorial de %d é = %d%n", i, numeroFatorialLng);
        }



    }
}
