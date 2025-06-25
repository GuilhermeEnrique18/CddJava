package fundamentosII;

public class Exercicio08 {

	public static void main(String[] args) {
		int multTres = 0, multCinco = 0, total = 0;

		for (int i = 0; i <= 20 ; i++) {
			
			multTres += i%3==0?i:0;
			multCinco += i%3==0?i:0;
			
			
			/*if (i % 3 == 0) {
				System.out.println(i);
				multTres += i;
			}
			 if (i % 5 == 0) {
				System.out.println(i);
				multCinco += i;
			}*/
			
		}
		System.out.println(multTres);
		System.out.println(multCinco);
		
		total = multTres + multCinco;
		System.out.println(total);
	}

}
