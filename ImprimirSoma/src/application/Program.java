package application;

public class Program {

	public static void main(String[] args) {
		
		int resultadoSoma = 0;
		
		for(int i = 1; i <= 1000 ;i++) {
			
			resultadoSoma += i;
			
		}

		System.out.printf("Soma = %d", resultadoSoma);
		
	}

}
