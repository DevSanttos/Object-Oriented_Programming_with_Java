import java.util.ArrayList;

public class Portal {
	private String nome;
	private String url;
	private ArrayList<Anuncio> anuncios;
	
	public Portal(String nome, String url){
		this.nome = nome;
		this.url = url;
		this.anuncios = new ArrayList<Anuncio>();
	}
	
	public void addAnuncio(Anuncio anuncio){
		this.anuncios.add(anuncio);
	}
		
	public String toString(){
		String texto = "Portal: "+this.nome+", URL: "+this.url+"\n";
		// concatenar os vários anúncios
		for(Anuncio anuncio : anuncios){
			texto = texto + anuncio.toString()+"\n";
		}
		return texto;
	}
}
