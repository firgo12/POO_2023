import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		
		//Usando a super classe
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		//ArrayList<Produto> lista = new ArrayList<Produto>();
		
		//inserindo3ojetos
		lista.add(new Produto(1, "arroz", 25.50));
		lista.add(new Produto(2, "feijoada", 60));
		lista.add(new Produto(3, "caipirinha", 15));
		
		//impressão usando o for tradicional
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		//impressão usando o for each
		for (Produto p : lista) {
			System.out.println(p);
		}
		

	}

}
