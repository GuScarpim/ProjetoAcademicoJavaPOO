package projeto;

public class Recurso {
    private int codigo;
    private String titulo;
    private String nivelEnsino;
    private String formato;
    private String disciplina;
    private String dataCriacao;
    private Autor autores[];
    private PalavraChave palavras[];
    private Historico atualizacoes[];

    public Recurso() {
    }

    public Recurso(int codigo, String titulo, String nivelEnsino, String formato, String disciplina, String dataCriacao, Autor[] autores, PalavraChave[] palavras, Historico[] atualizacoes) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.nivelEnsino = nivelEnsino;
        this.formato = formato;
        this.disciplina = disciplina;
        this.dataCriacao = dataCriacao;
        this.autores = autores;
        this.palavras = palavras;
        this.atualizacoes = atualizacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivelEnsino() {
        return nivelEnsino;
    }

    public void setNivelEnsino(String nivelEnsino) {
        this.nivelEnsino = nivelEnsino;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public PalavraChave[] getPalavras() {
        return palavras;
    }

    public void setPalavras(PalavraChave[] palavras) {
        this.palavras = palavras;
    }

    public Historico[] getAtualizacoes() {
        return atualizacoes;
    }

    public void setAtualizacoes(Historico[] atualizacoes) {
        this.atualizacoes = atualizacoes;
    }
   
    public String resumo(){
        String autores = "";
        String palavrasChaves = "";
        String historico = "";
        for(int i=0;i<this.autores.length;i++){
            autores += this.autores[i].toString();
        }
        for(int i=0;i<palavras.length;i++){
            palavrasChaves += palavras[i].toString();
        }
        for(int i=0;i<atualizacoes.length;i++){
            historico += atualizacoes[i].toString();
        }
        return "Recurso{\n" + " Código: " + codigo 
                        + "\n Título: " + titulo 
                        + "\n Nível de Ensino: " + nivelEnsino 
                        + "\n Formato: " + formato 
                        + "\n Disciplina: " + disciplina 
                        + "\n Data de Criação: " + dataCriacao 
                        + "\n\n" + autores 
                        + "\n\n" + palavrasChaves 
                        + "\n\n" + historico 
                + "\n}";
    }
  
}
