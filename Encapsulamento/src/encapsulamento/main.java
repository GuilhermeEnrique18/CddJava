package encapsulamento;

public class main {

	public static void main(String[] args) {

		AnimalDeEstimacao kleber = new AnimalDeEstimacao();
		kleber.setNome("Kleber");
		kleber.setIdade(21);
		kleber.setRaca("Lulu da o Palmeiranas");
		kleber.setTipo("Cachorro");
		
		System.out.printf(" Nome: %s \n Idade: %d \n Raça: %s \n Tipo: %s",kleber.getNome(),kleber.getIdade(),kleber.getRaca(),kleber.getTipo());
		
		
	}

}
