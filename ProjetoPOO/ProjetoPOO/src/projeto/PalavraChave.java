package projeto;

public class PalavraChave {
    private String termoPortugues;
    private String termoIngles;

    public PalavraChave() {
    }

    public PalavraChave(String termoPortugues, String termoIngles) {
        this.termoPortugues = termoPortugues;
        this.termoIngles = termoIngles;
    }

    public String getTermoPortugues() {
        return termoPortugues;
    }

    public void setTermoPortugues(String termoPortugues) {
        this.termoPortugues = termoPortugues;
    }

    public String getTermoIngles() {
        return termoIngles;
    }

    public void setTermoIngles(String termoIngles) {
        this.termoIngles = termoIngles;
    }

    @Override
    public String toString() {
        return "PalavraChave{" 
                    + "\n Termo em Português = " + termoPortugues 
                    + "\n Termo em Inglês = " + termoIngles 
                + "\n}";
    }
        
}
