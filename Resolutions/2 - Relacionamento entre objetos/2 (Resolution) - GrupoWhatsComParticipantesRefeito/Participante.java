public class Participante {
    private String nome;
    private int telefone;
    
    public Participante(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public boolean setNome(String nome) {
        if(!nome.equals(" ")){
            this.nome = nome;
            return true;
        } else return false;
    }
    public String getNome() {
        return this.nome;
    }
    
    public boolean setTelefone(int telefone) {
        if(telefone > 0) {
            this.telefone = telefone;
            return true;
        } else return false;
    }
    public int getTelefone() {
        return this.telefone;
    }
}