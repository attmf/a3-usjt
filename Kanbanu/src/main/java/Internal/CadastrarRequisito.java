/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Internal;

import Controller.RequisitoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author atm
 */
public class CadastrarRequisito extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroProjeto
     */
    private Usuario usuarioLogado;
    private int IDProejto;

    public CadastrarRequisito(Usuario usuarioLogado, int IDProjeto) {
        initComponents();
        this.IDProejto = IDProjeto;
        this.usuarioLogado = usuarioLogado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        formularioDeProjeto = new javax.swing.JPanel();
        labelCadastroDeProjeto = new javax.swing.JLabel();
        labelNomProjeto = new javax.swing.JLabel();
        fieldNomeRequisito = new javax.swing.JTextField();
        descricaoLabel = new javax.swing.JLabel();
        fieldModulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fieldFuncionalidade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescricaoRequisito = new javax.swing.JTextArea();
        descricaoRequisito = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxComplexiade = new javax.swing.JComboBox<>();
        comboBoxPrioridade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxEstado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        faseField = new javax.swing.JTextField();
        buttonVoltar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttounSalvar = new javax.swing.JButton();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        formularioDeProjeto.setBackground(new java.awt.Color(255, 255, 255));

        labelCadastroDeProjeto.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        labelCadastroDeProjeto.setText("Cadastrar Requisito");

        labelNomProjeto.setText("Nome Requisito");

        descricaoLabel.setText("Modulo");

        jLabel1.setText("Funcionalidade");

        textDescricaoRequisito.setColumns(20);
        textDescricaoRequisito.setRows(5);
        jScrollPane2.setViewportView(textDescricaoRequisito);

        descricaoRequisito.setText("Descri????o Requisito");

        jLabel3.setText("Complexidade");

        comboBoxComplexiade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboBoxComplexiade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxComplexiadeActionPerformed(evt);
            }
        });

        comboBoxPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        comboBoxPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPrioridadeActionPerformed(evt);
            }
        });

        jLabel5.setText("Prioridade");

        jLabel6.setText("Estado");

        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especificado", "Em andamento", "Finalizado" }));
        comboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Fase");

        faseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseFieldActionPerformed(evt);
            }
        });

        buttonVoltar.setBackground(new java.awt.Color(51, 204, 255));
        buttonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttonLimpar.setBackground(new java.awt.Color(51, 204, 255));
        buttonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttounSalvar.setBackground(new java.awt.Color(51, 204, 255));
        buttounSalvar.setForeground(new java.awt.Color(255, 255, 255));
        buttounSalvar.setText("Salvar");
        buttounSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttounSalvarMouseClicked(evt);
            }
        });
        buttounSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttounSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioDeProjetoLayout = new javax.swing.GroupLayout(formularioDeProjeto);
        formularioDeProjeto.setLayout(formularioDeProjetoLayout);
        formularioDeProjetoLayout.setHorizontalGroup(
            formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                        .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNomProjeto)
                            .addComponent(jLabel1)
                            .addComponent(fieldFuncionalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(faseField))
                        .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(103, 103, 103))
                            .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                                        .addComponent(comboBoxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBoxComplexiade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5)
                                    .addComponent(fieldModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descricaoLabel))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                        .addComponent(fieldNomeRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                        .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoRequisito)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE))))
            .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(labelCadastroDeProjeto))
                    .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(buttounSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formularioDeProjetoLayout.setVerticalGroup(
            formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastroDeProjeto)
                .addGap(29, 29, 29)
                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomProjeto)
                    .addComponent(descricaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNomeRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxPrioridade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldFuncionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxComplexiade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(faseField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricaoRequisito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttounSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioDeProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioDeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttounSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttounSalvarActionPerformed
        String funcionalidade = this.fieldFuncionalidade.getText();
        String modulo = this.fieldModulo.getText();
        String nomeRequisito = this.fieldNomeRequisito.getText();
        String textDescrucai = this.textDescricaoRequisito.getText();
        String fase = this.faseField.getText();
        int prioridade = Integer.parseInt(this.comboBoxPrioridade.getSelectedItem().toString());
        String estado = this.comboBoxEstado.getSelectedItem().toString();
        int complexidade = Integer.parseInt(this.comboBoxComplexiade.getSelectedItem().toString());

        try {
            RequisitoController requisito = new RequisitoController(funcionalidade, modulo, nomeRequisito, textDescrucai, fase, prioridade, estado, complexidade, this.IDProejto, this.usuarioLogado.getIdUsuario());
            requisito.salvarRequisito();
            JOptionPane.showInternalMessageDialog(null, "Requisito Salvo!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarRequisito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttounSalvarActionPerformed

    private void buttounSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttounSalvarMouseClicked

    }//GEN-LAST:event_buttounSalvarMouseClicked

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        this.fieldFuncionalidade.setText("");
        this.fieldModulo.setText("");
        this.fieldNomeRequisito.setText("");
        this.textDescricaoRequisito.setText("");
        this.faseField.setText("");
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void faseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseFieldActionPerformed

    private void comboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEstadoActionPerformed

    private void comboBoxPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPrioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPrioridadeActionPerformed

    private void comboBoxComplexiadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxComplexiadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxComplexiadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JButton buttounSalvar;
    private javax.swing.JComboBox<String> comboBoxComplexiade;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JComboBox<String> comboBoxPrioridade;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JLabel descricaoRequisito;
    private javax.swing.JTextField faseField;
    private javax.swing.JTextField fieldFuncionalidade;
    private javax.swing.JTextField fieldModulo;
    private javax.swing.JTextField fieldNomeRequisito;
    private javax.swing.JPanel formularioDeProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCadastroDeProjeto;
    private javax.swing.JLabel labelNomProjeto;
    private javax.swing.JTextArea textDescricaoRequisito;
    // End of variables declaration//GEN-END:variables
}
