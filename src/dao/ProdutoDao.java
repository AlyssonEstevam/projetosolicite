package dao;

import bean.Produto;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProdutoDao {
    public void inserir(Produto p){
        
        String sql = "insert into produtos(codigo, nome, descricao, marca, custounitario, preco, estoqueminimo, estoqueatual, fornecedor) values (?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, p.getCodigo());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getDescricao());
            stmt.setString(4, p.getMarca());
            stmt.setDouble(5, p.getCustoUnitario());
            stmt.setDouble(6, p.getPreco());
            stmt.setInt(7, p.getEstoqueMinimo());
            stmt.setInt(8, 0);
            stmt.setString(9, p.getFornecedor());
            stmt.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto.");
        } 
    }
    
    public ArrayList<Produto> consultar(){
        
        String sql = "SELECT * FROM produtos ORDER BY nome";
        
        PreparedStatement stmt;
        
        ArrayList<Produto> produtos = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto p = new Produto();
                p.setCodigo(rs.getString("codigo"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setMarca(rs.getString("marca"));
                p.setCustoUnitario(rs.getDouble("custounitario"));
                p.setPreco(rs.getDouble("preco"));
                p.setEstoqueMinimo(rs.getInt("estoqueminimo"));
                p.setEstoqueAtual(rs.getInt("estoqueatual"));
                p.setFornecedor(rs.getString("fornecedor"));
                
                produtos.add(p);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar produtos: "+ex);   
        }
        
        return produtos;  
    
    }
    
    public ArrayList<Produto> consultarFiltro(int tipo, String filtro){
        
        String sql;
        
        PreparedStatement stmt;
        
        ArrayList<Produto> produtos = new ArrayList();
        
        try{
            switch(tipo){
                case 1:
                    sql = "SELECT * FROM produtos WHERE codigo LIKE ? ORDER BY nome";
                    break;
                case 2:
                    sql = "SELECT * FROM produtos WHERE nome LIKE ? ORDER BY nome";
                    break;
                case 3:
                    sql = "SELECT * FROM produtos WHERE marca LIKE ? ORDER BY marca, nome";
                    break;
                case 4:
                    sql = "SELECT * FROM produtos WHERE fornecedor LIKE ? ORDER BY fornecedor, nome";
                    break;
                case 5:
                    sql = "SELECT * FROM produtos WHERE codigo LIKE ?";
                    break;
                default:
                    sql="";
                    break;
            }
            
            stmt = BancoDados.getInstance().prepareStatement(sql);
            
            if(tipo==5){
                stmt.setString(1, filtro);
            }else{
                stmt.setString(1, "%"+filtro+"%");
            }
            
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto p = new Produto();
                p.setCodigo(rs.getString("codigo"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setMarca(rs.getString("marca"));
                p.setCustoUnitario(rs.getDouble("custounitario"));
                p.setPreco(rs.getDouble("preco"));
                p.setEstoqueMinimo(rs.getInt("estoqueminimo"));
                p.setEstoqueAtual(rs.getInt("estoqueatual"));
                p.setFornecedor(rs.getString("fornecedor"));
                
                produtos.add(p);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar produto.");   
        }
        
        return produtos;  
    
    }
    
    public void alterar(Produto p, int flag){
        
        String sql = "UPDATE produtos SET nome = ?, descricao = ?, marca = ?, custounitario = ?, preco = ?, estoqueminimo = ?, estoqueatual = ?, fornecedor = ? WHERE produtos.codigo LIKE ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setString(3, p.getMarca());
            stmt.setDouble(4, p.getCustoUnitario());
            stmt.setDouble(5, p.getPreco());
            stmt.setInt(6, p.getEstoqueMinimo());
            stmt.setInt(7, p.getEstoqueAtual());
            stmt.setString(8, p.getFornecedor());
            stmt.setString(9, p.getCodigo());
            stmt.executeUpdate();
            if(flag==1){
              JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar produto.");   
        }
        
    }
    
    public void alterarCustoUnitario(Produto p, int flag){
        
        String sql = "UPDATE produtos SET custounitario = ? WHERE produtos.codigo LIKE ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            
            stmt.setDouble(1, p.getCustoUnitario());
            stmt.setString(2, p.getCodigo());
            stmt.executeUpdate();
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar produto.");   
        }
        
    }
    
    public void alterarEstoque(Produto p){
        
        String sql = "UPDATE produtos SET estoqueatual = ? WHERE produtos.codigo LIKE ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            
            stmt.setInt(1, p.getEstoqueAtual());
            stmt.setString(2, p.getCodigo());
            stmt.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar produto.");   
        }
        
    }
    
    public void excluir(Produto p){
        
        String sql = "DELETE FROM produtos WHERE codigo LIKE ?";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, p.getCodigo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao remover produto.: "+ex);
        }
        
    }
}
