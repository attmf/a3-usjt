package view;

import Internal.CadastrarProjeto;
import Internal.PerfilUsuarioInternal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {

    private final Usuario usuarioLogado;
    private PerfilUsuarioInternal perfilUsuario;
    private CadastrarProjeto cadastroProjeto;

    public TelaPrincipal(Usuario usuarioLogado) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarioLogado = usuarioLogado;
        this.perfilUsuario = new PerfilUsuarioInternal(usuarioLogado);
        this.cadastroProjeto = new CadastrarProjeto(usuarioLogado);
        this.conteudo.add(this.cadastroProjeto);
        this.conteudo.add(this.perfilUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        conteiner = new javax.swing.JPanel();
        labelUltimoProjetos = new javax.swing.JLabel();
        conteinerProjeto = new javax.swing.JPanel();
        labelDataCriacao = new javax.swing.JLabel();
        dataCriacaoProjeto = new javax.swing.JLabel();
        labelProjeto = new javax.swing.JLabel();
        nomeProjeto = new javax.swing.JLabel();
        labelConteudo = new javax.swing.JLabel();
        previaConteudo = new javax.swing.JLabel();
        conteudo = new javax.swing.JPanel();
        jLabeCadastroUsuario = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuPerfil = new javax.swing.JMenu();
        Conta = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuProjeto = new javax.swing.JMenu();
        jMenuNovoProjeto = new javax.swing.JMenuItem();
        jMenuMeuProjeto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        conteiner.setBackground(new java.awt.Color(255, 255, 255));
        conteiner.setName(""); // NOI18N
        conteiner.setPreferredSize(new java.awt.Dimension(400, 600));

        labelUltimoProjetos.setText("Ultimos Projetos");

        conteinerProjeto.setBackground(new java.awt.Color(255, 255, 255));
        conteinerProjeto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelDataCriacao.setText("Criação:");

        dataCriacaoProjeto.setText("2021-12-03");

        labelProjeto.setText("Projeto:");

        nomeProjeto.setText("Nome Projeto");

        labelConteudo.setText("Conteudo:");

        previaConteudo.setText("Descrição Conteudo");

        javax.swing.GroupLayout conteinerProjetoLayout = new javax.swing.GroupLayout(conteinerProjeto);
        conteinerProjeto.setLayout(conteinerProjetoLayout);
        conteinerProjetoLayout.setHorizontalGroup(
            conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProjeto)
                    .addComponent(labelConteudo)
                    .addComponent(labelDataCriacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeProjeto)
                    .addComponent(previaConteudo)
                    .addComponent(dataCriacaoProjeto))
                .addContainerGap())
        );
        conteinerProjetoLayout.setVerticalGroup(
            conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(conteinerProjetoLayout.createSequentialGroup()
                        .addComponent(nomeProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previaConteudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataCriacaoProjeto))
                    .addGroup(conteinerProjetoLayout.createSequentialGroup()
                        .addComponent(labelProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelConteudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDataCriacao)))
                .addContainerGap())
        );

        conteudo.setBackground(new java.awt.Color(237, 237, 237));

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        conteudoLayout.setVerticalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout conteinerLayout = new javax.swing.GroupLayout(conteiner);
        conteiner.setLayout(conteinerLayout);
        conteinerLayout.setHorizontalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conteinerProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(conteinerLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(labelUltimoProjetos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        conteinerLayout.setVerticalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addGap(5, 13, Short.MAX_VALUE)
                .addComponent(labelUltimoProjetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conteinerProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
            .addGroup(conteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLabeCadastroUsuario.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabeCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabeCadastroUsuario.setText("Kanbanu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeCadastroUsuario)
                .addContainerGap(577, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabeCadastroUsuario)
                .addContainerGap(525, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuPerfil.setText("Perfil");

        Conta.setText("Editar Perfil");
        Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContaActionPerformed(evt);
            }
        });
        jMenuPerfil.add(Conta);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Sair");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenuPerfil.add(jCheckBoxMenuItem1);

        jMenuBar.add(jMenuPerfil);

        jMenuProjeto.setText("Projeto");

        jMenuNovoProjeto.setText("Novo Projeto");
        jMenuNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoProjetoActionPerformed(evt);
            }
        });
        jMenuProjeto.add(jMenuNovoProjeto);

        jMenuMeuProjeto.setText("Meus Projetos");
        jMenuMeuProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMeuProjetoActionPerformed(evt);
            }
        });
        jMenuProjeto.add(jMenuMeuProjeto);

        jMenuBar.add(jMenuProjeto);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContaActionPerformed
        this.perfilUsuario.setVisible(true);
    }//GEN-LAST:event_ContaActionPerformed

    private void jMenuNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoProjetoActionPerformed
        this.cadastroProjeto.setVisible(true);
    }//GEN-LAST:event_jMenuNovoProjetoActionPerformed

    private void jMenuMeuProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMeuProjetoActionPerformed
        try {
            this.dispose();
            TelaProjeto telaProjeto = new TelaProjeto(usuarioLogado);
            telaProjeto.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuMeuProjetoActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        this.dispose();
        System.exit(WIDTH);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Conta;
    private javax.swing.JPanel conteiner;
    private javax.swing.JPanel conteinerProjeto;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLabel dataCriacaoProjeto;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabeCadastroUsuario;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuMeuProjeto;
    private javax.swing.JMenuItem jMenuNovoProjeto;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu jMenuProjeto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelConteudo;
    private javax.swing.JLabel labelDataCriacao;
    private javax.swing.JLabel labelProjeto;
    private javax.swing.JLabel labelUltimoProjetos;
    private javax.swing.JLabel nomeProjeto;
    private javax.swing.JLabel previaConteudo;
    // End of variables declaration//GEN-END:variables
}
