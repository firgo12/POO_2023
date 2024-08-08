package empregado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import empregado.conexao.Conexao;
import empregado.entidade.Departamento;

public class DepartamentoDAO {
	//PreparedStament um objeto que permite executar os comandos de SQL, sabe sua senha e login. 
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
			//O ps sabe onde está a conexão, banco de dados, porta e etc. Por isso mandamos ele executar para levar as informações para o BD, assim executando os comandos
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
			//rs = ps.executeQuery(); -  Copia da tabela
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
	
	//Método para listar TODOS os departamentos
	public List<Departamento> listar(){
		List<Departamento> lista = new LinkedList<>();
		sql = "select * from java_departamento order by id";
		
		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery(); //SOMENTE PARA O SELECT - CONSULTA
			while (rs.next()) {
				lista.add(new Departamento(rs.getInt("id"), rs.getString("nome")));
			}
			ps.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return lista;
	}
}

