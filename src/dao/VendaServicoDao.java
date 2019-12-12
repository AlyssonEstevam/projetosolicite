package dao;

import bean.Usuario;
import bean.VendaServico;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VendaServicoDao {
    public void inserir(VendaServico vs){
        
        String sql = "insert into vendaservicos(data, responsavel, tipo, quantidade, valor) values (?,?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, vs.getData());
            stmt.setString(2, vs.getResponsavel());
            stmt.setString(3, vs.getTipo());
            stmt.setInt(4, vs.getQuantidade());
            stmt.setDouble(5, vs.getValor());
            
            stmt.executeUpdate();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao realizar venda. "+ex);
        } 
    }
    
    public ArrayList<VendaServico> consultar(){
        
        String sql = "SELECT * FROM vendaservicos ORDER BY id";
        
        PreparedStatement stmt;
        
        ArrayList<VendaServico> vendas = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaServico vs = new VendaServico();
                vs.setId(rs.getInt("id"));
                vs.setData(rs.getString("data"));
                vs.setResponsavel(rs.getString("responsavel"));
                vs.setTipo(rs.getString("tipo"));
                vs.setQuantidade(rs.getInt("quantidade"));
                vs.setValor(rs.getDouble("valor"));
                vendas.add(vs);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar vendas: "+ex);   
        }
        
        return vendas;  
    
    }
    
    public ArrayList<VendaServico> consultarFiltro(int tipo, String filtro){
        
        String sql="";
        
        PreparedStatement stmt;
        
        ArrayList<VendaServico> vendas = new ArrayList();
        
        try{
            switch(tipo){
                case 1:
                    sql = "SELECT * FROM vendaservicos WHERE data LIKE ? ORDER BY data, id";
                    break;
                case 2:
                    sql = "SELECT * FROM vendaservicos WHERE responsavel LIKE ? ORDER BY responsavel, id";
                    break;
                case 3:
                    sql = "SELECT * FROM vendaservicos WHERE tipo LIKE ? ORDER BY tipo, id";
                    break;
            }
            
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, "%"+filtro+"%");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaServico vs = new VendaServico();
                vs.setId(rs.getInt("id"));
                vs.setData(rs.getString("data"));
                vs.setResponsavel(rs.getString("responsavel"));
                vs.setTipo(rs.getString("tipo"));
                vs.setQuantidade(rs.getInt("quantidade"));
                vs.setValor(rs.getDouble("valor"));
                vendas.add(vs);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar vendas.");   
        }
        
        return vendas;  
    
    }
    
    public void alterar(VendaServico vs, int flag){
        
        String sql = "UPDATE vendaservicos SET data = ?, responsavel = ?, tipo = ?, quantidade = ?, valor = ? WHERE vendaservicos.id = ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, vs.getData());
            stmt.setString(2, vs.getResponsavel());
            stmt.setString(3, vs.getTipo());
            stmt.setInt(4, vs.getQuantidade());
            stmt.setDouble(5, vs.getValor());
            stmt.setInt(6, vs.getId());
            stmt.executeUpdate();
            if(flag==1){
              JOptionPane.showMessageDialog(null, "Venda alterada com sucesso!");
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar venda: "+ex);   
        }
        
    }
    
    
    public void excluir(VendaServico vs){
        
        String sql = "DELETE FROM vendaservicos WHERE id = ?";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setInt(1, vs.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venda removida com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao remover venda.");
        }
        
    }
}
