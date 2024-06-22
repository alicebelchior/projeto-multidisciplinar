package VaralChic.model;

import VaralChic.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alice
 */

/*
essa classe sera responsavel por conectar com o banco de dados
 */
public class CadastroProdutoConexao {
    //CREATE
    public void InserirProduto() {
        Connection conn = null;

        String sql = "INSERT INTO produto (categoria, quantidade_estoque, preco) VALUES (?, ?, ?)";

        //conexão com o BD
        conn = Conexao.getConexao();

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadastroProduto.categoria);
            stmt.setString(2, String.valueOf(CadastroProduto.quantidade_estoque));
            stmt.setString(3, String.valueOf(CadastroProduto.preco));

            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados! Erro:" + ex);
        } finally {
            Conexao.fecharConexao(conn, stmt);
        }
    }
    
    //UPDATE
    public void AtualizarProduto() {
        Connection conn = null;
        
        //conexão com o BD
        conn = Conexao.getConexao();

        String sql = "UPDATE produto SET categoria = ?, quantidade_estoque = ?, preco = ?"
                + "WHERE codigo_produto = ?";

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadastroProduto.categoria);
            stmt.setString(2, String.valueOf(CadastroProduto.quantidade_estoque));
            stmt.setString(3, String.valueOf(CadastroProduto.preco));
            stmt.setInt(4, CadastroProduto.codigo_produto);

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar no banco de dados! Erro:" + ex);
        } finally {
            Conexao.fecharConexao(conn, stmt);
        }
    }
    
    //DELETE
    //metodo para DELETAR a linha e os dados escolhidos no banco de dados
    public void DeletarProduto() {
        Connection conn = null;
        
        conn = Conexao.getConexao();//conexão com o banco de dados

        String sql = "DELETE FROM produto WHERE codigo_produto = ?";

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, CadastroProduto.codigo_produto);

            stmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados! Erro:" + e);
        }
    }
}
