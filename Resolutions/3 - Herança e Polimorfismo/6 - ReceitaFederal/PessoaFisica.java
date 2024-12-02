public class PessoaFisica extends Pessoa {
    private int RG;
    private int CPF;
    private double salarioMensal;
    private int quantDependentes;
    
    public PessoaFisica(String nome, String endereco, int RG, int CPF, double salarioMensal, int quantDependentes) {
        super(nome, endereco);
        this.RG = RG;
        this.CPF = CPF;
        this.salarioMensal = salarioMensal;
        this.quantDependentes = quantDependentes;
    }
    
    public int getRG() {
        return this.RG;
    }
    
    public int getCPF() {
        return this.CPF;
    }
    
    public double getSalarioMensal() {
        return this.salarioMensal;
    }
    
    public int getQuantDependentes() {
        return this.quantDependentes;
    }
    
    public double CalculaImposto() {
        double imposto = 0;
        
        if(this.salarioMensal > 1000) {
            imposto = this.salarioMensal * 0.07;
        } else {
            if(this.salarioMensal > 500) {
                imposto = this.salarioMensal * 0.05;
            } else imposto = 0;
        }
        
        imposto -= 50 * this.quantDependentes;
        if(imposto < 0) {
            imposto = 0;
        }
        
        return imposto;
    }
    
    public String toString() {
        return super.toString() + ", " +
            "RG: " + this.RG + ", " +
            "CPF: " + this.CPF + ", " +
            "Salario Mensal: " + this.salarioMensal + ", " +
            "Quantidade de dependentes: " + this.quantDependentes;
    }
}