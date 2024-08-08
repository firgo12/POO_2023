import java.util.ArrayList;

public class Controle {

	private ArrayList<Empregado> lista = new ArrayList<>();
	
	public void inserir (Empregado empregado) {
		lista.add(empregado);
	}
	
	public Empregado pesquisar(long matricula) {
		Empregado aux = null;
		for (Empregado e : lista) {
			if(e.matricula == matricula) {
				aux = e;
			}
		}
		return aux;
	}
	
	public String listar () {
		String auxHorista = "Empregado Horista\n";
		String auxComissionado = "Empregado Comissionado\n";
		
		for (Empregado e : lista) {
			if (e instanceof EmpregadoHorista) {
				auxHorista += e + "\n";
			} else {
				auxComissionado += e + "\n";
			}
		}
		
		return auxHorista + auxComissionado;
	}
	
}
