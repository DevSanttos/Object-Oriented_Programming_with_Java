import java.util.ArrayList;

public class Catalogo{
    private String colecionador;
    private ArrayList<Item> itens;

    public Catalogo(String colecionador){
        this.colecionador = colecionador;
        this.itens = new ArrayList<Item>();
    }
    
    public void addItens(Item ite){
        this.itens.add(ite);
    }
    
    public String toString(){
        String texto = "Colecionador: "+this.colecionador+"\n";
        texto += "Itens da coleção: \n";
        for(Item it: this.itens) {
            texto += it.toString()+"\n";
        }
        return texto;
    }
}
