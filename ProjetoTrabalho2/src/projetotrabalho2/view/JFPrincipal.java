/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotrabalho2.view;
import projetotrabalho2.model.Cliente;
/**
 *
 * @author thiag
 */
public class JFPrincipal extends javax.swing.JFrame {
    private Cliente obj;
    
    public JFPrincipal(Cliente obj){
    this();
    this.obj = obj;
    }
    
    public JFPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        obj = new Cliente();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCadastrarOrdem = new javax.swing.JButton();
        jlTituloPrincipal = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();
        jbCadastrarCliente = new javax.swing.JButton();
        jlFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbCadastrarOrdem.setBackground(new java.awt.Color(255, 0, 51));
        jbCadastrarOrdem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCadastrarOrdem.setText("Cadastrar Ordem de Serviço");
        jbCadastrarOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarOrdemActionPerformed(evt);
            }
        });

        jlTituloPrincipal.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jlTituloPrincipal.setForeground(new java.awt.Color(204, 0, 0));
        jlTituloPrincipal.setText("OFICINA SO ALINHAMENTOS");

        jbSair.setBackground(new java.awt.Color(255, 0, 51));
        jbSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbCadastrarCliente.setBackground(new java.awt.Color(255, 0, 51));
        jbCadastrarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCadastrarCliente.setText("Cadastrar Cliente");
        jbCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarClienteActionPerformed(evt);
            }
        });

        jlFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotrabalho2/images/unnamed.jpg"))); // NOI18N
        jlFoto.setText("jLabel1");
        jlFoto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTituloPrincipal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jbCadastrarCliente)
                        .addGap(43, 43, 43)
                        .addComponent(jbCadastrarOrdem)
                        .addGap(31, 31, 31)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlTituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarOrdemActionPerformed
        new JFOrdemServico().setVisible(true);
            dispose();
    }//GEN-LAST:event_jbCadastrarOrdemActionPerformed

    private void jbCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarClienteActionPerformed
        new JFCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbCadastrarClienteActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrarCliente;
    private javax.swing.JButton jbCadastrarOrdem;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlFoto;
    private javax.swing.JLabel jlTituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
