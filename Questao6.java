public class Questao6 {

    public static void main(String[] args) {
        int numeroAtual = 1, numeroAnterior = 0;

        System.out.printf("-> %d %n-> %d%n", numeroAnterior, numeroAtual);

        for(int proximoNumero = numeroAnterior + numeroAtual; proximoNumero < 150; proximoNumero = numeroAnterior + numeroAtual) {
            System.out.println("-> " + proximoNumero);
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;

        }

    }
}
