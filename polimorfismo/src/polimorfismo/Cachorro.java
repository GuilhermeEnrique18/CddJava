package polimorfismo;

public class Cachorro extends Animal{

	public static void main(String[] args) {
		Animal animal1 = new Animal("Vermelho","Fodase",45.20);
		Animal animal2 = new Animal("Azul","Seila",50);
		Cachorro toto = new Cachorro("Rosa","Orra",40);
		
		animal1.somAnimal();
		animal1.somAnimal("cachorro");
		animal1.somAnimal("gato");
		toto.comer();
		
	}
	
	
	
	public Cachorro(String cor, String especie, double peso) {
		super(cor,especie,peso);
	}
	
	public void comer() {
		System.out.println("Está comendo ração");
	}
	
	public void latir() {
		System.out.println("Au au au au");
	}
}
