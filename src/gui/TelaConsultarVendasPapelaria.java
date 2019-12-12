/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bean.Cliente;
import bean.Produto;
import bean.VendaPapelaria;
import bean.VendaServico;
import dao.ClienteDao;
import dao.ProdutoDao;
import dao.VendaPapelariaDao;
import dao.VendaServicoDao;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Alysson
 */
public class TelaConsultarVendasPapelaria extends javax.swing.JFrame {

    String responsavel;
    
    public TelaConsultarVendasPapelaria(String responsavel) {
        initComponents();
        txtPesquisa.setCaretColor(Color.white);
        this.getContentPane().setBackground(Color.white);
        this.setExtendedState(MAXIMIZED_BOTH);
        setarTabela();
        this.consultar();
        
        JTableHeader cabecalho = tabelaVendas.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.BOLD, 18));
        this.responsavel=responsavel;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        txtPesquisa = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        btPesquisar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btRemover = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Vendas");
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
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FILTRO", "Data", "Responsável", "Produto" }));
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

        tabelaVendas.setBackground(new java.awt.Color(0, 0, 102));
        tabelaVendas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabelaVendas.setForeground(new java.awt.Color(255, 255, 255));
        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Responsável", "Código Produto", "Produto", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVendas);
        if (tabelaVendas.getColumnModel().getColumnCount() > 0) {
            tabelaVendas.getColumnModel().getColumn(0).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(1).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(2).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(3).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(4).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(5).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(6).setResizable(false);
        }

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIcon.png"))); // NOI18N
        btPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Consultar Vendas");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(524, 524, 524)
                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)))
                .addGap(0, 437, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(613, 613, 613)
                .addComponent(btRemover)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
            VendaPapelariaDao vpd = new VendaPapelariaDao();
            ArrayList<VendaPapelaria> vendas = new ArrayList();

            vendas = vpd.consultarFiltro(cbFiltro.getSelectedIndex(), txtPesquisa.getText());

            DefaultTableModel model = (DefaultTableModel) tabelaVendas.getModel(); 
            model.setNumRows(0);

            DecimalFormat df = new DecimalFormat("#,###0.00");

            for(VendaPapelaria vp: vendas){
                ArrayList<Produto> produtos = new ArrayList();
                Produto p;
                ProdutoDao pd = new ProdutoDao();

                produtos = pd.consultarFiltro(5, vp.getCodigoProduto());

                p = produtos.get(0);

                String data = formataData(vp.getData());
                String valor = "R$ "+df.format(vp.getValor());

                model.addRow(new Object[]{vp.getId(), data, vp.getResponsavel(), p.getCodigo(), p.getNome(), vp.getQuantidade(), valor});
            }
        }
    }//GEN-LAST:event_btPesquisarMouseClicked

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linha = tabelaVendas.getSelectedRow();
        
        if(linha!=-1){
            int op = JOptionPane.showConfirmDialog(null, "Deseja remover a venda "+tabelaVendas.getValueAt(linha, 0).toString()+"?", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op==0){
                VendaPapelariaDao vpd = new VendaPapelariaDao();
                VendaPapelaria vp = new VendaPapelaria();
                vp.setId(Integer.parseInt(tabelaVendas.getValueAt(linha, 0).toString()));
                
                Produto p = new Produto();
                p.setCodigo(tabelaVendas.getValueAt(linha, 3).toString());
                p.colocaNoEstoque(Integer.parseInt(tabelaVendas.getValueAt(linha, 5).toString()));
                ProdutoDao pd = new ProdutoDao();
                pd.alterarEstoque(p);
                
                vpd.excluir(vp);
                consultar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione a venda que deseja remover.");
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

    void consultar(){
        VendaPapelariaDao vpd = new VendaPapelariaDao();
        ArrayList<VendaPapelaria> vendas = new ArrayList();
        
        vendas = vpd.consultar();
        
        DefaultTableModel model = (DefaultTableModel) tabelaVendas.getModel(); 
        model.setNumRows(0);
        
        DecimalFormat df = new DecimalFormat("#,###0.00");
        
        for(VendaPapelaria vp: vendas){
            ArrayList<Produto> produtos = new ArrayList();
            Produto p;
            ProdutoDao pd = new ProdutoDao();
            
            produtos = pd.consultarFiltro(5, vp.getCodigoProduto());
            
            p = produtos.get(0);
            
            String data = formataData(vp.getData());
            String valor = "R$ "+df.format(vp.getValor());
            
            model.addRow(new Object[]{vp.getId(), data, vp.getResponsavel(), p.getCodigo(), p.getNome(), vp.getQuantidade(), valor});
        }
    }
    
    String formataData(String data){
        return data.charAt(8)+""+data.charAt(9)+"/"+data.charAt(5)+""+data.charAt(6)+"/"+data.charAt(0)+""+data.charAt(1)+""+data.charAt(2)+""+data.charAt(3);
    }
    
    void setarTabela(){
        tabelaVendas.getParent().setBackground(Color.white);
        
        tabelaVendas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for(int i=0; i<7; i++){
            if(i==0){
                tabelaVendas.getColumnModel().getColumn(i).setPreferredWidth(50);
            }else{
                tabelaVendas.getColumnModel().getColumn(i).setPreferredWidth(215);
            }
            tabelaVendas.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox cbFiltro;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVendas;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
