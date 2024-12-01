public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;
    
    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }
    
    public boolean setMatricula(int matricula) {
        if(matricula > 0) {
            this.matricula = matricula;
            return true;
        } else return false;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public boolean setCnpj(String nome) {
        if(!nome.equals(" ")) {
            this.nome = nome;
            return true;
        } else return false;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public boolean setSalario(double salario) {
        if(salario > 0) {
            this.salario = salario;
            return true;
        } else return false;
    }
    
    public double getSalario() {
        return this.salario;
    }
}