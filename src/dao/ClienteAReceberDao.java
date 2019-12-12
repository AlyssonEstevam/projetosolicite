package dao;

import bean.ClienteAReceber;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteAReceberDao {
    public void inserir(ClienteAReceber car){
        
        String sql = "insert into clientesareceber(data, idcliente, tipo, vencimento, valor, datapagamento, valorpago, situacao) values (?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, car.getData());
            stmt.setInt(2, car.getIdcliente());
            stmt.setString(3, car.getTipo());
            stmt.setString(4, car.getVencimento());
            stmt.setDouble(5, car.getValor());
            stmt.setString(6, car.getDataPagamento());
            stmt.setDouble(7, car.getValorPago());
            stmt.setString(8, car.getSituacao());
            stmt.executeUpdate();
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir valores."+ex);
        } 
    }
    
    public ArrayList<ClienteAReceber> consultar(String situacao){
        
        String sql = "SELECT * FROM clientesareceber WHERE situacao LIKE ? ORDER BY id";
        
        PreparedStatement stmt;
        
        ArrayList<ClienteAReceber> valores = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, "%"+situacao+"%");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                ClienteAReceber car = new ClienteAReceber();
                car.setId(rs.getInt("id"));
                car.setData(rs.getString("data"));
                car.setIdcliente(rs.getInt("idcliente"));
                car.setTipo(rs.getString("tipo"));
                car.setVencimento(rs.getString("vencimento"));
                car.setValor(rs.getDouble("valor"));
                car.setDataPagamento(rs.getString("datapagamento"));
                car.setValorPago(rs.getDouble("valorpago"));
                car.setSituacao(rs.getString("situacao"));
                
                valores.add(car);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar valores: "+ex);   
        }
        
        return valores;  
    
    }
    
    public ArrayList<ClienteAReceber> consultarFiltro(int tipo, String filtro, String situacao){
        
        String sql;
        
        PreparedStatement stmt;
        
        ArrayList<ClienteAReceber> valores = new ArrayList();
        
        try{
            switch(tipo){
                case 1:
                    sql = "SELECT * FROM clientesareceber car JOIN clientes c ON car.idcliente=c.id WHERE c.nome LIKE ? AND car.situacao LIKE ? ORDER BY c.nome, car.id";
                    break;
                case 2:
                    sql = "SELECT * FROM clientesareceber WHERE vencimento LIKE ? AND situacao LIKE ? ORDER BY vencimento, id";
                    break;
                default:
                    sql="";
                    break;
            }
            
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, "%"+filtro+"%");
            stmt.setString(2, "%"+situacao+"%");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                ClienteAReceber car = new ClienteAReceber();
                car.setId(rs.getInt("id"));
                car.setData(rs.getString("data"));
                car.setIdcliente(rs.getInt("idcliente"));
                car.setTipo(rs.getString("tipo"));
                car.setVencimento(rs.getString("vencimento"));
                car.setValor(rs.getDouble("valor"));
                car.setDataPagamento(rs.getString("datapagamento"));
                car.setValorPago(rs.getDouble("valorpago"));
                car.setSituacao(rs.getString("situacao"));
                
                valores.add(car);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar valores: "+ex);   
        }
        
        return valores;  
    
    }
    
    public void alterar(ClienteAReceber car, int flag){
        
        String sql = "UPDATE clientesareceber SET data = ?, idcliente = ?, tipo = ?, vencimento = ?, valor = ?, datapagamento = ?, valorpago = ?, situacao = ? WHERE clientesareceber.id = ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, car.getData());
            stmt.setInt(2, car.getIdcliente());
            stmt.setString(3, car.getTipo());
            stmt.setString(4, car.getVencimento());
            stmt.setDouble(5, car.getValor());
            stmt.setString(6, car.getDataPagamento());
            stmt.setDouble(7, car.getValorPago());
            stmt.setString(8, car.getSituacao());
            stmt.setInt(9, car.getId());
            stmt.executeUpdate();
            if(flag==1){
              JOptionPane.showMessageDialog(null, "Valores alterados com sucesso!");
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar valores.");   
        }
        
    }
    
    
    public void excluir(ClienteAReceber car){
        
        String sql = "DELETE FROM clientesareceber WHERE id = ?";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setInt(1, car.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao remover valores.");
        }
        
    }
}
