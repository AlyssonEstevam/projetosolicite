package dao;

import bean.Produto;
import bean.VendaPapelaria;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VendaPapelariaDao {
    public void inserir(VendaPapelaria vp){
        
        String sql = "INSERT INTO vendapapelaria (data, responsavel, quantidade, valor, codigoproduto) VALUES (?,?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, vp.getData());
            stmt.setString(2, vp.getResponsavel());
            stmt.setInt(3, vp.getQuantidade());
            stmt.setDouble(4, vp.getValor());
            stmt.setString(5, vp.getCodigoProduto());
            
            stmt.executeUpdate();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao realizar venda. "+ex);
        } 
    }
    
    public ArrayList<VendaPapelaria> consultar(){
        
        String sql="select * from vendapapelaria ORDER BY id";
        
        PreparedStatement stmt;
        
        ArrayList<VendaPapelaria> vendas = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaPapelaria vp = new VendaPapelaria();
                vp.setId(rs.getInt("id"));
                vp.setData(rs.getString("data"));
                vp.setResponsavel(rs.getString("responsavel"));
                vp.setQuantidade(rs.getInt("quantidade"));
                vp.setValor(rs.getDouble("valor"));
                vp.setCodigoProduto(rs.getString("codigoproduto"));
                vendas.add(vp);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar vendas.");   
        }
        
        return vendas;   
    
    }
    
    public ArrayList<VendaPapelaria> consultarFiltro(int tipo, String filtro){
        
        String sql="";
        
        PreparedStatement stmt;
        
        ArrayList<VendaPapelaria> vendas = new ArrayList();
        
        try{
            switch(tipo){
                case 1:
                    sql = "SELECT * FROM vendapapelaria WHERE data LIKE ? ORDER BY data, id";
                    break;
                case 2:
                    sql = "SELECT * FROM vendapapelaria WHERE responsavel LIKE ? ORDER BY responsavel, id";
                    break;
                case 3:
                    sql = "SELECT * FROM vendapapelaria JOIN produtos ON produtos.codigo = vendapapelaria.codigoproduto WHERE produtos.nome LIKE ? ORDER BY produtos.nome, id";
                    break;
            }
            
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, "%"+filtro+"%");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaPapelaria vp = new VendaPapelaria();
                vp.setId(rs.getInt("id"));
                vp.setData(rs.getString("data"));
                vp.setResponsavel(rs.getString("responsavel"));
                vp.setQuantidade(rs.getInt("quantidade"));
                vp.setValor(rs.getDouble("valor"));
                vp.setCodigoProduto(rs.getString("codigoproduto"));
                vendas.add(vp);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar vendas.");   
        }
        
        return vendas;  
    
    }
    
    public void excluir(VendaPapelaria vp){
        
        String sql = "DELETE FROM vendapapelaria WHERE id = ?";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setInt(1, vp.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venda removida com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao remover venda.");
        }
        
    }
}
