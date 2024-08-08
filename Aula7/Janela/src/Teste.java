import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		//Atributos
		String nome;
		int idade;
		double nota;
		
		//Usa o painel do SISTEMA OPERACIONAL - Classe.Método
		//Null (Centraliza a pagina), "String" - Mensagem que vai aparecer no painel
		//JOptionPane.showMessageDialog(null, "Feriado");
		
		
		
		//nome = JOptionPane.showInputDialog("Nome");
		//JOptionPane.showMessageDialog(null, "Boa noite, " + nome);
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		JOptionPane.showMessageDialog(null, idade);

	}

}
