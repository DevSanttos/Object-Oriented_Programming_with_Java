import java.util.ArrayList;

public class Detran {
    private String estado;
    private ArrayList<Veiculo> veiculos;
    
    public Detran(String estado) {
        this.estado = estado;
        veiculos = new ArrayList<Veiculo>();
    }
    
    public void addVeiculos(Veiculo veic) {
        this.veiculos.add(veic);
    }
    
    public ArrayList<Veiculo> getVeiculos() {
        return this.veiculos;
    }
    
    public boolean setEstado(String estado) {
        if(!estado.equals(" ")) {
            this.estado = estado;
            return true;
        } else return false;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public String toString() {
        String texto = "Estado: "+this.estado;
        
        for(Veiculo veic : this.veiculos) {
            texto += ", " + veic.toString();
        } return texto;
    }
}