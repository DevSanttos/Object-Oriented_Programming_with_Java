public class Deputado {
    private int matricula;
    private String  nome;
    private int numPartido;
    private String estado;
    
    public Deputado(int matricula, String nome, String estado) {
        this.matricula = matricula;
        this.nome = nome;
        this.estado = estado;
    }
    
    public boolean setNumPartido(int numPartido) {  
        if(numPartido > 0) {
            this.numPartido = numPartido;
            return true;
        } return false;
    }
    
    public String toString() {
        return " ";
    }
    
    public int getMatricula() {
        return this.matricula;
    }public String getNome() {
        return this.nome;
    }
    public int getPartido() {
        return this.numPartido;
    }
    public String getEstado() {
        return this.estado;
    }
}