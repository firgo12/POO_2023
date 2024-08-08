
public class Exemplo2 {
	public static void main(String[] args) {
		
		int x = somar(2, 3);
		System.out.println(x);
		int y = somar(2, 3, 1);
		System.out.println(y);
		int z = somar(2, 3, 1, 5, 6);
		System.out.println(z);
		
	}

	//Os três pontos permite colocar todos os parametros do vetor.
	public static int somar(int...x) {
		int total = 0;
		for (int i : x) {
			total += i;
		}
		return total;
	}

}
