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

public class CadastroUsuarioConexao {
    //CREATE
    public void InserirUsuario() {
        Connection conn = null;

        String sql = "INSERT INTO login (nome, cpf_usuario, telefone, usuario, senha)"
                + " VALUES (?, ?, ?, ?, ?)";

        //conexão com o BD
        conn = Conexao.getConexao();

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadastroUsuario.nome);
            stmt.setString(2, CadastroUsuario.cpf_usuario);
            stmt.setString(3, CadastroUsuario.telefone);
            stmt.setString(4, CadastroUsuario.usuario);
            stmt.setString(5, CadastroUsuario.senha);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados! Erro:" + ex);
        } finally {
            Conexao.fecharConexao(conn, stmt);
        }
    }
}
