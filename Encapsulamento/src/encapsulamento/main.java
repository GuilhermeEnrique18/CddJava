package encapsulamento;

public class main {

	public static void main(String[] args) {

		Retangulo retangulo1 = new Retangulo();
		
		retangulo1.setAltura(21);
		retangulo1.setBase(5);

		System.out.printf(" A área do retangulo é: %.2f\n O perimetro do retangulo é: %.2f",retangulo1.calculaArea(),retangulo1.calculaPerimetro());
		
	}

}
