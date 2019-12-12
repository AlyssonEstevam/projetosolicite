/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexaobd;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class BancoDados {
    
    private static Connection conn = null;
    
    private String banco = "sistemasolicite";
    
    BancoDados(){
        
        try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String urlBD = "jdbc:mysql://localhost:3306/"+banco+"?useTimezone=true&serverTimezone=UTC";
        conn = DriverManager.getConnection(urlBD, "root", "");
        
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "O driver não foi encontrado "+e);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados "+ex);
        }
    }
    
    public static Connection getInstance(){
        if(conn == null)
            new BancoDados();
        return conn;
    }
    
}
