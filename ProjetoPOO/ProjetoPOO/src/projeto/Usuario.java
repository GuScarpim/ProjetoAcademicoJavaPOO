package projeto;

public class Usuario extends Pessoa{
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String login, String senha, String nome, String email) {
        super(nome, email);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return " Usuario{" 
                    + "\n     Nome = "  + this.getNome() 
                    + "\n     E-mail = " + this.getEmail()
                    + "\n     Login = " + login 
                    + "\n     Senha = " + senha 
                +  "\n  }";
    }
   
}
