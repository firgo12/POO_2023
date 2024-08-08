import java.util.Scanner;

public class Exemplo1 {
	
	Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] x = {1, 2, 3};
		double [] y = {0.5, 1.76, 4.9};
		String [] z = {"amora", "caqui", "calor"};
		
		//Sobrecarga --> Para ser sobrecarga precisa ser de tipos diferentes ou/e parametros diferentes
		imprimir(x);
		imprimir(y);
		imprimir(z);

	}
	
	public static void imprimir(String[] z) {
		//FOREACH (Declaração de variavel: array)
		//Os dois pontos é "associado"
		for (String i : z) {
			System.out.println(i);
		}
		//z[i] ---> i
		
	}

	public static void imprimir(double[] y) {
		for (double i : y) {
			System.out.println(i);
		}
		
	}

	public static void imprimir(int [] x) {
		for (int i : x) {
			System.out.println(i);
		}
		
	}

}
