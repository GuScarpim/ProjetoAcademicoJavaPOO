package projeto;

public class Historico {
    private Usuario responsavel;
    private String dataAtualizacao;
    private String descricao;

    public Historico() {
    }

    public Historico(Usuario responsavel, String dataAtualizacao, String descricao) {
        this.responsavel = responsavel;
        this.dataAtualizacao = dataAtualizacao;
        this.descricao = descricao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Historico{" 
                    + "\nDados do Responsável:"
                    + "\n  " + responsavel.toString() 
                    + "\n     Data de Atualização: " + dataAtualizacao 
                    + "\n     Descrição: " + descricao 
                + "\n}";
    }
    
    
}
