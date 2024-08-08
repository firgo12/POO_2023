import java.util.Scanner;

public class Exercicio1 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int i = 0, j = 0;

		System.out.print("Valor de i ");
		i = entrada.nextInt();

		System.out.print("Valor de j ");
		j = entrada.nextInt();

		imprimir(i, j);

	}

	public static void imprimir(int i, int j) {

		int repeticao = 0, maior = 0, n = 0;

		for (; i <= j; i++) {

			repeticao=0;
			n = i;
			
			while (true) {
				repeticao++;
				if (n == 1) {
					break;
				}

				if (n % 2 == 0) {

					n = n / 2;

				} else {

					n = (n * 3) + 1;
				}

			}
			
			if(repeticao > maior) {
				maior = repeticao;
			}

		}
		
		System.out.println(maior);

	}

}
