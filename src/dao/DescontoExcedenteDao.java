package dao;

import bean.DescontoExcedente;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DescontoExcedenteDao {
    public void inserir(DescontoExcedente de){
        
        String sql = "insert into descontoexcedente(tipo, valor) values (?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setBoolean(1, de.isTipo());
            stmt.setDouble(2, de.getValor());
            stmt.executeUpdate();
        
            if(de.isTipo()){
                JOptionPane.showMessageDialog(null, "Desconto lançado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Excedente lançado com sucesso!");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao realizar lançamento.");
        } 
    }
}