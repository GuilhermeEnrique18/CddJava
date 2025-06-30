package Metodos;

public class Concessionaria {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		Carro c2 = new Carro("Suv",2.500);
		Carro c3 = new Carro("Preto", "UnoMiller", 55.000);
		
		c1.cor = "Azul";
		System.out.println(c1.cor);
		c1.modelo = "Civic";
		System.out.println(c1.modelo);
		c1.preco = 45000.00;
		System.out.println(c1.preco);
		System.out.printf(c2.modelo, c2.preco);
		System.out.printf(c3.cor,c3.modelo,c3.preco);
		
	}

}
