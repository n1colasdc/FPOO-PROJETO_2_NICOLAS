package br.com.zonin.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import br.com.zonin.controller.Conexao;
import br.com.zonin.model.Produto;

public class CrudDAO {
	
	public void create(Produto produto) {
		String sql = "INSERT INTO estoque(Nome, Preco, Quantidade ) VALUES (?,?,?)";
		Connection conn = null;
		PreparedStatement p = null;	
		
		try {
			conn = (Connection) Conexao.criandoconexao();
			p = (PreparedStatement) conn.prepareStatement(sql);
			p.setString(1, produto.getNome());
			p.setInt(2, produto.getQuant());
			p.setFloat(3, produto.getValor());
			p.execute();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Erro ao inserir dados! \nERRO" + e);
		}finally {
			try {
				if (p != null);
				p.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} //fim do inserir
	
	
	
	public void update(Produto produto) {
		String select_sql = "SELECT COUNT(*) FROM estoque WHERE codigo = ?";
		String sql ="UPDATE alunos SET nome = ?, quantidade = ?, preco = ? WHERE codigo = ?";
		Connection conn = null;
		PreparedStatement sl =null;
		PreparedStatement update = null;
		//ResultSet resultado = null;
		
		try {
			conn = (Connection) Conexao.criandoconexao();
			sl = (PreparedStatement) conn.prepareStatement(select_sql);
			
			System.out.println("ate aqui 1" + sl);
			
			sl.setInt(1,produto.getCodigo());
			ResultSet resultado = sl.executeQuery();
					
			
				
			if (resultado.next() && resultado.getInt(1) > 0) {
				
				update = (PreparedStatement) conn.prepareStatement(sql);
				System.out.println("ate aqui 2" + update);
								
				update.setString(1, produto.getNome());
				update.setInt(2, produto.getQuantidade());
				update.setInt(3, produto.getCodigo());
				update.setFloat(4, produto.getPreco());
				System.out.println("ate aqui 4");
				update.execute();
				System.out.println("ate aqui 5");
				//System.out.println(produto.getNome() + " "+ aluno.getIdade());
				
			JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
			System.out.println("dados atualizados com sucesso");
			}else {
				JOptionPane.showMessageDialog(null,  "Erro ao atualizars os dados: \nERRO");
			}
			
			//p.setInt(3,aluno.getRa());
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,  "Erro ao atualizars os dados: \nERRO"+e);
		}finally {
			try {
				if (update != null) {
				update.close();
			} 
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
