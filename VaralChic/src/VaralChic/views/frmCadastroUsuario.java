package VaralChic.views;

import VaralChic.model.CadastroUsuario;
import VaralChic.model.CadastroUsuarioConexao;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class frmCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDeUsuario
     */
    public frmCadastroUsuario() {
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
        lblNomeUsuario = new javax.swing.JLabel();
        lblCpfUsuario = new javax.swing.JLabel();
        lblFoneUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtCpfUsuario = new javax.swing.JFormattedTextField();
        txtFoneUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblLogotipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setFocusCycleRoot(false);
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(920, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro de usuário");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, -1, -1));

        lblNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNomeUsuario.setText("Nome");
        getContentPane().add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        lblCpfUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCpfUsuario.setText("CPF");
        getContentPane().add(lblCpfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 30, 20));

        lblFoneUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFoneUsuario.setText("Telefone");
        getContentPane().add(lblFoneUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        txtNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 500, 30));

        try {
            txtCpfUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCpfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 500, 30));

        txtFoneUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtFoneUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 500, 30));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 500, 30));

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 500, 30));

        btnCadastrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarUsuario.setText("Cadastrar");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 130, 50));

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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // CHAMANDO A PÁGINA PRINCIPAL
        frmPaginaPrincipal pagPrincipal = new frmPaginaPrincipal();
        pagPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    //SALVAR OS DADOS DO FORMULARIO CADASTRAR USUARIO
    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        // PEGANDO OS DADOS DIGITADOS E JOGANDO PARA OS ATRIBUTOS DA CLASSE "CadastroUsuario" (pacote model)
        CadastroUsuario.nome = txtNomeUsuario.getText();
        CadastroUsuario.cpf_usuario = txtCpfUsuario.getText();
        CadastroUsuario.telefone = txtFoneUsuario.getText();
        CadastroUsuario.usuario = txtUsuario.getText();
        CadastroUsuario.senha = new String(txtSenha.getPassword());
        
        CadastroUsuarioConexao cadcan = new CadastroUsuarioConexao();
        cadcan.InserirUsuario();
        
        JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso");
        
        //LIMPANDO OS DADOS DEPOIS DE SALVAR
        limparCampos();
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    //limpar campos do cadastro
    public void limparCampos() {
        txtNomeUsuario.setText("");
        txtCpfUsuario.setText("");
        txtFoneUsuario.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
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
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblCpfUsuario;
    private javax.swing.JLabel lblFoneUsuario;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JFormattedTextField txtCpfUsuario;
    private javax.swing.JTextField txtFoneUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}