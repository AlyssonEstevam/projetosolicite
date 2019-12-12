package projetosolicite;

import gui.TelaLogin;
import java.awt.Color;

public class ProjetoSolicite {

    public static void main(String[] args) {
        TelaLogin L = new TelaLogin();
        L.setLocationRelativeTo(null);
        L.getContentPane().setBackground(Color.white);
        L.setVisible(true);
    }
    
}
