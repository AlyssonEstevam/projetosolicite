package gui;

import bean.Cliente;
import bean.ClienteAReceber;
import bean.VendaServico;
import dao.ClienteAReceberDao;
import dao.ClienteDao;
import dao.VendaServicoDao;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class TelaRealizarVendaServico extends javax.swing.JFrame {
    String responsavel;
    
    public TelaRealizarVendaServico(String responsavel) {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        txtData.setText(getData());
        this.setResizable(false);
        txtData.setCaretColor(Color.white);
        lbCliente.setVisible(false);
        cbCliente.setVisible(false);
        this.responsavel = responsavel;
        
        carregaClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        rbVista = new javax.swing.JRadioButton();
        rbPrazo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox();
        txtData = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JSpinner();
        lbTotal = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox();
        lbCifrao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar Serviço");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Realizar Serviço");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Tipo: ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Data:");

        lbCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCliente.setForeground(new java.awt.Color(0, 0, 102));
        lbCliente.setText("Cliente:");

        buttonGroup1.add(rbVista);
        rbVista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbVista.setForeground(new java.awt.Color(0, 0, 102));
        rbVista.setSelected(true);
        rbVista.setText("À Vista");
        rbVista.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbVistaStateChanged(evt);
            }
        });
        rbVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbVistaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbPrazo);
        rbPrazo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbPrazo.setForeground(new java.awt.Color(0, 0, 102));
        rbPrazo.setText("À Prazo");
        rbPrazo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbPrazoStateChanged(evt);
            }
        });
        rbPrazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbPrazoMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Total:");

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

        cbTipo.setBackground(new java.awt.Color(0, 0, 102));
        cbTipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbTipo.setForeground(new java.awt.Color(255, 255, 255));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Impressão P/B", "Impressão Colorida", "Cópia P/B", "Cópia Colorida", "Encadernação", "Digitalização" }));
        cbTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        lbTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTotal.setText("0.00");

        cbCliente.setBackground(new java.awt.Color(0, 0, 102));
        cbCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbCliente.setForeground(new java.awt.Color(255, 255, 255));
        cbCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));
        cbCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCifrao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCifrao.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCifrao)
                                .addGap(3, 3, 3)
                                .addComponent(lbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lbCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btConfirmar)
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rbVista)
                .addGap(18, 18, 18)
                .addComponent(rbPrazo)
                .addGap(75, 75, 75))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btConfirmar, btLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotal)
                            .addComponent(lbCifrao))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbVista)
                    .addComponent(rbPrazo))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliente)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btConfirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        cbTipo.setSelectedIndex(0);
        txtData.setText(getData());
        txtQuantidade.setValue(1);
        lbTotal.setText("0,00");
        rbVista.setSelected(true);
        cbCliente.setSelectedIndex(0);
        
        lbCliente.setVisible(false);
        cbCliente.setVisible(false);
    }//GEN-LAST:event_btLimparActionPerformed

    private void rbPrazoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbPrazoStateChanged
        
    }//GEN-LAST:event_rbPrazoStateChanged

    private void rbVistaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbVistaStateChanged
        
    }//GEN-LAST:event_rbVistaStateChanged

    private void cbTipoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbTipoPropertyChange
        
    }//GEN-LAST:event_cbTipoPropertyChange

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

    private void rbPrazoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPrazoMouseClicked
        if(rbPrazo.isSelected()){
            cbCliente.setSelectedIndex(0);
            lbCliente.setVisible(true);
            cbCliente.setVisible(true);
        }else if(rbVista.isSelected()){
            lbCliente.setVisible(false);
            cbCliente.setVisible(false);
        }
    }//GEN-LAST:event_rbPrazoMouseClicked

    private void rbVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbVistaMouseClicked
        if(rbPrazo.isSelected()){
            cbCliente.setSelectedIndex(0);
            lbCliente.setVisible(true);
            cbCliente.setVisible(true);
        }else if(rbVista.isSelected()){
            lbCliente.setVisible(false);
            cbCliente.setVisible(false);
        }
    }//GEN-LAST:event_rbVistaMouseClicked

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        if(cbTipo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Selecione um tipo de serviço!");
        }else if(!validaData(txtData.getText())){
            JOptionPane.showMessageDialog(null, "Informe uma data válida!");
        }else{
            VendaServico vs = new VendaServico();
            vs.setData(converteData(txtData.getText()));
            vs.setResponsavel(responsavel);
            vs.setTipo(cbTipo.getSelectedItem().toString());
            vs.setQuantidade(Integer.parseInt(txtQuantidade.getValue().toString()));
            vs.setValor(Double.parseDouble(lbTotal.getText().replace(",", ".")));
            
            VendaServicoDao vsd = new VendaServicoDao();
            
            if(rbVista.isSelected()){
                vsd.inserir(vs);
                btLimparActionPerformed(null);
            }else if(rbPrazo.isSelected()){
                if(cbCliente.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(null, "Selecione um cliente para vendas à prazo!");
                }else{
                    Cliente c = (Cliente) cbCliente.getItemAt(cbCliente.getSelectedIndex());
                    vsd.inserir(vs);
                    ClienteAReceber car = new ClienteAReceber();
                    car.setData(converteData(txtData.getText()));
                    car.setIdcliente(c.getId());
                    car.setVencimento(geraVencimento(converteData(txtData.getText())));
                    car.setSituacao("A RECEBER");
                    car.setValor(Double.parseDouble(lbTotal.getText().replace(",", ".")));
                    car.setTipo("Impressões");
                    ClienteAReceberDao card = new ClienteAReceberDao();
                    card.inserir(car);
                    btLimparActionPerformed(null);
                }
            }
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static String getData(){   
       String data;     
    
       java.util.Date agora = new java.util.Date();
       SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");     
       data = formata.format(agora);
       
       return data;
    }
    
    public String geraVencimento(String data){
        int mes = Integer.parseInt(data.charAt(5)+""+data.charAt(6));
        int ano = Integer.parseInt(data.charAt(0)+""+data.charAt(1)+""+data.charAt(2)+""+data.charAt(3));
        
        if(mes==12){
            mes=1;
            ano++;
        }else{
            mes++;
        }
        
        if(mes<10){
            return ano+"-"+"0"+mes+"-"+"10";
        }else{
            return ano+"-"+mes+"-"+"10";
        }
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
    
    public void carregaClientes(){
        ClienteDao cd = new ClienteDao();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes = cd.consultar();
        
        for(Cliente c: clientes){
            cbCliente.addItem(c);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbCifrao;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JRadioButton rbPrazo;
    private javax.swing.JRadioButton rbVista;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JSpinner txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
