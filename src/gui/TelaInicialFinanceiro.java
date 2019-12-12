/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bean.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 *
 * @author Alysson
 */


public class TelaInicialFinanceiro extends javax.swing.JFrame {
    Usuario usuario;
    /**
     * Creates new form TelaInicialAdministrador
     */
    public TelaInicialFinanceiro(Usuario u) {
        initComponents();
        this.usuario=u;
        this.getContentPane().setBackground(Color.white);
        this.setExtendedState(MAXIMIZED_BOTH);
        customizeMenuBar(mbMenuPrincipal);
        lbUsuarioLogado.setText(lbUsuarioLogado.getText()+u.getUsuario()+", Desde às "+getHora());
    }
    
    private void customizeMenuBar(JMenuBar menuBar) {

    menuBar.setUI(new BasicMenuBarUI() {

        @Override
        public void paint(Graphics g, JComponent c) {
            g.setColor(new java.awt.Color(0,0,102));
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
        }

    });

    MenuElement[] menus = menuBar.getSubElements();

    for (MenuElement menuElement : menus) {

        JMenu menu = (JMenu) menuElement.getComponent();
        changeComponentColors(menu);
        menu.setOpaque(true);

        MenuElement[] menuElements = menu.getSubElements();

        for (MenuElement popupMenuElement : menuElements) {

            JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
            popupMenu.setBorder(null);

            MenuElement[] menuItens = popupMenuElement.getSubElements();

            for (MenuElement menuItemElement : menuItens) {

                JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
                changeComponentColors(menuItem);
                menuItem.setOpaque(true);

            }
        }
    }
}

private void changeComponentColors(Component comp) {
    comp.setBackground(new java.awt.Color(0,0,102));
    comp.setForeground(Color.white);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbUsuarioLogado = new javax.swing.JLabel();
        mbMenuPrincipal = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        miPagamento = new javax.swing.JMenuItem();
        miRealizarPagamento = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miConsultarCliente = new javax.swing.JMenuItem();
        miClientesReceber = new javax.swing.JMenuItem();
        miConsultarUsuario = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        miPerdaPapelaria1 = new javax.swing.JMenuItem();
        miVendaServiço = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        miRelatorioSaidas2 = new javax.swing.JMenuItem();
        miRelatorioVendas2 = new javax.swing.JMenuItem();
        miRelatorioVendas3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Solicite");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 20));

        lbUsuarioLogado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbUsuarioLogado.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuarioLogado.setText("Logado como ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUsuarioLogado)
                .addContainerGap(1232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mbMenuPrincipal.setBackground(new java.awt.Color(0, 0, 102));
        mbMenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mbMenuPrincipal.setForeground(new java.awt.Color(204, 0, 0));
        mbMenuPrincipal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jMenu3.setText("Financeiro");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 20));

        miPagamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miPagamento.setText("Consultar Pagamentos");
        miPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPagamentoActionPerformed(evt);
            }
        });
        jMenu3.add(miPagamento);

        miRealizarPagamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miRealizarPagamento.setText("Realizar Pagamento");
        miRealizarPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miRealizarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRealizarPagamentoActionPerformed(evt);
            }
        });
        jMenu3.add(miRealizarPagamento);

        mbMenuPrincipal.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jMenu4.setText("Consultas");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 20));

        miConsultarCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miConsultarCliente.setText("Consultar Cliente");
        miConsultarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(miConsultarCliente);

        miClientesReceber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miClientesReceber.setText("Consultar Clientes a Receber");
        miClientesReceber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miClientesReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesReceberActionPerformed(evt);
            }
        });
        jMenu4.add(miClientesReceber);

        miConsultarUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miConsultarUsuario.setText("Consultar Usuário");
        miConsultarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(miConsultarUsuario);

        jMenu9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jMenu9.setText("Consultar Vendas/Serviço");
        jMenu9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        miPerdaPapelaria1.setBackground(new java.awt.Color(0, 0, 102));
        miPerdaPapelaria1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miPerdaPapelaria1.setForeground(new java.awt.Color(255, 255, 255));
        miPerdaPapelaria1.setText("Papelaria");
        miPerdaPapelaria1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miPerdaPapelaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerdaPapelaria1ActionPerformed(evt);
            }
        });
        jMenu9.add(miPerdaPapelaria1);

        miVendaServiço.setBackground(new java.awt.Color(0, 0, 102));
        miVendaServiço.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miVendaServiço.setForeground(new java.awt.Color(255, 255, 255));
        miVendaServiço.setText("Serviço");
        miVendaServiço.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miVendaServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaServiçoActionPerformed(evt);
            }
        });
        jMenu9.add(miVendaServiço);

        jMenu4.add(jMenu9);

        mbMenuPrincipal.add(jMenu4);

        jMenu11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jMenu11.setText("Relatórios");
        jMenu11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMenu11.setPreferredSize(new java.awt.Dimension(150, 20));

        miRelatorioSaidas2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miRelatorioSaidas2.setText("Relatório de Apuração das Saídas");
        miRelatorioSaidas2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miRelatorioSaidas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioSaidas2ActionPerformed(evt);
            }
        });
        jMenu11.add(miRelatorioSaidas2);

        miRelatorioVendas2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miRelatorioVendas2.setText("Relatório Diário");
        miRelatorioVendas2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miRelatorioVendas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioVendas2ActionPerformed(evt);
            }
        });
        jMenu11.add(miRelatorioVendas2);

        miRelatorioVendas3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        miRelatorioVendas3.setText("Relatório de Vendas");
        miRelatorioVendas3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        miRelatorioVendas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioVendas3ActionPerformed(evt);
            }
        });
        jMenu11.add(miRelatorioVendas3);

        mbMenuPrincipal.add(jMenu11);

        setJMenuBar(mbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 486, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPagamentoActionPerformed
        TelaConsultarPagamentos tcp = new TelaConsultarPagamentos(usuario.getUsuario());
        tcp.setLocationRelativeTo(null);
        tcp.setVisible(true);
    }//GEN-LAST:event_miPagamentoActionPerformed

    private void miClientesReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesReceberActionPerformed
        TelaConsultarClientesAReceber tccar = new TelaConsultarClientesAReceber();
        tccar.setLocationRelativeTo(null);
        tccar.setVisible(true);
    }//GEN-LAST:event_miClientesReceberActionPerformed

    private void miConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarUsuarioActionPerformed
        TelaConsultarUsuarios tcu = new TelaConsultarUsuarios();
        tcu.setLocationRelativeTo(null);
        tcu.setVisible(true);
    }//GEN-LAST:event_miConsultarUsuarioActionPerformed

    private void miConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarClienteActionPerformed
        TelaConsultarCliente tcc = new TelaConsultarCliente();
        tcc.setLocationRelativeTo(null);
        tcc.setVisible(true);
    }//GEN-LAST:event_miConsultarClienteActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed
        
    private void miVendaServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaServiçoActionPerformed
        TelaConsultarVendasServicos tcvs = new TelaConsultarVendasServicos(usuario.getUsuario());
        tcvs.setLocationRelativeTo(null);
        tcvs.setVisible(true);
    }//GEN-LAST:event_miVendaServiçoActionPerformed

    private void miPerdaPapelaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerdaPapelaria1ActionPerformed
        TelaConsultarVendasPapelaria tcvs = new TelaConsultarVendasPapelaria(usuario.getUsuario());
        tcvs.setLocationRelativeTo(null);
        tcvs.setVisible(true);
    }//GEN-LAST:event_miPerdaPapelaria1ActionPerformed

    private void miRealizarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRealizarPagamentoActionPerformed
        TelaRealizarPagamento trp = new TelaRealizarPagamento(usuario.getUsuario());
        trp.setLocationRelativeTo(null);
        trp.setVisible(true);
    }//GEN-LAST:event_miRealizarPagamentoActionPerformed

    private void miRelatorioVendas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioVendas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miRelatorioVendas2ActionPerformed

    private void miRelatorioSaidas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioSaidas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miRelatorioSaidas2ActionPerformed

    private void miRelatorioVendas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioVendas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miRelatorioVendas3ActionPerformed

    public static String getHora(){   
       String hora;     
    
       java.util.Date agora = new java.util.Date();
       SimpleDateFormat formata = new SimpleDateFormat("HH:mm");     
       hora = formata.format(agora);
       
       return hora;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbUsuarioLogado;
    private javax.swing.JMenuBar mbMenuPrincipal;
    private javax.swing.JMenuItem miClientesReceber;
    private javax.swing.JMenuItem miConsultarCliente;
    private javax.swing.JMenuItem miConsultarUsuario;
    private javax.swing.JMenuItem miPagamento;
    private javax.swing.JMenuItem miPerdaPapelaria1;
    private javax.swing.JMenuItem miRealizarPagamento;
    private javax.swing.JMenuItem miRelatorioSaidas2;
    private javax.swing.JMenuItem miRelatorioVendas2;
    private javax.swing.JMenuItem miRelatorioVendas3;
    private javax.swing.JMenuItem miVendaServiço;
    // End of variables declaration//GEN-END:variables
}
