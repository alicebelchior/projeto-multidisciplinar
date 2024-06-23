/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaralChic.views;

/**
 *
 * @author Aluno
 */
public class frmControleVenda2 extends javax.swing.JFrame {

    /**
     * Creates new form frmCadastrodeVenda
     */
    public frmControleVenda2() {
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

        txtTitulo = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        txtPesquisarCliente = new javax.swing.JTextField();
        JScrollPane = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtCodigoControleCliente = new javax.swing.JTextField();
        txtNomeControleCliente = new javax.swing.JTextField();
        lblPesquisarProduto = new javax.swing.JLabel();
        txtPesquisarProduto = new javax.swing.JTextField();
        txtProduto1 = new javax.swing.JTextField();
        txtProduto2 = new javax.swing.JTextField();
        JScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblPrecoUnitario = new javax.swing.JLabel();
        txtPrecoUnitario = new javax.swing.JTextField();
        lblVatorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        JScrollPane2 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        lblPagamento = new javax.swing.JLabel();
        boxPagamento = new javax.swing.JComboBox<>();
        btnFecharCompra = new javax.swing.JButton();
        jLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTitulo.setText("Controle de venda");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, -1, -1));

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCliente.setText("Nome/CPF do cliente");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        txtPesquisarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 280, 30));

        tblCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        JScrollPane.setViewportView(tblCliente);

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 280, 50));

        txtCodigoControleCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCodigoControleCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigoControleCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigoControleCliente.setEnabled(false);
        getContentPane().add(txtCodigoControleCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 40, 30));

        txtNomeControleCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNomeControleCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNomeControleCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNomeControleCliente.setEnabled(false);
        getContentPane().add(txtNomeControleCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 230, 30));

        lblPesquisarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPesquisarProduto.setText("Produto");
        getContentPane().add(lblPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, 30));

        txtPesquisarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisarProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 280, 30));

        txtProduto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtProduto1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProduto1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtProduto1.setEnabled(false);
        getContentPane().add(txtProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 40, 30));

        txtProduto2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtProduto2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProduto2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtProduto2.setEnabled(false);
        txtProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduto2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 230, 30));

        tblProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Código", "Produto", "Valor Unitário"
            }
        ));
        JScrollPane1.setViewportView(tblProduto);

        getContentPane().add(JScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 280, 50));

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantidade.setText("Quantidade");
        getContentPane().add(lblQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, 30));

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuantidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 110, 30));

        lblPrecoUnitario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecoUnitario.setText("Preço Unitário (R$)");
        getContentPane().add(lblPrecoUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 30));

        txtPrecoUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecoUnitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPrecoUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 110, 30));

        lblVatorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVatorTotal.setText("Valor Total (R$)");
        getContentPane().add(lblVatorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, 30));

        txtValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 110, 30));

        tblVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Preço Unitário", "Valor Total"
            }
        ));
        JScrollPane2.setViewportView(tblVenda);

        getContentPane().add(JScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 470, 170));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 25, -1, -1));

        lblPagamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPagamento.setText("Método de Pagamento");
        getContentPane().add(lblPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 165, 30));

        boxPagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À VISTA", "À PRAZO", "CREDIÁRIO" }));
        boxPagamento.setToolTipText("");
        getContentPane().add(boxPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 250, 30));

        btnFecharCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFecharCompra.setText("Fechar compra");
        btnFecharCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnFecharCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, -1, 36));

        jLogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoVaralChic/VARALCHIC logo.png"))); // NOI18N
        getContentPane().add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 912, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyTyped
        // Pesquisa pelo nome ou cpf
        String sql = "SELECT * FROM cliente WHERE nome_cliente LIKE '%"
        + txtPesquisarProduto.getText()
        + "%' OR cpf_cliente LIKE '%"
        + txtPesquisarProduto.getText()
        + "%'"
        + "ORDER BY codigo_cliente DESC";

        //chamando o método para povoar a tabela "tblCliente"
        //povoarJTable(sql);
    }//GEN-LAST:event_txtPesquisarProdutoKeyTyped

    private void txtPesquisarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarClienteKeyTyped

    private void txtProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProduto2ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnFecharCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCompraActionPerformed

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
            java.util.logging.Logger.getLogger(frmControleVenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmControleVenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmControleVenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmControleVenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmControleVenda2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JScrollPane JScrollPane2;
    private javax.swing.JComboBox<String> boxPagamento;
    private javax.swing.JButton btnFecharCompra;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLogo;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblPesquisarProduto;
    private javax.swing.JLabel lblPrecoUnitario;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblVatorTotal;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTable tblVenda;
    private javax.swing.JTextField txtCodigoControleCliente;
    private javax.swing.JTextField txtNomeControleCliente;
    private javax.swing.JTextField txtPesquisarCliente;
    private javax.swing.JTextField txtPesquisarProduto;
    private javax.swing.JTextField txtPrecoUnitario;
    private javax.swing.JTextField txtProduto1;
    private javax.swing.JTextField txtProduto2;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
