package encapsulamento;

public class Retangulo {
	
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calculaArea(){
		return this.base * this.altura;
	}
	public double calculaPerimetro(){
		return (this.base + this.altura) * 2;
	}
	
}
