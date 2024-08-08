package empregado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import empregado.conexao.Conexao;
import empregado.entidade.Empregado;

public class EmpregadoDAO {
	
	//PreparedStament um objeto que permite executar os comandos de SQL, sabe sua senha e login. 
	private PreparedStatement ps;
	//Realizar as Querrys, comandos e etc
	private String sql;
	//Conexão com o Banco de Dados
	private Conexao conexao;
	//Devolver os selects
	private ResultSet rs;
	
	//Construtor do departamento
	public EmpregadoDAO() {
		conexao = new Conexao();
	}
	
	//Método para pesquisar um empregado pelo ID
	public boolean pesquisar(int id) {
		boolean status = false;
		sql = "select * from java_empregado where id = ?";
		
		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery(); //SOMENTE PARA O SELECT - CONSULTA
			//Encontrou id = ? (EXEMPLO: 1), se sim, retorna true
			if(rs.next()) {
				status = true;
			}
			ps.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("erro ao pesquisar empregado\n"+ e);
		}
		
		return status;
	}
	
	//Metodo para inserir um empregado no banco de dados
	public void inserir(Empregado empregado) {
		sql = "insert into java_empregado(id, nome, salario, id_departamento) values(?, ?, ?, ?)";
		
		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			//Configurando o int. Posição/ordem do interrogação e depois falar onde pegar
			ps.setInt(1, empregado.getId());
			ps.setString(2, empregado.getNome());
			ps.setDouble(3, empregado.getSalario());
			ps.setInt(4, empregado.getDepartamento().getId());
			//O ps sabe onde está a conexão, banco de dados, porta e etc. Por isso mandamos ele executar para levar as informações para o BD, assim executando os comandos
			ps.execute();
			//Fechar a conexão com BD que leva as informações para o BD (ps)
			ps.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	//Método para remover um empregado pelo ID
	public void remover(int id) {
		sql = "DELETE FROM java_empregado WHERE id = ?";
		
		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("erro ao pesquisar empregado\n"+ e);
		}
	}
	
}
