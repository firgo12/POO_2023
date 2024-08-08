package br.fiap.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fiap.entidade.Funcionario;
import br.fiap.entidade.Venda;


public class VendaDAO extends DAO {
	
	// método para inserir uma venda na tabela java_venda
	public void inserir(Venda venda) {
		sql = "insert into java_venda values(venda_sequence.nextval, ?, ?, ?)";
		
		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, venda.getFuncionario().getId());
			ps.setDouble(2, venda.getValor());
			ps.setDouble(3, venda.calcularComissao());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir vendas");
		}
	}
	
	// método para listar(LIST) todos os funcionários e a soma de suas vendas
	public List<Venda> listar(){
		List<Venda> lista = new ArrayList<>();
		Funcionario funcionario;
		Venda venda;
		
		sql="SELECT jf.nome \"nome\", jf.salario \"salario\", SUM(jv.comissao) \"total_comissao\"\r\n"
				+ "FROM java_funcionario jf LEFT JOIN java_venda jv\r\n"
				+ "ON (jf.id_funcionario = jv.id_funcionario)\r\n"
				+ "Group BY jf.nome, jf.salario\r\n"
				+ "ORDER BY jf.nome";
		
		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				funcionario = new Funcionario();
				venda = new Venda();
				funcionario.setNome(rs.getString("nome"));
				funcionario.setSalario(rs.getDouble("salario"));
				venda.setFuncionario(funcionario);
				venda.setComissao(rs.getDouble("total_comissao"));
				lista.add(venda);
			}
			
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir vendas");
		}
		
		return lista;
	}
	
}
