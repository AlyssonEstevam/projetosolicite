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
public class TelaPrimeiroLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    Usuario u;
    
    public TelaPrimeiroLogin(Usuario usuarioSelecionado) {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.u=usuarioSelecionado;
        this.setResizable(false);
        txtNovaSenha.requestFocus();
        txtConfirmarSenha.setCaretColor(Color.white);
        txtNovaSenha.setCaretColor(Color.white);
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
        txtConfirmarSenha = new javax.swing.JPasswordField();
        btConfirmar = new javax.swing.JButton();
        txtNovaSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Primeiro Login");
        setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setFont(new java.awt.Font("Tahoma", 0, 120)); // NOI18N
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        lbSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(0, 0, 102));
        lbSenha.setText("Confirmar senha:");

        lbUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 0, 102));
        lbUsuario.setText("Nova senha:");

        txtConfirmarSenha.setBackground(new java.awt.Color(0, 0, 102));
        txtConfirmarSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmarSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarSenhaActionPerformed(evt);
            }
        });
        txtConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarSenhaKeyPressed(evt);
            }
        });

        btConfirmar.setBackground(new java.awt.Color(0, 0, 153));
        btConfirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btConfirmar.setText("CONFIRMA");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        txtNovaSenha.setBackground(new java.awt.Color(0, 0, 102));
        txtNovaSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNovaSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtNovaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovaSenhaActionPerformed(evt);
            }
        });
        txtNovaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNovaSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSenha)
                    .addComponent(lbUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbLogo)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btConfirmar)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        String senha = txtNovaSenha.getText();
        String confirmaSenha = txtConfirmarSenha.getText();
        
        if(!(senha.equals("")) && !(confirmaSenha.equals("")) && senha.equals(confirmaSenha)){
            u.setSenha(senha);
            UsuarioDao ud = new UsuarioDao();
            
            ud.alterar(u, 0);
            
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso! Faça o login novamente.");
            this.dispose();
            TelaLogin tl = new TelaLogin();
            tl.setVisible(true);
            tl.setLocationRelativeTo(null);
        }else if(senha.equals("") || confirmaSenha.equals("")){
            JOptionPane.showMessageDialog(null, "Um dos campos está em branco!");
        }else if(!(senha.equals(confirmaSenha))){
            JOptionPane.showMessageDialog(null, "As senhas não conferem!");
        }
        
        
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void txtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarSenhaActionPerformed

    private void txtNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNovaSenhaActionPerformed

    private void txtNovaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNovaSenhaKeyPressed
        if(evt.getKeyCode()==10){
            txtConfirmarSenha.requestFocus();
        }
    }//GEN-LAST:event_txtNovaSenhaKeyPressed

    private void txtConfirmarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaKeyPressed
        if(evt.getKeyCode()==10){
            btConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_txtConfirmarSenhaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmar;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JPasswordField txtNovaSenha;
    // End of variables declaration//GEN-END:variables
}
