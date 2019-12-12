package gui;

import bean.EntradasEstoque;
import bean.Produto;
import dao.EntradasEstoqueDao;
import dao.ProdutoDao;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaRealizarEntradasEstoque extends javax.swing.JFrame {
    Produto produto;
    int flagQuantidade;
    
    public TelaRealizarEntradasEstoque() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        txtData.setText(getData());
        txtNome.setEditable(false);
        this.setResizable(false);
        txtData.setCaretColor(Color.white);
        flagQuantidade=0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JSpinner();
        lbCustoUnitario = new javax.swing.JLabel();
        lbCifrao = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCustoTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar Venda");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Realizar Entrada no Estoque");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Data:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Custo Unitário");

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

        lbCustoUnitario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCustoUnitario.setText("0.00");

        lbCifrao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCifrao.setText("R$");

        txtCodigo.setBackground(new java.awt.Color(0, 0, 102));
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
        });
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(0, 0, 102));
        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Código:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Custo Total:");

        txtCustoTotal.setBackground(new java.awt.Color(0, 0, 102));
        txtCustoTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCustoTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtCustoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCustoTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustoTotalFocusLost(evt);
            }
        });
        txtCustoTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustoTotalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustoTotalKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCifrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCustoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustoTotal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btConfirmar)
                .addGap(53, 53, 53))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btConfirmar, btLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCifrao)
                    .addComponent(lbCustoUnitario)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btConfirmar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQuantidadeStateChanged
        if((txtNome.getText().equals("") || txtNome.getText().equals("ERRO NA CONSULTA")) && flagQuantidade==0){
            flagQuantidade=1;
            txtQuantidade.setValue(1);
            JOptionPane.showMessageDialog(null, "Informe o produto acima!");
        }else if((txtNome.getText().equals("") || txtNome.getText().equals("ERRO NA CONSULTA")) && flagQuantidade==1){
            flagQuantidade=0;
        }else if(txtCustoTotal.getText().equals("")){
            
        }else{
            double valor = Double.parseDouble(txtCustoTotal.getText().replace(",", "."))/Double.parseDouble(txtQuantidade.getValue().toString());
            DecimalFormat df = new DecimalFormat("#,###0.00");
            lbCustoUnitario.setText(df.format(valor));
        }
    }//GEN-LAST:event_txtQuantidadeStateChanged

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtData.setText(getData());
        txtQuantidade.setValue(1);
        lbCustoUnitario.setText("0,00");
        txtNome.setText("");
        txtCodigo.setText("");
        txtCustoTotal.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        if(!validaData(txtData.getText())){
            JOptionPane.showMessageDialog(null, "Informe uma data válida!");
        }else if(txtNome.getText().equals("") || txtNome.getText().equals("ERRO NA CONSULTA")){
            JOptionPane.showMessageDialog(null, "Informe um produto!");
        }else if(txtCustoTotal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o custo total!");
        }else{
            EntradasEstoque ee = new EntradasEstoque();
            ee.setCodigoProduto(txtCodigo.getText());
            ee.setQuantidade(Integer.parseInt(txtQuantidade.getValue().toString()));
            ee.setData(converteData(txtData.getText()));
            ee.setCustoTotal(Double.parseDouble(txtCustoTotal.getText()));

            EntradasEstoqueDao eed = new EntradasEstoqueDao();

            eed.inserir(ee);
            produto.setCustoUnitario(Double.parseDouble(lbCustoUnitario.getText().replace(",", ".")));
            produto.colocaNoEstoque(ee.getQuantidade());
            ProdutoDao pd = new ProdutoDao();
            pd.alterarEstoque(produto);
            pd.alterarCustoUnitario(produto, 1);
            btLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if(evt.getKeyCode()==10){
            ProdutoDao pd = new ProdutoDao();
            ArrayList<Produto> produtos = new ArrayList<>();
            produtos = pd.consultarFiltro(5, txtCodigo.getText());
            if(produtos.isEmpty()){
                txtCodigo.setText("");
                txtNome.setText("ERRO NA CONSULTA");
            }else{
                produto = produtos.get(0);
                txtNome.setText(produto.getNome()+" ("+produto.getMarca()+")");
                txtNome.setCaretPosition(0);
            }
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed

    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
        txtCodigo.setText("");
    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked
        txtCodigo.setText("");
    }//GEN-LAST:event_txtCodigoMouseClicked

    private void txtCustoTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustoTotalKeyPressed
        if(evt.getKeyCode()==10){
            if((txtNome.getText().equals("") || txtNome.getText().equals("ERRO NA CONSULTA")) && flagQuantidade==0){
                flagQuantidade=1;
                txtQuantidade.setValue(1);
                JOptionPane.showMessageDialog(null, "Informe o produto acima!");
            }else if((txtNome.getText().equals("") || txtNome.getText().equals("ERRO NA CONSULTA")) && flagQuantidade==1){
                flagQuantidade=0;
            }else if(txtCustoTotal.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Informe o custo total!");
            }else{
                double valor = Double.parseDouble(txtCustoTotal.getText().replace(",", "."))/Double.parseDouble(txtQuantidade.getValue().toString());
                DecimalFormat df = new DecimalFormat("#,###0.00");
                lbCustoUnitario.setText(df.format(valor));
            }
        }
    }//GEN-LAST:event_txtCustoTotalKeyPressed

    private void txtCustoTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustoTotalKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isDigit(c) && !String.valueOf(c).equals(",") && !String.valueOf(c).equals(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCustoTotalKeyTyped

    private void txtCustoTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustoTotalFocusLost
        if((txtNome.getText().equals("") || txtNome.getText().equals("ERRO NA CONSULTA")) && flagQuantidade==0){
            flagQuantidade=1;
            txtQuantidade.setValue(1);
            JOptionPane.showMessageDialog(null, "Informe o produto acima!");
        }else if((txtNome.getText().equals("") || txtNome.getText().equals("ERRO NA CONSULTA")) && flagQuantidade==1){
            flagQuantidade=0;
        }else if(txtCustoTotal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o custo total!");
        }else{
            double valor = Double.parseDouble(txtCustoTotal.getText().replace(",", "."))/Double.parseDouble(txtQuantidade.getValue().toString());
            DecimalFormat df = new DecimalFormat("#,###0.00");
            lbCustoUnitario.setText(df.format(valor));
        }
    }//GEN-LAST:event_txtCustoTotalFocusLost

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbCifrao;
    private javax.swing.JLabel lbCustoUnitario;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCustoTotal;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JSpinner txtQuantidade;
    // End of variables declaration//GEN-END:variables
}