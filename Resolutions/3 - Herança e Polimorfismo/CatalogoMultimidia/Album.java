public class Album extends Item {
    private String artista;
    private int faixas;
    
    public boolean setArtista(String artista) {
        if (!artista.isEmpty()){
            this.artista = artista;
            return true;
        }else{
            return false;
        }
    }

    public String getArtista() {
        return artista;
    }

    public boolean setFaixas(int faixas) {
        if (faixas > 0){
            this.faixas = faixas;
            return true;
        }else{
            return false;
        }
    }
    
    public int getFaixas() {
        return faixas;
    }
    
    @Override
    public String toString(){
        return "Título: " + this.titulo + ", " +
            "Duração: " + this.duracao + ", " +
            "Comentário: "+ this.comentario + ", " +
            "Artista: " + this.artista + ", " +
            "Faixas: " + this.faixas;
    }
}
