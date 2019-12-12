/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bean.Cliente;
import bean.Usuario;
import bean.VendaServico;
import dao.ClienteDao;
import dao.UsuarioDao;
import dao.VendaServicoDao;
import static gui.TelaRealizarVendaServico.getData;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Alysson
 */
public class TelaAlterarVendaServico extends javax.swing.JFrame {

    /**
     * Creates new form TelaRealizarVendaServico
    */
    VendaServico vendaAntiga;
    String responsavel;
    
    public TelaAlterarVendaServico(VendaServico vs, String responsavel) {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setResizable(false);
        txtId.setEditable(false);
        this.vendaAntiga = vs;
        this.responsavel = responsavel;
        btLimparActionPerformed(null);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        lbCifrao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Data:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Serviço");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Alterar Serviço");

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

        lbTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTotal.setText("0.00");

        lbCifrao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCifrao.setText("R$");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Total:");

        txtQuantidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtQuantidade.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        txtQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQuantidadeStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Quantidade:");

        txtData.setBackground(new java.awt.Color(0, 0, 102));
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setCaretColor(new java.awt.Color(255, 255, 255));
        txtData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Data:");

        cbTipo.setBackground(new java.awt.Color(0, 0, 102));
        cbTipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbTipo.setForeground(new java.awt.Color(255, 255, 255));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Impressão P/B", "Impressão Colorida", "Cópia P/B", "Cópia Colorida", "Encadernação", "Digitalização" }));
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoItemStateChanged(evt);
            }
        });
        cbTipo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbTipoPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Tipo: ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("ID:");

        txtId.setBackground(new java.awt.Color(0, 0, 102));
        txtId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtId.setCaretColor(new java.awt.Color(255, 255, 255));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCifrao)
                                .addGap(3, 3, 3)
                                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btConfirmar)
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btConfirmar, btLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbTotal)
                    .addComponent(lbCifrao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtId.setText(vendaAntiga.getId()+"");
        txtData.setValue(vendaAntiga.getData());
        txtQuantidade.setValue(vendaAntiga.getQuantidade());
        lbTotal.setText(vendaAntiga.getValor()+"");
        cbTipo.setSelectedItem(vendaAntiga.getTipo());
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        if(cbTipo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Selecione um tipo de serviço!");
        }else if(!validaData(txtData.getText())){
            JOptionPane.showMessageDialog(null, "Informe uma data válida!");
        }else{
            VendaServico vs = new VendaServico();
            vs.setId(Integer.parseInt(txtId.getText()));
            vs.setData(converteData(txtData.getText()));
            vs.setResponsavel(responsavel);
            vs.setTipo(cbTipo.getSelectedItem().toString());
            vs.setQuantidade(Integer.parseInt(txtQuantidade.getValue().toString()));
            vs.setValor(Double.parseDouble(lbTotal.getText().replace(",", ".")));
            
            VendaServicoDao vsd = new VendaServicoDao();
            
            vsd.alterar(vs, 1);
            btLimparActionPerformed(null);
            this.dispose();
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void txtQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQuantidadeStateChanged
        int tipo = cbTipo.getSelectedIndex();
        Double valor=0.0;

        switch(tipo){
            case 0:
            valor=0.0;
            break;
            case 1:
            if(Integer.parseInt(txtQuantidade.getValue().toString())>=50){
                valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.15;
            }else{
                valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.2;
            }
            break;
            case 2:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.5;
            break;
            case 3:
            if(Integer.parseInt(txtQuantidade.getValue().toString())>=50){
                valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.15;
            }else{
                valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.2;
            }
            break;
            case 4:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.5;
            break;
            case 5:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*2.5;
            break;
            case 6:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.5;
            break;
        }

        DecimalFormat df = new DecimalFormat("#,###0.00");
        lbTotal.setText(df.format(valor));
    }//GEN-LAST:event_txtQuantidadeStateChanged

    private void cbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoItemStateChanged
        int tipo = cbTipo.getSelectedIndex();
        Double valor=0.0;

        switch(tipo){
            case 0:
            valor=0.0;
            break;
            case 1:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.2;
            break;
            case 2:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.5;
            break;
            case 3:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.2;
            break;
            case 4:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.5;
            break;
            case 5:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*2.5;
            break;
            case 6:
            valor=Double.parseDouble(txtQuantidade.getValue().toString())*0.5;
            break;
        }

        DecimalFormat df = new DecimalFormat("#,###0.00");
        lbTotal.setText(df.format(valor));
    }//GEN-LAST:event_cbTipoItemStateChanged

    private void cbTipoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbTipoPropertyChange

    }//GEN-LAST:event_cbTipoPropertyChange

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        
    }//GEN-LAST:event_txtIdKeyPressed

    public static String getData(){   
       String data;     
    
       java.util.Date agora = new java.util.Date();
       SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");     
       data = formata.format(agora);
       
       return data;
   }
    
    String formataData(String data){
        return data.charAt(8)+""+data.charAt(9)+"/"+data.charAt(5)+""+data.charAt(6)+"/"+data.charAt(0)+""+data.charAt(1)+""+data.charAt(2)+""+data.charAt(3);
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
    
    public String converteData(String data){
        return data.charAt(6)+""+data.charAt(7)+""+data.charAt(8)+""+data.charAt(9)+"-"+data.charAt(3)+""+data.charAt(4)+"-"+data.charAt(0)+""+data.charAt(1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCifrao;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtId;
    private javax.swing.JSpinner txtQuantidade;
    // End of variables declaration//GEN-END:variables
}