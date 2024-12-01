public class Treinador {
    private int CPF;
    private String nome;
    private double salarioMensal;
    
    public Treinador(int CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }
    
    public boolean setSalarioMensal() {
        if(salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
            return true;
        } else return false;
    }
    
    public double getSalarioMensal() {
        return this.salarioMensal;
    }
    public int getCPF() {
        return this.CPF;
    }
    public String getNome() {
        return this.nome;
    }
}