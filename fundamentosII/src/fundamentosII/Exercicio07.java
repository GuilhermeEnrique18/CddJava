package fundamentosII;
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sua sala? \n");
		int qtdAlunos = input.nextInt();
		double nota = 0, media = 0;

		
		for (int i = 0; i < qtdAlunos ; i++) {
			System.out.printf("Digite a nota %d \n",i);
			nota += input.nextDouble();
			
		}
		
		media  = nota / qtdAlunos;
		String resultado = media < 7 ? "A turma foi reprovada" : "A turma foi aprovada";
		System.out.println(resultado);
	}

}
