/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotrabalho2.view;

import projetotrabalho2.model.Cliente;
import projetotrabalho2.control.ClienteControl;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Iterator;

/**
 *
 * @author thiag
 */
public class JFCliente extends javax.swing.JFrame {

    //Constantes de controle de estados do formulário
    private static final int CREATE = 0;
    private static final int UPDATE = 1;
 
    
    private int currState;
            
    private ClienteControl ctrl;
            
    /**
     * Creates new form TeamForm
     */
    public JFCliente() {
        initComponents();
        ctrl = new ClienteControl();
        currState = CREATE;
        updForm(null);
    }

    private void clearForm() {
        jtfCpfCnpj.setText("");        
        jtfNome1.setText(""); 
        jtfTelefone.setText("");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setNumRows(0);
        
    }
    
    private void updForm(Cliente c) {
        if (currState == CREATE) {
            lblCurrState.setText("Inserting data");
            clearForm();
            jtfCpfCnpj.setEnabled(true);
            jtfNome1.setEnabled(true);
            jtfTelefone.setEnabled(true);
            jbExcluir.setEnabled(false);
            btnSearch.setEnabled(true);
            jtfCpfCnpj.grabFocus(); //Posiciona cursor no campo txtId
        } else if (currState == UPDATE) {
            lblCurrState.setText("Update or delete data");            
            jtfCpfCnpj.setEnabled(false);
            jtfNome1.setEnabled(true);
            jtfTelefone.setEnabled(true);
            if (c!=null) {
                jtfCpfCnpj.setText(c.getCpfcnpj().toString());
                jtfNome1.setText(c.getNome());                     
                jtfTelefone.setText(c.getTelefone());                
            }
            jbExcluir.setEnabled(true);
            btnSearch.setEnabled(false);
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

        jlTelefone = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlCpfCnpj1 = new javax.swing.JLabel();
        jtfCpfCnpj = new javax.swing.JTextField();
        jlNome1 = new javax.swing.JLabel();
        jtfNome1 = new javax.swing.JTextField();
        jbSalvar1 = new javax.swing.JButton();
        jbEditar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtfPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        lblCurrState = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlTelefone.setText("Telefone: ");
        getContentPane().add(jlTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 188, 96, 23));

        jtfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jtfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 190, 120, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Clientes");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jlCpfCnpj1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlCpfCnpj1.setText("CPF ou CNPJ:");
        getContentPane().add(jlCpfCnpj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 106, 96, 23));

        jtfCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCpfCnpjActionPerformed(evt);
            }
        });
        getContentPane().add(jtfCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 108, 120, 20));

        jlNome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlNome1.setText("Nome:");
        getContentPane().add(jlNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 145, 96, 23));

        jtfNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNome1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 147, 120, 20));

        jbSalvar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbSalvar1.setText("Salvar");
        jbSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 90, 30));

        jbEditar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbEditar1.setText("Editar");
        jbEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 80, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CPF ou CNPJ", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 333, 500, 90));

        jtfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaActionPerformed(evt);
            }
        });
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyReleased(evt);
            }
        });
        getContentPane().add(jtfPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 289, 570, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pesquisa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 267, -1, -1));

        jbVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 90, 30));

        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));
        getContentPane().add(lblCurrState, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 283, 24));

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("Pesquisar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 362, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefoneActionPerformed

    private void jtfCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCpfCnpjActionPerformed

    private void jtfNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNome1ActionPerformed

    private void jbEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditar1ActionPerformed
        jbSalvar1.setEnabled(true);
        jbEditar1.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtfCpfCnpj.setEnabled(true);
        jtfNome1.setEnabled(true);
        jtfTelefone.setEnabled(true);
    }//GEN-LAST:event_jbEditar1ActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        new JFPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int conf = JOptionPane.showConfirmDialog(this, "Do you confirm?", 
                                        "Deleting", JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE);
        if (conf == JOptionPane.YES_OPTION) {
            try {
                String cpfcnpj = jtfCpfCnpj.getText();
                Cliente c = ctrl.search(cpfcnpj);  //Recupera registro novamente, para ter referência ao objeto
                if (c!=null) { //Se conseguiu recuperar o objeto do BD com ref. atualizada
                    ctrl.delete(c); //Tenta exluir registro
                    //Se não ocorreu nenhuma Exception......
                    JOptionPane.showMessageDialog(this, "Data deleted!", 
                                        "Sucess",JOptionPane.ERROR_MESSAGE);                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,  e.getMessage(), 
                                            "Delete fail",
                                            JOptionPane.ERROR_MESSAGE);                  
            }
            currState = CREATE;
            updForm(null);
            
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvar1ActionPerformed
        // TODO add your handling code here:
        try {
            validarCampos();
            String cpfcnpj = jtfCpfCnpj.getText();
            if (currState == CREATE) {
                //Cria novo objeto e preenche os valores dos campos
                Cliente c = new Cliente();
                c.setCpfcnpj(cpfcnpj);
                c.setNome(jtfNome1.getText());
                c.setTelefone(jtfTelefone.getText());
                
                ctrl.create(c);  //Realiza INSERT
                clearForm();
            } else if (currState == UPDATE) {
                Cliente c = ctrl.search(cpfcnpj); //Recupera o registro no banco, novamente, para ter referência atualizada.    
                if (c!=null) { //Se a recuperação não falhou, tem-se objeto com referência atualizada
                    //Atualiza campos, exceto o ID
                    c.setNome(jtfNome1.getText());
                    c.setTelefone(jtfTelefone.getText());  
                    ctrl.update(c);
                }
            }
            //Se não ocorreu nenhuma Exception......
            JOptionPane.showMessageDialog(this, "Data saved!", 
                                        "Sucess",JOptionPane.ERROR_MESSAGE);
            currState = CREATE;
            updForm(null);
        } catch (Exception e) { //Case tenha dado problema na validação
            JOptionPane.showMessageDialog(this,  e.getMessage(), 
                                        "Operation fail",
                                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvar1ActionPerformed

    private void jtfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyReleased
//        try {
//            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();
//            mp.setNumRows(0);
//            if (jtfPesquisa.getText().length() > 1) {
//                listapesquisa = DAO.pesquisar(jtfPesquisa.getText());
//                for (clienteModel u : listapesquisa) {
//                    mp.addRow(new String[]{"" + u.getCpfCnpj(), "" + u.getNome(), "" + u.getTelefone()});
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_jtfPesquisaKeyReleased

    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        
        Cliente c = new Cliente();
        //Preenche objeto t com dados do model
        String cpfcnpj = ((String)jTable1.getModel().getValueAt(row, 0));
        c.setCpfcnpj(cpfcnpj);
        c.setNome((String)jTable1.getModel().getValueAt(row, 1));
        c.setTelefone((String)jTable1.getModel().getValueAt(row, 2));
        currState = UPDATE;
        updForm(c);  //Atualiza campos do formulário, preenchendo dados neles.
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

        try {
            List<Cliente> rs = new ArrayList<Cliente>();
            if (jtfPesquisa.getText().isEmpty()) {
                rs = ctrl.retrieveAll();
            } else {
                Cliente s = ctrl.search(jtfPesquisa.getText());
                if (s!=null) {
                    rs.add(s);
                }
            }
            Iterator it = rs.iterator();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setNumRows(0);
            while(it.hasNext()) {
                Cliente c = (Cliente) it.next();
                model.addRow(new String[]{c.getCpfcnpj().toString(),
                    //ATENÇÃO!!!! -Provavelmente esse .ToString vai causar algum erro
                    c.getNome(),
                    c.getTelefone()});
        }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,  ex.getMessage(),
                "Search fail",
                JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbEditar1;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar1;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlCpfCnpj1;
    private javax.swing.JLabel jlNome1;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTextField jtfCpfCnpj;
    private javax.swing.JTextField jtfNome1;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JLabel lblCurrState;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
        String msg = "";
        if (jtfCpfCnpj.getText().length() < 11) {
            msg += "\nO CNPJ deve ter pelo menos 11 caracteres";
        }
        if (jtfCpfCnpj.getText().length() > 14) {
            msg += "\nO ID do Remédio deve ter no máximo 14 caracteres";
        }
        if (jtfNome1.getText().length() < 3) {
            msg += "\nO ID da Pessoa deve ter pelo menos 3 caracteres";
        }
        if (jtfNome1.getText().length() > 100) {
            msg += "\nO ID deve ter no máximo 100 caracteres";
        }
        if (jtfTelefone.getText().length() < 10) {
            msg += "\nO Telefone deve ter no mínimo 10 caracteres";
        }
        if (jtfTelefone.getText().length() > 11) {
            msg += "\nO ID deve ter no máximo 11 caracteres";
        }

        if (msg.length() == 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Corrija os seguintes campos" + msg, "Acesso Negado", JOptionPane.ERROR_MESSAGE);

            return false;
        }
    }

//    private boolean preencherObjeto() {
//
//        obj.setCpfCnpj(jtfCpfCnpj.getText());
//        obj.setNome(jtfNome1.getText());
//        obj.setTelefone(jtfTelefone.getText());
//        return true;
//    }
    
}