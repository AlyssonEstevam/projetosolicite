/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Cliente;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SOLICITE
 */
public class ClienteDao {
    public void inserir(Cliente c){
        
        String sql = "insert into clientes(cpf, nome, usuario1, usuario2, email, telefone, situacao) values (?,?,?,?,?,?,?)";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, c.getCpf());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getUsuario1());
            stmt.setString(4, c.getUsuario2());
            stmt.setString(5, c.getEmail());
            stmt.setString(6, c.getTelefone());
            stmt.setBoolean(7, c.getSituacao());
            stmt.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente.");
        } 
    }
    
    public ArrayList<Cliente> consultar(){
        
        String sql = "SELECT * FROM clientes ORDER BY id";
        
        PreparedStatement stmt;
        
        ArrayList<Cliente> clientes = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCpf(rs.getString("cpf"));
                c.setNome(rs.getString("nome"));
                c.setUsuario1(rs.getString("usuario1"));
                c.setUsuario2(rs.getString("usuario2"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setSituacao(rs.getBoolean("situacao"));
                
                clientes.add(c);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar clientes: "+ex);   
        }
        
        return clientes;  
    
    }
    
    public ArrayList<Cliente> consultarId(int idcliente){
        
        String sql = "SELECT * FROM clientes WHERE id = ?";
        
        PreparedStatement stmt;
        
        ArrayList<Cliente> clientes = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setInt(1, idcliente);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCpf(rs.getString("cpf"));
                c.setNome(rs.getString("nome"));
                c.setUsuario1(rs.getString("usuario1"));
                c.setUsuario2(rs.getString("usuario2"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setSituacao(rs.getBoolean("situacao"));
                
                clientes.add(c);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar clientes: "+ex);   
        }
        
        return clientes;  
    
    }
    
    public ArrayList<Cliente> consultarFiltro(int tipo, String filtro){
        
        String sql;
        
        PreparedStatement stmt;
        
        ArrayList<Cliente> clientes = new ArrayList();
        
        try{
            switch(tipo){
                case 1:
                    sql = "SELECT * FROM clientes WHERE cpf LIKE ? ORDER BY cpf, id";
                    break;
                case 2:
                    sql = "SELECT * FROM clientes WHERE nome LIKE ? ORDER BY nome, id";
                    break;
                case 3:
                    sql = "SELECT * FROM clientes WHERE usuario1 LIKE ? ORDER BY usuario1, id";
                    break;
                case 4:
                    sql = "SELECT * FROM clientes WHERE usuario2 LIKE ? ORDER BY usuario2, id";
                    break;
                case 5:
                    sql = "SELECT * FROM clientes WHERE email LIKE ? ORDER BY email, id";
                    break;
                case 6:
                    sql = "SELECT * FROM clientes WHERE telefone LIKE ? ORDER BY telefone, id";
                    break;
                case 7:
                    if(filtro.equals("ATIVO")){
                        filtro="1";
                    }else{
                        filtro="0";
                    }
                    sql = "SELECT * FROM clientes WHERE situacao LIKE ? ORDER BY id";
                    break;
                default:
                    sql="";
                    break;
            }
            
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, "%"+filtro+"%");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCpf(rs.getString("cpf"));
                c.setNome(rs.getString("nome"));
                c.setUsuario1(rs.getString("usuario1"));
                c.setUsuario2(rs.getString("usuario2"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setSituacao(rs.getBoolean("situacao"));
                    
                clientes.add(c);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar cliente.");   
        }
        
        return clientes;  
    
    }
    
    public void alterar(Cliente c, int flag){
        
        String sql = "UPDATE clientes SET cpf = ?, nome = ?, usuario1 = ?, usuario2 = ?, email = ?, telefone = ?, situacao = ? WHERE clientes.id = ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, c.getCpf());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getUsuario1());
            stmt.setString(4, c.getUsuario2());
            stmt.setString(5, c.getEmail());
            stmt.setString(6, c.getTelefone());
            stmt.setBoolean(7, c.getSituacao());
            stmt.setInt(8, c.getId());
            stmt.executeUpdate();
            if(flag==1){
              JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar cliente.");   
        }
        
    }
    
    
    public void excluir(Cliente c){
        
        String sql = "DELETE FROM clientes WHERE id = ?";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setInt(1, c.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao remover cliente.");
        }
        
    }
}
