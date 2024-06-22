package VaralChic.views;

import VaralChic.conexao.Conexao;
import VaralChic.model.CadastroCliente;
import VaralChic.model.CadastroClienteConexao;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author alice
 */
public class frmConsultaCliente extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCliente
     */
    public frmConsultaCliente() {
        initComponents();

        //modificar o cabeçalho da tabela
        JTableHeader jth = tblCliente.getTableHeader();
        jth.setFont(new Font("Tahoma", Font.BOLD, 14));
    }

    private Connection conn = null;

    //READ
    //MÉTODO PARA POVOAR A TABELA "tblCliente"
    //BUSCANDO DO BANCO DE DADOS
    public void povoarJTable(String sql) {
        conn = Conexao.getConexao();

        try {
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.execute();

            ResultSet rs = stmt.executeQuery();

            //pegando uma biblioteca que vai criar uma classe que irá povoar a tabela
            DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
            model.setNumRows(0); //ele vai iniciar do primeiro elemento da tabel (1ª coluna)

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("codigo_cliente"),
                    rs.getString("nome_cliente"),
                    rs.getString("cpf_cliente"),
                    rs.getString("telefone_cliente")
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

        lblTitulo = new javax.swing.JLabel();
        txtPesquisarCliente = new javax.swing.JTextField();
        txtCodigoControle = new javax.swing.JTextField();
        txtNomeControle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnDeleteCliente = new javax.swing.JButton();
        lblPesquisarCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setMaximumSize(new java.awt.Dimension(920, 600));
        setMinimumSize(new java.awt.Dimension(920, 600));
        setPreferredSize(new java.awt.Dimension(920, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Consulta de cliente");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, -1, -1));

        txtPesquisarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 500, 30));

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

        jScrollPane1.setFocusable(false);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tblCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
                "CÓDIGO", "NOME", "CPF", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setAutoscrolls(false);
        tblCliente.setMaximumSize(new java.awt.Dimension(300, 200));
        tblCliente.setMinimumSize(new java.awt.Dimension(300, 200));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 785, 265));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 25, -1, -1));

        btnEditarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarCliente.setText("EDITAR");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 100, 40));

        btnDeleteCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteCliente.setText("EXCLUIR");
        btnDeleteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 100, 40));

        lblPesquisarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPesquisarCliente.setText("Digite o nome ou CPF do cliente:");
        getContentPane().add(lblPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 240, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CLIENTE SELECIONADO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        lblLogotipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoVaralChic/VARALCHIC logo.png"))); // NOI18N
        lblLogotipo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblLogotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //READ
    //CRIAÇÃO DO SQL AO ABRIR O FORMULÁRIO
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Carrega os dados na tabela "tblCliente" quando abrir a tela "frmConsultaCliente"
        // cria o SQL
        String sql = "SELECT * FROM cliente ORDER BY codigo_cliente DESC";

        //chamando o método para povoar a tabela "tblCliente"
        povoarJTable(sql);
    }//GEN-LAST:event_formWindowOpened

    //READ (PESQUISA PELO NOME/CPF)
    private void txtPesquisarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarClienteKeyTyped
        // Pesquisa pelo nome ou cpf
        String sql = "SELECT * FROM cliente WHERE nome_cliente LIKE '%"
                + txtPesquisarCliente.getText()
                + "%' OR cpf_cliente LIKE '%"
                + txtPesquisarCliente.getText()
                + "%'"
                + "ORDER BY codigo_cliente DESC";

        //chamando o método para povoar a tabela "tblCliente"
        povoarJTable(sql);
    }//GEN-LAST:event_txtPesquisarClienteKeyTyped

    //VOLTAR PÁGINA PRINCIPAL
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // CHAMANDO A PÁGINA PRINCIPAL
        frmPaginaPrincipal pagPrincipal = new frmPaginaPrincipal();
        pagPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    //UPDATE
    //ATUALIZAR CLIENTE
    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        //verificando se o campo de código do cliente selecionado não esta vazio
        if (txtCodigoControle.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");
        } else {
            // abrir a tela "frmAtualizarCliente"
            frmAtualizarCliente updtCliente = new frmAtualizarCliente();
            updtCliente.setVisible(true);

            //jogar o codigo_cliente (pk) no JTField "txtCodigoControle"
            CadastroCliente.codigo_cliente = Integer.parseInt(txtCodigoControle.getText());

            //depois de atualizar, limpar os campos com os dados do cliente previamente atualizado
            txtCodigoControle.setText("");
            txtNomeControle.setText("");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    //UPDATE
    // MÉTODO PARA ATUALIZAR O DADO DA LINHA SELECIONADA
    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        //passando os valores da tabela "tblCliente" para os JTFields "txtCodigoControle" e "txtNomeControle"
        int linha = tblCliente.getSelectedRow(); //vai selecionar a linha e jogar na var linha

        //selecionando a coluna "codigo"
        txtCodigoControle.setText(tblCliente.getValueAt(linha, 0).toString());

        //selecionando a coluna "nome"
        txtNomeControle.setText(tblCliente.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_tblClienteMouseClicked

    //DELETE
    //EXCLUIR CLIENTE
    private void btnDeleteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClienteActionPerformed
        // deletar a linha escolhida na tabela "tblCliente"
        //verificando se o campo de código do cliente selecionado não esta vazio
        if (txtCodigoControle.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para EXCLUIR ");
        } else {
            //jogar o codigo_cliente (pk) no JTField "txtCodigoControle"
            CadastroCliente.codigo_cliente = Integer.parseInt(txtCodigoControle.getText());

            int confirmacaoJOptionPane = JOptionPane.OK_CANCEL_OPTION;

            //mensagem para LEMBRAR O SUSUARIO QUE ELE VAI EXCLUIR O ITEM SELECIONADO
            JOptionPane.showConfirmDialog(null, "Você tem certeza que você quer EXCLUIR o cliente",
                    "APAGAR CADASTRO DE CLIENTE", confirmacaoJOptionPane);

            //se a opção selecionada for ok, exclui o item selecionado
            if (confirmacaoJOptionPane == JOptionPane.OK_CANCEL_OPTION) {
                //chamando o metodo deletar
                CadastroClienteConexao cadcdel = new CadastroClienteConexao();
                cadcdel.DeletarCliente();

                //atualizar a "tblCliente" depois de excluir o item 
                String sql = "SELECT * FROM cliente ORDER BY codigo_cliente DESC";

                povoarJTable(sql);

                //depois de excluir, limpar os campos com os dados do cliente previamente deletado
                txtCodigoControle.setText("");
                txtNomeControle.setText("");
            }
        }
    }//GEN-LAST:event_btnDeleteClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblPesquisarCliente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCodigoControle;
    private javax.swing.JTextField txtNomeControle;
    private javax.swing.JTextField txtPesquisarCliente;
    // End of variables declaration//GEN-END:variables
}
