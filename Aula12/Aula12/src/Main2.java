import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Main2 {

	public static void main(String[] args) {
		
		int id;
		String nome;
		double preco;
		
		try{
			id = parseInt(showInputDialog("ID"));
			nome = showInputDialog("Nome");
			preco = parseDouble(showInputDialog("Preço"));
			Produto p = new Produto(id, nome, preco);
		} catch(NumberFormatException e) {
			showMessageDialog(null, "Você deve digitar um número\n" + e);
		} catch(Exception e) {
			showMessageDialog(null, "Você deve digitar um número");
		}
	}

}
