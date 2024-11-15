public class Questao4 {
    
    public static void main(String[] args ) throws Exception {
            
        int numeroFatorial = 1;
    
        for (int i = 1; i <= 10; i++) {
                
            numeroFatorial = -i*(i-(i+numeroFatorial));
            System.out.printf("Fatorial de %d = %d%n", i, numeroFatorial);
                
        }
    
    }
}





