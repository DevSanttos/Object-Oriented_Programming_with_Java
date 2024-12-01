import java.util.ArrayList;

public class Banco {
    private int codigo;
    private String nome;
    private ArrayList<Agencia> listaAgencia;
    
    public Banco(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        listaAgencia = new ArrayList<Agencia>();
    }
    
    public void addAgencias(Agencia agen) {
        this.listaAgencia.add(agen);
    }
    
    public int getQuantAgencias() {
        return this.listaAgencia.size();
    }
    
    public ArrayList<Agencia> getListaAgencia() {
        return this.listaAgencia;
    }
    
    public ArrayList<Agencia> getListaAgencia(String cidade) {
        ArrayList<Agencia> listaCidade = new ArrayList<Agencia>();
        for(Agencia agen : this.listaAgencia) {
            if(agen.getCidade().equals(cidade)) {
                listaCidade.add(agen);
            }
        } return listaCidade;
    }
    
    public ArrayList<Agencia> getListaAgencia(int anoAbertura) {
        ArrayList<Agencia> listaAnoAbertura = new ArrayList<Agencia>();
        for(Agencia agen : listaAgencia) {
            if(agen.getAnoAbertura() == anoAbertura) {
                listaAnoAbertura.add(agen);
            }
        } return listaAnoAbertura;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public boolean setNome(String nome) {
        if(!nome.equals(" ")) {
            this.nome = nome;
            return true;
        } else return false;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void imprimeRelacao() {
        System.out.println("Informações do banco");
        System.out.println("Código: " + getCodigo() + "Nome: " + getNome());
        
        for(Agencia agen : this.listaAgencia) {
            System.out.println("Dados da agencia");
            System.out.println(agen.toString());
        }
    }
    
    public void imprimeRelacao(String cidade) {
        System.out.println("Informações do banco");
        System.out.println("Código: " + getCodigo() + "Nome: " + getNome());
        ArrayList<Agencia> listaCidade = this.getListaAgencia(cidade);
        for(Agencia agen : listaCidade) {
            System.out.println("Dados da agencia");
            System.out.println(agen.toString());
        }
    }
    
    public void imprimeRelacao(int anoAbertura) {
        System.out.println("Informações do banco");
        System.out.println("Código: " + getCodigo() + "Nome: " + getNome());
        ArrayList<Agencia> listaAnoAbertura = this.getListaAgencia(anoAbertura);
        for(Agencia agen : listaAnoAbertura) {
            System.out.println("Dados da agencia");
            System.out.println(agen.toString());
        }
    }
    
    public Agencia getAgencia(int numero) {
        Agencia procurada = null;
        for(Agencia agen : this.listaAgencia) {
            if(agen.getNumAgencia() == numero) {
                procurada = agen;
            }
        } return procurada;
    }
}