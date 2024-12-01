import java.util.ArrayList;

public class Clube {
    private String nome;
    private String cidade;
    private ArrayList<Socio> socios;
    public Clube(String nome,String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        socios = new ArrayList<Socio>();
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public void addSocios(Socio soc) {
        this.socios.add(soc);
    }
    
    public ArrayList<Socio> getSocios() {
        return this.socios;
    }
    
    public ArrayList<Socio> getSociosMenoresDeIdade() {
        ArrayList<Socio> socioMenorIdade = new ArrayList<Socio>();
        for(Socio soc : this.socios) {
            if(soc.getIdade() < 18) {
                socioMenorIdade.add(soc);
            }
        } return socioMenorIdade;
    }
    
    public double getIdadeMediaSocios() {
        double fazMedia = 0;
        for(Socio soc : this.socios) {
            fazMedia += soc.getIdade();    
        } return fazMedia / this.socios.size();
    }
    
    public ArrayList<Socio> getSociosIdadeMaiorQueMedia() {
        ArrayList<Socio> socioMaiorQueMedia = new ArrayList<Socio>();
        for(Socio soc : this.socios) {
            if(soc.getIdade() > getIdadeMediaSocios()) {
                socioMaiorQueMedia.add(soc);
            }
        } return socioMaiorQueMedia;
    }
    
    public double getArrecadacaoMensalidades() {
        double armazenaArrecadacao = 0;
        for(Socio soc : this.socios) {
            armazenaArrecadacao += soc.getValorMensalidade();
        } return armazenaArrecadacao;
    }
    
    public boolean removerSocio(int matricula) {
        for(Socio soc : this.socios) {
            if(soc.getMatricula() == matricula) {
                this.socios.remove(soc);
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        String texto = "Clube: " + this.nome + "-" + this.cidade + "\n";
        for(Socio soc : this.socios) {
            texto += soc.toString() + "\n";
        }
        return texto;
    }
}