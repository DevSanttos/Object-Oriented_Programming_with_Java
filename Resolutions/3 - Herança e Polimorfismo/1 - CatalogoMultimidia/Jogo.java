public class Jogo extends Item {
    private int quantJogadores;
    private String plataforma;
    
    public Jogo(String titulo, double duracao, String comentario, int quantJogadores, String plataforma) {
        super(titulo, duracao, comentario);
        this.quantJogadores = quantJogadores;
        this.plataforma = plataforma;
    }
    
    public boolean setQuantJogadores(int quantJogadores) {
        if(quantJogadores > 0) {
            this.quantJogadores = quantJogadores;
            return true;
        } else return false;
    }
    
    public int getQuantJogadores() {
        return this.quantJogadores;
    }
    
    public boolean setPlataforma() {
        if(!plataforma.equals(" ")) {
            this.plataforma = plataforma;
            return true;
        } else return false;
    }
    
    public String getPlataforma() {
        return this.plataforma;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " +
            "Quantidade jogadores: " + this.quantJogadores + ", " +
            "Plataforma: " + this.plataforma;
    }
}