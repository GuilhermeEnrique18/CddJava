package fundamentosII;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem na sua sala?");
		int qtdAlunos = input.nextInt();
		int i= 1;
		// double aux = 0;
		double notaAluno = 0;
				
		while (i <= qtdAlunos) {
			System.out.printf("Digite a nota do aluno %d \n",i);
			notaAluno += input.nextDouble();
			//aux += notaAluno ;
			i++;			
		}
		
		double mediaNota = notaAluno / qtdAlunos;
		
/*		if (mediaNota < 7) {
			System.out.println("Turma abaixo da media ;(");
		} else if (mediaNota >= 7) {
			System.out.println("Turma acima da média! :)");
		}*/
		String resultado = mediaNota >= 7 ? "Turma aprovada!" : "Turma reprovada!";
		System.out.printf("A média da turma foi: %.2f e a turma foi %s",mediaNota,resultado);
	}

}
