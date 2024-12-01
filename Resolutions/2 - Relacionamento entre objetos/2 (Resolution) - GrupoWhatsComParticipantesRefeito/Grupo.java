import java.util.ArrayList;

public class Grupo {
    private String nome;
    private ArrayList<Participante> listaParticipante;
    public Grupo(String nome) {
        this.nome = nome;
        listaParticipante = new ArrayList<Participante>();
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
    
    public void addParticipante(Participante partic) {
        this.listaParticipante.add(partic);
    }
    public ArrayList<Participante> getParticipantes() {
        return this.listaParticipante;
    }
    
    public void imprimeDadosParticipante() {
        System.out.println("Nome do grupo: " + getNome());
        System.out.println("Dados do participante");
        
        for(Participante partic : listaParticipante) {
            System.out.println("Nome: "+ partic.getNome() + " Telefone: " + partic.getTelefone());
        }
    }
}