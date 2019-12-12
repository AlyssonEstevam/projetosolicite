package gui;

import bean.DescontoExcedente;
import dao.DescontoExcedenteDao;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class TelaLancarDescontoExcedente extends javax.swing.JFrame {

    public TelaLancarDescontoExcedente() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setResizable(false);
        txtValor.requestFocus();
        btLimparActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtUsuario2 = new javax.swing.JTextField();
        txtTelefone1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        rbDesconto = new javax.swing.JRadioButton();
        rbExcedente = new javax.swing.JRadioButton();

        txtUsuario2.setBackground(new java.awt.Color(0, 0, 102));
        txtUsuario2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuario2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuario2KeyPressed(evt);
            }
        });

        txtTelefone1.setBackground(new java.awt.Color(0, 0, 102));
        txtTelefone1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefone1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone1ActionPerformed(evt);
            }
        });
        txtTelefone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefone1KeyPressed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Lançar Desconto/Excedente");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Valor:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Tipo:");

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

        txtValor.setBackground(new java.awt.Color(0, 0, 102));
        txtValor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        txtValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbDesconto);
        rbDesconto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbDesconto.setForeground(new java.awt.Color(0, 0, 102));
        rbDesconto.setSelected(true);
        rbDesconto.setText("Desconto");
        rbDesconto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbDescontoStateChanged(evt);
            }
        });
        rbDesconto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbDescontoMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbExcedente);
        rbExcedente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbExcedente.setForeground(new java.awt.Color(0, 0, 102));
        rbExcedente.setText("Excedente");
        rbExcedente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbExcedenteStateChanged(evt);
            }
        });
        rbExcedente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbExcedenteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbDesconto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbExcedente))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtValor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btLimpar)
                                    .addGap(36, 36, 36)
                                    .addComponent(btConfirmar))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btConfirmar, btLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbDesconto)
                    .addComponent(rbExcedente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtValor.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        DescontoExcedente de = new DescontoExcedente();
        
        if(txtValor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Valor não informado!");
            txtValor.requestFocus();
        }else{
            if(rbDesconto.isSelected()){
                de.setTipo(true);
            }else{
                de.setTipo(false);
            }
            
            de.setValor(Double.parseDouble(txtValor.getText().replace(",", ".")));
                    
            DescontoExcedenteDao ded = new DescontoExcedenteDao();

            ded.inserir(de);

            btLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
        if(evt.getKeyCode()==10){
            btConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_txtValorKeyPressed

    private void txtUsuario2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuario2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario2KeyPressed

    private void txtTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone1ActionPerformed

    private void txtTelefone1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefone1KeyPressed
        if(evt.getKeyCode()==10){
            btConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_txtTelefone1KeyPressed

    private void rbDescontoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbDescontoStateChanged

    }//GEN-LAST:event_rbDescontoStateChanged

    private void rbDescontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDescontoMouseClicked
        
    }//GEN-LAST:event_rbDescontoMouseClicked

    private void rbExcedenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbExcedenteStateChanged

    }//GEN-LAST:event_rbExcedenteStateChanged

    private void rbExcedenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbExcedenteMouseClicked
        
    }//GEN-LAST:event_rbExcedenteMouseClicked

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) && !String.valueOf(c).equals(",") && !String.valueOf(c).equals(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbDesconto;
    private javax.swing.JRadioButton rbExcedente;
    private javax.swing.JRadioButton rbVista;
    private javax.swing.JFormattedTextField txtTelefone1;
    private javax.swing.JTextField txtUsuario2;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
