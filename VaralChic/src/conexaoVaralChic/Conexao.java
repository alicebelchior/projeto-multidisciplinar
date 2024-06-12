/*
classe para conectar com o banco de dados
 */
package conexaoVaralChic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    //atributos static para a conexao e serão final = serão uma constante
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mydbvaralchic";
    private static final String USER = "root";
    private static final String PASS = "abc1234";

    //abrir conexão
    public static Connection getConexao() {
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Algo de errado aconteceu com a conexão com o banco, veja: " + ex);
        }
    }

    //fechar conexao
    public static void fecharConexao(Connection conn) {
        if (conn != null) { //se estiver conectado
            try {
                conn.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Algo de errado aconteceu com o fechamento com o banco, veja: " + ex);
            }
        }
    }

    //fechar conexão, do tipo quando só estiver conectado 
    public static void fecharConexao(Connection conn, PreparedStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Algo de errado aconteceu com o fechamento com o banco, veja: " + ex);
            }
        }
        fecharConexao(conn);
    }

    //fechar conexão, do tipo quando só estiver conectado 
    public static void fecharConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Algo de errado aconteceu com o fechamento com o banco, veja: " + ex);
            }
        }
        fecharConexao(conn, stmt);
    }
}
