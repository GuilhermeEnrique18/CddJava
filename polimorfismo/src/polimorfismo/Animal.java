package polimorfismo;

public class Animal {
	public String cor;
	public String especie;
	public double peso;
	
	
	public Animal(String cor, String especie, double peso) {
		this.cor = cor;
		this.especie = especie;
		this.peso = peso;
		
	}
	
	public void somAnimal() {
		System.out.println("Sei la, botasse nada, imagina um som de qualquer animal aí doidão");
	}
	public void somAnimal(String nomeAnimal) {
		
		if(nomeAnimal.equals("cachorro")) {
			System.out.println("Au au au au");
			
		}else if (nomeAnimal.equals("gato")) {
			System.out.println("Miau miau");
		}
		
	}
	
	
	
	public void comer() {
		System.out.println("Está comendo");
	}
}
