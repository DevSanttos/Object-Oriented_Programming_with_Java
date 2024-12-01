public class Time {
    private String nome;
    private int anoFundacao;
    private String cidade;
    private Treinador treinador;
    
    public Time(String nome, int anoFundacao, String cidade) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.cidade = cidade;
    }
    
    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }
    
    public Treinador getTreinador() {
        return this.treinador;
    }
    
    public String getNome() {
        return this.nome = nome;
    }
    
    public int getAnoFundacao() {
        return this.anoFundacao = anoFundacao;
    }
    
    public String getCidade() {
        return this.cidade = cidade;
    }
    
    public void representacaoTextual() {
        //dados do time e do treinador
    }
}