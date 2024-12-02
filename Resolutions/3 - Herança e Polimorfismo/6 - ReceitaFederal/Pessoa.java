public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    
    public Pessoa(String nome, String endereço) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public boolean setNome(String nome) {
        if(!nome.equals(" ")) {
            this.nome = nome;
            return true;
        } else return false;
    }
    
    public boolean setEndereco(String endereco) {
        if(!endereco.equals(" ")) {
            this.endereco = endereco;
            return true;
        } else return false;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public abstract double CalculaImposto();
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + "-" + "Endereço: "+ this.endereco;
    }
}