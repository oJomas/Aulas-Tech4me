package modelo;

public class Usuario{
    private String login;
    private String senha;
    
    public Usuario(){

    }
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public Usuario (String Login){
        this.login = login;
    }
    public boolean autenticar(String login, String senha){
        if (this.login.equals(login) && this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }
    //#region
    public void setLogin(String login) {
        this.login = login;
    }
   
    public String getLogin() {
        return login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    //#endregion
}