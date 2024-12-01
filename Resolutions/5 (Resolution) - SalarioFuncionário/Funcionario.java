public class Funcionario{
    private String nome;
    private double quantHorasTrabalhadas;
    private double salarioHora;
    private int quantDependentes;
    
    public boolean setNome(String nome){
        if(!nome.equals(" ")){
            this.nome = nome;
            return true;
        } else return false;
    }
    public String getNome(){
        return this.nome;
    }
    
    public boolean setQuantHorasTrabalhadas(double quantHorasTrabalhadas){
        if(quantHorasTrabalhadas >= 0){
            this.quantHorasTrabalhadas = quantHorasTrabalhadas;
            return true;
        } else return false;
    }
    public double getQuantHorasTrabalhadas(){
        return this.quantHorasTrabalhadas;
    }
    
    public boolean setSalarioHora(double salarioHora){
        if(salarioHora >= 0){
            this.salarioHora = salarioHora;
            return true;
        } else return false;
    }
    public double getSalarioHora(){
        return this.salarioHora;
    }
    
    public boolean setQuantDependentes(int quantDependentes){
        if(quantDependentes >= 0){
            this.quantDependentes = quantDependentes;
            return true;
        } else return false;
    }
    public int getDependentes(){
        return this.quantDependentes;   
    }
    
    public double retornaSalarioBruto(){
        return quantHorasTrabalhadas * salarioHora + (50 * quantDependentes);
    }
    
    public double retornaDescontINSS(){
        if(retornaSalarioBruto() <= 1000){
            return retornaSalarioBruto() * 0.085;
        } else return retornaSalarioBruto() * 0.09;
    }
    
    public double retornaDescontIR(){
        if(retornaSalarioBruto() <= 500){
            return 0;
        } else
            if(retornaSalarioBruto() > 500 && retornaSalarioBruto() <= 1000){
                return retornaSalarioBruto() * 0.05;
            } else return retornaSalarioBruto() * 0.07;
    }
    
    public double retornaSalarioLiquido(){
        return (retornaSalarioBruto() - retornaDescontINSS()) - retornaDescontIR();
    }
    
    public double retornaDescontos(){
        return retornaDescontINSS() + retornaDescontIR();
    }
    
    public String retornaRepresentacaoText(){
        return "Nome: "+nome + ", Dependentes: "+quantDependentes+ ", Sal. Hora: "+salarioHora+ 
        ", Qtd. Horas Trab.: "+quantHorasTrabalhadas + ", Salario Bruto: "+retornaSalarioBruto() + ", INSS: "+retornaDescontINSS()+ 
        ", IR: " + retornaDescontIR() + ", Sal. Liquido: "+retornaSalarioLiquido();
    }
    
}
