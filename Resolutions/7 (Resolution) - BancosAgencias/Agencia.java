public class Agencia {
    private int numAgencia;
    private String cidade;
    private int anoAbertura;
    
    
    public Agencia(int numAgencia, String cidade, int anoAbertura) {
        this.numAgencia= numAgencia;
        this.cidade = cidade;
        this.anoAbertura = anoAbertura;
    }
    
    public int getNumAgencia() {
        return this.numAgencia;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public int getAnoAbertura() {
        return this.anoAbertura;
    }
    
    public String toString() {
        return "Número da agencia: " + getNumAgencia() +
                "Cidade: " + getCidade() + 
                "Ano de abertura: " + getAnoAbertura();
    }
}