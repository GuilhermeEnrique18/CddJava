package fundamentosII;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio10 {

	public static void main(String[] args) {

				Scanner input = new Scanner(System.in);
				double numDigitado = 0, media = 0;
				double arrayNotas[] = new double[5];
				
				for(int i = 0; i < arrayNotas.length; i++) {
					System.out.printf("Digite a nota %d º\n",i+1);
					arrayNotas[i] = input.nextDouble();
					numDigitado += arrayNotas[i];
				}
				media = numDigitado / arrayNotas.length;;
				System.out.println(Arrays.toString(arrayNotas));
				System.out.println(media);
				
				System.out.println(media > 7 ? "Turma aprovada":"Turma reprovada");
				
			}

		}

	


