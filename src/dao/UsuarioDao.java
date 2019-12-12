package dao;

import bean.Usuario;
import conexaobd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDao {
    
    public void inserir(Usuario u){
        
        String sql = "insert into usuarios(usuario, senha, funcao) values (?,?,?)";
        
        PreparedStatement stmt;
        
        try{

            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, u.getUsuario());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getFuncao());
            stmt.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuário.");
        } 
    }
    
    public ArrayList<Usuario> consultar(){
        
        String sql = "SELECT * FROM usuarios ORDER BY id";
        
        PreparedStatement stmt;
        
        ArrayList<Usuario> usuarios = new ArrayList();
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setUsuario(rs.getString("usuario"));
                u.setSenha(rs.getString("senha"));
                u.setFuncao(rs.getString("funcao"));
                usuarios.add(u);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar usuários: "+ex);   
        }
        
        return usuarios;  
    
    }
    
    public ArrayList<Usuario> consultarFiltro(int tipo, String filtro){
        
        String sql;
        
        PreparedStatement stmt;
        
        ArrayList<Usuario> usuarios = new ArrayList();
        
        
        
        try{
            if(tipo==1){
                sql = "SELECT * FROM usuarios WHERE usuario LIKE ? ORDER BY usuarios, id";
                stmt = BancoDados.getInstance().prepareStatement(sql);
                stmt.setString(1, "%"+filtro+"%");
            }else{
                sql = "SELECT * FROM usuarios WHERE funcao LIKE ? ORDER BY funcao, id";
                stmt = BancoDados.getInstance().prepareStatement(sql);
                stmt.setString(1, "%"+filtro+"%");
            }
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setUsuario(rs.getString("usuario"));
                u.setSenha(rs.getString("senha"));
                u.setFuncao(rs.getString("funcao"));
                usuarios.add(u);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar usuários.");   
        }
        
        return usuarios;  
    
    }
    
    public void alterar(Usuario u, int flag){
        
        String sql = "UPDATE usuarios SET usuario = ?, senha = ?, funcao = ? WHERE usuarios.id = ?";
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setString(1, u.getUsuario());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getFuncao());
            stmt.setInt(4, u.getId());
            stmt.executeUpdate();
            if(flag==1){
              JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar usuário.");   
        }
        
    }
    
    
    public void excluir(Usuario u){
        
        String sql = "DELETE FROM usuarios WHERE id = ?";
        
        PreparedStatement stmt;
        
        try{
            stmt = BancoDados.getInstance().prepareStatement(sql);
            stmt.setInt(1, u.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao remover usuario.");
        }
        
    }
    
    
}
