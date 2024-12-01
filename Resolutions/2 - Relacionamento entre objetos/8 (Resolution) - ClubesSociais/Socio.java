public class Socio {
    private int matricula;
    private String nome;
    private int idade;
    private double valorMensalidade;
    
    public Socio(int matricula, String nome, int idade, double valorMensalidade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.valorMensalidade = valorMensalidade;
    }
    
    public boolean setIdade(int idade) {
        if(idade > 0 && idade < 130) {
            this.idade = idade;
            return true;
        } else return false;
    } 
    
    public boolean setValorMensalidade(double valorMensalidade) {
        if(valorMensalidade > 0) {
            this.valorMensalidade = this.valorMensalidade;
            return true;
        } else return false;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public double getValorMensalidade() {
        return this.valorMensalidade;
    }
    
    public String toString() {
        return "Matricula: " + this.matricula +
                "Nome: " + this.nome +
                "Idade: " + this.idade + 
                "Valor da mensalidade: " + String.format("%.2f", this.valorMensalidade);
    }
}