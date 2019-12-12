package gui;

import bean.PerdaUsoServico;
import dao.PerdaUsoServicoDao;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class TelaLancarPerdaUsoServico extends javax.swing.JFrame {
    String responsavel;
    
    public TelaLancarPerdaUsoServico(String responsavel) {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        txtData.setText(getData());
        this.setResizable(false);
        txtData.setCaretColor(Color.white);
        rbPerda.setSelected(true);
        this.responsavel = responsavel;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbUso = new javax.swing.JRadioButton();
        rbPerda = new javax.swing.JRadioButton();
        cbServico = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar Venda");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Lançar Perda/Uso Papelaria");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Data:");

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

        txtData.setBackground(new java.awt.Color(0, 0, 102));
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtQuantidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtQuantidade.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        txtQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQuantidadeStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Serviço:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Tipo:");

        buttonGroup1.add(rbUso);
        rbUso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbUso.setForeground(new java.awt.Color(0, 0, 102));
        rbUso.setText("Uso");
        rbUso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbUsoStateChanged(evt);
            }
        });
        rbUso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbUsoMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbPerda);
        rbPerda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbPerda.setForeground(new java.awt.Color(0, 0, 102));
        rbPerda.setText("Perda");
        rbPerda.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbPerdaStateChanged(evt);
            }
        });
        rbPerda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbPerdaMouseClicked(evt);
            }
        });

        cbServico.setBackground(new java.awt.Color(0, 0, 102));
        cbServico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbServico.setForeground(new java.awt.Color(255, 255, 255));
        cbServico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Impressão P/B", "Impressão Colorida", "Cópia P/B", "Cópia Colorida", "Encadernação", "Digitalização" }));
        cbServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbServicoItemStateChanged(evt);
            }
        });
        cbServico.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbServicoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbPerda)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbUso))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(btLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btConfirmar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbServico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btConfirmar, btLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbPerda)
                    .addComponent(rbUso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btConfirmar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQuantidadeStateChanged
       
    }//GEN-LAST:event_txtQuantidadeStateChanged

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        cbServico.setSelectedIndex(0);
        txtData.setText(getData());
        txtQuantidade.setValue(1);
        rbPerda.setSelected(true);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        if(!validaData(txtData.getText())){
            JOptionPane.showMessageDialog(null, "Informe uma data válida!");
        }else if(cbServico.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Selecione o serviço!");
        }else{
            PerdaUsoServico pus = new PerdaUsoServico();
            pus.setData(converteData(txtData.getText()));
            pus.setResponsavel(responsavel);
            pus.setServico(cbServico.getSelectedItem().toString());
            pus.setQuantidade(Integer.parseInt(txtQuantidade.getValue().toString()));
            if(rbPerda.isSelected()){
                pus.setTipo("Perda");
            }else{
                pus.setTipo("Uso");
            }
            PerdaUsoServicoDao pusd = new PerdaUsoServicoDao();
            pusd.inserir(pus);
            btLimparActionPerformed(evt);
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void rbUsoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbUsoStateChanged

    }//GEN-LAST:event_rbUsoStateChanged

    private void rbUsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbUsoMouseClicked
        
    }//GEN-LAST:event_rbUsoMouseClicked

    private void rbPerdaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbPerdaStateChanged

    }//GEN-LAST:event_rbPerdaStateChanged

    private void rbPerdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPerdaMouseClicked
        
    }//GEN-LAST:event_rbPerdaMouseClicked

    private void cbServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbServicoItemStateChanged
        
    }//GEN-LAST:event_cbServicoItemStateChanged

    private void cbServicoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbServicoPropertyChange

    }//GEN-LAST:event_cbServicoPropertyChange

    public static String getData(){   
       String data;     
    
       java.util.Date agora = new java.util.Date();
       SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");     
       data = formata.format(agora);
       
       return data;
    }
    
    public String converteData(String data){
        return data.charAt(6)+""+data.charAt(7)+""+data.charAt(8)+""+data.charAt(9)+"-"+data.charAt(3)+""+data.charAt(4)+"-"+data.charAt(0)+""+data.charAt(1);
    }
    
    public boolean validaData(String dataInformada){
        String dataAtual = getData();
        
        int diaInformado = Integer.parseInt(dataInformada.charAt(0)+""+dataInformada.charAt(1));
        int mesInformado = Integer.parseInt(dataInformada.charAt(3)+""+dataInformada.charAt(4));
        int anoInformado = Integer.parseInt(dataInformada.charAt(6)+""+dataInformada.charAt(7)+dataInformada.charAt(8)+""+dataInformada.charAt(9));
        
        int diaAtual = Integer.parseInt(dataAtual.charAt(0)+""+dataAtual.charAt(1));
        int mesAtual = Integer.parseInt(dataAtual.charAt(3)+""+dataAtual.charAt(4));
        int anoAtual = Integer.parseInt(dataAtual.charAt(6)+""+dataAtual.charAt(7)+dataAtual.charAt(8)+""+dataAtual.charAt(9));
        
        if(anoInformado>anoAtual){
            return false;
        }else if(mesInformado<1 || mesInformado>12 || (anoInformado==anoAtual && mesInformado>mesAtual)){
            return false;
        }else if(mesInformado==1 || mesInformado==3 || mesInformado==5 || mesInformado==7 || mesInformado==8 || mesInformado==10 || mesInformado==12){
            if(diaInformado<1 || diaInformado>31 || (anoInformado==anoAtual && mesInformado==mesAtual && diaInformado>diaAtual)){
                return false;
            }
        }else if((mesInformado==4 || mesInformado==9 || mesInformado==11)){
            if(diaInformado<1 || diaInformado>30 || (anoInformado==anoAtual && mesInformado==mesAtual && diaInformado>diaAtual)){
                return false;
            }
        }else if(mesInformado==2){
            if(anoInformado%4==0){
                if(diaInformado<1 || diaInformado>29 || (anoInformado==anoAtual && mesInformado==mesAtual && diaInformado>diaAtual)){
                    return false;
                } 
            }else{
                if(diaInformado<1 || diaInformado>28 || (anoInformado==anoAtual && mesInformado==mesAtual && diaInformado>diaAtual)){
                    return false;
                } 
            }
        }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbPerda;
    private javax.swing.JRadioButton rbUso;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JSpinner txtQuantidade;
    // End of variables declaration//GEN-END:variables
}