import java.util.ArrayList;

public class ReceitaFederal {
    private ArrayList<Pessoa> pessoas;
    
    public ReceitaFederal() {
        pessoas = new ArrayList<Pessoa>();
    }
    
    public void addPessoas(Pessoa pes) {
        this.pessoas.add(pes);
    }
    
    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }
    
    public void imprimeDadosBasicos() {
        for(Pessoa pes : this.pessoas) {
            System.out.println(pes.toString());
        }
    }
    
    public void imprimeDadosCompletos() {
        for(Pessoa pes : this.pessoas) {
            System.out.println(pes.toString() + ", Imposto: " + pes.CalculaImposto());
        }
    }
}