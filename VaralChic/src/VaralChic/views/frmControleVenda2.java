/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaralChic.views;

import VaralChic.conexao.Conexao;
import VaralChic.model.Venda;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
        
        //tabela cliente
        JTableHeader jthCliente = tblCliente.getTableHeader();
        jthCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        //tabela produto
        JTableHeader jthProduto = tblProduto.getTableHeader();
        jthProduto.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        //tabela venda
        JTableHeader jthVenda = tblVenda.getTableHeader();
        jthVenda.setFont(new Font("Tahoma", Font.BOLD, 14));
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
        lblVatorTotal1 = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JFormattedTextField();
        btnAdicionar = new javax.swing.JButton();
        btnAdicionar1 = new javax.swing.JButton();
        jLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
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

        JScrollPane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 280, 70));

        txtCodigoControleCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCodigoControleCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigoControleCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtCodigoControleCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 40, 30));

        txtNomeControleCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNomeControleCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNomeControleCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNomeControleCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 230, 30));

        lblPesquisarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPesquisarProduto.setText("Produto");
        getContentPane().add(lblPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, 30));

        txtPesquisarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisarProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 280, 30));

        txtProduto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtProduto1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProduto1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 40, 30));

        txtProduto2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtProduto2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProduto2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduto2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 230, 30));

        JScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Produto", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollPane1.setViewportView(tblProduto);

        getContentPane().add(JScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 280, 70));

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantidade.setText("Quantidade");
        getContentPane().add(lblQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, 30));

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuantidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 110, 30));

        lblPrecoUnitario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecoUnitario.setText("Preço Unitário (R$)");
        getContentPane().add(lblPrecoUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 30));

        txtPrecoUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecoUnitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPrecoUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 110, 30));

        lblVatorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVatorTotal.setText("Valor Total (R$)");
        getContentPane().add(lblVatorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, 30));

        txtValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 110, 30));

        JScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Produto", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVenda.setColumnSelectionAllowed(false);
        JScrollPane2.setViewportView(tblVenda);

        getContentPane().add(JScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 470, 140));

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
        getContentPane().add(lblPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 30));

        boxPagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À VISTA", "À PRAZO", "CREDIÁRIO" }));
        boxPagamento.setToolTipText("");
        getContentPane().add(boxPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 150, 30));

        btnFecharCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFecharCompra.setText("Fechar compra");
        btnFecharCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnFecharCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, 36));

        lblVatorTotal1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVatorTotal1.setText("Data");
        getContentPane().add(lblVatorTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, 30));

        txtDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(txtDataCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 110, -1));

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionar.setText("Adicionar");
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, 36));

        btnAdicionar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionar1.setText("Remover");
        getContentPane().add(btnAdicionar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, 36));

        jLogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoVaralChic/VARALCHIC logo.png"))); // NOI18N
        getContentPane().add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 912, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Connection conn = null;
    
    ////READ
    //MÉTODO PARA POVOAR AS TABELAS Cliente e Produto
    //BUSCANDO DO BANCO DE DADOS
    public void povoarJTable(String sql) {
        conn = Conexao.getConexao();

        try {
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.execute();

            ResultSet rs = stmt.executeQuery();

            //pegando uma biblioteca que vai criar uma classe que irá povoar a tabela
            DefaultTableModel modelCliente = (DefaultTableModel) tblCliente.getModel();
            modelCliente.setNumRows(0); //ele vai iniciar do primeiro elemento da tabel (1ª coluna)
            
            DefaultTableModel modelProduto = (DefaultTableModel) tblProduto.getModel();
            modelProduto.setNumRows(0); //ele vai iniciar do primeiro elemento da tabel (1ª coluna)

            while (rs.next()) {
                modelCliente.addRow(new Object[]{
                    rs.getInt("codigo_cliente"),
                    rs.getString("nome")
                });
            }
            
            while (rs.next()) {
                modelProduto.addRow(new Object[]{
                    rs.getInt("codigo_produto"),
                    rs.getString("nome"),
                    rs.getFloat("preco")
                });
            }

            //fechar a conexão
            Conexao.fecharConexao(conn, stmt, rs);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível obter os dados do banco. Veja: " + e);
        }
    }
    private void txtPesquisarProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyTyped
        // Pesquisa pelo nome
        String sql = "SELECT * FROM produto WHERE codigo_produto LIKE '%"
                + txtPesquisarProduto.getText()
                + "%'"
                + "ORDER BY codigo_produto";

        //chamando o método para povoar a tabela
        povoarJTable(sql);
    }//GEN-LAST:event_txtPesquisarProdutoKeyTyped

    private void txtPesquisarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarClienteKeyTyped
        // Pesquisa pelo nome ou cpf
        String sql = "SELECT * FROM cliente WHERE codigo_cliente LIKE '%"
        + txtPesquisarProduto.getText()
        + "ORDER BY codigo_cliente";
        
        //chamando o método para povoar a tabela
        povoarJTable(sql);
    }//GEN-LAST:event_txtPesquisarClienteKeyTyped

    private void txtProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProduto2ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // CHAMANDO A PÁGINA PRINCIPAL
        frmPaginaPrincipal pagPrincipal = new frmPaginaPrincipal();
        pagPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    //SALVAR OS DADOS DO FORMULARIO CADASTRAR USUARIO
    private void btnFecharCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCompraActionPerformed
        // PEGANDO OS DADOS DIGITADOS E JOGANDO PARA OS ATRIBUTOS DA CLASSE "Venda" (pacote model)
        Venda.codigo_cliente = Integer.parseInt(txtCodigoControleCliente.getText());
        Venda.codigo_produto = Integer.parseInt(txtProduto1.getText());
        Venda.metodo_pagamento = boxPagamento.getSelectedItem().toString();
        Venda.valor = Float.parseFloat(txtValorTotal.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            java.util.Date date =  sdf.parse(txtDataCompra.getText());
            java.sql.Date dataSql = new java.sql.Date(date.getTime());
            Venda.data_venda = dataSql;
            
            
        } 
        catch (ParseException ex) 
        {
            Logger.getLogger(frmCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnFecharCompraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Carrega os dados na tabela "tblProduto" quando abrir a tela "venda"
        // cria o SQL
        String sql1 = "SELECT * FROM produto ORDER BY codigo_produto";
        
        //chamando o método para povoar a tabela "tblProduto"
        povoarJTable(sql1);
    }//GEN-LAST:event_formWindowOpened

    
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
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnFecharCompra;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLogo;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblPesquisarProduto;
    private javax.swing.JLabel lblPrecoUnitario;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblVatorTotal;
    private javax.swing.JLabel lblVatorTotal1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTable tblVenda;
    private javax.swing.JTextField txtCodigoControleCliente;
    private javax.swing.JFormattedTextField txtDataCompra;
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
