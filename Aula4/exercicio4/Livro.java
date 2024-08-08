package exercicio4;

public class Livro {

	// atributos ou propriedades ou variável de instância (= objeto)
	int id;
	String titulo;
	String autor;
	//Por padrão boolean começa como 'false'
	boolean disponivel;
	
	//método para simular o empréstimo
	public void emprestarLivro() {
		//Se verdadeiro
		if(disponivel) {
			disponivel = false;
		}
	}
	
	//método para simular a devolução
	public void devolverLivro() {
		if(!disponivel) {
			disponivel = true;
		}
	}
	
	//método para retornar os dados
	public String getDados() {
		return id + "\n" + titulo + "\n" + autor + "\n" + disponivel;
	}
}
