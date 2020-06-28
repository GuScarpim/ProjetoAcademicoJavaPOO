package projeto;

public class Autor extends Pessoa{
    private String especialidade;

    public Autor() {
    }

    public Autor(String especialidade, String nome, String email) {
        super(nome, email);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Autor{" 
                    + "\n Nome: "  + this.getNome() 
                    + "\n E-mail: " + this.getEmail() 
                    + "\n Especialidade: " + especialidade 
                + "\n}";
    }
 
    
}
