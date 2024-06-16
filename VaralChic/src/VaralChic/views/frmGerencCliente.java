package VaralChic.views;

/**
 *
 * @author alice
 */
public class frmGerencCliente extends javax.swing.JFrame {

    /**
     * Creates new form GerencCliente
     */
    public frmGerencCliente() {
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
        btnVoltar = new javax.swing.JButton();
        btnCadastroCliente = new javax.swing.JButton();
        btnConsultaCliente = new javax.swing.JButton();
        lblLogotipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(920, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTitulo.setText("Gerenciamento de cliente");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, -1, -1));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 25, -1, -1));

        btnCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCadastroCliente.setText("Cadastro de cliente");
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 252, 100));

        btnConsultaCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConsultaCliente.setText("Consulta de cliente");
        btnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 252, 100));

        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoVaralChic/VARALCHIC logo.png"))); // NOI18N
        getContentPane().add(lblLogotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //VOLTAR PARA A PAGINA PRINCIPAL
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // CHAMANDO A PÁGINA PRINCIPAL
        frmPaginaPrincipal pagPrincipal = new frmPaginaPrincipal();
        pagPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    //CADASTRAR CLIENTE
    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        // CHAMANDO O CADASTRO DE CLIENTE
        frmCadastroCliente cadCliente = new frmCadastroCliente();
        cadCliente.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    //CONSULTAR CLIENTE
    private void btnConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaClienteActionPerformed
        // CHAMANDO A CONSULTA DE CLIENTE
        frmConsultaCliente consultaCliente = new frmConsultaCliente();
        consultaCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmGerencCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGerencCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGerencCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGerencCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGerencCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JButton btnConsultaCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
