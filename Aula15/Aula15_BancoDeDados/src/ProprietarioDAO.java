import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProprietarioDAO {
	private Connection connection;
	private PreparedStatement ps;
	private String sql;
	
	public void inserir(Proprietario p) {//Insere na ordem!
		sql = "insert into java_proprietario(id,nome,cpf) values (?,?,?)";
	}
	
}
