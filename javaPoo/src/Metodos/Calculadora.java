package Metodos;

public class Calculadora {

	public static void main(String[] args) {

		CalcularMetodos c1 = new CalcularMetodos();
		int resp1 = c1.somar(5, 5);
		int resp2 = c1.somar(5, 5,10);

		System.err.printf("%d / %d", resp1, resp2);

		
	}

}
