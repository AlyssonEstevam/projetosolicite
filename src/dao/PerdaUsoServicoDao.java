package dao;

import bean.PerdaUsoServico;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PerdaUsoServicoDao {
    public void inserir(PerdaUsoServico pus){
        
        String sql = "INSERT INTO perdausoservico (data, responsavel, servico, quantidade, tipo) VALUES (?,?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, pus.getData());
            stmt.setString(2, pus.getResponsavel());
            stmt.setString(3, pus.getServico());
            stmt.setInt(4, pus.getQuantidade());
            stmt.setString(5, pus.getTipo());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lançamento de "+pus.getTipo()+" concluído!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao lançar "+pus.getTipo()+": "+ex);
        } 
    }
}
