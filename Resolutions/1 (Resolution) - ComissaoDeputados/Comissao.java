import java.util.ArrayList;

public class Comissao {
    private String titulo;
    private ArrayList <Deputado> deputados;
    public Comissao(String titulo) {
        this.titulo = titulo;
        this.deputados = new ArrayList <Deputado>();
    }
    
    public void addDeputado(Deputado deputa) {
        this.deputados.add(deputa);
    }
    public ArrayList<Deputado> getDeputados() {
        return this.deputados;
    }
    public ArrayList<Deputado> getDeputados(int partido) {
        ArrayList<Deputado> procurados = new ArrayList<Deputado>();
        for(int i = 0; i < this.deputados.size(); i++) {
            Deputado dep = this.deputados.get(i);
            if(dep.getPartido() == partido) {
                procurados.add(dep);
            }
        } return procurados;
    }
    public ArrayList<Deputado> getDeputados(String estado) {
        ArrayList<Deputado> procurados = new ArrayList<Deputado>();
        //Igual ao de cima, mas esse é o For each! Não precisa criar nenhuma variável dep pra armazenar índices;
        for(Deputado dep : this.deputados) {
            if(dep.getEstado().equals(estado)) {
                procurados.add(dep);
            }
        } return procurados;
    }
    
    public void imprimeDeputados(){
        /*For each básico
        for(Deputado dep : this.deputados){
            System.out.println(dep.toString())
        }
        */
        //For each avançado
        this.deputados.forEach(dep -> System.out.println(dep.toString()));
    }
    public void imprimeDeputados(int partido){
        ArrayList<Deputado> procurados = this.getDeputados(partido);
        procurados.forEach(dep -> System.out.println(dep.toString()));
    }
    public void imprimeDeputados(String estado){
        ArrayList<Deputado> procurados = this.getDeputados(estado);
        procurados.forEach(dep -> System.out.println(dep.toString()));
    }
}