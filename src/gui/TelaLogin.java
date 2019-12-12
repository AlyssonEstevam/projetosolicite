/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bean.Usuario;
import dao.UsuarioDao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Alysson
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public TelaLogin() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        txtSenha.setCaretColor(Color.white);
        
        this.setResizable(false);
        
        UsuarioDao ud = new UsuarioDao();
        for(Usuario x: ud.consultar()){
            cbUsuario.addItem(x.getUsuario());
        }
        
        txtSenha.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogo = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        cbUsuario = new javax.swing.JComboBox();
        txtSenha = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setFont(new java.awt.Font("Tahoma", 0, 120)); // NOI18N
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        lbSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(0, 0, 102));
        lbSenha.setText("Senha:");

        lbUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 0, 102));
        lbUsuario.setText("Usuário: ");

        cbUsuario.setBackground(new java.awt.Color(0, 0, 102));
        cbUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        cbUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));
        cbUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUsuarioItemStateChanged(evt);
            }
        });
        cbUsuario.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                cbUsuarioPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbUsuarioMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbUsuarioMouseReleased(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(0, 0, 102));
        txtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        btEntrar.setBackground(new java.awt.Color(0, 0, 153));
        btEntrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("ENTRAR");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbLogo)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbSenha))
                            .addComponent(lbUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbUsuario, 0, 171, Short.MAX_VALUE)
                            .addComponent(txtSenha))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEntrar)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String usuario = cbUsuario.getSelectedItem().toString();
        
        if(usuario.equals("SELECIONE")){
            JOptionPane.showMessageDialog(null, "Favor selecionar um usuário na lista.");
        }else{
            UsuarioDao ud = new UsuarioDao();
            for(Usuario x: ud.consultar()){
                if(x.getUsuario().equals(usuario)){
                    if(x.getSenha().equals("")){
                        TelaPrimeiroLogin tpl = new TelaPrimeiroLogin(x);
                        tpl.setLocationRelativeTo(null);
                        tpl.setVisible(true);
                        this.dispose();
                    }else if(x.getSenha().equals(txtSenha.getText())){
                        if(x.getFuncao().equals("administrador")){
                            TelaInicialAdministrador tia = new TelaInicialAdministrador(x);
                            tia.setLocationRelativeTo(null);
                            tia.setVisible(true);
                            this.dispose();
                        }
                    }else if(!(x.getSenha().equals(txtSenha.getText()))){
                        JOptionPane.showMessageDialog(null, "SENHA INCORRETA!");
                    }
                }
            }
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode()==10){
            btEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void cbUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUsuarioItemStateChanged
        txtSenha.requestFocus();
    }//GEN-LAST:event_cbUsuarioItemStateChanged

    private void cbUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbUsuarioMouseReleased
        
    }//GEN-LAST:event_cbUsuarioMouseReleased

    private void cbUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbUsuarioMouseExited
        
    }//GEN-LAST:event_cbUsuarioMouseExited

    private void cbUsuarioPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbUsuarioPopupMenuCanceled
        
    }//GEN-LAST:event_cbUsuarioPopupMenuCanceled


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JComboBox cbUsuario;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}