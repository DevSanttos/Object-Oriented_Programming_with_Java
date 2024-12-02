public class Filme extends Item{
    private String diretor;
    
     public Filme(String titulo, double duracao, String comentario, String diretor) {
        super(titulo, duracao, comentario);
        this.diretor = diretor;
    }
    
    public String getDiretor() {
        return diretor;
    }

    public boolean setDiretor(String diretor) {
        if (!diretor.isEmpty()){
            this.diretor = diretor;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " +
            "Diretor: " + this.diretor;
    }
}
