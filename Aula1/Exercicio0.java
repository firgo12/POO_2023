import java.util.Scanner;

public class Exercicio0 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 0, num =0;
		
		System.out.print("Digite um número inteiro: ");
		n = entrada.nextInt();
		
		System.out.print(n + " ");
		
		while(num != 1) {
			
			num = calculo(n);
			n = num;
			System.out.print(num + " ");
			
		}
		
		//System.out.print("Valor de n" );
		// n = entrada.nextInt();
		
		//While(true){
			//System.out.println(n + " ");
			//if(n == 1){
				//break;
			//}
		
		//if (n % 2 == 0) {
			
			//n = n/2;
			
		//} else {
			
			//n = (n*3) + 1;
		//}
	
		//}

	}
	
	public static int calculo (int n) {

		if (n % 2 == 0) {
			
			n = n/2;
			
		} else {
			
			n = (n*3) + 1;
		}
		
		return n;
	}

}
