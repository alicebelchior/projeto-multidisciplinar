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
public class CadastroClienteConexao {

    //CREATE
    public void InserirCliente() {
        Connection conn = null;

        String sql = "INSERT INTO cliente (nome_cliente, cpf_cliente, rg_cliente, endereco_cliente, telefone_cliente, email_cliente, observacao)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";

        //conexão com o BD
        conn = Conexao.getConexao();

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadastroCliente.nome_cliente);
            stmt.setString(2, CadastroCliente.cpf_cliente);
            stmt.setString(3, CadastroCliente.rg_cliente);
            stmt.setString(4, CadastroCliente.endereco_cliente);
            stmt.setString(5, CadastroCliente.telefone_cliente);
            stmt.setString(6, CadastroCliente.email_cliente);
            stmt.setString(7, CadastroCliente.observacao);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados! Erro:" + ex);
        } finally {
            Conexao.fecharConexao(conn, stmt);
        }
    }
    
    //UPDATE
    public void AtualizarCliente() {
        Connection conn = null;
        
        //conexão com o BD
        conn = Conexao.getConexao();

        String sql = "UPDATE cliente SET nome_cliente = ?, cpf_cliente = ?, rg_cliente = ?, endereco_cliente = ?,"
                + " telefone_cliente = ?, email_cliente = ?, observacao = ?"
                + "WHERE codigo_cliente = ?";

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadastroCliente.nome_cliente);
            stmt.setString(2, CadastroCliente.cpf_cliente);
            stmt.setString(3, CadastroCliente.rg_cliente);
            stmt.setString(4, CadastroCliente.endereco_cliente);
            stmt.setString(5, CadastroCliente.telefone_cliente);
            stmt.setString(6, CadastroCliente.email_cliente);
            stmt.setString(7, CadastroCliente.observacao);
            stmt.setInt(8, CadastroCliente.codigo_cliente);

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
    public void DeletarCliente() {
        Connection conn = null;
        
        conn = Conexao.getConexao();//conexão com o banco de dados

        String sql = "DELETE FROM cliente WHERE codigo_cliente = ?";

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, CadastroCliente.codigo_cliente);

            stmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados! Erro:" + e);
        }
    }
}
