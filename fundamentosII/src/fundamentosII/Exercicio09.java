package fundamentosII;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numDigitado = 0;
		int arrayA[] = new int[4];
		int arrayB[] = new int[4];
		int arrayC[] = new int[4];
		int arrayD[] = new int[4];
		
		for(int i = 0; i < arrayA.length; i++) {
			System.out.printf("Digite um número para adicionar ao A para adicionar na posição: %d \n",i);
			arrayA[i] = input.nextInt();
			System.out.printf("Digite um número para adicionar ao B para adicionar na posição: %d \n",i);
			arrayB[i] = input.nextInt();
			System.out.printf("Digite um número para adicionar ao C para adicionar na posição: %d \n",i);
			arrayC[i] = input.nextInt();
			System.out.printf("Digite um número para adicionar ao D para adicionar na posição: %d \n",i);
			arrayD[i] = input.nextInt();

		}
		System.out.println(Arrays.toString(arrayA));
		System.out.println(Arrays.toString(arrayB));
		System.out.println(Arrays.toString(arrayC));
		System.out.println(Arrays.toString(arrayD));
	}

}
