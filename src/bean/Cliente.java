/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author SOLICITE
 */
public class Cliente {
    private int id;
    private String cpf;
    private String nome;
    private String usuario1;
    private String usuario2;
    private String email;
    private String telefone;
    private boolean situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        if(cpf.length()!=14){
            return false;
        }
        
        int x=10, somatorio=0;
        for(int i=0; i<cpf.length(); i++){
            if(cpf.charAt(i)!='.' && cpf.charAt(i)!='-'){
                somatorio+=x*Integer.parseInt(cpf.charAt(i)+"");
                x--;
            }
            if(x==1){
                break;
            }
        }
        
        int digito1;
        if((11-(somatorio%11))>9){
            digito1 = 0;
        }else{
            digito1 = (11-(somatorio%11));
        }
        
        if(digito1!=Integer.parseInt(cpf.charAt(12)+"")){
            return false;
        }
        
        x=11;
        somatorio=0;
        for(int i=0; i<cpf.length(); i++){
            if(cpf.charAt(i)!='.' && cpf.charAt(i)!='-'){
                somatorio+=x*Integer.parseInt(cpf.charAt(i)+"");
                x--;
            }
            if(x==1){
                break;
            }
        }
        
        int digito2;
        if((11-(somatorio%11))>9){
            digito2 = 0;
        }else{
            digito2 = (11-(somatorio%11));
        }
        
        if(digito2!=Integer.parseInt(cpf.charAt(13)+"")){
            return false;
        }else{
            this.cpf = cpf;
            return true;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public String getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
