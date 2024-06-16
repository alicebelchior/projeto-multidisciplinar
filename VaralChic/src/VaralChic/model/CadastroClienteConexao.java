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
    public void InserirUsuarCliente() {
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
}
