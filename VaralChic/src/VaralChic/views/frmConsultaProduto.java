package VaralChic.views;

import VaralChic.conexao.Conexao;
import VaralChic.model.CadastroProduto;
import VaralChic.model.CadastroProdutoConexao;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class frmConsultaProduto extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public frmConsultaProduto() {
        initComponents();
        
        //modificar o cabeçalho da tabela
        JTableHeader jth = tblProduto.getTableHeader();
        jth.setFont(new Font("Tahoma", Font.BOLD, 14));
    }
    
     private Connection conn = null;

     
    //READ
    //MÉTODO PARA POVOAR A TABELA "tblProduto"
    //BUSCANDO DO BANCO DE DADOS
    public void povoarJTable(String sql) {
        conn = Conexao.getConexao();

        try {
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.execute();

            ResultSet rs = stmt.executeQuery();

            //pegando uma biblioteca que vai criar uma classe que irá povoar a tabela
            DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
            model.setNumRows(0); //ele vai iniciar do primeiro elemento da tabel (1ª coluna)

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("codigo_produto"),
                    rs.getString("categoria"),
                    rs.getString("quantidade_estoque"),
                    rs.getString("preco")
                });
            }

            //fechar a conexão
            Conexao.fecharConexao(conn, stmt, rs);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível obter os dados do banco. Veja: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Preco = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JLabel();
        lblPesquisarProduto = new javax.swing.JLabel();
        txtPesquisarProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnDeleteProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoControle = new javax.swing.JTextField();
        txtNomeControle = new javax.swing.JTextField();
        lblLogotipo = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Categoria de roupa");

        Preco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROLE DE ESTOQUE");
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(920, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTitulo.setText("Consulta de produto");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, -1, -1));

        lblPesquisarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPesquisarProduto.setText("Digite a categoria do produto:");
        getContentPane().add(lblPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 220, 30));

        txtPesquisarProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 500, 30));

        tblProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CATEGORIA DE ROUPA", "QUANTIDADE", "PREÇO"
            }
        ));
        tblProduto.setAutoscrolls(false);
        tblProduto.setMaximumSize(new java.awt.Dimension(300, 200));
        tblProduto.setMinimumSize(new java.awt.Dimension(300, 200));
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduto);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(0).setMinWidth(150);
            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblProduto.getColumnModel().getColumn(0).setMaxWidth(150);
            tblProduto.getColumnModel().getColumn(2).setMinWidth(100);
            tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblProduto.getColumnModel().getColumn(2).setMaxWidth(100);
            tblProduto.getColumnModel().getColumn(3).setMinWidth(100);
            tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblProduto.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 785, 265));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 25, -1, -1));

        btnEditarProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarProduto.setText("EDITAR");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 100, 40));

        btnDeleteProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteProduto.setText("EXCLUIR");
        btnDeleteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PRODUTO SELECIONADO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        txtCodigoControle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCodigoControle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigoControle.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigoControle.setEnabled(false);
        getContentPane().add(txtCodigoControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 40, 30));

        txtNomeControle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNomeControle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNomeControle.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNomeControle.setEnabled(false);
        getContentPane().add(txtNomeControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 450, 230, 30));

        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoVaralChic/VARALCHIC logo.png"))); // NOI18N
        getContentPane().add(lblLogotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecoActionPerformed

    //VOLTAR PARA A PAGINA PRINCIPAL
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // CHAMANDO A PÁGINA PRINCIPAL
        frmPaginaPrincipal pagPrincipal = new frmPaginaPrincipal();
        pagPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    //UPDATE
    //ATULIZAR PRODUTO
    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        //verificando se o campo de código do produto selecionado não esta vazio
        if (txtCodigoControle.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");
        } else {
            // abrir a tela "frmAtualizarProduto"
            frmAtualizarProduto updtProduto = new frmAtualizarProduto();
            updtProduto.setVisible(true);

            //jogar o codigo_cliente (pk) no JTField "txtCodigoControle"
            CadastroProduto.codigo_produto = Integer.parseInt(txtCodigoControle.getText());

            //depois de atualizar, limpar os campos com os dados do cliente previamente atualizado
            txtCodigoControle.setText("");
            txtNomeControle.setText("");
        }
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    //READ
    //CRIAÇÃO DO SQL AO ABRIR O FORMULÁRIO
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Carrega os dados na tabela "tblCliente" quando abrir a tela "frmConsultaProduto"
        // cria o SQL
        String sql = "SELECT * FROM produto ORDER BY codigo_produto DESC";
        
        //chamando o método para povoar a tabela "tblProduto"
        povoarJTable(sql);
    }//GEN-LAST:event_formWindowOpened

    //READ (PESQUISA PELA CATEGORIA DO PRODUTO)
    private void txtPesquisarProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyTyped
        // Pesquisa pelo nome
        String sql = "SELECT * FROM produto WHERE categoria LIKE '%"
                + txtPesquisarProduto.getText()
                + "%'"
                + "ORDER BY codigo_produto DESC";
        
        //chamando o método para povoar a tabela "tblCliente"
        povoarJTable(sql);
    }//GEN-LAST:event_txtPesquisarProdutoKeyTyped

    //UPDATE
    // MÉTODO PARA ATUALIZAR O DADO DA LINHA SELECIONADA
    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        //passando os valores da tabela "tblProduto" para os JTFields "txtCodigoControle" e "txtNomeControle"
        int linha = tblProduto.getSelectedRow(); //vai selecionar a linha e jogar na var linha

        //selecionando a coluna "codigo"
        txtCodigoControle.setText(tblProduto.getValueAt(linha, 0).toString());

        //selecionando a coluna "categoria"
        txtNomeControle.setText(tblProduto.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_tblProdutoMouseClicked

    //DELETE
    //EXCLUIR PRODUTO
    private void btnDeleteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProdutoActionPerformed
        // deletar a linha escolhida na tabela "tblProduto"
        //verificando se o campo de código do produto selecionado não esta vazio
        if (txtCodigoControle.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para EXCLUIR ");
        } else {
            //jogar o codigo_cliente (pk) no JTField "txtCodigoControle"
            CadastroProduto.codigo_produto = Integer.parseInt(txtCodigoControle.getText());

            int confirmacaoJOptionPane = JOptionPane.OK_CANCEL_OPTION;
            
            //mensagem para LEMBRAR O SUSUARIO QUE ELE VAI EXCLUIR O ITEM SELECIONADO
            JOptionPane.showConfirmDialog(null, "Você tem certeza que você quer EXCLUIR o produto",
                    "APAGAR CADASTRO DE PRODUTO", confirmacaoJOptionPane);

            //se a opção selecionada for ok, exclui o item selecionado
            if (confirmacaoJOptionPane == JOptionPane.OK_CANCEL_OPTION) {
                //chamando o metodo deletar
                CadastroProdutoConexao cadproddel = new CadastroProdutoConexao();
                cadproddel.DeletarProduto();
                
                //atualizar a "tblProduto" depois de excluir o item 
                String sql = "SELECT * FROM produto ORDER BY codigo_produto DESC";

                povoarJTable(sql);
            }
        }
    }//GEN-LAST:event_btnDeleteProdutoActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new frmConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Preco;
    private javax.swing.JButton btnDeleteProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblPesquisarProduto;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCodigoControle;
    private javax.swing.JTextField txtNomeControle;
    private javax.swing.JTextField txtPesquisarProduto;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}