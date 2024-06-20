package VaralChic.views;

import VaralChic.model.CadastroCliente;
import VaralChic.model.CadastroClienteConexao;
import javax.swing.JOptionPane;

/**
 *
 * @author alice
 */
public class frmCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public frmCadastroCliente() {
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

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        lblTitulo = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();
        lblRgCliente = new javax.swing.JLabel();
        lblEnderecoCliente = new javax.swing.JLabel();
        lblFoneCliente = new javax.swing.JLabel();
        lblEmailCliente = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        txtRgCliente = new javax.swing.JFormattedTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtFoneCliente = new javax.swing.JFormattedTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtObs = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblLogotipo = new javax.swing.JLabel();

        jScrollPane5.setViewportView(jTextPane5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(920, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro de cliente");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, -1, -1));

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNomeCliente.setText("Nome");
        getContentPane().add(lblNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        lblCpfCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCpfCliente.setText("CPF");
        getContentPane().add(lblCpfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        lblRgCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRgCliente.setText("RG");
        getContentPane().add(lblRgCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        lblEnderecoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEnderecoCliente.setText("Endereço");
        getContentPane().add(lblEnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        lblFoneCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFoneCliente.setText("Telefone");
        getContentPane().add(lblFoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        lblEmailCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmailCliente.setText("E-mail");
        getContentPane().add(lblEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        lblObs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObs.setText("Observação");
        getContentPane().add(lblObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 500, 30));

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCpfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 200, 30));

        try {
            txtRgCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtRgCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 200, 30));

        txtEnderecoCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtEnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 500, 30));

        try {
            txtFoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtFoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 500, 30));

        txtEmailCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 500, 30));

        txtObs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 500, 60));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 130, 50));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //VOLTAR PARA A PAGINA PRINCIPAL
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // CHAMANDO A PÁGINA PRINCIPAL
        frmPaginaPrincipal pagPrincipal = new frmPaginaPrincipal();
        pagPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    //SALVAR OS DADOS DO FORMULARIO CADASTRAR
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // PEGANDO OS DADOS DIGITADOS E JOGANDO PARA OS ATRIBUTOS DA CLASSE "CadastroCliente" (pacote model)
        CadastroCliente.nome_cliente = txtNomeCliente.getText();
        CadastroCliente.cpf_cliente = txtCpfCliente.getText();
        CadastroCliente.rg_cliente = txtRgCliente.getText();
        CadastroCliente.endereco_cliente = txtEnderecoCliente.getText();
        CadastroCliente.telefone_cliente = txtFoneCliente.getText();
        CadastroCliente.email_cliente = txtEmailCliente.getText();
        CadastroCliente.observacao = txtObs.getText();
        
        CadastroClienteConexao cadcan = new CadastroClienteConexao();
        cadcan.InserirCliente();
        
        JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso");
        
        //LIMPANDO OS DADOS DEPOIS DE SALVAR
        limparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    //limpar campos do cadastro
    public void limparCampos() {
        txtNomeCliente.setText("");
        txtCpfCliente.setText("");
        txtRgCliente.setText("");
        txtEnderecoCliente.setText("");
        txtFoneCliente.setText("");
        txtEmailCliente.setText("");
        txtObs.setText("");
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
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblFoneCliente;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblRgCliente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JFormattedTextField txtFoneCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtObs;
    private javax.swing.JFormattedTextField txtRgCliente;
    // End of variables declaration//GEN-END:variables
}
