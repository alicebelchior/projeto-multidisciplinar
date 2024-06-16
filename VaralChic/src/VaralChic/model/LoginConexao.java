package VaralChic.model;

import VaralChic.conexao.Conexao;
import VaralChic.views.frmPaginaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
essa classe sera responsavel pela execução dos comandos SQL
 */
public class LoginConexao {
//    CREATE
//    public void InserirUsuario() {
//        Connection conn = null;
//
//        String sql = "INSERT INTO login (usuario, senha) VALUES (?, ?)";
//
//        //conexão com o BD
//        conn = Conexao.getConexao();
//
//        PreparedStatement stmt = null;
//
//        try {
//            stmt = conn.prepareStatement(sql);
//            stmt.setString(1, Login.usuario);
//            stmt.setString(2, Login.senha);
//
//            stmt.executeUpdate();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados! Erro:" + ex);
//        } finally {
//            Conexao.fecharConexao(conn, stmt);
//        }
//    }

    //READ
    public void VerificarUsario() {
        Connection conn = null;

        String sql = "SELECT * FROM login WHERE usuario = '"+ Login.usuario + "'";

        //conexão com o BD
        conn = Conexao.getConexao();

        PreparedStatement stmt = null;
        
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            rs.next();
            
            String usuario1 = rs.getString("usuario");
            String senha1 = rs.getString("senha");
            
            //testar se o usuario é o mesmo digitado
            if(usuario1.equals(Login.usuario) && senha1.equals(Login.senha)){
                frmPaginaPrincipal pagPrincipal = new frmPaginaPrincipal();
                pagPrincipal.setVisible(true);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao entrar no sistema! Erro:" + ex);
        } finally {
            Conexao.fecharConexao(conn, stmt);
        }
    }
}
