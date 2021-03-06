/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Internal;

import Controller.PerfilController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author atm
 */
public class PerfilUsuarioInternal extends javax.swing.JInternalFrame {

    /**
     * Creates new form PerfielUsuarioInternal
     */
    private Usuario usuarioLogado;

    public PerfilUsuarioInternal(Usuario usuarioLogado) {
        initComponents();
        this.usuarioLogado = usuarioLogado;
        this.fieldNome.setText(usuarioLogado.getNomeCompleto());
        this.fieldEmail.setText(usuarioLogado.getEmail());
        this.fieldTelefone.setText(usuarioLogado.getTelefone());
        this.fieldUsuario.setText(usuarioLogado.getUsuario());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formularioDeUsuario = new javax.swing.JPanel();
        jLabelInformacaoUsuario2 = new javax.swing.JLabel();
        jLabelNomeCompleto2 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabelEmailUsario2 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabelTelefone2 = new javax.swing.JLabel();
        fieldTelefone = new javax.swing.JTextField();
        fieldUsuario = new javax.swing.JTextField();
        jLabelUsuario2 = new javax.swing.JLabel();
        jLabelPassword2 = new javax.swing.JLabel();
        senhaNova = new javax.swing.JPasswordField();
        jLabelComfirmePassword2 = new javax.swing.JLabel();
        confirmacaoSenhaNova = new javax.swing.JPasswordField();
        jButtonVoltar2 = new javax.swing.JButton();
        jButtonEnviar2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        senhaAntiga = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(51, 204, 255));
        setBorder(null);

        formularioDeUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabelInformacaoUsuario2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelInformacaoUsuario2.setText("Perfil Usu??rio");

        jLabelNomeCompleto2.setText("Nome Completo");

        jLabelEmailUsario2.setText("E-mail");

        jLabelTelefone2.setText("Telefone");

        fieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTelefoneActionPerformed(evt);
            }
        });

        jLabelUsuario2.setText("Usu??rio");

        jLabelPassword2.setText("Nova Senha");

        jLabelComfirmePassword2.setText("Confirme Senha");

        confirmacaoSenhaNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmacaoSenhaNovaActionPerformed(evt);
            }
        });

        jButtonVoltar2.setBackground(new java.awt.Color(51, 204, 255));
        jButtonVoltar2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar2.setText("Voltar");
        jButtonVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltar2ActionPerformed(evt);
            }
        });

        jButtonEnviar2.setBackground(new java.awt.Color(51, 204, 255));
        jButtonEnviar2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEnviar2.setText("Salvar");
        jButtonEnviar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnviar2MouseClicked(evt);
            }
        });
        jButtonEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviar2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 204, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Deletar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Senha Atual");

        javax.swing.GroupLayout formularioDeUsuarioLayout = new javax.swing.GroupLayout(formularioDeUsuario);
        formularioDeUsuario.setLayout(formularioDeUsuarioLayout);
        formularioDeUsuarioLayout.setHorizontalGroup(
            formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(confirmacaoSenhaNova)
                            .addComponent(senhaNova, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaAntiga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeCompleto2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmailUsario2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassword2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelComfirmePassword2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                                        .addComponent(jLabelTelefone2)
                                        .addGap(0, 130, Short.MAX_VALUE))
                                    .addComponent(fieldTelefone))
                                .addGap(18, 18, 18)
                                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                                        .addComponent(jLabelUsuario2)
                                        .addGap(142, 142, 142))
                                    .addComponent(fieldUsuario)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioDeUsuarioLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButtonVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonEnviar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabelInformacaoUsuario2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formularioDeUsuarioLayout.setVerticalGroup(
            formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelInformacaoUsuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNomeCompleto2)
                .addGap(0, 0, 0)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmailUsario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone2)
                    .addComponent(jLabelUsuario2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelComfirmePassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmacaoSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEnviar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelefoneActionPerformed

    }//GEN-LAST:event_fieldTelefoneActionPerformed

    private void confirmacaoSenhaNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmacaoSenhaNovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmacaoSenhaNovaActionPerformed

    private void jButtonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltar2ActionPerformed

    private void jButtonEnviar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviar2MouseClicked

    }//GEN-LAST:event_jButtonEnviar2MouseClicked

    private void jButtonEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviar2ActionPerformed
        String email = this.fieldEmail.getText();
        String telefone = this.fieldTelefone.getText();
        String usuario = this.fieldUsuario.getText();
        String senhaAntiga = this.senhaAntiga.getText();
        String senhaNova = this.confirmacaoSenhaNova.getText();
        String comfirmaSenhaNova = this.confirmacaoSenhaNova.getText();
        String nomeCompleto = this.fieldNome.getText();

        if(senhaNova.equals(comfirmaSenhaNova)){
            PerfilController updateUsuario = new PerfilController(usuarioLogado ,nomeCompleto,email,telefone, usuario, senhaAntiga, senhaNova);
            try {
                this.usuarioLogado = updateUsuario.updateUsuario();
            } catch (SQLException ex) {
                Logger.getLogger(PerfilUsuarioInternal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
               JOptionPane.showMessageDialog(null, "As senhas n??o conferem"); 
        }
    }//GEN-LAST:event_jButtonEnviar2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           int deletarAConta = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja deletar a conta?");
           try {
               if(deletarAConta == 0) {
                   usuarioLogado.deleteMeuUsuario();
                   System.exit(EXIT_ON_CLOSE);
               }
           } catch (SQLException ex) {
               Logger.getLogger(PerfilUsuarioInternal.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmacaoSenhaNova;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel formularioDeUsuario;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonEnviar2;
    private javax.swing.JButton jButtonVoltar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelComfirmePassword2;
    private javax.swing.JLabel jLabelEmailUsario2;
    private javax.swing.JLabel jLabelInformacaoUsuario2;
    private javax.swing.JLabel jLabelNomeCompleto2;
    private javax.swing.JLabel jLabelPassword2;
    private javax.swing.JLabel jLabelTelefone2;
    private javax.swing.JLabel jLabelUsuario2;
    private javax.swing.JPasswordField senhaAntiga;
    private javax.swing.JPasswordField senhaNova;
    // End of variables declaration//GEN-END:variables
}
