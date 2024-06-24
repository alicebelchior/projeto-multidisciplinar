/*
classe para conectar com o banco de dados varal_chic
 */
package VaralChic.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
//    public Connection conectaBD() {
//        Connection conn = null;
//        
//        try {
//            String url = "jdbc:mysql://localhost:3306/varal_chic?user=root$password=1234";
//            conn = DriverManager.getConnection(url);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Erro ao conectar o banco de dados. Erro: " + e.getMessage());
//        }
//        return conn;
//    }

    //atributos static para a conexao e serão final = serão constantes
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/varal_chic";
    private static final String USER = "root";
    private static final String PASS = "1234";

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

    public static Connection getConxeao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
