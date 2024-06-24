package VaralChic.model;

import VaralChic.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alice
 */
public class VendaConexao {

    public void criarVenda(int codigo_cliente, int codigo_produto, java.sql.Date data_venda, float valor, String metodo_pagamento) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "INSERT INTO venda (codigo_cliente, codigo_produto, data_venda, valor, metodo_pagamento)"
                + " VALUES (?, ?, ?, ?, ?)";

        try {
            conn = Conexao.getConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, CadastroCliente.codigo_cliente);
            stmt.setInt(2, CadastroProduto.codigo_produto);
            stmt.setDate(3, data_venda);
            stmt.setFloat(4, valor);
            stmt.setString(5, metodo_pagamento);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venda criada com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados. Erro: " + ex);
            
        } finally {
            Conexao.fecharConexao(conn, stmt);
        }
    }

    public boolean verificarCodigoCliente(int codigo_cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT codigo_cliente FROM cliente WHERE codigo_cliente = ?";

        try {
            conn = Conexao.getConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, codigo_cliente);

            rs = stmt.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar o código do cliente! Erro: " + ex);
            return false;
            
        } finally {
            Conexao.fecharConexao(conn, stmt, rs);
        }
    }

    public boolean verificarCodigoProduto(int codigo_produto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT codigo_produto FROM produto WHERE codigo_produto = ?";

        try {
            conn = Conexao.getConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, codigo_produto);

            rs = stmt.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar o código do produto! Erro: " + ex);
            return false;
            
        } finally {
            Conexao.fecharConexao(conn, stmt, rs);
        }
    }
}