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
}
