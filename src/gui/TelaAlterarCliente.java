/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bean.Cliente;
import bean.Usuario;
import dao.ClienteDao;
import dao.UsuarioDao;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Alysson
 */
public class TelaAlterarCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaRealizarVendaServico
    */
    Cliente antigoUsuario;
    
    public TelaAlterarCliente(Cliente c) {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setResizable(false);
        txtId.setCaretColor(Color.white);
        txtCpf.requestFocus();
        
        txtId.setText(c.getId()+"");
        txtCpf.setText(c.getCpf());
        txtNome.setText(c.getNome());
        
        txtUsuario1.setText(c.getUsuario1());
        if(!c.getUsuario1().equals("")){
            checkUsuario1.setSelected(true);
            txtUsuario1.setEnabled(true);
        }else{
            checkUsuario1.setSelected(false);
            txtUsuario1.setEnabled(false);
        }
        
        txtUsuario2.setText(c.getUsuario2());
        if(!c.getUsuario2().equals("")){
            checkUsuario2.setSelected(true);
            txtUsuario2.setEnabled(true);
        }else{
            checkUsuario2.setSelected(false);
            txtUsuario2.setEnabled(false);
        }
        
        txtEmail.setText(c.getEmail());
        txtTelefone.setText(c.getTelefone());
        
        if(c.getSituacao()){
            checkSituacao.setSelected(true);
        }else{
            checkSituacao.setSelected(false);
        }
        
        txtId.setEditable(false);
        antigoUsuario=c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        checkUsuario1 = new javax.swing.JCheckBox();
        txtUsuario1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        checkUsuario2 = new javax.swing.JCheckBox();
        txtUsuario2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        checkSituacao = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Cliente");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Alterar Cliente");

        btLimpar.setBackground(new java.awt.Color(0, 0, 102));
        btLimpar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btConfirmar.setBackground(new java.awt.Color(0, 0, 102));
        btConfirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("CPF:");

        txtCpf.setBackground(new java.awt.Color(0, 0, 102));
        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nome:");

        txtId.setBackground(new java.awt.Color(0, 0, 102));
        txtId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Usuário 1:");

        checkUsuario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkUsuario1.setForeground(new java.awt.Color(0, 0, 102));
        checkUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUsuario1ActionPerformed(evt);
            }
        });

        txtUsuario1.setBackground(new java.awt.Color(0, 0, 102));
        txtUsuario1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuario1KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Usuário 2:");

        checkUsuario2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkUsuario2.setForeground(new java.awt.Color(0, 0, 102));
        checkUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUsuario2ActionPerformed(evt);
            }
        });

        txtUsuario2.setBackground(new java.awt.Color(0, 0, 102));
        txtUsuario2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuario2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuario2KeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("E-mail:");

        txtEmail.setBackground(new java.awt.Color(0, 0, 102));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.setPreferredSize(new java.awt.Dimension(211, 24));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Telefone:");

        txtTelefone.setBackground(new java.awt.Color(0, 0, 102));
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefone.setPreferredSize(new java.awt.Dimension(211, 24));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });

        checkSituacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        checkSituacao.setForeground(new java.awt.Color(0, 0, 102));
        checkSituacao.setText("Situação Cadastro");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("ID:");

        txtNome.setBackground(new java.awt.Color(0, 0, 102));
        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkUsuario1)
                                    .addComponent(checkUsuario2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btConfirmar)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkSituacao)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btConfirmar, btLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkUsuario1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkUsuario2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSituacao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtId.setText(antigoUsuario.getId()+"");
        txtCpf.setText(antigoUsuario.getCpf());
        txtNome.setText(antigoUsuario.getNome());
        
        txtUsuario1.setText(antigoUsuario.getUsuario1());
        if(!antigoUsuario.getUsuario1().equals("")){
            checkUsuario1.setSelected(true);
            txtUsuario1.setEnabled(true);
        }else{
            checkUsuario1.setSelected(true);
            txtUsuario1.setEnabled(false);
        }
        
        txtUsuario2.setText(antigoUsuario.getUsuario2());
        if(!antigoUsuario.getUsuario2().equals("")){
            checkUsuario2.setSelected(true);
            txtUsuario2.setEnabled(true);
        }else{
            checkUsuario2.setSelected(true);
            txtUsuario2.setEnabled(false);
        }
        
        txtEmail.setText(antigoUsuario.getEmail());
        txtTelefone.setText(antigoUsuario.getTelefone());
        
        if(antigoUsuario.getSituacao()){
            checkSituacao.setSelected(true);
        }else{
            checkSituacao.setSelected(true);
        }
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        Cliente c = new Cliente();
        
        if(txtCpf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "CPF do cliente não informado!");
        }else{
            String cpf = txtCpf.getText();
            
            if(c.setCpf(cpf)){
                if(txtNome.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Nome do cliente não informado!");
                }else if(checkUsuario1.isSelected() && txtUsuario1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Nome do Usuário 1 não informado!");
                }else if(checkUsuario2.isSelected()&& txtUsuario2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Nome do Usuário 2 não informado!");
                }else{
                    if(checkSituacao.isSelected()){
                        c.setSituacao(true);
                    }else{
                        c.setSituacao(false);
                    }
                    
                    c.setId(Integer.parseInt(txtId.getText()));
                    c.setNome(txtNome.getText());
                    c.setUsuario1(txtUsuario1.getText());
                    c.setUsuario2(txtUsuario2.getText());
                    c.setEmail(txtEmail.getText());
                    c.setTelefone(txtTelefone.getText());

                    ClienteDao cd = new ClienteDao();

                    cd.alterar(c, 1);

                    btLimparActionPerformed(null);
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "O CPF informado não é válido!");
            }
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed

    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyPressed
        if(evt.getKeyCode()==10){
            txtId.requestFocus();
        }
    }//GEN-LAST:event_txtCpfKeyPressed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        if(evt.getKeyCode()==10){
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void checkUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUsuario1ActionPerformed
        if(checkUsuario1.isSelected()){
            txtUsuario1.setEnabled(true);
        }else{
            txtUsuario1.setEnabled(false);
            txtUsuario1.setText("");
        }
    }//GEN-LAST:event_checkUsuario1ActionPerformed

    private void txtUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuario1KeyPressed
        if(evt.getKeyCode()==10){
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtUsuario1KeyPressed

    private void checkUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUsuario2ActionPerformed
        if(checkUsuario2.isSelected()){
            txtUsuario2.setEnabled(true);
        }else{
            txtUsuario2.setEnabled(false);
            txtUsuario2.setText("");
        }
    }//GEN-LAST:event_checkUsuario2ActionPerformed

    private void txtUsuario2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuario2KeyPressed
        if(evt.getKeyCode()==10){
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtUsuario2KeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(evt.getKeyCode()==10){
            txtTelefone.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if(evt.getKeyCode()==10){
            btConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeKeyPressed

    public static String getData(){   
       String data;     
    
       java.util.Date agora = new java.util.Date();
       SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");     
       data = formata.format(agora);
       
       return data;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkSituacao;
    private javax.swing.JCheckBox checkUsuario1;
    private javax.swing.JCheckBox checkUsuario2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUsuario1;
    private javax.swing.JTextField txtUsuario2;
    // End of variables declaration//GEN-END:variables
}