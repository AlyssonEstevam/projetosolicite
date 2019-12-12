package gui;

import bean.Cliente;
import bean.ClienteAReceber;
import dao.ClienteAReceberDao;
import dao.ClienteDao;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TelaConsultarClientesAReceber extends javax.swing.JFrame {
    
    public TelaConsultarClientesAReceber() {
        initComponents();
        
        txtPesquisa.setCaretColor(Color.white);
        this.getContentPane().setBackground(Color.white);
        this.setExtendedState(MAXIMIZED_BOTH);
        rbAReceber.setSelected(true);
        setarTabela();
        this.consultar();
        
        JTableHeader cabecalho = tabelaValores.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.BOLD, 18));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        txtPesquisa = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaValores = new javax.swing.JTable();
        btPesquisar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btRemover = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();
        rbPago = new javax.swing.JRadioButton();
        rbAReceber = new javax.swing.JRadioButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton2.setText("A RECEBER");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtPesquisa.setBackground(new java.awt.Color(0, 0, 102));
        txtPesquisa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisa.setText("Pesquisar...");
        txtPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesquisaFocusGained(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        cbFiltro.setBackground(new java.awt.Color(0, 0, 102));
        cbFiltro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbFiltro.setForeground(new java.awt.Color(255, 255, 255));
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FILTRO", "Cliente", "Vencimento" }));
        cbFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFiltroItemStateChanged(evt);
            }
        });
        cbFiltro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbFiltroPropertyChange(evt);
            }
        });

        tabelaValores.setBackground(new java.awt.Color(0, 0, 102));
        tabelaValores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabelaValores.setForeground(new java.awt.Color(255, 255, 255));
        tabelaValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "ID Cliente", "Cliente", "Tipo", "Vencimento", "Valor", "Data Pagamento", "Valor Pago", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaValores);

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIcon.png"))); // NOI18N
        btPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Consultar Clientes a Receber");

        btRemover.setBackground(new java.awt.Color(0, 0, 102));
        btRemover.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btRemover.setForeground(new java.awt.Color(255, 255, 255));
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/removeIcon.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btPagar.setBackground(new java.awt.Color(0, 0, 102));
        btPagar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btPagar.setForeground(new java.awt.Color(255, 255, 255));
        btPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagamentoIcon.png"))); // NOI18N
        btPagar.setText("Pagar");
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPago);
        rbPago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbPago.setText("PAGO");
        rbPago.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbPagoStateChanged(evt);
            }
        });
        rbPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbPagoMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbAReceber);
        rbAReceber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbAReceber.setText("A RECEBER");
        rbAReceber.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbAReceberStateChanged(evt);
            }
        });
        rbAReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbAReceberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(545, Short.MAX_VALUE)
                .addComponent(btPagar)
                .addGap(74, 74, 74)
                .addComponent(btRemover)
                .addGap(473, 473, 473))
            .addGroup(layout.createSequentialGroup()
                .addGap(524, 524, 524)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbAReceber)
                        .addGap(18, 18, 18)
                        .addComponent(rbPago)
                        .addGap(195, 195, 195))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btPagar, btRemover});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPago)
                            .addComponent(rbAReceber))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFiltroItemStateChanged

    }//GEN-LAST:event_cbFiltroItemStateChanged

    private void cbFiltroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbFiltroPropertyChange

    }//GEN-LAST:event_cbFiltroPropertyChange

    private void txtPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisaFocusGained
        txtPesquisa.setText("");
    }//GEN-LAST:event_txtPesquisaFocusGained

    private void btPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarMouseClicked
        if(txtPesquisa.getText().equals("") || txtPesquisa.getText().equals("Pesquisar...") || cbFiltro.getSelectedIndex()==0){
            consultar();
        }else{
            ClienteAReceberDao card = new ClienteAReceberDao();
            ArrayList<ClienteAReceber> valores = new ArrayList();
            ArrayList<Cliente> clientes = new ArrayList();

            String situacao;
            if(rbAReceber.isSelected()){
                situacao = "A RECEBER";
            }else{
                situacao = "PAGO";
            }
            
            valores = card.consultarFiltro(cbFiltro.getSelectedIndex(), txtPesquisa.getText(), situacao);

            DefaultTableModel model = (DefaultTableModel) tabelaValores.getModel(); 
            model.setNumRows(0);

            DecimalFormat df = new DecimalFormat("#,###0.00");
            
            for(ClienteAReceber car: valores){
                ClienteDao cd = new ClienteDao();
                clientes = cd.consultarId(car.getIdcliente());

                String valor = "R$ "+df.format(car.getValor());
                String valorPago = "R$ "+df.format(car.getValorPago());
                
                model.addRow(new Object[]{car.getId(), formataData(car.getData()), clientes.get(0).getId(), clientes.get(0).getNome(), car.getTipo(), formataData(car.getVencimento()), valor, formataData(car.getDataPagamento()), valorPago, car.getSituacao()});
            }
        }
    }//GEN-LAST:event_btPesquisarMouseClicked

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linha = tabelaValores.getSelectedRow();
        
        if(linha!=-1){
            int op = JOptionPane.showConfirmDialog(null, "Deseja remover o valor de ID "+tabelaValores.getValueAt(linha, 0).toString()+"?", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op==0){
                ClienteAReceberDao card = new ClienteAReceberDao();
                ClienteAReceber car = new ClienteAReceber();
                car.setId(Integer.parseInt(tabelaValores.getValueAt(linha, 0).toString()));
                card.excluir(car);
                consultar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione a linha que deseja remover.");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        if(evt.getKeyCode()==10){
            btPesquisarMouseClicked(null);
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.consultar();
    }//GEN-LAST:event_formWindowActivated

    private void rbAReceberStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbAReceberStateChanged
        
    }//GEN-LAST:event_rbAReceberStateChanged

    private void rbPagoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbPagoStateChanged
        
    }//GEN-LAST:event_rbPagoStateChanged

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        if(tabelaValores.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Selecione pelo menos uma linha!");
        }else{
            int linhas[] = tabelaValores.getSelectedRows();
        
            double valorTotal=0;

            int flag=0;
            for(int i=0; i<tabelaValores.getSelectedRowCount(); i++){
                if(!tabelaValores.getValueAt(i, 9).toString().equals("PAGO")){                  
                    valorTotal+=calcularJuros(tabelaValores.getValueAt(i, 5).toString(), Double.parseDouble(tabelaValores.getValueAt(i, 6).toString().substring(3, tabelaValores.getValueAt(i, 6).toString().length()-1).replace(",", ".")));
                    flag=1;
                }
            }

            if(flag==0){
                JOptionPane.showMessageDialog(null, "Selecione pelo menos uma linha com situação \"A RECEBER\"!");
            }else{
                DecimalFormat df = new DecimalFormat("#,###0.00");
                String valorFinal = "R$ "+df.format(valorTotal);

                int op = JOptionPane.showConfirmDialog(null, "Valor total: "+valorFinal+"\nDeseja realizar o pagamento? ", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(op==0){
                    for(int i=0; i<tabelaValores.getSelectedRowCount(); i++){
                        if(!tabelaValores.getValueAt(i, 8).toString().equals("PAGO")){
                            ClienteAReceber car = new ClienteAReceber();
                            car.setId(Integer.parseInt(tabelaValores.getValueAt(i, 0).toString()));
                            car.setData(converteData(tabelaValores.getValueAt(i, 1).toString()));
                            car.setIdcliente(Integer.parseInt(tabelaValores.getValueAt(i, 2).toString()));
                            car.setTipo(tabelaValores.getValueAt(i, 4).toString());
                            car.setVencimento(converteData(tabelaValores.getValueAt(i, 5).toString()));
                            car.setValor(Double.parseDouble(tabelaValores.getValueAt(i, 6).toString().substring(3, tabelaValores.getValueAt(i, 6).toString().length()-1).replace(",", ".")));
                            car.setDataPagamento(converteData(getData()));
                            car.setValorPago(calcularJuros(tabelaValores.getValueAt(i, 5).toString(), Double.parseDouble(tabelaValores.getValueAt(i, 6).toString().substring(3, tabelaValores.getValueAt(i, 6).toString().length()-1).replace(",", "."))));
                            car.setSituacao("PAGO");
                            
                            ClienteAReceberDao card = new ClienteAReceberDao();
                            card.alterar(car, 1);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btPagarActionPerformed

    private void rbAReceberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAReceberMouseClicked
        btPesquisarMouseClicked(evt);
    }//GEN-LAST:event_rbAReceberMouseClicked

    private void rbPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPagoMouseClicked
        btPesquisarMouseClicked(evt);
    }//GEN-LAST:event_rbPagoMouseClicked

    void consultar(){
        ClienteAReceberDao card = new ClienteAReceberDao();
        ArrayList<ClienteAReceber> valores = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        
        String situacao;
        if(rbAReceber.isSelected()){
            situacao = "A RECEBER";
        }else{
            situacao = "PAGO";
        }
        
        valores = card.consultar(situacao);
        
        DefaultTableModel model = (DefaultTableModel) tabelaValores.getModel(); 
        model.setNumRows(0);
        
        DecimalFormat df = new DecimalFormat("#,###0.00");
            
        for(ClienteAReceber car: valores){
            ClienteDao cd = new ClienteDao();
            clientes = cd.consultarId(car.getIdcliente());

            String valor = "R$ "+df.format(car.getValor());
            String valorPago = "R$ "+df.format(car.getValorPago());
                
            model.addRow(new Object[]{car.getId(), formataData(car.getData()), clientes.get(0).getId(), clientes.get(0).getNome(), car.getTipo(), formataData(car.getVencimento()), valor, formataData(car.getDataPagamento()), valorPago, car.getSituacao()});
        }
    }
    
    void setarTabela(){
        tabelaValores.getParent().setBackground(Color.white);
        
        tabelaValores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for(int i=0; i<10; i++){
            if(i==0 || i==2){
                tabelaValores.getColumnModel().getColumn(i).setPreferredWidth(50);
            }else{
                tabelaValores.getColumnModel().getColumn(i).setPreferredWidth(200);
            }
            tabelaValores.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
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
    
    public double calcularJuros(String dataVencimento, double valor){
        String dataPagamento = getData();
        Calendar Vencimento = Calendar.getInstance();
        Calendar Pagamento = Calendar.getInstance();
        
        Vencimento.set(Integer.parseInt(dataVencimento.charAt(6)+""+dataVencimento.charAt(7)+
                ""+dataVencimento.charAt(8)+""+dataVencimento.charAt(9)), (Integer.parseInt(dataVencimento.charAt(3)
                +""+dataVencimento.charAt(4))-1), Integer.parseInt(dataVencimento.charAt(0)+""+dataVencimento.charAt(1)));
        
        Pagamento.set(Integer.parseInt(dataPagamento.charAt(6)+""+dataPagamento.charAt(7)+
                ""+dataPagamento.charAt(8)+""+dataPagamento.charAt(9)), (Integer.parseInt(dataPagamento.charAt(3)
                +""+dataPagamento.charAt(4))-1), Integer.parseInt(dataPagamento.charAt(0)+""+dataPagamento.charAt(1)));
        
        if(Vencimento.getTimeInMillis()>Pagamento.getTimeInMillis()){
            return valor;
        }else{
            long dia = 1000 * 60 * 60 * 24;
        
            long qtdDias = ((Pagamento.getTimeInMillis()-Vencimento.getTimeInMillis())/dia);
            
            valor = (Math.pow(1.0025, qtdDias)*valor)+0.01*valor;
            
            return valor;
        }
    }
    
    String formataData(String data){
        data+="";
        if(data.equals("null")){
            return "";
        }else{
            return data.charAt(8)+""+data.charAt(9)+"/"+data.charAt(5)+""+data.charAt(6)+"/"+data.charAt(0)+""+data.charAt(1)+""+data.charAt(2)+""+data.charAt(3);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPagar;
    private javax.swing.JLabel btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbFiltro;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAReceber;
    private javax.swing.JRadioButton rbPago;
    private javax.swing.JTable tabelaValores;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
