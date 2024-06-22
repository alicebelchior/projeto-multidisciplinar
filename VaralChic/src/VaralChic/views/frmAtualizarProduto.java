package VaralChic.views;

import VaralChic.conexao.Conexao;
import VaralChic.model.CadastroProduto;
import VaralChic.model.CadastroProdutoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmAtualizarProduto extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public frmAtualizarProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblQuantiEstoque = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtQuantEstoque = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnAtualizarProduto = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblLogotipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(920, 600));
        setName("Cadastro de Produto"); // NOI18N
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Atualizar produto");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, -1, -1));

        lblCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria de roupa");
        getContentPane().add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        lblQuantiEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantiEstoque.setText("Quantidade em estoque");
        getContentPane().add(lblQuantiEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        lblPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPreco.setText("Preço");
        getContentPane().add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        txtCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 500, 30));

        txtQuantEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuantEstoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtQuantEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 500, 30));

        txtPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPreco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 500, 30));

        btnAtualizarProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtualizarProduto.setText("Atualizar");
        btnAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 130, 50));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 25, -1, -1));

        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoVaralChic/VARALCHIC logo.png"))); // NOI18N
        getContentPane().add(lblLogotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //SALVAR OS DADOS DO FORMULARIO CADASTRAR PRODUTO
    private void btnAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProdutoActionPerformed
        // PEGANDO OS DADOS DIGITADOS E JOGANDO PARA OS ATRIBUTOS DA CLASSE "CadastroProduto" (pacote model)
        CadastroProduto.categoria = txtCategoria.getText();
        CadastroProduto.quantidade_estoque = Integer.parseInt(txtQuantEstoque.getText());
        CadastroProduto.preco = Float.parseFloat(txtPreco.getText());

        CadastroProdutoConexao cadprodupd = new CadastroProdutoConexao();
        cadprodupd.AtualizarProduto();

        this.dispose();
    }//GEN-LAST:event_btnAtualizarProdutoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // buscar os dados quando iniciar o formulario
        povoarJTable();
    }//GEN-LAST:event_formWindowOpened

    //VOLTAR PARA A PAGINA ANTERIOR
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // CHAMANDO A PÁGINA DE CONSULTA
        frmConsultaProduto updtProduto = new frmConsultaProduto();
        updtProduto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    //método para buscar os dados selecionados na tabela "tblProduto" da tela "frmConsultProduto"
    //e trazê-los para os campos do "frmAtualizarProduto"
    public void povoarJTable() {
        Connection conn = null;

        ResultSet rs = null;

        PreparedStatement stmt = null;

        conn = Conexao.getConexao(); //conectar ao banco

        String sql = "SELECT * FROM produto WHERE codigo_produto = '" + CadastroProduto.codigo_produto + "'";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.execute();

            rs = stmt.executeQuery();

            rs.next();

            txtCategoria.setText(rs.getString("categoria"));
            txtQuantEstoque.setText(rs.getString("quantidade_estoque"));
            txtPreco.setText(rs.getString("preco"));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados! Erro:" + e);
        } finally {
            Conexao.fecharConexao(conn, stmt, rs);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAtualizarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarProduto;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantiEstoque;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantEstoque;
    // End of variables declaration//GEN-END:variables
}
