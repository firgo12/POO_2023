package empregado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import empregado.conexao.Conexao;
import empregado.entidade.Departamento;

public class DepartamentoDAO {
	//PreparedStament permite executar os comandos de SQL. 
	private PreparedStatement ps;
	//Realizar as Querrys, comandos e etc
	private String sql;
	//Conexão com o Banco de Dados
	private Conexao conexao;
	//Devolver os selects
	private ResultSet rs;
	
	//Construtor do departamento
	public DepartamentoDAO() {
		conexao = new Conexao();
	}
	
	//Método para inserir os dados do departamento
	public void inserir(Departamento departamento) {
		sql = "insert into java_departamento(id, nome) values(?, ?)";
		
		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			//Configurando o int. Posição/ordem do interrogação e depois falar onde pegar
			ps.setInt(1, departamento.getId());
			ps.setString(2, departamento.getNome());
			//O ps sabe onde está a conexão, banco de dados, porta e etc. Por isso mandamos ele executar para levar as informações
			ps.execute();
			//Fechar a conexão com BD que leva as informações para o BD (ps)
			ps.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	//método para pesquisar um departamento
	public boolean pesquisar(Departamento departamento) {
		boolean aux = false;
		sql = "select *  from java_departamento where id = ? or nome = ?";
		
		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, departamento.getId());
			ps.setString(2, departamento.getNome());
			ps.execute();
			rs = ps.executeQuery();
			//Encontrou id = ? e nome = ? (EXEMPLO: 1,RH), se sim, retorna true
			if(rs.next()) {
				aux = true;
			}
			ps.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return aux;
	}
}
