/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bean.EntradasEstoque;
import bean.Produto;
import dao.EntradasEstoqueDao;
import dao.ProdutoDao;
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

public class TelaConsultarEntradasEstoque extends javax.swing.JFrame {

    public TelaConsultarEntradasEstoque() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        setarTabela();
        txtPesquisa.setCaretColor(Color.white);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.consultar();
        
        JTableHeader cabecalho = tabelaEntradas.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.BOLD, 18));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        txtPesquisa = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEntradas = new javax.swing.JTable();
        btPesquisar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btRemover = new javax.swing.JButton();
        btEntrada = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Produtos");
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
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FILTRO", "Código Produto", "Data" }));
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

        tabelaEntradas.setBackground(new java.awt.Color(0, 0, 102));
        tabelaEntradas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabelaEntradas.setForeground(new java.awt.Color(255, 255, 255));
        tabelaEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código Produto", "Nome Produto", "Quantidade", "Data", "Custo Unitário", "Custo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEntradas);
        if (tabelaEntradas.getColumnModel().getColumnCount() > 0) {
            tabelaEntradas.getColumnModel().getColumn(0).setResizable(false);
            tabelaEntradas.getColumnModel().getColumn(1).setResizable(false);
            tabelaEntradas.getColumnModel().getColumn(2).setResizable(false);
            tabelaEntradas.getColumnModel().getColumn(3).setResizable(false);
            tabelaEntradas.getColumnModel().getColumn(4).setResizable(false);
            tabelaEntradas.getColumnModel().getColumn(5).setResizable(false);
            tabelaEntradas.getColumnModel().getColumn(6).setResizable(false);
        }

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIcon.png"))); // NOI18N
        btPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Consultar Entradas Estoque");

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

        btEntrada.setBackground(new java.awt.Color(0, 0, 102));
        btEntrada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/entradaIcon.png"))); // NOI18N
        btEntrada.setText("Realizar Entrada");
        btEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntradaActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesquisar)
                .addGap(0, 443, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEntrada)
                .addGap(74, 74, 74)
                .addComponent(btRemover)
                .addGap(402, 402, 402))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btEntrada, btRemover});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            EntradasEstoqueDao eed = new EntradasEstoqueDao();
            ProdutoDao pd = new ProdutoDao();
            ArrayList<EntradasEstoque> entradas = new ArrayList();

            entradas = eed.consultarFiltro(cbFiltro.getSelectedIndex(), txtPesquisa.getText());

            DefaultTableModel model = (DefaultTableModel) tabelaEntradas.getModel(); 
            model.setNumRows(0);

            DecimalFormat df = new DecimalFormat("#,###0.00");

            for(EntradasEstoque ee: entradas){
                String custoTotal = "R$ "+df.format(ee.getCustoTotal());
                String custoUnitario = "R$ "+df.format(ee.getCustoTotal()/ee.getQuantidade());
                String produto = pd.consultarFiltro(5, ee.getCodigoProduto()).get(0).getNome();
                String data = formataData(ee.getData());
                model.addRow(new Object[]{ee.getId(), ee.getCodigoProduto(), produto, ee.getQuantidade(), data, custoUnitario, custoTotal});
            }
        }
    }//GEN-LAST:event_btPesquisarMouseClicked

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linha = tabelaEntradas.getSelectedRow();
        
        if(linha!=-1){
            int op = JOptionPane.showConfirmDialog(null, "Deseja remover a entrada de ID "+tabelaEntradas.getValueAt(linha, 0).toString()+"?", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op==0){
                EntradasEstoqueDao eed = new EntradasEstoqueDao();
                Produto p = new Produto();
                ProdutoDao pd = new ProdutoDao();
                EntradasEstoque ee = new EntradasEstoque();
                p = pd.consultarFiltro(5, tabelaEntradas.getValueAt(linha, 1).toString()).get(0);
                p.retiraDoEstoque(Integer.parseInt(tabelaEntradas.getValueAt(linha, 3).toString()));
                pd.alterarEstoque(p);
                ee.setId(Integer.parseInt(tabelaEntradas.getValueAt(linha, 0).toString()));
                
                eed.excluir(ee);
                consultar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione aa entrada que deseja remover.");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntradaActionPerformed
        TelaRealizarEntradasEstoque tree = new TelaRealizarEntradasEstoque();
        tree.setLocationRelativeTo(null);
        tree.setVisible(true);
    }//GEN-LAST:event_btEntradaActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        if(evt.getKeyCode()==10){
            btPesquisarMouseClicked(null);
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.consultar();
    }//GEN-LAST:event_formWindowActivated

    void consultar(){
        EntradasEstoqueDao eed = new EntradasEstoqueDao();
        ProdutoDao pd = new ProdutoDao();
        ArrayList<EntradasEstoque> entradas = new ArrayList();
        
        entradas = eed.consultar();
        
        DefaultTableModel model = (DefaultTableModel) tabelaEntradas.getModel(); 
        model.setNumRows(0);
        
        DecimalFormat df = new DecimalFormat("#,###0.00");
        
        for(EntradasEstoque ee: entradas){
            String custoTotal = "R$ "+df.format(ee.getCustoTotal());
            String custoUnitario = "R$ "+df.format(ee.getCustoTotal()/ee.getQuantidade());
            String produto = pd.consultarFiltro(5, ee.getCodigoProduto()).get(0).getNome();
            String data = formataData(ee.getData());
            model.addRow(new Object[]{ee.getId(), ee.getCodigoProduto(), produto, ee.getQuantidade(), data, custoUnitario, custoTotal});
        }
    }
    
    void setarTabela(){
        tabelaEntradas.getParent().setBackground(Color.white);
        
        tabelaEntradas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for(int i=0; i<7; i++){
            tabelaEntradas.getColumnModel().getColumn(i).setPreferredWidth(200);
            tabelaEntradas.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }

    String formataData(String data){
        return data.charAt(8)+""+data.charAt(9)+"/"+data.charAt(5)+""+data.charAt(6)+"/"+data.charAt(0)+""+data.charAt(1)+""+data.charAt(2)+""+data.charAt(3);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrada;
    private javax.swing.JLabel btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox cbFiltro;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEntradas;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
