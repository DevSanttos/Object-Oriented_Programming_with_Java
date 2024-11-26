import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private ArrayList<Funcionario> funcionarios;
    
    public Empresa(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public boolean setCnpj(String cnpj) {
        if(!cnpj.equals(" ")) {
            this.cnpj = cnpj;
            return true;
        } else return false;
    }
    
    public String getCnpj() {
        return this.cnpj;
    }
    
    public boolean setRazaoSocial(String razaoSocial) {
        if(!razaoSocial.equals(" ")) {
            this.razaoSocial = razaoSocial;
            return true;
        } else  return false;
    }
    
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void addFuncionarios(Funcionario funci) {
        this.funcionarios.add(funci);
    }
    
    public ArrayList<Funcionario> getFuncionario() {
        return this.funcionarios;
    }
    
    public int getQuantidadeFuncionarios() {
        return this.funcionarios.size();
    }
        
    public void imprimeFuncionarios() {
        
    }
}