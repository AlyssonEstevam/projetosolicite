package dao;

import bean.EntradasEstoque;
import bean.Produto;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EntradasEstoqueDao {
    public void inserir(EntradasEstoque ee){
        
        String sql = "insert into entradasestoque(codigoProduto, quantidade, data, custoTotal) values (?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, ee.getCodigoProduto());
            stmt.setInt(2, ee.getQuantidade());
            stmt.setString(3, ee.getData());
            stmt.setDouble(4, ee.getCustoTotal());
            stmt.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Entrada cadastrada com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir entrada.");
        } 
    }
    
    public ArrayList<EntradasEstoque> consultar(){
        
        String sql = "SELECT * FROM entradasestoque ORDER BY id";
        
        PreparedStatement stmt;
        
        ArrayList<EntradasEstoque> entradas = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                EntradasEstoque ee = new EntradasEstoque();
                ee.setId(rs.getInt("id"));
                ee.setCodigoProduto(rs.getString("codigoproduto"));
                ee.setQuantidade(rs.getInt("quantidade"));
                ee.setData(rs.getString("data"));
                ee.setCustoTotal(rs.getDouble("custototal"));
                
                entradas.add(ee);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar entradas: "+ex);   
        }
        
        return entradas;  
    
    }
    
    public ArrayList<EntradasEstoque> consultarFiltro(int tipo, String filtro){
        
        String sql;
        
        PreparedStatement stmt;
        
        ArrayList<EntradasEstoque> entradas = new ArrayList();
        
        try{
            switch(tipo){
                case 1:
                    sql = "SELECT * FROM entradasestoque WHERE codigoproduto LIKE ? ORDER BY codigoproduto, id";
                    break;
                case 2:
                    sql = "SELECT * FROM entradasestoque WHERE data LIKE ? ORDER BY data, id";
                    break;
                default:
                    sql="";
                    break;
            }
            
            stmt = BancoDados.getInstance().prepareStatement(sql);
            
            if(tipo==1){
                stmt.setString(1, filtro);
            }else{
                stmt.setString(1, "%"+filtro+"%");
            }
            
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                EntradasEstoque ee = new EntradasEstoque();
                ee.setId(rs.getInt("id"));
                ee.setCodigoProduto(rs.getString("codigoproduto"));
                ee.setQuantidade(rs.getInt("quantidade"));
                ee.setData(rs.getString("data"));
                ee.setCustoTotal(rs.getDouble("custototal"));
                
                entradas.add(ee);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar entradas: "+ex);   
        }
        
        return entradas;  
    
    }
    
    public void alterar(EntradasEstoque ee, int flag){
        
        String sql = "UPDATE entradasestoque SET codigoproduto = ?, quantidade = ?, data = ?, custoTotal = ? WHERE entradasestoque.id = ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            
            stmt.setString(1, ee.getCodigoProduto());
            stmt.setInt(2, ee.getQuantidade());
            stmt.setString(3, ee.getData());
            stmt.setInt(4, ee.getId());
            stmt.executeUpdate();
            if(flag==1){
              JOptionPane.showMessageDialog(null, "Entrada alterada com sucesso!");
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar entrada.");   
        }
        
    }
    
    public void excluir(EntradasEstoque ee){
        
        String sql = "DELETE FROM entradasestoque WHERE id = ?";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setInt(1, ee.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entrada removida com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao remover entrada: "+ex);
        }
        
    }
}
