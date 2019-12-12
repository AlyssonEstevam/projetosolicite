package dao;

import bean.Pagamento;
import bean.Produto;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PagamentoDao {
    public void inserir(Pagamento p){
        
        String sql = "insert into pagamentos(data, motivo, fornecedor, valortotal, responsavel, valoresapagar, vencimento, valorespagos, classificacao) values (?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, p.getData());
            stmt.setString(2, p.getMotivo());
            stmt.setString(3, p.getFornecedor());
            stmt.setDouble(4, p.getValorTotal());
            stmt.setString(5, p.getResponsavel());
            stmt.setDouble(6, p.getValoresAPagar());
            stmt.setString(7, p.getVencimento());
            stmt.setDouble(8, p.getValoresPagos());
            stmt.setString(9, p.getClassificacao());
            stmt.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Pagamento cadastrado com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir pagamento.");
        } 
    }
    
    public ArrayList<Pagamento> consultar(){
        
        String sql = "SELECT * FROM pagamentos ORDER BY id";
        
        PreparedStatement stmt;
        
        ArrayList<Pagamento> pagamentos = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Pagamento p = new Pagamento();
                p.setId(rs.getInt("id"));
                p.setData(rs.getString("data"));
                p.setMotivo(rs.getString("motivo"));
                p.setFornecedor(rs.getString("fornecedor"));
                p.setValorTotal(rs.getDouble("valortotal"));
                p.setResponsavel(rs.getString("responsavel"));
                p.setValoresAPagar(rs.getDouble("valoresapagar"));
                p.setVencimento(rs.getString("vencimento"));
                p.setValoresPagos(rs.getDouble("valorespagos"));
                p.setClassificacao(rs.getString("classificacao"));
                
                pagamentos.add(p);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar pagamentos: "+ex);   
        }
        
        return pagamentos;  
    
    }
    
    public ArrayList<Pagamento> consultarFiltro(int tipo, String filtro){
        
        String sql;
        
        PreparedStatement stmt;
        
        ArrayList<Pagamento> pagamentos = new ArrayList();
        
        try{
            switch(tipo){
                case 1:
                    sql = "SELECT * FROM pagamentos WHERE data LIKE ? ORDER BY data, id";
                    break;
                case 2:
                    sql = "SELECT * FROM pagamentos WHERE motivo LIKE ? ORDER BY motivo, id";
                    break;
                case 3:
                    sql = "SELECT * FROM pagamentos WHERE fornecedor LIKE ? ORDER BY fornecedor, id";
                    break;
                case 4:
                    sql = "SELECT * FROM pagamentos WHERE responsavel LIKE ? ORDER BY responsavel, id";
                    break;
                case 5:
                    sql = "SELECT * FROM pagamentos WHERE vencimento LIKE ? ORDER BY vencimento, id";
                    break;
                case 6:
                    sql = "SELECT * FROM pagamentos WHERE classificacao LIKE ? ORDER BY classificacao, id";
                    break;
                default:
                    sql="";
                    break;
            }
            
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, "%"+filtro+"%");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Pagamento p = new Pagamento();
                p.setId(rs.getInt("id"));
                p.setData(rs.getString("data"));
                p.setMotivo(rs.getString("motivo"));
                p.setFornecedor(rs.getString("fornecedor"));
                p.setValorTotal(rs.getDouble("valortotal"));
                p.setResponsavel(rs.getString("responsavel"));
                p.setValoresAPagar(rs.getDouble("valoresapagar"));
                p.setVencimento(rs.getString("vencimento"));
                p.setValoresPagos(rs.getDouble("valorespagos"));
                p.setClassificacao(rs.getString("classificacao"));
                
                pagamentos.add(p);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar pagamento.");   
        }
        
        return pagamentos;  
    
    }
    
    public void alterar(Pagamento p, int flag){
        
        String sql = "UPDATE pagamentos SET data = ?, motivo = ?, fornecedor = ?, valortotal = ?, responsavel = ?, valoresapagar = ?, vencimento = ?, valorespagos = ?, classificacao = ? WHERE pagamentos.id = ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, p.getData());
            stmt.setString(2, p.getMotivo());
            stmt.setString(3, p.getFornecedor());
            stmt.setDouble(4, p.getValorTotal());
            stmt.setString(5, p.getResponsavel());
            stmt.setDouble(6, p.getValoresAPagar());
            stmt.setString(7, p.getVencimento());
            stmt.setDouble(8, p.getValoresPagos());
            stmt.setString(9, p.getClassificacao());
            stmt.setInt(10, p.getId());
            stmt.executeUpdate();
            if(flag==1){
              JOptionPane.showMessageDialog(null, "Pagamento alterado com sucesso!");
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar pagamento.");   
        }
        
    }
    
    public void excluir(Pagamento p){
        
        String sql = "DELETE FROM pagamentos WHERE id = ?";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setInt(1, p.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pagamento removido com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao remover pagamento.: "+ex);
        }
        
    }
}
