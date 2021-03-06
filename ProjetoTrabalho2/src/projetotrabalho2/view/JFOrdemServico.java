/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotrabalho2.view;

import projetotrabalho2.control.OrdemControl;
import projetotrabalho2.model.Ordemservico;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetotrabalho2.control.ClienteControl;
import projetotrabalho2.model.Cliente;

/**
 *
 * @author thiag
 */
public class JFOrdemServico extends javax.swing.JFrame {
    
    //Constantes de controle de estados do formulário
    private static final int CREATE = 0;
    private static final int UPDATE = 1;
 
    
    private int currState;
            
    private OrdemControl ctrl;
    private ClienteControl cliCtrl;
            
    /**
     * Creates new form TeamForm
     */
    public JFOrdemServico() {
        initComponents();
        ctrl = new OrdemControl();
        cliCtrl = new ClienteControl();
        currState = CREATE;
        updForm(null);
    }

    private void clearForm() {
        jtfNroServico.setText(""); 
        jtfCpfCnpj.setText("");        
        jtfDataServico.setText(""); 
        jtfValorServico.setText("");
        jtfPlaca.setText("");
        jtfModelo.setText("");
        jtfFrota.setText("");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setNumRows(0);
        
    }
    
    private void updForm(Ordemservico o) {
        if (currState == CREATE) {
            lblCurrState.setText("Inserting data");
            clearForm();
            jtfNroServico.setEnabled(true);
            jtfCpfCnpj.setEnabled(true);
            jtfDataServico.setEnabled(true);
            jtfValorServico.setEnabled(true);
            jtfPlaca.setEnabled(true);
            jtfModelo.setEnabled(true);
            jtfFrota.setEnabled(true);
            jbExcluir.setEnabled(false);
            btnSearch.setEnabled(true);
            jtfNroServico.grabFocus(); //Posiciona cursor no campo txtId
        } else if (currState == UPDATE) {
            lblCurrState.setText("Update or delete data");   
            jtfNroServico.setEnabled(true);
            jtfCpfCnpj.setEnabled(false);
            jtfDataServico.setEnabled(true);
            jtfValorServico.setEnabled(true);
            jtfPlaca.setEnabled(true);
            jtfModelo.setEnabled(true);
            jtfFrota.setEnabled(true);
            if (o!=null) {
                jtfNroServico.setText(o.getNroservico().toString());
                Cliente c = o.getCpfcnpj();
                jtfCpfCnpj.setText(c.getCpfcnpj());
                jlNomeCli.setText(c.getNome());
                jtfDataServico.setText(o.getDataservico());  
                jtfValorServico.setText(o.getValorservico()); 
                jtfPlaca.setText(o.getPlaca()); 
                jtfModelo.setText(o.getModelo()); 
                jtfFrota.setText(o.getFrota());
            }
            jbExcluir.setEnabled(true);
            btnSearch.setEnabled(false);
        }         
        
    }
    
//    private int acao;
//    private ordemModel obj;
//    private OrdemData DAO;
//    private ArrayList<ordemModel> listapesquisa;
//    public JFOrdemServico() {
//        try {
//            obj = new ordemModel();
//            DAO = new OrdemData();
//            listapesquisa = new ArrayList<>();
//            acao = 0;
//            initComponents();
//            this.setLocationRelativeTo(null);
//            jbNovo.setEnabled(true);
//            jbSalvar.setEnabled(false);
//            jbEditar.setEnabled(true);
//            jbSalvar.setEnabled(false);
//            jtfNroServico.setEnabled(false);
//            jtfDataServico.setEnabled(false);
//            jtfCpfCnpj.setEnabled(false);
//            jtfValorServico.setEnabled(false);
//            jtfPlaca.setEnabled(false);
//            jtfModelo.setEnabled(false);
//            jtfFrota.setEnabled(false);
//        } catch (Exception erro) {
//            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCpfCnpj = new javax.swing.JLabel();
        jtfCpfCnpj = new javax.swing.JTextField();
        jlPlaca = new javax.swing.JLabel();
        jtfPlaca = new javax.swing.JTextField();
        jlNomeCli = new javax.swing.JLabel();
        jtfDataServico = new javax.swing.JTextField();
        jlNroServico = new javax.swing.JLabel();
        jtfNroServico = new javax.swing.JTextField();
        jlCaminhao = new javax.swing.JLabel();
        jlServico1 = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlFrota = new javax.swing.JLabel();
        jlValorServico = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jtfFrota = new javax.swing.JTextField();
        jtfValorServico = new javax.swing.JTextField();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlPesquisa = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jbVoltar = new javax.swing.JButton();
        lblCurrState = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jlDataServico1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlCpfCnpj.setText("CPF ou CNPJ");
        jlCpfCnpj.setToolTipText("");
        getContentPane().add(jlCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 22));

        jtfCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCpfCnpjActionPerformed(evt);
            }
        });
        getContentPane().add(jtfCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 140, -1));

        jlPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlPlaca.setText("Placa: ");
        jlPlaca.setToolTipText("");
        getContentPane().add(jlPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 22));

        jtfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(jtfPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 140, -1));

        jlNomeCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlNomeCli.setToolTipText("");
        getContentPane().add(jlNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 320, 22));

        jtfDataServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDataServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfDataServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 140, -1));

        jlNroServico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlNroServico.setText("Número do Orçamento:");
        jlNroServico.setToolTipText("");
        getContentPane().add(jlNroServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 22));

        jtfNroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNroServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNroServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 140, -1));

        jlCaminhao.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlCaminhao.setForeground(new java.awt.Color(255, 0, 51));
        jlCaminhao.setText("Caminhão");
        getContentPane().add(jlCaminhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 100, 30));

        jlServico1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlServico1.setForeground(new java.awt.Color(255, 0, 51));
        jlServico1.setText("Serviço");
        getContentPane().add(jlServico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 80, 30));

        jlModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlModelo.setText("Modelo: ");
        jlModelo.setToolTipText("");
        getContentPane().add(jlModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, 22));

        jlFrota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlFrota.setText("Frota: ");
        jlFrota.setToolTipText("");
        getContentPane().add(jlFrota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, 22));

        jlValorServico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlValorServico.setText("Valor do Serviço: ");
        jlValorServico.setToolTipText("");
        getContentPane().add(jlValorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 22));

        jtfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfModeloActionPerformed(evt);
            }
        });
        getContentPane().add(jtfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 140, -1));

        jtfFrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFrotaActionPerformed(evt);
            }
        });
        getContentPane().add(jtfFrota, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 140, -1));

        jtfValorServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfValorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 140, -1));

        jbEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jbSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Número do Serviço", "CPF ou CNPJ", "Data do Serviço", "Valor", "Placa", "Modelo", "Frota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 600, 130));

        jlPesquisa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPesquisa.setText("Pesquisar");
        getContentPane().add(jlPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

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
        getContentPane().add(jtfPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 540, -1));

        jbVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 90, 30));
        getContentPane().add(lblCurrState, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 283, 24));

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("Pesquisar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        jlDataServico1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlDataServico1.setText("Data do Serviço:");
        jlDataServico1.setToolTipText("");
        getContentPane().add(jlDataServico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 22));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCpfCnpjActionPerformed

    private void jtfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlacaActionPerformed

    private void jtfDataServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDataServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDataServicoActionPerformed

    private void jtfNroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNroServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNroServicoActionPerformed

    private void jtfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfModeloActionPerformed

    private void jtfFrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFrotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFrotaActionPerformed

    private void jtfValorServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorServicoActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jbSalvar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtfNroServico.setEnabled(true);
        jtfDataServico.setEnabled(true);
        jtfCpfCnpj.setEnabled(true);
        jtfValorServico.setEnabled(true);
        jtfPlaca.setEnabled(true);
        jtfModelo.setEnabled(true);
        jtfFrota.setEnabled(true);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int conf = JOptionPane.showConfirmDialog(this, "Do you confirm?", 
                                        "Deleting", JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE);
        if (conf == JOptionPane.YES_OPTION) {
            try {
                Integer nroservico = Integer.parseInt(jtfNroServico.getText());
                Ordemservico o = ctrl.search(nroservico);  //Recupera registro novamente, para ter referência ao objeto
                if (o!=null) { //Se conseguiu recuperar o objeto do BD com ref. atualizada
                    ctrl.delete(o); //Tenta exluir registro
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

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
     
        
        try {
            validarCampos();
            Cliente c = cliCtrl.search(jtfCpfCnpj.getText());
            if (c==null) { ///Que achou cliente pelo cpfcnpj
                JOptionPane.showMessageDialog(this, 
                                            "Não há cliente para o cpf/cnpj informado!", 
                                            "Falha",
                                            JOptionPane.ERROR_MESSAGE);                    
            } else {     
                Integer nroservico = Integer.parseInt(jtfNroServico.getText());
                if (currState == CREATE) {
                    //Cria novo objeto e preenche os valores dos campos
                    Ordemservico o = new Ordemservico();
                    o.setNroservico(nroservico);                
                    o.setCpfcnpj(c); //coloca objeto cliente dentro da ordem de servico
                    o.setDataservico(jtfDataServico.getText());
                    o.setValorservico(jtfValorServico.getText());
                    o.setPlaca(jtfPlaca.getText());
                    o.setModelo(jtfModelo.getText());
                    o.setFrota(jtfFrota.getText());
                    ctrl.create(o);  //Realiza INSERT
                    clearForm();

                } else if (currState == UPDATE) {
                    Ordemservico o = ctrl.search(nroservico); //Recupera o registro no banco, novamente, para ter referência atualizada.    
                    if (o!=null) { //Se a recuperação não falhou, tem-se objeto com referência atualizada
                        //Atualiza campos, exceto o ID
                        o.setCpfcnpj(c);
                        o.setDataservico(jtfDataServico.getText());
                        o.setValorservico(jtfValorServico.getText());
                        o.setPlaca(jtfPlaca.getText());
                        o.setModelo(jtfModelo.getText());
                        o.setFrota(jtfFrota.getText());
                        ctrl.update(o);
                    }
                }
                //Se não ocorreu nenhuma Exception......
                JOptionPane.showMessageDialog(this, "Data saved!", 
                                            "Sucess",JOptionPane.ERROR_MESSAGE);
                currState = CREATE;
                updForm(null);
            }
        } catch (Exception e) { //Case tenha dado problema na validação
            JOptionPane.showMessageDialog(this,  e.getMessage(), 
                                        "Operation fail",
                                        JOptionPane.ERROR_MESSAGE);
        }                  
        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        
        Ordemservico o = new Ordemservico();
        //Preenche objeto t com dados do model
        Integer nroservico = Integer.parseInt((String)jTable1.getModel().getValueAt(row, 0));
        
        try {
            o = ctrl.search(nroservico);
            currState = UPDATE;
            updForm(o);  //Atualiza campos do formulário, preenchendo dados neles.
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,  ex.getMessage(), 
                                        "Operation fail",
                                        JOptionPane.ERROR_MESSAGE);           
        } 
        
//        o.setNroservico(nroservico);
//        Cliente c = new Cliente();
//        c.setCpfcnpj((String)jTable1.getModel().getValueAt(row, 1));
//        c.setNome("PEGAR da coluna nova");
//        o.setCpfcnpj(c);
//        o.setDataservico((String)jTable1.getModel().getValueAt(row, 2));
//        o.setValorservico((String)jTable1.getModel().getValueAt(row, 3));
//        o.setPlaca((String)jTable1.getModel().getValueAt(row, 4));
//        o.setModelo((String)jTable1.getModel().getValueAt(row, 5));
//        o.setFrota((String)jTable1.getModel().getValueAt(row, 6));
  
    }//GEN-LAST:event_jTable1MouseClicked

    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisaActionPerformed

    private void jtfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyReleased
//        try {
//            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();
//            mp.setNumRows(0);
//            if (jtfPesquisa.getText().length() > 1) {
//                listapesquisa = DAO.pesquisar(Integer.parseInt(jtfPesquisa.getText()));
//                for (ordemModel u : listapesquisa) {
//                    mp.addRow(new String[]{"" + u.getNroServico(),"" + u.getCpfCnpj(), "" + u.getDataServico(), 
//                        "" + u.getValorservico(), "" + u.getPlaca(), "" + u.getModelo(), "" + u.getFrota()
//                    });
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_jtfPesquisaKeyReleased

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
       new JFPrincipal().setVisible(true);
       dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

        try {
            List<Ordemservico> rs = new ArrayList<Ordemservico>();
            if (jtfCpfCnpj.getText().isEmpty()) {
                rs = ctrl.retrieveAll();
            } else {
                Ordemservico s = ctrl.search(Integer.parseInt(jtfNroServico.getText()));
                if (s!=null) {
                    rs.add(s);
                }
            }
            Iterator it = rs.iterator();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setNumRows(0);
            while(it.hasNext()) {
                Ordemservico o = (Ordemservico) it.next();
                Cliente c = o.getCpfcnpj();
                model.addRow(new String[]{o.getNroservico().toString(),
                    //ATENÇÃO!!!! - Provavelmente esse .ToString vai causar algum erro

                    c.getCpfcnpj(),
                    o.getDataservico(),
                    o.getValorservico(),
                    o.getPlaca(),
                    o.getModelo(),
                    o.getFrota()
                    });
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
            java.util.logging.Logger.getLogger(JFOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFOrdemServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlCaminhao;
    private javax.swing.JLabel jlCpfCnpj;
    private javax.swing.JLabel jlDataServico1;
    private javax.swing.JLabel jlFrota;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNomeCli;
    private javax.swing.JLabel jlNroServico;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JLabel jlServico1;
    private javax.swing.JLabel jlValorServico;
    private javax.swing.JTextField jtfCpfCnpj;
    private javax.swing.JTextField jtfDataServico;
    private javax.swing.JTextField jtfFrota;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNroServico;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfPlaca;
    private javax.swing.JTextField jtfValorServico;
    private javax.swing.JLabel lblCurrState;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
        String msg = "";
        if (jtfNroServico.getText().length() < 1) {
            msg += "\nO Número do Orçamento deve ter pelo menos 1 caractere";
        }
        if (jtfNroServico.getText().length() > 5) {
            msg += "\nO Número do Orçamento deve ter no máximo 5 caracteres";
        }
        if (jtfCpfCnpj.getText().length() < 11) {
            msg += "\nO CPF/CNPJ deve ter pelo menos 11 caracteres";
        }
        if (jtfCpfCnpj.getText().length() > 14) {
            msg += "\nO CPF/CNPJ deve ter no máximo 18 caracteres";
        }
        if (jtfDataServico.getText().length() < 8) {
            msg += "\nA data do serviço deve ter no mínimo 8 caracteres";
        }
        if (jtfDataServico.getText().length() > 10) {
            msg += "\nA data do serviço deve ter no máximo 10 caracteres";
        }
        if (jtfValorServico.getText().length() < 2) {
            msg += "\nO valor do serviço deve ter no mínimo 2 caracteres";
        }
        if (jtfValorServico.getText().length() > 10) {
            msg += "\nO valor do serviço deve ter no máximo 10 caracteres";
        }
        if (jtfPlaca.getText().length() < 7) {
            msg += "\nA placa deve ter no mínimo 7 caracteres";
        }
        if (jtfPlaca.getText().length() > 8) {
            msg += "\nA placa deve ter no máximo 8 caracteres";
        }
        if (jtfModelo.getText().length() < 3) {
            msg += "\nO modelo deve ter no mínimo 3 caracteres";
        }
        if (jtfModelo.getText().length() > 30) {
            msg += "\nO modelo deve ter no máximo 30 caracteres";
        }
        if (jtfFrota.getText().length() > 10) {
            msg += "\nA frota deve ter no máximo 10 caracteres";
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
//        obj.setNroServico(Integer.parseInt(jtfNroServico.getText()));
//        obj.setCpfCnpj(jtfCpfCnpj.getText());
//        obj.setDataServico(jtfDataServico.getText());
//        obj.setValorservico(jtfValorServico.getText());
//        obj.setPlaca(jtfPlaca.getText());
//        obj.setModelo(jtfModelo.getText());
//        obj.setFrota(jtfFrota.getText());
//        return true;
//        }
}