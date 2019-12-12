package dao;

import bean.PerdaUsoPapelaria;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PerdaUsoPapelariaDao {
    public void inserir(PerdaUsoPapelaria pup){
        
        String sql = "INSERT INTO perdausopapelaria (data, responsavel, codigoproduto, quantidade, tipo) VALUES (?,?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, pup.getData());
            stmt.setString(2, pup.getResponsavel());
            stmt.setString(3, pup.getCodigoProduto());
            stmt.setInt(4, pup.getQuantidade());
            stmt.setString(5, pup.getTipo());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lançamento de "+pup.getTipo()+" concluído!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao lançar "+pup.getTipo()+": "+ex);
        } 
    }
}
