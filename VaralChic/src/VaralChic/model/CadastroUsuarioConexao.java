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
    
    //UPDATE
    public void AtualizarUsuario() {
        Connection conn = null;
        
        //conexão com o BD
        conn = Conexao.getConexao();

        String sql = "UPDATE login SET nome = ?, cpf_usuario = ?, telefone = ?, usuario = ?, senha = ?"
                + "WHERE codigo_usuario = ?";

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadastroUsuario.nome);
            stmt.setString(2, CadastroUsuario.cpf_usuario);
            stmt.setString(3, CadastroUsuario.telefone);
            stmt.setString(4, CadastroUsuario.usuario);
            stmt.setString(5, CadastroUsuario.senha);
            stmt.setInt(6, CadastroUsuario.codigo_usuario);

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
    public void DeletarUsuario() {
        Connection conn = null;
        
        conn = Conexao.getConexao();//conexão com o banco de dados

        String sql = "DELETE FROM login WHERE codigo_usuario = ?";

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, CadastroUsuario.codigo_usuario);

            stmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados! Erro:" + e);
        }
    }
}
